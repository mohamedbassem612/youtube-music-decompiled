package defpackage;

import android.text.TextUtils;
import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class wqo extends wqk {
    public wqo(abxv abxvVar, zwa zwaVar) {
        super("like/like", abxvVar, zwaVar);
    }

    @Override // defpackage.wlu
    public final /* synthetic */ aiir a() {
        aihf aihfVarCreateBuilder = alrj.a.createBuilder();
        amlh amlhVar = ((wqk) this).a;
        aihfVarCreateBuilder.copyOnWrite();
        alrj alrjVar = (alrj) aihfVarCreateBuilder.instance;
        amlhVar.getClass();
        alrjVar.d = amlhVar;
        alrjVar.b |= 2;
        if (!TextUtils.isEmpty(((wqk) this).b)) {
            String str = ((wqk) this).b;
            aihfVarCreateBuilder.copyOnWrite();
            alrj alrjVar2 = (alrj) aihfVarCreateBuilder.instance;
            str.getClass();
            alrjVar2.b |= 4;
            alrjVar2.e = str;
        }
        Optional optional = ((wqk) this).c;
        vrl vrlVar = new vrl(aihfVarCreateBuilder, 10);
        if (true == optional.isPresent()) {
            Object obj = optional.get();
            aihf aihfVar = (aihf) vrlVar.a;
            aihfVar.copyOnWrite();
            alrj alrjVar3 = (alrj) aihfVar.instance;
            alrjVar3.f = (apkf) obj;
            alrjVar3.b |= 16;
        }
        return aihfVarCreateBuilder;
    }
}
