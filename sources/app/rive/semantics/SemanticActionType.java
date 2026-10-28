package app.rive.semantics;

import defpackage.awpl;
import internal.org.jni_zero.JniZero;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public enum SemanticActionType {
    Tap(0),
    Increase(1),
    Decrease(2);

    private static final /* synthetic */ awpl $ENTRIES = JniZero.m(values());
    private final int value;

    SemanticActionType(int i) {
        this.value = i;
    }

    public static awpl getEntries() {
        return $ENTRIES;
    }

    public final int getValue$third_party_java_android_libs_rive_rive_android() {
        return this.value;
    }
}
