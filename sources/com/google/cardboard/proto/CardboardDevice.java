package com.google.cardboard.proto;

import com.google.protobuf.ExtensionRegistryLite;
import defpackage.aifs;
import defpackage.aigj;
import defpackage.aigm;
import defpackage.aihf;
import defpackage.aihm;
import defpackage.aihn;
import defpackage.aihr;
import defpackage.aihs;
import defpackage.aiht;
import defpackage.aihu;
import defpackage.aiis;
import defpackage.aiix;
import j$.util.DesugarCollections;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class CardboardDevice {

    /* JADX INFO: renamed from: com.google.cardboard.proto.CardboardDevice$1, reason: invalid class name */
    /* JADX INFO: compiled from: PG */
    /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;

        static {
            int[] iArr = new int[aihm.values().length];
            $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke = iArr;
            try {
                iArr[aihm.d.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[aihm.e.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[aihm.c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[aihm.f.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[aihm.g.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* JADX INFO: compiled from: PG */
    public interface DeviceParamsOrBuilder extends aiis {
        float getDistortionCoefficients(int i);

        int getDistortionCoefficientsCount();

        List getDistortionCoefficientsList();

        float getInterLensDistance();

        float getLeftEyeFieldOfViewAngles(int i);

        int getLeftEyeFieldOfViewAnglesCount();

        List getLeftEyeFieldOfViewAnglesList();

        String getModel();

        aigj getModelBytes();

        DeviceParams.ButtonType getPrimaryButton();

        float getScreenToLensDistance();

        float getTrayToLensDistance();

        String getVendor();

        aigj getVendorBytes();

        DeviceParams.VerticalAlignmentType getVerticalAlignment();

        boolean hasInterLensDistance();

        boolean hasModel();

        boolean hasPrimaryButton();

        boolean hasScreenToLensDistance();

        boolean hasTrayToLensDistance();

        boolean hasVendor();

        boolean hasVerticalAlignment();
    }

    private CardboardDevice() {
    }

    /* JADX INFO: compiled from: PG */
    public final class DeviceParams extends aihn implements DeviceParamsOrBuilder {
        private static final DeviceParams DEFAULT_INSTANCE;
        public static final int DISTORTION_COEFFICIENTS_FIELD_NUMBER = 7;
        public static final int INTER_LENS_DISTANCE_FIELD_NUMBER = 4;
        public static final int LEFT_EYE_FIELD_OF_VIEW_ANGLES_FIELD_NUMBER = 5;
        public static final int MODEL_FIELD_NUMBER = 2;
        public static final int PRIMARY_BUTTON_FIELD_NUMBER = 12;
        public static final int SCREEN_TO_LENS_DISTANCE_FIELD_NUMBER = 3;
        public static final int TRAY_TO_LENS_DISTANCE_FIELD_NUMBER = 6;
        public static final int VENDOR_FIELD_NUMBER = 1;
        public static final int VERTICAL_ALIGNMENT_FIELD_NUMBER = 11;
        private int bitField0_;
        private float interLensDistance_;
        private float screenToLensDistance_;
        private float trayToLensDistance_;
        private int verticalAlignment_;
        private int leftEyeFieldOfViewAnglesMemoizedSerializedSize = -1;
        private int distortionCoefficientsMemoizedSerializedSize = -1;
        private String vendor_ = "";
        private String model_ = "";
        private aihu leftEyeFieldOfViewAngles_ = emptyFloatList();
        private aihu distortionCoefficients_ = emptyFloatList();
        private int primaryButton_ = 1;

        /* JADX INFO: compiled from: PG */
        public final class Builder extends aihf implements DeviceParamsOrBuilder {
            private Builder() {
                super(DeviceParams.DEFAULT_INSTANCE);
            }

            public Builder addAllDistortionCoefficients(Iterable iterable) {
                copyOnWrite();
                ((DeviceParams) this.instance).addAllDistortionCoefficients(iterable);
                return this;
            }

            public Builder addAllLeftEyeFieldOfViewAngles(Iterable iterable) {
                copyOnWrite();
                ((DeviceParams) this.instance).addAllLeftEyeFieldOfViewAngles(iterable);
                return this;
            }

            public Builder addDistortionCoefficients(float f) {
                copyOnWrite();
                ((DeviceParams) this.instance).addDistortionCoefficients(f);
                return this;
            }

            public Builder addLeftEyeFieldOfViewAngles(float f) {
                copyOnWrite();
                ((DeviceParams) this.instance).addLeftEyeFieldOfViewAngles(f);
                return this;
            }

            public Builder clearDistortionCoefficients() {
                copyOnWrite();
                ((DeviceParams) this.instance).clearDistortionCoefficients();
                return this;
            }

            public Builder clearInterLensDistance() {
                copyOnWrite();
                ((DeviceParams) this.instance).clearInterLensDistance();
                return this;
            }

            public Builder clearLeftEyeFieldOfViewAngles() {
                copyOnWrite();
                ((DeviceParams) this.instance).clearLeftEyeFieldOfViewAngles();
                return this;
            }

            public Builder clearModel() {
                copyOnWrite();
                ((DeviceParams) this.instance).clearModel();
                return this;
            }

            public Builder clearPrimaryButton() {
                copyOnWrite();
                ((DeviceParams) this.instance).clearPrimaryButton();
                return this;
            }

            public Builder clearScreenToLensDistance() {
                copyOnWrite();
                ((DeviceParams) this.instance).clearScreenToLensDistance();
                return this;
            }

            public Builder clearTrayToLensDistance() {
                copyOnWrite();
                ((DeviceParams) this.instance).clearTrayToLensDistance();
                return this;
            }

            public Builder clearVendor() {
                copyOnWrite();
                ((DeviceParams) this.instance).clearVendor();
                return this;
            }

            public Builder clearVerticalAlignment() {
                copyOnWrite();
                ((DeviceParams) this.instance).clearVerticalAlignment();
                return this;
            }

            @Override // com.google.cardboard.proto.CardboardDevice.DeviceParamsOrBuilder
            public float getDistortionCoefficients(int i) {
                return ((DeviceParams) this.instance).getDistortionCoefficients(i);
            }

            @Override // com.google.cardboard.proto.CardboardDevice.DeviceParamsOrBuilder
            public int getDistortionCoefficientsCount() {
                return ((DeviceParams) this.instance).getDistortionCoefficientsCount();
            }

            @Override // com.google.cardboard.proto.CardboardDevice.DeviceParamsOrBuilder
            public List getDistortionCoefficientsList() {
                return DesugarCollections.unmodifiableList(((DeviceParams) this.instance).getDistortionCoefficientsList());
            }

            @Override // com.google.cardboard.proto.CardboardDevice.DeviceParamsOrBuilder
            public float getInterLensDistance() {
                return ((DeviceParams) this.instance).getInterLensDistance();
            }

            @Override // com.google.cardboard.proto.CardboardDevice.DeviceParamsOrBuilder
            public float getLeftEyeFieldOfViewAngles(int i) {
                return ((DeviceParams) this.instance).getLeftEyeFieldOfViewAngles(i);
            }

            @Override // com.google.cardboard.proto.CardboardDevice.DeviceParamsOrBuilder
            public int getLeftEyeFieldOfViewAnglesCount() {
                return ((DeviceParams) this.instance).getLeftEyeFieldOfViewAnglesCount();
            }

            @Override // com.google.cardboard.proto.CardboardDevice.DeviceParamsOrBuilder
            public List getLeftEyeFieldOfViewAnglesList() {
                return DesugarCollections.unmodifiableList(((DeviceParams) this.instance).getLeftEyeFieldOfViewAnglesList());
            }

            @Override // com.google.cardboard.proto.CardboardDevice.DeviceParamsOrBuilder
            public String getModel() {
                return ((DeviceParams) this.instance).getModel();
            }

            @Override // com.google.cardboard.proto.CardboardDevice.DeviceParamsOrBuilder
            public aigj getModelBytes() {
                return ((DeviceParams) this.instance).getModelBytes();
            }

            @Override // com.google.cardboard.proto.CardboardDevice.DeviceParamsOrBuilder
            public ButtonType getPrimaryButton() {
                return ((DeviceParams) this.instance).getPrimaryButton();
            }

            @Override // com.google.cardboard.proto.CardboardDevice.DeviceParamsOrBuilder
            public float getScreenToLensDistance() {
                return ((DeviceParams) this.instance).getScreenToLensDistance();
            }

            @Override // com.google.cardboard.proto.CardboardDevice.DeviceParamsOrBuilder
            public float getTrayToLensDistance() {
                return ((DeviceParams) this.instance).getTrayToLensDistance();
            }

            @Override // com.google.cardboard.proto.CardboardDevice.DeviceParamsOrBuilder
            public String getVendor() {
                return ((DeviceParams) this.instance).getVendor();
            }

            @Override // com.google.cardboard.proto.CardboardDevice.DeviceParamsOrBuilder
            public aigj getVendorBytes() {
                return ((DeviceParams) this.instance).getVendorBytes();
            }

            @Override // com.google.cardboard.proto.CardboardDevice.DeviceParamsOrBuilder
            public VerticalAlignmentType getVerticalAlignment() {
                return ((DeviceParams) this.instance).getVerticalAlignment();
            }

            @Override // com.google.cardboard.proto.CardboardDevice.DeviceParamsOrBuilder
            public boolean hasInterLensDistance() {
                return ((DeviceParams) this.instance).hasInterLensDistance();
            }

            @Override // com.google.cardboard.proto.CardboardDevice.DeviceParamsOrBuilder
            public boolean hasModel() {
                return ((DeviceParams) this.instance).hasModel();
            }

            @Override // com.google.cardboard.proto.CardboardDevice.DeviceParamsOrBuilder
            public boolean hasPrimaryButton() {
                return ((DeviceParams) this.instance).hasPrimaryButton();
            }

            @Override // com.google.cardboard.proto.CardboardDevice.DeviceParamsOrBuilder
            public boolean hasScreenToLensDistance() {
                return ((DeviceParams) this.instance).hasScreenToLensDistance();
            }

            @Override // com.google.cardboard.proto.CardboardDevice.DeviceParamsOrBuilder
            public boolean hasTrayToLensDistance() {
                return ((DeviceParams) this.instance).hasTrayToLensDistance();
            }

            @Override // com.google.cardboard.proto.CardboardDevice.DeviceParamsOrBuilder
            public boolean hasVendor() {
                return ((DeviceParams) this.instance).hasVendor();
            }

            @Override // com.google.cardboard.proto.CardboardDevice.DeviceParamsOrBuilder
            public boolean hasVerticalAlignment() {
                return ((DeviceParams) this.instance).hasVerticalAlignment();
            }

            public Builder setDistortionCoefficients(int i, float f) {
                copyOnWrite();
                ((DeviceParams) this.instance).setDistortionCoefficients(i, f);
                return this;
            }

            public Builder setInterLensDistance(float f) {
                copyOnWrite();
                ((DeviceParams) this.instance).setInterLensDistance(f);
                return this;
            }

            public Builder setLeftEyeFieldOfViewAngles(int i, float f) {
                copyOnWrite();
                ((DeviceParams) this.instance).setLeftEyeFieldOfViewAngles(i, f);
                return this;
            }

            public Builder setModel(String str) {
                copyOnWrite();
                ((DeviceParams) this.instance).setModel(str);
                return this;
            }

            public Builder setModelBytes(aigj aigjVar) {
                copyOnWrite();
                ((DeviceParams) this.instance).setModelBytes(aigjVar);
                return this;
            }

            public Builder setPrimaryButton(ButtonType buttonType) {
                copyOnWrite();
                ((DeviceParams) this.instance).setPrimaryButton(buttonType);
                return this;
            }

            public Builder setScreenToLensDistance(float f) {
                copyOnWrite();
                ((DeviceParams) this.instance).setScreenToLensDistance(f);
                return this;
            }

            public Builder setTrayToLensDistance(float f) {
                copyOnWrite();
                ((DeviceParams) this.instance).setTrayToLensDistance(f);
                return this;
            }

            public Builder setVendor(String str) {
                copyOnWrite();
                ((DeviceParams) this.instance).setVendor(str);
                return this;
            }

            public Builder setVendorBytes(aigj aigjVar) {
                copyOnWrite();
                ((DeviceParams) this.instance).setVendorBytes(aigjVar);
                return this;
            }

            public Builder setVerticalAlignment(VerticalAlignmentType verticalAlignmentType) {
                copyOnWrite();
                ((DeviceParams) this.instance).setVerticalAlignment(verticalAlignmentType);
                return this;
            }
        }

        /* JADX INFO: compiled from: PG */
        public enum ButtonType implements aihr {
            NONE(0),
            MAGNET(1),
            TOUCH(2),
            INDIRECT_TOUCH(3);

            public static final int INDIRECT_TOUCH_VALUE = 3;
            public static final int MAGNET_VALUE = 1;
            public static final int NONE_VALUE = 0;
            public static final int TOUCH_VALUE = 2;
            private static final aihs internalValueMap = new aihs() { // from class: com.google.cardboard.proto.CardboardDevice.DeviceParams.ButtonType.1
                @Override // defpackage.aihs
                public ButtonType findValueByNumber(int i) {
                    return ButtonType.forNumber(i);
                }
            };
            private final int value;

            /* JADX INFO: compiled from: PG */
            final class ButtonTypeVerifier implements aiht {
                static final aiht INSTANCE = new ButtonTypeVerifier();

                private ButtonTypeVerifier() {
                }

                @Override // defpackage.aiht
                public boolean isInRange(int i) {
                    return ButtonType.forNumber(i) != null;
                }
            }

            ButtonType(int i) {
                this.value = i;
            }

            public static ButtonType forNumber(int i) {
                if (i == 0) {
                    return NONE;
                }
                if (i == 1) {
                    return MAGNET;
                }
                if (i == 2) {
                    return TOUCH;
                }
                if (i != 3) {
                    return null;
                }
                return INDIRECT_TOUCH;
            }

            public static aihs internalGetValueMap() {
                return internalValueMap;
            }

            public static aiht internalGetVerifier() {
                return ButtonTypeVerifier.INSTANCE;
            }

            @Override // defpackage.aihr
            public final int getNumber() {
                return this.value;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return Integer.toString(this.value);
            }
        }

        /* JADX INFO: compiled from: PG */
        public enum VerticalAlignmentType implements aihr {
            BOTTOM(0),
            CENTER(1),
            TOP(2);

            public static final int BOTTOM_VALUE = 0;
            public static final int CENTER_VALUE = 1;
            public static final int TOP_VALUE = 2;
            private static final aihs internalValueMap = new aihs() { // from class: com.google.cardboard.proto.CardboardDevice.DeviceParams.VerticalAlignmentType.1
                @Override // defpackage.aihs
                public VerticalAlignmentType findValueByNumber(int i) {
                    return VerticalAlignmentType.forNumber(i);
                }
            };
            private final int value;

            /* JADX INFO: compiled from: PG */
            final class VerticalAlignmentTypeVerifier implements aiht {
                static final aiht INSTANCE = new VerticalAlignmentTypeVerifier();

                private VerticalAlignmentTypeVerifier() {
                }

                @Override // defpackage.aiht
                public boolean isInRange(int i) {
                    return VerticalAlignmentType.forNumber(i) != null;
                }
            }

            VerticalAlignmentType(int i) {
                this.value = i;
            }

            public static VerticalAlignmentType forNumber(int i) {
                if (i == 0) {
                    return BOTTOM;
                }
                if (i == 1) {
                    return CENTER;
                }
                if (i != 2) {
                    return null;
                }
                return TOP;
            }

            public static aihs internalGetValueMap() {
                return internalValueMap;
            }

            public static aiht internalGetVerifier() {
                return VerticalAlignmentTypeVerifier.INSTANCE;
            }

            @Override // defpackage.aihr
            public final int getNumber() {
                return this.value;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return Integer.toString(this.value);
            }
        }

        static {
            DeviceParams deviceParams = new DeviceParams();
            DEFAULT_INSTANCE = deviceParams;
            aihn.registerDefaultInstance(DeviceParams.class, deviceParams);
        }

        private DeviceParams() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllDistortionCoefficients(Iterable iterable) {
            ensureDistortionCoefficientsIsMutable();
            aifs.addAll(iterable, this.distortionCoefficients_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllLeftEyeFieldOfViewAngles(Iterable iterable) {
            ensureLeftEyeFieldOfViewAnglesIsMutable();
            aifs.addAll(iterable, this.leftEyeFieldOfViewAngles_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addDistortionCoefficients(float f) {
            ensureDistortionCoefficientsIsMutable();
            this.distortionCoefficients_.h(f);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addLeftEyeFieldOfViewAngles(float f) {
            ensureLeftEyeFieldOfViewAnglesIsMutable();
            this.leftEyeFieldOfViewAngles_.h(f);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDistortionCoefficients() {
            this.distortionCoefficients_ = emptyFloatList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearInterLensDistance() {
            this.bitField0_ &= -9;
            this.interLensDistance_ = 0.0f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLeftEyeFieldOfViewAngles() {
            this.leftEyeFieldOfViewAngles_ = emptyFloatList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearModel() {
            this.bitField0_ &= -3;
            this.model_ = getDefaultInstance().getModel();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPrimaryButton() {
            this.bitField0_ &= -65;
            this.primaryButton_ = 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearScreenToLensDistance() {
            this.bitField0_ &= -5;
            this.screenToLensDistance_ = 0.0f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTrayToLensDistance() {
            this.bitField0_ &= -33;
            this.trayToLensDistance_ = 0.0f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearVendor() {
            this.bitField0_ &= -2;
            this.vendor_ = getDefaultInstance().getVendor();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearVerticalAlignment() {
            this.bitField0_ &= -17;
            this.verticalAlignment_ = 0;
        }

        private void ensureDistortionCoefficientsIsMutable() {
            aihu aihuVar = this.distortionCoefficients_;
            if (aihuVar.c()) {
                return;
            }
            this.distortionCoefficients_ = aihn.mutableCopy(aihuVar);
        }

        private void ensureLeftEyeFieldOfViewAnglesIsMutable() {
            aihu aihuVar = this.leftEyeFieldOfViewAngles_;
            if (aihuVar.c()) {
                return;
            }
            this.leftEyeFieldOfViewAngles_ = aihn.mutableCopy(aihuVar);
        }

        public static DeviceParams getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static DeviceParams parseDelimitedFrom(InputStream inputStream) {
            return (DeviceParams) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static DeviceParams parseFrom(aigj aigjVar) {
            return (DeviceParams) aihn.parseFrom(DEFAULT_INSTANCE, aigjVar);
        }

        public static aiix parser() {
            return aihn.getParserForClass(DeviceParams.class);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDistortionCoefficients(int i, float f) {
            ensureDistortionCoefficientsIsMutable();
            this.distortionCoefficients_.f(i, f);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setInterLensDistance(float f) {
            this.bitField0_ |= 8;
            this.interLensDistance_ = f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLeftEyeFieldOfViewAngles(int i, float f) {
            ensureLeftEyeFieldOfViewAnglesIsMutable();
            this.leftEyeFieldOfViewAngles_.f(i, f);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setModel(String str) {
            str.getClass();
            this.bitField0_ |= 2;
            this.model_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setModelBytes(aigj aigjVar) {
            this.model_ = aigjVar.B();
            this.bitField0_ |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPrimaryButton(ButtonType buttonType) {
            this.primaryButton_ = buttonType.getNumber();
            this.bitField0_ |= 64;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setScreenToLensDistance(float f) {
            this.bitField0_ |= 4;
            this.screenToLensDistance_ = f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTrayToLensDistance(float f) {
            this.bitField0_ |= 32;
            this.trayToLensDistance_ = f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setVendor(String str) {
            str.getClass();
            this.bitField0_ |= 1;
            this.vendor_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setVendorBytes(aigj aigjVar) {
            this.vendor_ = aigjVar.B();
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setVerticalAlignment(VerticalAlignmentType verticalAlignmentType) {
            this.verticalAlignment_ = verticalAlignmentType.getNumber();
            this.bitField0_ |= 16;
        }

        @Override // defpackage.aihn
        protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
            int iOrdinal = aihmVar.ordinal();
            if (iOrdinal == 2) {
                return newMessageInfo(DEFAULT_INSTANCE, "\u0001\t\u0000\u0001\u0001\f\t\u0000\u0002\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ခ\u0002\u0004ခ\u0003\u0005$\u0006ခ\u0005\u0007$\u000b᠌\u0004\f᠌\u0006", new Object[]{"bitField0_", "vendor_", "model_", "screenToLensDistance_", "interLensDistance_", "leftEyeFieldOfViewAngles_", "trayToLensDistance_", "distortionCoefficients_", "verticalAlignment_", VerticalAlignmentType.internalGetVerifier(), "primaryButton_", ButtonType.internalGetVerifier()});
            }
            if (iOrdinal == 3) {
                return new DeviceParams();
            }
            if (iOrdinal == 4) {
                return new Builder();
            }
            if (iOrdinal == 5) {
                return DEFAULT_INSTANCE;
            }
            if (iOrdinal == 6) {
                return aihn.getParserForClass(DeviceParams.class);
            }
            return null;
        }

        @Override // com.google.cardboard.proto.CardboardDevice.DeviceParamsOrBuilder
        public float getDistortionCoefficients(int i) {
            return this.distortionCoefficients_.d(i);
        }

        @Override // com.google.cardboard.proto.CardboardDevice.DeviceParamsOrBuilder
        public int getDistortionCoefficientsCount() {
            return this.distortionCoefficients_.size();
        }

        @Override // com.google.cardboard.proto.CardboardDevice.DeviceParamsOrBuilder
        public List getDistortionCoefficientsList() {
            return this.distortionCoefficients_;
        }

        @Override // com.google.cardboard.proto.CardboardDevice.DeviceParamsOrBuilder
        public float getInterLensDistance() {
            return this.interLensDistance_;
        }

        @Override // com.google.cardboard.proto.CardboardDevice.DeviceParamsOrBuilder
        public float getLeftEyeFieldOfViewAngles(int i) {
            return this.leftEyeFieldOfViewAngles_.d(i);
        }

        @Override // com.google.cardboard.proto.CardboardDevice.DeviceParamsOrBuilder
        public int getLeftEyeFieldOfViewAnglesCount() {
            return this.leftEyeFieldOfViewAngles_.size();
        }

        @Override // com.google.cardboard.proto.CardboardDevice.DeviceParamsOrBuilder
        public List getLeftEyeFieldOfViewAnglesList() {
            return this.leftEyeFieldOfViewAngles_;
        }

        @Override // com.google.cardboard.proto.CardboardDevice.DeviceParamsOrBuilder
        public String getModel() {
            return this.model_;
        }

        @Override // com.google.cardboard.proto.CardboardDevice.DeviceParamsOrBuilder
        public aigj getModelBytes() {
            return aigj.x(this.model_);
        }

        @Override // com.google.cardboard.proto.CardboardDevice.DeviceParamsOrBuilder
        public ButtonType getPrimaryButton() {
            ButtonType buttonTypeForNumber = ButtonType.forNumber(this.primaryButton_);
            return buttonTypeForNumber == null ? ButtonType.MAGNET : buttonTypeForNumber;
        }

        @Override // com.google.cardboard.proto.CardboardDevice.DeviceParamsOrBuilder
        public float getScreenToLensDistance() {
            return this.screenToLensDistance_;
        }

        @Override // com.google.cardboard.proto.CardboardDevice.DeviceParamsOrBuilder
        public float getTrayToLensDistance() {
            return this.trayToLensDistance_;
        }

        @Override // com.google.cardboard.proto.CardboardDevice.DeviceParamsOrBuilder
        public String getVendor() {
            return this.vendor_;
        }

        @Override // com.google.cardboard.proto.CardboardDevice.DeviceParamsOrBuilder
        public aigj getVendorBytes() {
            return aigj.x(this.vendor_);
        }

        @Override // com.google.cardboard.proto.CardboardDevice.DeviceParamsOrBuilder
        public VerticalAlignmentType getVerticalAlignment() {
            VerticalAlignmentType verticalAlignmentTypeForNumber = VerticalAlignmentType.forNumber(this.verticalAlignment_);
            return verticalAlignmentTypeForNumber == null ? VerticalAlignmentType.BOTTOM : verticalAlignmentTypeForNumber;
        }

        @Override // com.google.cardboard.proto.CardboardDevice.DeviceParamsOrBuilder
        public boolean hasInterLensDistance() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.google.cardboard.proto.CardboardDevice.DeviceParamsOrBuilder
        public boolean hasModel() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.cardboard.proto.CardboardDevice.DeviceParamsOrBuilder
        public boolean hasPrimaryButton() {
            return (this.bitField0_ & 64) != 0;
        }

        @Override // com.google.cardboard.proto.CardboardDevice.DeviceParamsOrBuilder
        public boolean hasScreenToLensDistance() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.google.cardboard.proto.CardboardDevice.DeviceParamsOrBuilder
        public boolean hasTrayToLensDistance() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // com.google.cardboard.proto.CardboardDevice.DeviceParamsOrBuilder
        public boolean hasVendor() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.cardboard.proto.CardboardDevice.DeviceParamsOrBuilder
        public boolean hasVerticalAlignment() {
            return (this.bitField0_ & 16) != 0;
        }

        public static Builder newBuilder(DeviceParams deviceParams) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(deviceParams);
        }

        public static DeviceParams parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (DeviceParams) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static DeviceParams parseFrom(aigj aigjVar, ExtensionRegistryLite extensionRegistryLite) {
            return (DeviceParams) aihn.parseFrom(DEFAULT_INSTANCE, aigjVar, extensionRegistryLite);
        }

        public static DeviceParams parseFrom(aigm aigmVar) {
            return (DeviceParams) aihn.parseFrom(DEFAULT_INSTANCE, aigmVar);
        }

        public static DeviceParams parseFrom(aigm aigmVar, ExtensionRegistryLite extensionRegistryLite) {
            return (DeviceParams) aihn.parseFrom(DEFAULT_INSTANCE, aigmVar, extensionRegistryLite);
        }

        public static DeviceParams parseFrom(InputStream inputStream) {
            return (DeviceParams) aihn.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static DeviceParams parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (DeviceParams) aihn.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static DeviceParams parseFrom(ByteBuffer byteBuffer) {
            return (DeviceParams) aihn.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static DeviceParams parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (DeviceParams) aihn.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static DeviceParams parseFrom(byte[] bArr) {
            return (DeviceParams) aihn.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static DeviceParams parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (DeviceParams) aihn.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }
}
