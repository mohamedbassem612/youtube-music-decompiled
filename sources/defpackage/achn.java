package defpackage;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class achn extends wqh {
    public aigj D;
    public String E;
    private String F;
    private int G;
    public List e;

    protected achn(abxv abxvVar, zwa zwaVar) {
        super(abxvVar, zwaVar);
        this.e = null;
        this.G = -1;
    }

    @Override // defpackage.wqh
    public final void F(int i) {
        this.d = i;
        this.G = i;
    }

    @Override // defpackage.wqh
    public final void G(String str) {
        ((wqh) this).a = str;
        this.F = str;
    }

    @Override // defpackage.wqh
    /* JADX INFO: renamed from: H */
    public final aihf a() {
        aihf aihfVarCreateBuilder = alur.a.createBuilder();
        String str = this.F;
        if (str != null) {
            aihfVarCreateBuilder.copyOnWrite();
            alur alurVar = (alur) aihfVarCreateBuilder.instance;
            alurVar.b |= 2;
            alurVar.d = str;
        }
        aigj aigjVar = this.D;
        if (aigjVar != null) {
            aihfVarCreateBuilder.copyOnWrite();
            alur alurVar2 = (alur) aihfVarCreateBuilder.instance;
            alurVar2.b |= 64;
            alurVar2.h = aigjVar;
        }
        String str2 = this.E;
        if (str2 != null) {
            aihfVarCreateBuilder.copyOnWrite();
            alur alurVar3 = (alur) aihfVarCreateBuilder.instance;
            alurVar3.b |= 16;
            alurVar3.f = str2;
        }
        int i = this.G;
        if (i >= 0) {
            aihfVarCreateBuilder.copyOnWrite();
            alur alurVar4 = (alur) aihfVarCreateBuilder.instance;
            alurVar4.b |= 32;
            alurVar4.g = i;
        }
        List list = this.e;
        if (list != null && !list.isEmpty()) {
            for (achs achsVar : this.e) {
                if (achsVar != null) {
                    achsVar.a(this, aihfVarCreateBuilder);
                }
            }
        }
        return aihfVarCreateBuilder;
    }

    @Override // defpackage.wqh, defpackage.wlu
    public final /* bridge */ /* synthetic */ aiir a() {
        return a();
    }

    @Override // defpackage.wqh, defpackage.wkf
    protected final void b() {
        typ.f(this.F);
        List list = this.e;
        if (list == null || list.isEmpty()) {
            return;
        }
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            if (((achs) it.next()) != null) {
                a();
            }
        }
    }

    @Override // defpackage.wqh
    public final void e(String str) {
        this.E = str;
    }
}
