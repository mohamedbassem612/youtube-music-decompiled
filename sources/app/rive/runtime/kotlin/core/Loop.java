package app.rive.runtime.kotlin.core;

import defpackage.a;
import defpackage.awpl;
import defpackage.awqx;
import internal.org.jni_zero.JniZero;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public enum Loop {
    ONESHOT,
    LOOP,
    PINGPONG,
    AUTO;

    private static final /* synthetic */ awpl $ENTRIES = JniZero.m(values());
    public static final Companion Companion = new Companion(null);

    public static awpl getEntries() {
        return $ENTRIES;
    }

    /* JADX INFO: compiled from: PG */
    public final class Companion {
        private Companion() {
        }

        public final Loop fromIndex(int i) {
            int size = Loop.getEntries().size();
            if (i < 0 || i > size) {
                throw new IndexOutOfBoundsException(a.bQ(size, i, "Invalid Loop index value ", ". It must be between 0 and "));
            }
            return (Loop) Loop.getEntries().get(i);
        }

        public /* synthetic */ Companion(awqx awqxVar) {
            this();
        }
    }
}
