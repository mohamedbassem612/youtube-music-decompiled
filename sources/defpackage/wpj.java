package defpackage;

import android.text.TextUtils;
import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class wpj extends wlu {
    public Optional D;
    public String a;
    public String b;
    public String c;
    public Optional d;
    public boolean e;

    public wpj(abxv abxvVar, zwa zwaVar) {
        super("comment/create_comment_reply", abxvVar, zwaVar, 1, false, null, null);
        this.a = "";
        this.b = "";
        this.c = "";
        this.d = Optional.empty();
        this.e = false;
        this.D = Optional.empty();
        m();
    }

    @Override // defpackage.wlu
    public final /* bridge */ /* synthetic */ aiir a() {
        aihf aihfVarCreateBuilder = alnq.a.createBuilder();
        String str = this.a;
        if (str != null) {
            aihfVarCreateBuilder.copyOnWrite();
            alnq alnqVar = (alnq) aihfVarCreateBuilder.instance;
            alnqVar.b |= 2;
            alnqVar.f = str;
        }
        if (this.e) {
            aihf aihfVarCreateBuilder2 = alnx.a.createBuilder();
            aihfVarCreateBuilder2.copyOnWrite();
            alnx alnxVar = (alnx) aihfVarCreateBuilder2.instance;
            alnxVar.b |= 1;
            alnxVar.c = true;
            if (this.d.isPresent()) {
                Object obj = this.d.get();
                aihfVarCreateBuilder2.copyOnWrite();
                alnx alnxVar2 = (alnx) aihfVarCreateBuilder2.instance;
                alnxVar2.d = (alay) obj;
                alnxVar2.b |= 2;
            }
            alnx alnxVar3 = (alnx) aihfVarCreateBuilder2.build();
            aihfVarCreateBuilder.copyOnWrite();
            alnq alnqVar2 = (alnq) aihfVarCreateBuilder.instance;
            alnxVar3.getClass();
            alnqVar2.i = alnxVar3;
            alnqVar2.b |= 64;
        }
        String str2 = this.b;
        aihfVarCreateBuilder.copyOnWrite();
        alnq alnqVar3 = (alnq) aihfVarCreateBuilder.instance;
        str2.getClass();
        alnqVar3.b |= 4;
        alnqVar3.g = str2;
        if (!TextUtils.isEmpty(this.c)) {
            aihf aihfVarCreateBuilder3 = alnd.a.createBuilder();
            String str3 = this.c;
            aihfVarCreateBuilder3.copyOnWrite();
            alnd alndVar = (alnd) aihfVarCreateBuilder3.instance;
            str3.getClass();
            alndVar.b |= 1;
            alndVar.c = str3;
            aihfVarCreateBuilder.copyOnWrite();
            alnq alnqVar4 = (alnq) aihfVarCreateBuilder.instance;
            alnd alndVar2 = (alnd) aihfVarCreateBuilder3.build();
            alndVar2.getClass();
            alnqVar4.d = alndVar2;
            alnqVar4.c = 7;
        }
        if (this.D.isPresent()) {
            String str4 = (String) this.D.get();
            aihfVarCreateBuilder.copyOnWrite();
            alnq alnqVar5 = (alnq) aihfVarCreateBuilder.instance;
            alnqVar5.b |= 8;
            alnqVar5.h = str4;
        }
        return aihfVarCreateBuilder;
    }

    @Override // defpackage.wkf
    protected final void b() {
        typ.f(this.a);
        boolean zIsEmpty = TextUtils.isEmpty(this.b);
        boolean z = true;
        boolean z2 = this.D.isPresent() && !TextUtils.isEmpty((CharSequence) this.D.get());
        if (zIsEmpty && !z2) {
            z = false;
        }
        ahno.F(z);
    }
}
