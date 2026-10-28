package app.rive.runtime.kotlin.core;

import defpackage.a;
import defpackage.awpl;
import defpackage.awqx;
import internal.org.jni_zero.JniZero;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public enum Alignment {
    TOP_LEFT,
    TOP_CENTER,
    TOP_RIGHT,
    CENTER_LEFT,
    CENTER,
    CENTER_RIGHT,
    BOTTOM_LEFT,
    BOTTOM_CENTER,
    BOTTOM_RIGHT;

    private static final /* synthetic */ awpl $ENTRIES = JniZero.m(values());
    public static final Companion Companion = new Companion(null);

    public static awpl getEntries() {
        return $ENTRIES;
    }

    /* JADX INFO: compiled from: PG */
    public final class Companion {
        private Companion() {
        }

        public final Alignment fromIndex(int i) {
            int size = Alignment.getEntries().size();
            if (i < 0 || i > size) {
                throw new IndexOutOfBoundsException(a.bQ(size, i, "Invalid Alignment index value ", ". It must be between 0 and "));
            }
            return (Alignment) Alignment.getEntries().get(i);
        }

        public /* synthetic */ Companion(awqx awqxVar) {
            this();
        }
    }
}
