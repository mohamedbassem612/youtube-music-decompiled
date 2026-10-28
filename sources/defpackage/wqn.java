package defpackage;

import android.text.TextUtils;
import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class wqn extends wqk {
    public wqn(abxv abxvVar, zwa zwaVar) {
        super("like/dislike", abxvVar, zwaVar);
    }

    @Override // defpackage.wlu
    public final /* synthetic */ aiir a() {
        aihf aihfVarCreateBuilder = alrh.a.createBuilder();
        amlh amlhVar = ((wqk) this).a;
        aihfVarCreateBuilder.copyOnWrite();
        alrh alrhVar = (alrh) aihfVarCreateBuilder.instance;
        amlhVar.getClass();
        alrhVar.d = amlhVar;
        alrhVar.b |= 2;
        if (!TextUtils.isEmpty(((wqk) this).b)) {
            String str = ((wqk) this).b;
            aihfVarCreateBuilder.copyOnWrite();
            alrh alrhVar2 = (alrh) aihfVarCreateBuilder.instance;
            str.getClass();
            alrhVar2.b |= 4;
            alrhVar2.e = str;
        }
        Optional optional = ((wqk) this).c;
        vrl vrlVar = new vrl(aihfVarCreateBuilder, 9);
        if (true == optional.isPresent()) {
            Object obj = optional.get();
            aihf aihfVar = (aihf) vrlVar.a;
            aihfVar.copyOnWrite();
            alrh alrhVar3 = (alrh) aihfVar.instance;
            alrhVar3.f = (apkf) obj;
            alrhVar3.b |= 16;
        }
        return aihfVarCreateBuilder;
    }
}
