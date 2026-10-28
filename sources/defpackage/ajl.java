package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ajl extends AtomicInteger {
    public ajl() {
        super(0);
    }

    @Override // java.lang.Number
    public final byte byteValue() {
        return (byte) super.intValue();
    }

    @Override // java.lang.Number
    public final short shortValue() {
        return (short) super.intValue();
    }
}
