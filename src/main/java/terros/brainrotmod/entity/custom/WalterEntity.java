package terros.brainrotmod.entity.custom;

import net.minecraft.component.type.PotionContentsComponent;
import net.minecraft.entity.AnimationState;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.goal.*;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.mob.*;
import net.minecraft.entity.passive.WanderingTraderEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.potion.Potions;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.village.TradeOffer;
import net.minecraft.village.TradeOfferList;
import net.minecraft.village.TradedItem;
import net.minecraft.world.World;
import terros.brainrotmod.item.ModItems;

public class WalterEntity extends WanderingTraderEntity {

    public final AnimationState idleAnimationState = new AnimationState();
    private int idleAnimationTimeout = 0;

    public WalterEntity(EntityType<? extends WalterEntity> entityType, World world) {
        super(entityType, world);
    }

    @Override
    protected void initGoals() {
        this.goalSelector.add(1, new StopFollowingCustomerGoal(this));
        this.goalSelector.add(1, new FleeEntityGoal<>(this, ZombieEntity.class, 8.0F, 0.5, 2));
        this.goalSelector.add(1, new FleeEntityGoal<>(this, EvokerEntity.class, 12.0F, 0.5, 2));
        this.goalSelector.add(1, new FleeEntityGoal<>(this, VindicatorEntity.class, 8.0F, 0.5, 2));
        this.goalSelector.add(1, new FleeEntityGoal<>(this, VexEntity.class, 8.0F, 0.5, 2));
        this.goalSelector.add(1, new FleeEntityGoal<>(this, PillagerEntity.class, 15.0F, 0.5, 2));
        this.goalSelector.add(1, new FleeEntityGoal<>(this, IllusionerEntity.class, 12.0F, 0.5, 2));
        this.goalSelector.add(1, new FleeEntityGoal<>(this, ZoglinEntity.class, 10.0F, 0.5, 2));
        this.goalSelector.add(1, new EscapeDangerGoal(this, 2));
        this.goalSelector.add(1, new LookAtCustomerGoal(this));
        this.goalSelector.add(4, new GoToWalkTargetGoal(this, 0.35));
        this.goalSelector.add(8, new WanderAroundFarGoal(this, 0.35));
        this.goalSelector.add(9, new StopAndLookAtEntityGoal(this, PlayerEntity.class, 3.0F, 1.0F));
        this.goalSelector.add(10, new LookAtEntityGoal(this, MobEntity.class, 8.0F));
        this.goalSelector.add(0, new SwimGoal(this));
        this.goalSelector
                .add(
                        0,
                        new HoldInHandsGoal<>(
                                this,
                                PotionContentsComponent.createStack(Items.POTION, Potions.INVISIBILITY),
                                SoundEvents.ENTITY_WANDERING_TRADER_DISAPPEARED,
                                walterEntity -> this.getWorld().isDay() && !walterEntity.isInvisible()
                        )
                );
        this.goalSelector
                .add(
                        0,
                        new HoldInHandsGoal<>(
                                this,
                                new ItemStack(Items.MILK_BUCKET),
                                SoundEvents.ENTITY_WANDERING_TRADER_REAPPEARED,
                                walterEntity -> this.getWorld().isNight() && walterEntity.isInvisible()
                        )
                );



        }
        public static DefaultAttributeContainer.Builder createAttributes() {
        return MobEntity.createMobAttributes()
                .add(EntityAttributes.MAX_HEALTH, 50)
                .add(EntityAttributes.MOVEMENT_SPEED, 0.9)
                .add(EntityAttributes.ATTACK_DAMAGE, 1);
        }
//
        private void setupAnimationStates() {
            if (this.idleAnimationTimeout <= 0) {
                this.idleAnimationTimeout = 20;
                this.idleAnimationState.start(this.age);
            } else {
                --this.idleAnimationTimeout;
            }
        }

    @Override
    protected void fillRecipes() {

        TradeOffer customTrade = new TradeOffer(new TradedItem(Items.EMERALD, 32) , new ItemStack(ModItems.WHITE_POWDER, 6), 10, 2, 0.04f);
        TradeOfferList tradeOfferList = this.getOffers();
        tradeOfferList.add(customTrade);

    }

    @Override
    public void tick() {
        super.tick();

        if(this.getWorld().isClient()) {
            this.setupAnimationStates();
        }
    }

    /*Sounds*/

    @Override
    protected SoundEvent getAmbientSound() {
        return null;
    }

    @Override
    protected SoundEvent getTradingSound(boolean sold) {
        return sold ? SoundEvents.ENTITY_VILLAGER_YES : SoundEvents.ENTITY_VILLAGER_NO;
    }

    @Override
    public SoundEvent getYesSound() {
        return SoundEvents.ENTITY_EXPERIENCE_ORB_PICKUP;
    }

}

