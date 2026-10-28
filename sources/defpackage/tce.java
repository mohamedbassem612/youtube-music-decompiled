package defpackage;

import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class tce {
    public static final /* synthetic */ int b = 0;
    private static final agkz c = agkz.q(avla.c, avla.e);
    public final avlh a;
    private final awly d;
    private final Optional e;

    public tce(Optional optional, avla avlaVar) {
        if (!c.contains(avlaVar)) {
            throw new IllegalArgumentException();
        }
        this.e = optional;
        awli awliVar = new awli();
        this.d = awliVar;
        this.a = awliVar.g(avlaVar);
    }

    public final void a(Object obj) {
        this.d.kk(obj);
        hkp hkpVar = new hkp(obj, 9);
        Optional optional = this.e;
        optional.isPresent();
        ((tbt) optional.get()).c(hkpVar.a);
    }

    public tce(tbt tbtVar) {
        this(Optional.of(tbtVar), avla.e);
    }

    public tce(tbt tbtVar, byte[] bArr) {
        this(Optional.of(tbtVar), avla.e);
    }

    public tce(tbt tbtVar, char[] cArr) {
        this(Optional.of(tbtVar), avla.c);
    }

    public tce(tbt tbtVar, int[] iArr) {
        this(Optional.of(tbtVar), avla.e);
    }

    public tce(tbt tbtVar, short[] sArr) {
        this(Optional.of(tbtVar), avla.c);
    }
}
