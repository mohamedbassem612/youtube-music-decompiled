package app.rive;

import defpackage.awpl;
import internal.org.jni_zero.JniZero;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public enum Alignment {
    TopLeft((byte) 0),
    TopCenter((byte) 1),
    TopRight((byte) 2),
    CenterLeft((byte) 3),
    Center((byte) 4),
    CenterRight((byte) 5),
    BottomLeft((byte) 6),
    BottomCenter((byte) 7),
    BottomRight((byte) 8);

    private static final /* synthetic */ awpl $ENTRIES = JniZero.m(values());
    private final byte nativeMapping;

    Alignment(byte b) {
        this.nativeMapping = b;
    }

    public static awpl getEntries() {
        return $ENTRIES;
    }

    public final byte getNativeMapping$third_party_java_android_libs_rive_rive_android() {
        return this.nativeMapping;
    }
}
