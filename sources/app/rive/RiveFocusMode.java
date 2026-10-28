package app.rive;

import defpackage.awmj;
import defpackage.awpl;
import internal.org.jni_zero.JniZero;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public enum RiveFocusMode {
    Off,
    On,
    Automatic;

    private static final /* synthetic */ awpl $ENTRIES = JniZero.m(values());

    /* JADX INFO: compiled from: PG */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[RiveFocusMode.values().length];
            try {
                iArr[RiveFocusMode.Off.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RiveFocusMode.On.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[RiveFocusMode.Automatic.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static awpl getEntries() {
        return $ENTRIES;
    }

    public final boolean isEnabled$third_party_java_android_libs_rive_rive_android(boolean z) {
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            return false;
        }
        if (iOrdinal == 1) {
            return true;
        }
        if (iOrdinal != 2) {
            throw new awmj();
        }
        return z;
    }
}
