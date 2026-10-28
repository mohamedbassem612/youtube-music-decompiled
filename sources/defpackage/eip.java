package defpackage;

import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class eip implements eik, eis, eii {
    private final String b;
    private final boolean c;
    private final ehm d;
    private final ejj e;
    private boolean f;
    private final Path a = new Path();
    private final dov g = new dov((char[]) null, (byte[]) null);

    public eip(ehm ehmVar, ele eleVar, ela elaVar) {
        this.b = elaVar.a;
        this.c = elaVar.c;
        this.d = ehmVar;
        ejj ejjVarA = elaVar.b.a();
        this.e = ejjVarA;
        eleVar.i(ejjVarA);
        ejjVarA.h(this);
    }

    @Override // defpackage.ejw
    public final void a(Object obj, enp enpVar) {
        if (obj == ehr.P) {
            this.e.d = enpVar;
        }
    }

    @Override // defpackage.eis
    public final void d() {
        this.f = false;
        this.d.invalidateSelf();
    }

    @Override // defpackage.ejw
    public final void e(ejv ejvVar, int i, List list, ejv ejvVar2) {
        enh.d(ejvVar, i, list, ejvVar2, this);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    /* JADX WARN: Code duplicated, block: B:12:0x0027 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:13:0x0029  */
    /* JADX WARN: Code duplicated, block: B:21:0x0033 A[SYNTHETIC] */
    @Override // defpackage.eia
    public final void f(List list, List list2) {
        ArrayList arrayList = null;
        for (int i = 0; i < list.size(); i++) {
            eia eiaVar = (eia) list.get(i);
            if (eiaVar instanceof eir) {
                eir eirVar = (eir) eiaVar;
                if (eirVar.e == 1) {
                    this.g.o(eirVar);
                    eirVar.a(this);
                } else if (!(eiaVar instanceof eio)) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add((eio) eiaVar);
                }
            } else if (!(eiaVar instanceof eio)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add((eio) eiaVar);
            }
        }
        this.e.e = arrayList;
    }

    @Override // defpackage.eia
    public final String g() {
        return this.b;
    }

    @Override // defpackage.eik
    public final Path i() {
        if (this.f && this.e.d == null) {
            return this.a;
        }
        Path path = this.a;
        path.reset();
        if (this.c) {
            this.f = true;
        } else {
            Path path2 = (Path) this.e.e();
            if (path2 != null) {
                path.set(path2);
                path.setFillType(Path.FillType.EVEN_ODD);
                this.g.p(path);
                this.f = true;
            }
        }
        return path;
    }
}
