package defpackage;

import android.text.TextUtils;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class wve extends wlu {
    public String a;
    public String b;
    public List c;
    private List d;

    public wve(abxv abxvVar, zwa zwaVar) {
        super("ypc/cancel_recurrence", abxvVar, zwaVar, 1, true, null, null);
        this.a = "";
        this.b = "";
        this.d = null;
        this.c = null;
    }

    @Override // defpackage.wlu
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public final aihf a() {
        aihf aihfVarCreateBuilder = amau.a.createBuilder();
        String str = this.a;
        aihfVarCreateBuilder.copyOnWrite();
        amau amauVar = (amau) aihfVarCreateBuilder.instance;
        str.getClass();
        amauVar.b |= 2;
        amauVar.d = str;
        if (!TextUtils.isEmpty(this.b)) {
            String str2 = this.b;
            aihfVarCreateBuilder.copyOnWrite();
            amau amauVar2 = (amau) aihfVarCreateBuilder.instance;
            str2.getClass();
            amauVar2.b |= 8;
            amauVar2.f = str2;
        }
        aihf aihfVarCreateBuilder2 = arqc.a.createBuilder();
        List list = this.d;
        if (list != null) {
            aihfVarCreateBuilder2.copyOnWrite();
            arqc arqcVar = (arqc) aihfVarCreateBuilder2.instance;
            aiie aiieVar = arqcVar.b;
            if (!aiieVar.c()) {
                arqcVar.b = aihn.mutableCopy(aiieVar);
            }
            aifs.addAll(list, arqcVar.b);
        }
        List list2 = this.c;
        if (list2 != null) {
            aihfVarCreateBuilder2.copyOnWrite();
            arqc arqcVar2 = (arqc) aihfVarCreateBuilder2.instance;
            aiie aiieVar2 = arqcVar2.c;
            if (!aiieVar2.c()) {
                arqcVar2.c = aihn.mutableCopy(aiieVar2);
            }
            aifs.addAll(list2, arqcVar2.c);
        }
        aihfVarCreateBuilder.copyOnWrite();
        amau amauVar3 = (amau) aihfVarCreateBuilder.instance;
        arqc arqcVar3 = (arqc) aihfVarCreateBuilder2.build();
        arqcVar3.getClass();
        amauVar3.e = arqcVar3;
        amauVar3.b |= 4;
        return aihfVarCreateBuilder;
    }

    @Override // defpackage.wkf
    protected final void b() {
        typ.f(((amau) a().build()).d);
    }

    public final void e(List list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        this.d = list;
    }
}
