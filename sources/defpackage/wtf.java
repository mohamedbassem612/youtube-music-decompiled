package defpackage;

import android.net.Uri;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class wtf extends wlu {
    public final Uri a;
    protected final String b;
    protected final String c;
    final agke d;

    public wtf(abxv abxvVar, zwa zwaVar, Uri uri, String str, String str2) {
        super("navigation/resolve_url", abxvVar, zwaVar, 1, true, null, null);
        this.d = agpi.a;
        m();
        this.a = uri;
        this.b = str;
        this.c = str2;
    }

    @Override // defpackage.wkf
    public final String Y() {
        dov dovVarE = E();
        dovVarE.F("uri", this.a.toString());
        int i = 0;
        while (true) {
            agke agkeVar = this.d;
            if (i >= ((agpi) agkeVar).d) {
                return dovVarE.D();
            }
            dovVarE.F(a.bR(i, "file"), ((apko) agkeVar.get(i)).b);
            i++;
        }
    }

    @Override // defpackage.wlu
    public final /* bridge */ /* synthetic */ aiir a() {
        aihf aihfVarCreateBuilder = alsu.a.createBuilder();
        String string = this.a.toString();
        aihfVarCreateBuilder.copyOnWrite();
        alsu alsuVar = (alsu) aihfVarCreateBuilder.instance;
        string.getClass();
        alsuVar.b |= 4;
        alsuVar.d = string;
        String str = this.b;
        if (str != null) {
            aihfVarCreateBuilder.copyOnWrite();
            alsu alsuVar2 = (alsu) aihfVarCreateBuilder.instance;
            alsuVar2.b |= 16;
            alsuVar2.e = str;
        }
        String str2 = this.c;
        if (str2 != null) {
            aihfVarCreateBuilder.copyOnWrite();
            alsu alsuVar3 = (alsu) aihfVarCreateBuilder.instance;
            alsuVar3.b |= 32;
            alsuVar3.f = str2;
        }
        agke agkeVar = this.d;
        if (!agkeVar.isEmpty()) {
            aihfVarCreateBuilder.copyOnWrite();
            alsu alsuVar4 = (alsu) aihfVarCreateBuilder.instance;
            aiie aiieVar = alsuVar4.g;
            if (!aiieVar.c()) {
                alsuVar4.g = aihn.mutableCopy(aiieVar);
            }
            aifs.addAll(agkeVar, alsuVar4.g);
        }
        return aihfVarCreateBuilder;
    }

    @Override // defpackage.wkf
    protected final void b() {
        typ.f(this.a.toString());
    }
}
