package defpackage;

import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class wqk extends wlu {
    public amlh a;
    public String b;
    public Optional c;

    public wqk(String str, abxv abxvVar, zwa zwaVar) {
        super(str, abxvVar, zwaVar, 1, true, null, null);
        this.c = Optional.empty();
    }

    public final void F(amlh amlhVar) {
        amlhVar.getClass();
        this.a = amlhVar;
    }

    public final void G(apkf apkfVar) {
        this.c = Optional.of(apkfVar);
    }

    public final void H(String str) {
        aihf aihfVarCreateBuilder = amlh.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        amlh amlhVar = (amlh) aihfVarCreateBuilder.instance;
        amlhVar.b |= 1;
        amlhVar.c = str;
        this.a = (amlh) aihfVarCreateBuilder.build();
    }

    @Override // defpackage.wkf
    protected final void b() {
        ahno.O(this.a.d.isEmpty() != this.a.c.isEmpty());
    }

    public final void e(ajwo ajwoVar) {
        int i;
        aihl aihlVarCheckIsLite = aihn.checkIsLite(amla.b);
        ajwoVar.c(aihlVarCheckIsLite);
        ahno.F(ajwoVar.j.n(aihlVarCheckIsLite.d));
        aihl aihlVarCheckIsLite2 = aihn.checkIsLite(amla.b);
        ajwoVar.c(aihlVarCheckIsLite2);
        Object objK = ajwoVar.j.k(aihlVarCheckIsLite2.d);
        amla amlaVar = (amla) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK));
        if (ajwoVar.c.E()) {
            m();
        } else {
            n(ajwoVar.c);
        }
        if ((amlaVar.c & 2) != 0) {
            amlh amlhVar = amlaVar.g;
            if (amlhVar == null) {
                amlhVar = amlh.a;
            }
            this.a = amlhVar;
        }
        int i2 = amlaVar.d;
        if (i2 == 0) {
            i = 4;
        } else if (i2 == 6) {
            i = 1;
        } else if (i2 != 7) {
            i = i2 != 8 ? 0 : 3;
        } else {
            i = 2;
        }
        if (i == 0) {
            throw null;
        }
        int i3 = i - 1;
        if (i3 == 0) {
            this.b = i2 == 6 ? (String) amlaVar.e : "";
        } else if (i3 == 1) {
            this.b = i2 == 7 ? (String) amlaVar.e : "";
        } else if (i3 == 2) {
            this.b = i2 == 8 ? (String) amlaVar.e : "";
        }
    }
}
