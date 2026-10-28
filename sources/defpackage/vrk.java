package defpackage;

import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public abstract class vrk implements vro {
    protected final Set a = new HashSet();
    public Object b;
    protected boolean c;

    @Override // defpackage.vro
    public adxd g() {
        return null;
    }

    @Override // defpackage.vro
    public agev h() {
        return agdf.a;
    }

    @Override // defpackage.vro
    public void i(adlz adlzVar) {
        if (adlzVar != null) {
            this.a.add(adlzVar);
        }
    }

    @Override // defpackage.vro
    public void j(Object obj, boolean z, adxd adxdVar) {
        this.b = obj;
        this.c = z;
    }

    @Override // defpackage.vox
    public final /* synthetic */ void e() {
    }
}
