package defpackage;

import android.text.TextUtils;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class wur extends wlu {
    public final List a;
    public String b;
    public String c;
    public Optional d;

    public wur(abxv abxvVar, zwa zwaVar, boolean z) {
        super("ypc/commerce_action", abxvVar, zwaVar, 1, z, null, null);
        this.b = "";
        this.c = "";
        this.d = Optional.empty();
        this.a = new ArrayList();
    }

    @Override // defpackage.wlu
    public final /* synthetic */ aiir a() {
        aihf aihfVarCreateBuilder = aloe.a.createBuilder();
        if (!TextUtils.isEmpty(this.b)) {
            String str = this.b;
            aihfVarCreateBuilder.copyOnWrite();
            aloe aloeVar = (aloe) aihfVarCreateBuilder.instance;
            str.getClass();
            aloeVar.b |= 2;
            aloeVar.d = str;
        }
        if (!TextUtils.isEmpty(this.c)) {
            String str2 = this.c;
            aihfVarCreateBuilder.copyOnWrite();
            aloe aloeVar2 = (aloe) aihfVarCreateBuilder.instance;
            str2.getClass();
            aloeVar2.b |= 4;
            aloeVar2.e = str2;
        }
        List list = this.a;
        if (!list.isEmpty()) {
            aihfVarCreateBuilder.copyOnWrite();
            aloe aloeVar3 = (aloe) aihfVarCreateBuilder.instance;
            aiie aiieVar = aloeVar3.f;
            if (!aiieVar.c()) {
                aloeVar3.f = aihn.mutableCopy(aiieVar);
            }
            aifs.addAll(list, aloeVar3.f);
        }
        Optional optional = this.d;
        aihfVarCreateBuilder.getClass();
        vrl vrlVar = new vrl(aihfVarCreateBuilder, 17);
        if (true == optional.isPresent()) {
            Object obj = optional.get();
            aihf aihfVar = (aihf) vrlVar.a;
            aihfVar.copyOnWrite();
            aloe aloeVar4 = (aloe) aihfVar.instance;
            aloeVar4.g = (akai) obj;
            aloeVar4.b |= 8;
        }
        return aihfVarCreateBuilder;
    }

    @Override // defpackage.wkf
    protected final void b() {
        ahno.F(!TextUtils.isEmpty(this.b));
    }
}
