package app.rive.runtime.kotlin.core;

import defpackage.awpl;
import defpackage.awqx;
import internal.org.jni_zero.JniZero;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public enum RendererType {
    Rive(0),
    Canvas(1);

    private final int value;
    private static final /* synthetic */ awpl $ENTRIES = JniZero.m(values());
    public static final Companion Companion = new Companion(null);

    RendererType(int i) {
        this.value = i;
    }

    public static awpl getEntries() {
        return $ENTRIES;
    }

    public final int getValue() {
        return this.value;
    }

    /* JADX INFO: compiled from: PG */
    public final class Companion {
        private Companion() {
        }

        public final RendererType fromIndex(int i) {
            int size = RendererType.getEntries().size();
            if (i >= 0 && i <= size) {
                return (RendererType) RendererType.getEntries().get(i);
            }
            throw new IndexOutOfBoundsException("Invalid " + Companion.class + " index value " + i + ". It must be between 0 and " + size);
        }

        public /* synthetic */ Companion(awqx awqxVar) {
            this();
        }
    }
}
