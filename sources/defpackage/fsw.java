package defpackage;

import java.lang.reflect.Field;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fsw extends nq implements fju {
    public final int a;
    public final int b;

    public fsw(int i, int i2, int i3, int i4) {
        super(i, i2);
        this.a = i3;
        this.b = i4;
    }

    @Override // defpackage.fju
    public final int a() {
        return this.b;
    }

    @Override // defpackage.fju
    public final int b() {
        return this.a;
    }

    @Override // defpackage.fju
    public final boolean c() {
        oh ohVar;
        Field field = fsy.a;
        try {
            if (fsy.a == null) {
                fsy.a = nq.class.getDeclaredField("c");
                fsy.a.setAccessible(true);
            }
            ohVar = (oh) fsy.a.get(this);
        } catch (Exception unused) {
            ohVar = null;
        }
        return ohVar != null && ohVar.b() == -1;
    }
}
