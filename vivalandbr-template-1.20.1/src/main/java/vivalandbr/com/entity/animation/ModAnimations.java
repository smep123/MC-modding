package vivalandbr.com.entity.animation;

import net.minecraft.client.render.entity.animation.Animation;
import net.minecraft.client.render.entity.animation.AnimationHelper;
import net.minecraft.client.render.entity.animation.Keyframe;
import net.minecraft.client.render.entity.animation.Transformation;

public class ModAnimations {
    public static final Animation Idle = Animation.Builder.create(1.5833F).looping()
            .addBoneAnimation("head", new Transformation(Transformation.Targets.ROTATE,
                    new Keyframe(0.0F, AnimationHelper.createRotationalVector(-2.5F, 0.0F, 7.5F), Transformation.Interpolations.LINEAR),
                    new Keyframe(0.875F, AnimationHelper.createRotationalVector(-0.2F, 2.2F, 3.0F), Transformation.Interpolations.LINEAR),
                    new Keyframe(1.5833F, AnimationHelper.createRotationalVector(-2.5F, 0.0F, 7.5F), Transformation.Interpolations.LINEAR)
            ))
            .addBoneAnimation("head", new Transformation(Transformation.Targets.TRANSLATE,
                    new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.5F, 1.0F), Transformation.Interpolations.LINEAR),
                    new Keyframe(0.6667F, AnimationHelper.createTranslationalVector(0.0F, 0.3F, 0.8F), Transformation.Interpolations.LINEAR),
                    new Keyframe(1.5833F, AnimationHelper.createTranslationalVector(0.0F, 0.5F, 1.0F), Transformation.Interpolations.LINEAR)
            ))
            .addBoneAnimation("body", new Transformation(Transformation.Targets.ROTATE,
                    new Keyframe(0.0F, AnimationHelper.createRotationalVector(-5.0F, -5.0F, -2.5F), Transformation.Interpolations.LINEAR),
                    new Keyframe(0.875F, AnimationHelper.createRotationalVector(-4.0F, -6.0F, -2.5F), Transformation.Interpolations.LINEAR),
                    new Keyframe(1.5833F, AnimationHelper.createRotationalVector(-5.0F, -5.0F, -2.5F), Transformation.Interpolations.LINEAR)
            ))
            .addBoneAnimation("body", new Transformation(Transformation.Targets.TRANSLATE,
                    new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 1.0F), Transformation.Interpolations.LINEAR),
                    new Keyframe(0.7083F, AnimationHelper.createTranslationalVector(0.0F, 0.3F, 0.95F), Transformation.Interpolations.LINEAR),
                    new Keyframe(1.5833F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 1.0F), Transformation.Interpolations.LINEAR)
            ))
            .addBoneAnimation("left_arm", new Transformation(Transformation.Targets.ROTATE,
                    new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
                    new Keyframe(0.625F, AnimationHelper.createRotationalVector(-2.0F, 0.0F, -7.0F), Transformation.Interpolations.LINEAR),
                    new Keyframe(1.5833F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
            ))
            .addBoneAnimation("left_arm", new Transformation(Transformation.Targets.TRANSLATE,
                    new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
                    new Keyframe(0.4167F, AnimationHelper.createTranslationalVector(0.2F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
                    new Keyframe(1.1667F, AnimationHelper.createTranslationalVector(-0.2F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
                    new Keyframe(1.5833F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
            ))
            .addBoneAnimation("right_arm", new Transformation(Transformation.Targets.ROTATE,
                    new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
                    new Keyframe(0.9167F, AnimationHelper.createRotationalVector(2.5F, 0.0F, 5.0F), Transformation.Interpolations.LINEAR),
                    new Keyframe(1.5833F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
            ))
            .addBoneAnimation("right_arm", new Transformation(Transformation.Targets.TRANSLATE,
                    new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
                    new Keyframe(0.4167F, AnimationHelper.createTranslationalVector(0.2F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
                    new Keyframe(1.0833F, AnimationHelper.createTranslationalVector(-0.2F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
                    new Keyframe(1.5833F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
            ))
            .addBoneAnimation("left_leg", new Transformation(Transformation.Targets.ROTATE,
                    new Keyframe(0.0F, AnimationHelper.createRotationalVector(2.5F, 20.0F, -5.0F), Transformation.Interpolations.LINEAR),
                    new Keyframe(0.9583F, AnimationHelper.createRotationalVector(5.0F, 20.0F, -5.0F), Transformation.Interpolations.LINEAR),
                    new Keyframe(1.5833F, AnimationHelper.createRotationalVector(2.5F, 20.0F, -5.0F), Transformation.Interpolations.LINEAR)
            ))
            .addBoneAnimation("left_leg", new Transformation(Transformation.Targets.TRANSLATE,
                    new Keyframe(0.0F, AnimationHelper.createTranslationalVector(1.0F, 0.0F, 1.0F), Transformation.Interpolations.LINEAR),
                    new Keyframe(0.5417F, AnimationHelper.createTranslationalVector(1.0F, 0.0F, 0.8F), Transformation.Interpolations.LINEAR),
                    new Keyframe(1.5833F, AnimationHelper.createTranslationalVector(1.0F, 0.0F, 1.0F), Transformation.Interpolations.LINEAR)
            ))
            .addBoneAnimation("right_leg", new Transformation(Transformation.Targets.ROTATE,
                    new Keyframe(0.0F, AnimationHelper.createRotationalVector(-10.0F, 12.5F, 0.0F), Transformation.Interpolations.LINEAR),
                    new Keyframe(0.9583F, AnimationHelper.createRotationalVector(-11.0F, 12.5F, 0.0F), Transformation.Interpolations.LINEAR),
                    new Keyframe(1.5833F, AnimationHelper.createRotationalVector(-10.0F, 12.5F, 0.0F), Transformation.Interpolations.LINEAR)
            ))
            .addBoneAnimation("right_leg", new Transformation(Transformation.Targets.TRANSLATE,
                    new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
                    new Keyframe(0.5833F, AnimationHelper.createTranslationalVector(-0.4F, 0.0F, -0.2F), Transformation.Interpolations.LINEAR),
                    new Keyframe(1.5833F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
            ))
            .build();

    public static final Animation walk = Animation.Builder.create(2.25F).looping()
            .addBoneAnimation("head", new Transformation(Transformation.Targets.ROTATE,
                    new Keyframe(0.0F, AnimationHelper.createRotationalVector(-2.5F, 0.0F, 7.5F), Transformation.Interpolations.LINEAR),
                    new Keyframe(0.625F, AnimationHelper.createRotationalVector(-7.4929F, -0.3262F, 5.0214F), Transformation.Interpolations.LINEAR),
                    new Keyframe(1.0833F, AnimationHelper.createRotationalVector(3.8554F, 0.0976F, 0.699F), Transformation.Interpolations.LINEAR),
                    new Keyframe(1.2917F, AnimationHelper.createRotationalVector(-1.987F, 0.1845F, 4.3053F), Transformation.Interpolations.LINEAR),
                    new Keyframe(2.25F, AnimationHelper.createRotationalVector(-2.5F, 0.0F, 7.5F), Transformation.Interpolations.LINEAR)
            ))
            .addBoneAnimation("head", new Transformation(Transformation.Targets.TRANSLATE,
                    new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.5F, 1.0F), Transformation.Interpolations.LINEAR),
                    new Keyframe(0.75F, AnimationHelper.createTranslationalVector(0.6F, 0.4F, 1.0F), Transformation.Interpolations.LINEAR),
                    new Keyframe(1.25F, AnimationHelper.createTranslationalVector(0.41F, -0.73F, 1.0F), Transformation.Interpolations.LINEAR),
                    new Keyframe(2.25F, AnimationHelper.createTranslationalVector(0.0F, 0.5F, 1.0F), Transformation.Interpolations.LINEAR)
            ))
            .addBoneAnimation("body", new Transformation(Transformation.Targets.ROTATE,
                    new Keyframe(0.0F, AnimationHelper.createRotationalVector(-5.0F, -5.0F, -2.5F), Transformation.Interpolations.LINEAR),
                    new Keyframe(0.5417F, AnimationHelper.createRotationalVector(-10.3503F, -4.6004F, 1.8125F), Transformation.Interpolations.LINEAR),
                    new Keyframe(0.8333F, AnimationHelper.createRotationalVector(-5.6087F, -4.3057F, 4.9926F), Transformation.Interpolations.LINEAR),
                    new Keyframe(1.375F, AnimationHelper.createRotationalVector(-0.1056F, -4.046F, -1.6345F), Transformation.Interpolations.LINEAR),
                    new Keyframe(2.25F, AnimationHelper.createRotationalVector(-5.0F, -5.0F, -2.5F), Transformation.Interpolations.LINEAR)
            ))
            .addBoneAnimation("body", new Transformation(Transformation.Targets.TRANSLATE,
                    new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 1.0F), Transformation.Interpolations.LINEAR),
                    new Keyframe(0.75F, AnimationHelper.createTranslationalVector(0.6F, 0.4F, 1.0F), Transformation.Interpolations.LINEAR),
                    new Keyframe(1.25F, AnimationHelper.createTranslationalVector(0.41F, -0.73F, 1.0F), Transformation.Interpolations.LINEAR),
                    new Keyframe(2.25F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 1.0F), Transformation.Interpolations.LINEAR)
            ))
            .addBoneAnimation("left_arm", new Transformation(Transformation.Targets.ROTATE,
                    new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
                    new Keyframe(0.5833F, AnimationHelper.createRotationalVector(-12.4885F, -0.5409F, -2.4408F), Transformation.Interpolations.LINEAR),
                    new Keyframe(1.5F, AnimationHelper.createRotationalVector(11.2366F, 1.0888F, -9.0594F), Transformation.Interpolations.LINEAR),
                    new Keyframe(2.25F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
            ))
            .addBoneAnimation("left_arm", new Transformation(Transformation.Targets.TRANSLATE,
                    new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
                    new Keyframe(2.25F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
            ))
            .addBoneAnimation("right_arm", new Transformation(Transformation.Targets.ROTATE,
                    new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
                    new Keyframe(0.4583F, AnimationHelper.createRotationalVector(-12.4048F, -3.8728F, -2.4457F), Transformation.Interpolations.LINEAR),
                    new Keyframe(1.5417F, AnimationHelper.createRotationalVector(12.5826F, -4.4691F, 5.8187F), Transformation.Interpolations.LINEAR),
                    new Keyframe(2.25F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
            ))
            .addBoneAnimation("right_arm", new Transformation(Transformation.Targets.TRANSLATE,
                    new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
                    new Keyframe(2.25F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
            ))
            .addBoneAnimation("left_leg", new Transformation(Transformation.Targets.ROTATE,
                    new Keyframe(0.0F, AnimationHelper.createRotationalVector(2.5F, 20.0F, -5.0F), Transformation.Interpolations.LINEAR),
                    new Keyframe(0.625F, AnimationHelper.createRotationalVector(12.5F, 20.0F, -5.0F), Transformation.Interpolations.LINEAR),
                    new Keyframe(1.375F, AnimationHelper.createRotationalVector(-2.9234F, 7.517F, -4.3269F), Transformation.Interpolations.LINEAR),
                    new Keyframe(1.5417F, AnimationHelper.createRotationalVector(-10.141F, -3.598F, -3.8225F), Transformation.Interpolations.LINEAR),
                    new Keyframe(2.25F, AnimationHelper.createRotationalVector(2.5F, 20.0F, -5.0F), Transformation.Interpolations.LINEAR)
            ))
            .addBoneAnimation("left_leg", new Transformation(Transformation.Targets.TRANSLATE,
                    new Keyframe(0.0F, AnimationHelper.createTranslationalVector(1.0F, 0.0F, 1.0F), Transformation.Interpolations.LINEAR),
                    new Keyframe(0.5417F, AnimationHelper.createTranslationalVector(1.0F, -1.0F, 1.71F), Transformation.Interpolations.LINEAR),
                    new Keyframe(0.75F, AnimationHelper.createTranslationalVector(1.0F, 0.0F, 2.0F), Transformation.Interpolations.LINEAR),
                    new Keyframe(1.2917F, AnimationHelper.createTranslationalVector(1.2F, 1.0F, 1.69F), Transformation.Interpolations.LINEAR),
                    new Keyframe(1.625F, AnimationHelper.createTranslationalVector(1.3F, -0.24F, -0.5F), Transformation.Interpolations.LINEAR),
                    new Keyframe(2.25F, AnimationHelper.createTranslationalVector(1.0F, 0.0F, 1.0F), Transformation.Interpolations.LINEAR)
            ))
            .addBoneAnimation("right_leg", new Transformation(Transformation.Targets.ROTATE,
                    new Keyframe(0.0F, AnimationHelper.createRotationalVector(-10.0F, 12.5F, 0.0F), Transformation.Interpolations.LINEAR),
                    new Keyframe(0.3333F, AnimationHelper.createRotationalVector(-15.8311F, 22.1422F, -2.7812F), Transformation.Interpolations.LINEAR),
                    new Keyframe(0.875F, AnimationHelper.createRotationalVector(-11.0532F, 7.5941F, 0.9807F), Transformation.Interpolations.LINEAR),
                    new Keyframe(1.2917F, AnimationHelper.createRotationalVector(6.9016F, -5.3863F, -1.2084F), Transformation.Interpolations.LINEAR),
                    new Keyframe(2.25F, AnimationHelper.createRotationalVector(-10.0F, 12.5F, 0.0F), Transformation.Interpolations.LINEAR)
            ))
            .addBoneAnimation("right_leg", new Transformation(Transformation.Targets.TRANSLATE,
                    new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
                    new Keyframe(0.5F, AnimationHelper.createTranslationalVector(0.0F, 1.3F, -1.0F), Transformation.Interpolations.LINEAR),
                    new Keyframe(0.7917F, AnimationHelper.createTranslationalVector(0.0F, -0.51F, -0.74F), Transformation.Interpolations.LINEAR),
                    new Keyframe(1.4583F, AnimationHelper.createTranslationalVector(0.0F, -0.34F, 0.59F), Transformation.Interpolations.LINEAR),
                    new Keyframe(2.25F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
            ))
            .build();

    public static final Animation attack = Animation.Builder.create(2.3333F)
            .addBoneAnimation("head", new Transformation(Transformation.Targets.ROTATE,
                    new Keyframe(0.0F, AnimationHelper.createRotationalVector(-2.5F, 0.0F, 7.5F), Transformation.Interpolations.LINEAR),
                    new Keyframe(0.625F, AnimationHelper.createRotationalVector(-7.4929F, -0.3262F, 5.0214F), Transformation.Interpolations.LINEAR),
                    new Keyframe(1.0833F, AnimationHelper.createRotationalVector(3.8554F, 0.0976F, 0.699F), Transformation.Interpolations.LINEAR),
                    new Keyframe(1.2917F, AnimationHelper.createRotationalVector(-1.987F, 0.1845F, 4.3053F), Transformation.Interpolations.LINEAR),
                    new Keyframe(2.25F, AnimationHelper.createRotationalVector(-2.5F, 0.0F, 7.5F), Transformation.Interpolations.LINEAR)
            ))
            .addBoneAnimation("head", new Transformation(Transformation.Targets.TRANSLATE,
                    new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.5F, 1.0F), Transformation.Interpolations.LINEAR),
                    new Keyframe(0.75F, AnimationHelper.createTranslationalVector(0.6F, 0.4F, 1.0F), Transformation.Interpolations.LINEAR),
                    new Keyframe(1.25F, AnimationHelper.createTranslationalVector(0.41F, -0.73F, 1.0F), Transformation.Interpolations.LINEAR),
                    new Keyframe(2.25F, AnimationHelper.createTranslationalVector(0.0F, 0.5F, 1.0F), Transformation.Interpolations.LINEAR)
            ))
            .addBoneAnimation("body", new Transformation(Transformation.Targets.ROTATE,
                    new Keyframe(0.0F, AnimationHelper.createRotationalVector(-5.0F, -5.0F, -2.5F), Transformation.Interpolations.LINEAR),
                    new Keyframe(0.5417F, AnimationHelper.createRotationalVector(-10.3503F, -4.6004F, 1.8125F), Transformation.Interpolations.LINEAR),
                    new Keyframe(0.8333F, AnimationHelper.createRotationalVector(-5.6087F, -4.3057F, 4.9926F), Transformation.Interpolations.LINEAR),
                    new Keyframe(1.375F, AnimationHelper.createRotationalVector(-0.1056F, -4.046F, -1.6345F), Transformation.Interpolations.LINEAR),
                    new Keyframe(2.25F, AnimationHelper.createRotationalVector(-5.0F, -5.0F, -2.5F), Transformation.Interpolations.LINEAR)
            ))
            .addBoneAnimation("body", new Transformation(Transformation.Targets.TRANSLATE,
                    new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 1.0F), Transformation.Interpolations.LINEAR),
                    new Keyframe(0.75F, AnimationHelper.createTranslationalVector(0.6F, 0.4F, 1.0F), Transformation.Interpolations.LINEAR),
                    new Keyframe(1.25F, AnimationHelper.createTranslationalVector(0.41F, -0.73F, 1.0F), Transformation.Interpolations.LINEAR),
                    new Keyframe(2.25F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 1.0F), Transformation.Interpolations.LINEAR)
            ))
            .addBoneAnimation("left_arm", new Transformation(Transformation.Targets.ROTATE,
                    new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
                    new Keyframe(1.2917F, AnimationHelper.createRotationalVector(-138.5298F, 11.9533F, 26.1439F), Transformation.Interpolations.LINEAR),
                    new Keyframe(1.5417F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
                    new Keyframe(1.8333F, AnimationHelper.createRotationalVector(9.9162F, 1.2988F, -7.3873F), Transformation.Interpolations.LINEAR),
                    new Keyframe(2.25F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
            ))
            .addBoneAnimation("left_arm", new Transformation(Transformation.Targets.TRANSLATE,
                    new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
                    new Keyframe(1.625F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
                    new Keyframe(2.25F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
            ))
            .addBoneAnimation("right_arm", new Transformation(Transformation.Targets.ROTATE,
                    new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
                    new Keyframe(1.1667F, AnimationHelper.createRotationalVector(-132.2179F, 13.795F, 7.765F), Transformation.Interpolations.LINEAR),
                    new Keyframe(1.5417F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
                    new Keyframe(1.875F, AnimationHelper.createRotationalVector(7.4536F, 3.9817F, 8.0845F), Transformation.Interpolations.LINEAR),
                    new Keyframe(2.25F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
            ))
            .addBoneAnimation("right_arm", new Transformation(Transformation.Targets.TRANSLATE,
                    new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
                    new Keyframe(1.625F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
                    new Keyframe(2.25F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
            ))
            .addBoneAnimation("left_leg", new Transformation(Transformation.Targets.ROTATE,
                    new Keyframe(0.0F, AnimationHelper.createRotationalVector(2.5F, 20.0F, -5.0F), Transformation.Interpolations.LINEAR),
                    new Keyframe(1.1667F, AnimationHelper.createRotationalVector(12.5F, 20.0F, -5.0F), Transformation.Interpolations.LINEAR),
                    new Keyframe(1.625F, AnimationHelper.createRotationalVector(-2.9234F, 7.517F, -4.3269F), Transformation.Interpolations.LINEAR),
                    new Keyframe(1.7083F, AnimationHelper.createRotationalVector(-10.141F, -3.598F, -3.8225F), Transformation.Interpolations.LINEAR),
                    new Keyframe(2.25F, AnimationHelper.createRotationalVector(2.5F, 20.0F, -5.0F), Transformation.Interpolations.LINEAR)
            ))
            .addBoneAnimation("left_leg", new Transformation(Transformation.Targets.TRANSLATE,
                    new Keyframe(0.0F, AnimationHelper.createTranslationalVector(1.0F, 0.0F, 1.0F), Transformation.Interpolations.LINEAR),
                    new Keyframe(1.0833F, AnimationHelper.createTranslationalVector(1.0F, -1.0F, 1.71F), Transformation.Interpolations.LINEAR),
                    new Keyframe(1.25F, AnimationHelper.createTranslationalVector(1.0F, 0.0F, 2.0F), Transformation.Interpolations.LINEAR),
                    new Keyframe(1.5833F, AnimationHelper.createTranslationalVector(1.2F, 1.0F, 1.69F), Transformation.Interpolations.LINEAR),
                    new Keyframe(1.7917F, AnimationHelper.createTranslationalVector(1.3F, -0.24F, -0.5F), Transformation.Interpolations.LINEAR),
                    new Keyframe(2.25F, AnimationHelper.createTranslationalVector(1.0F, 0.0F, 1.0F), Transformation.Interpolations.LINEAR)
            ))
            .addBoneAnimation("right_leg", new Transformation(Transformation.Targets.ROTATE,
                    new Keyframe(0.0F, AnimationHelper.createRotationalVector(-10.0F, 12.5F, 0.0F), Transformation.Interpolations.LINEAR),
                    new Keyframe(1.0F, AnimationHelper.createRotationalVector(-15.8311F, 22.1422F, -2.7812F), Transformation.Interpolations.LINEAR),
                    new Keyframe(1.3333F, AnimationHelper.createRotationalVector(-11.0532F, 7.5941F, 0.9807F), Transformation.Interpolations.LINEAR),
                    new Keyframe(1.5833F, AnimationHelper.createRotationalVector(6.9016F, -5.3863F, -1.2084F), Transformation.Interpolations.LINEAR),
                    new Keyframe(2.25F, AnimationHelper.createRotationalVector(-10.0F, 12.5F, 0.0F), Transformation.Interpolations.LINEAR)
            ))
            .addBoneAnimation("right_leg", new Transformation(Transformation.Targets.TRANSLATE,
                    new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
                    new Keyframe(1.0833F, AnimationHelper.createTranslationalVector(0.0F, 1.3F, -1.0F), Transformation.Interpolations.LINEAR),
                    new Keyframe(1.25F, AnimationHelper.createTranslationalVector(0.0F, -0.51F, -0.74F), Transformation.Interpolations.LINEAR),
                    new Keyframe(1.625F, AnimationHelper.createTranslationalVector(0.0F, -0.34F, 0.59F), Transformation.Interpolations.LINEAR),
                    new Keyframe(2.25F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
            ))
            .build();
}

