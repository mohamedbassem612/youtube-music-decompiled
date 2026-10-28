package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aapy extends wlu {
    public Collection a;
    public boolean b;
    private final String c;

    public aapy(abxv abxvVar, zwa zwaVar, boolean z) {
        super("player/refresh", abxvVar, zwaVar, 1, z, null, null);
        this.a = new ArrayList();
        this.c = "";
        this.b = false;
        l(vzh.b);
    }

    @Override // defpackage.wlu
    public final /* bridge */ /* synthetic */ aiir a() {
        aihf aihfVarCreateBuilder = alut.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        alut alutVar = (alut) aihfVarCreateBuilder.instance;
        alutVar.b |= 2;
        alutVar.e = this.c;
        Collection collection = this.a;
        aihfVarCreateBuilder.copyOnWrite();
        alut alutVar2 = (alut) aihfVarCreateBuilder.instance;
        aiie aiieVar = alutVar2.d;
        if (!aiieVar.c()) {
            alutVar2.d = aihn.mutableCopy(aiieVar);
        }
        aifs.addAll(collection, alutVar2.d);
        aihfVarCreateBuilder.copyOnWrite();
        alut alutVar3 = (alut) aihfVarCreateBuilder.instance;
        alutVar3.b |= 4;
        alutVar3.f = true;
        boolean z = this.b;
        aihfVarCreateBuilder.copyOnWrite();
        alut alutVar4 = (alut) aihfVarCreateBuilder.instance;
        alutVar4.b |= 16;
        alutVar4.g = z;
        return aihfVarCreateBuilder;
    }

    @Override // defpackage.wkf
    protected final void b() {
        typ.f(this.r);
        String str = this.c;
        if (TextUtils.isEmpty(str)) {
            ahno.O(!this.a.isEmpty());
        } else {
            typ.f(str);
        }
    }
}
