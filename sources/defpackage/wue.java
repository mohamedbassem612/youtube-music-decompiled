package defpackage;

import android.text.TextUtils;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class wue extends wlu {
    public final Set a;
    public String b;
    public String c;
    private final aihf d;

    public wue(abxv abxvVar, zwa zwaVar) {
        super("subscription/subscribe", abxvVar, zwaVar, 1, true, null, null);
        this.a = new HashSet();
        this.d = aocg.a.createBuilder();
    }

    @Override // defpackage.wlu
    public final /* bridge */ /* synthetic */ aiir a() {
        aihf aihfVarCreateBuilder = alyj.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        alyj alyjVar = (alyj) aihfVarCreateBuilder.instance;
        aiie aiieVar = alyjVar.d;
        if (!aiieVar.c()) {
            alyjVar.d = aihn.mutableCopy(aiieVar);
        }
        aifs.addAll(this.a, alyjVar.d);
        if (!TextUtils.isEmpty(this.b)) {
            String str = this.b;
            aihfVarCreateBuilder.copyOnWrite();
            alyj alyjVar2 = (alyj) aihfVarCreateBuilder.instance;
            str.getClass();
            alyjVar2.b |= 2;
            alyjVar2.e = str;
        }
        if (!TextUtils.isEmpty(this.c)) {
            String str2 = this.c;
            aihfVarCreateBuilder.copyOnWrite();
            alyj alyjVar3 = (alyj) aihfVarCreateBuilder.instance;
            str2.getClass();
            alyjVar3.b |= 4;
            alyjVar3.f = str2;
        }
        aocg aocgVar = (aocg) this.d.build();
        aihfVarCreateBuilder.copyOnWrite();
        alyj alyjVar4 = (alyj) aihfVarCreateBuilder.instance;
        aocgVar.getClass();
        alyjVar4.g = aocgVar;
        alyjVar4.b |= 8;
        return aihfVarCreateBuilder;
    }

    @Override // defpackage.wkf
    protected final void b() {
        ahno.O(!this.a.isEmpty());
    }
}
