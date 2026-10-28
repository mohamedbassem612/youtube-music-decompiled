package defpackage;

import android.text.TextUtils;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class wuf extends wlu {
    public final Set a;
    public String b;
    public String c;

    public wuf(abxv abxvVar, zwa zwaVar) {
        super("subscription/unsubscribe", abxvVar, zwaVar, 1, true, null, null);
        this.a = new HashSet();
    }

    @Override // defpackage.wlu
    public final /* bridge */ /* synthetic */ aiir a() {
        aihf aihfVarCreateBuilder = alyl.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        alyl alylVar = (alyl) aihfVarCreateBuilder.instance;
        aiie aiieVar = alylVar.d;
        if (!aiieVar.c()) {
            alylVar.d = aihn.mutableCopy(aiieVar);
        }
        aifs.addAll(this.a, alylVar.d);
        if (!TextUtils.isEmpty(this.b)) {
            String str = this.b;
            aihfVarCreateBuilder.copyOnWrite();
            alyl alylVar2 = (alyl) aihfVarCreateBuilder.instance;
            str.getClass();
            alylVar2.b |= 2;
            alylVar2.e = str;
        }
        if (!TextUtils.isEmpty(this.c)) {
            String str2 = this.c;
            aihfVarCreateBuilder.copyOnWrite();
            alyl alylVar3 = (alyl) aihfVarCreateBuilder.instance;
            str2.getClass();
            alylVar3.b |= 4;
            alylVar3.f = str2;
        }
        return aihfVarCreateBuilder;
    }

    @Override // defpackage.wkf
    protected final void b() {
        ahno.O(!this.a.isEmpty());
    }
}
