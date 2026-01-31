package net.fourrvyak.necoarcmod.item.custom;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.UseAction;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

public class NecoArcJointItem extends Item {
    public NecoArcJointItem(Settings settings) {
        super(settings);
    }

    @Override
    public UseAction getUseAction(ItemStack stack) {
        return UseAction.BOW;
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        user.setCurrentHand(hand);
        return TypedActionResult.consume(user.getStackInHand(hand));
    }

    @Override
    public int getMaxUseTime(ItemStack stack, LivingEntity user) {
        return 40;
    }

    @Override
    public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {
        user.addStatusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 60, 20));

        Vec3d look = user.getRotationVector();
        double spread = 0.02;
        int count = 5;
        for (int i = 0; i < count; i++) {
            world.addParticle(ParticleTypes.LARGE_SMOKE,
                    user.getX(),
                    user.getY() + 1.5f,
                    user.getZ(),
                    look.x * 0.07f + (world.random.nextDouble() - 0.5) * spread,
                    look.y * 0.15f + (world.random.nextDouble() - 0.5) * spread,
                    look.z * 0.07f + (world.random.nextDouble() - 0.5) * spread);
            stack.decrement(1);
        }
        return stack;
    }
}