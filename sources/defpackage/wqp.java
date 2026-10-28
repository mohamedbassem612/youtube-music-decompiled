package defpackage;

import android.text.TextUtils;
import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class wqp extends wqk {
    public wqp(abxv abxvVar, zwa zwaVar) {
        super("like/removelike", abxvVar, zwaVar);
    }

    @Override // defpackage.wlu
    public final /* synthetic */ aiir a() {
        aihf aihfVarCreateBuilder = alrl.a.createBuilder();
        amlh amlhVar = ((wqk) this).a;
        aihfVarCreateBuilder.copyOnWrite();
        alrl alrlVar = (alrl) aihfVarCreateBuilder.instance;
        amlhVar.getClass();
        alrlVar.d = amlhVar;
        alrlVar.b |= 2;
        if (!TextUtils.isEmpty(((wqk) this).b)) {
            String str = ((wqk) this).b;
            aihfVarCreateBuilder.copyOnWrite();
            alrl alrlVar2 = (alrl) aihfVarCreateBuilder.instance;
            str.getClass();
            alrlVar2.b |= 4;
            alrlVar2.e = str;
        }
        Optional optional = ((wqk) this).c;
        vrl vrlVar = new vrl(aihfVarCreateBuilder, 11);
        if (true == optional.isPresent()) {
            Object obj = optional.get();
            aihf aihfVar = (aihf) vrlVar.a;
            aihfVar.copyOnWrite();
            alrl alrlVar3 = (alrl) aihfVar.instance;
            alrlVar3.f = (apkf) obj;
            alrlVar3.b |= 16;
        }
        return aihfVarCreateBuilder;
    }
}
