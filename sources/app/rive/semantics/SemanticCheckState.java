package app.rive.semantics;

import defpackage.awpl;
import internal.org.jni_zero.JniZero;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public enum SemanticCheckState {
    Unchecked,
    Checked,
    Mixed;

    private static final /* synthetic */ awpl $ENTRIES = JniZero.m(values());

    public static awpl getEntries() {
        return $ENTRIES;
    }
}
