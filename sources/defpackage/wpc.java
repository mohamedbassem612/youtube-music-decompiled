package defpackage;

import android.util.Base64;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class wpc extends wlu {
    public int D;
    public String a;
    public List b;
    public agke c;
    public String d;
    public aptc e;

    public wpc(abxv abxvVar, zwa zwaVar) {
        super("share/get_share_panel", abxvVar, zwaVar, 3, true, null, null);
        m();
    }

    public static String e(String str, List list, agke agkeVar, String str2, aptc aptcVar) {
        int i;
        StringBuilder sb = new StringBuilder();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Integer num = (Integer) it.next();
                if (sb.length() > 0) {
                    sb.append(',');
                }
                sb.append(num);
            }
        }
        StringBuilder sb2 = new StringBuilder();
        if (agkeVar != null) {
            int size = agkeVar.size();
            int i2 = 0;
            while (i2 < size) {
                almr almrVar = (almr) agkeVar.get(i2);
                if (sb2.length() > 0) {
                    sb2.append(';');
                }
                sb2.append(almrVar.c);
                sb2.append(':');
                sb2.append(almrVar.d);
                sb2.append(':');
                Iterator it2 = almrVar.e.iterator();
                while (true) {
                    i = i2 + 1;
                    if (it2.hasNext()) {
                        sb2.append((String) it2.next());
                        sb2.append(',');
                    }
                }
                i2 = i;
            }
        }
        dov dovVar = new dov((int[]) null);
        dovVar.F("serviceName", "share/get_share_panel");
        dovVar.F("serializedSharedEntity", str);
        dovVar.F("installedSharingServiceIds", sb.toString());
        dovVar.F("androidInstalledSharingServices", sb2.toString());
        if (str2 != null) {
            dovVar.F("sheetId", str2);
        }
        if (aptcVar != null) {
            dovVar.F("clientParams", Base64.encodeToString(aptcVar.toByteArray(), 2));
        }
        return dovVar.D();
    }

    @Override // defpackage.wkf
    public final String Y() {
        return e(this.a, this.b, this.c, this.d, this.e);
    }

    @Override // defpackage.wlu
    public final /* bridge */ /* synthetic */ aiir a() {
        aihf aihfVarCreateBuilder = alms.a.createBuilder();
        String str = this.a;
        aihfVarCreateBuilder.copyOnWrite();
        alms almsVar = (alms) aihfVarCreateBuilder.instance;
        str.getClass();
        almsVar.b |= 2;
        almsVar.d = str;
        int i = this.D;
        aihfVarCreateBuilder.copyOnWrite();
        alms almsVar2 = (alms) aihfVarCreateBuilder.instance;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        almsVar2.g = i2;
        almsVar2.b |= 4;
        List list = this.b;
        if (list != null) {
            aihfVarCreateBuilder.copyOnWrite();
            alms almsVar3 = (alms) aihfVarCreateBuilder.instance;
            aihv aihvVar = almsVar3.e;
            if (!aihvVar.c()) {
                almsVar3.e = aihn.mutableCopy(aihvVar);
            }
            aifs.addAll(list, almsVar3.e);
        }
        agke agkeVar = this.c;
        if (agkeVar != null) {
            aihfVarCreateBuilder.copyOnWrite();
            alms almsVar4 = (alms) aihfVarCreateBuilder.instance;
            aiie aiieVar = almsVar4.f;
            if (!aiieVar.c()) {
                almsVar4.f = aihn.mutableCopy(aiieVar);
            }
            aifs.addAll(agkeVar, almsVar4.f);
        }
        String str2 = this.d;
        if (str2 != null) {
            aihfVarCreateBuilder.copyOnWrite();
            alms almsVar5 = (alms) aihfVarCreateBuilder.instance;
            almsVar5.b |= 8;
            almsVar5.h = str2;
        }
        aptc aptcVar = this.e;
        if (aptcVar != null) {
            aihfVarCreateBuilder.copyOnWrite();
            alms almsVar6 = (alms) aihfVarCreateBuilder.instance;
            almsVar6.i = aptcVar;
            almsVar6.b |= 16;
        }
        return aihfVarCreateBuilder;
    }

    @Override // defpackage.wkf
    protected final void b() {
        this.a.getClass();
    }
}
