package defpackage;

import j$.util.Collection;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class wtz extends wms {
    private final boolean D;
    private final boolean E;
    private final int a;
    private final apvu b;
    private final String c;
    private final String d;
    private final String e;

    public wtz(abxv abxvVar, zwa zwaVar, aihf aihfVar, boolean z, boolean z2) {
        int i;
        apvu apvuVar;
        String str;
        super(abxvVar, zwaVar, "shorts/get_shorts_creation", aihfVar, z);
        this.D = z2;
        alqq alqqVar = (alqq) aihfVar.instance;
        int i2 = alqqVar.c;
        if ((i2 & 4) != 0) {
            int iAU = a.aU(alqqVar.g);
            i = (iAU == 0 ? 1 : iAU) - 1;
        } else {
            i = 0;
        }
        this.a = i;
        if ((i2 & 16) == 0 || (apvuVar = alqqVar.i) == null) {
            apvuVar = apvu.a;
        }
        this.b = apvuVar;
        ArrayList arrayList = new ArrayList();
        Iterator<E> it = new aihx(((alqq) aihfVar.instance).f, alqq.a).iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(((arfs) it.next()).e));
        }
        Collections.sort(arrayList);
        this.c = (String) Collection.EL.stream(agke.n(arrayList)).map(new vmw(15)).collect(Collectors.joining(","));
        ardi ardiVar = ((alqq) aihfVar.instance).e;
        ArrayList arrayList2 = new ArrayList((ardiVar == null ? ardi.a : ardiVar).c);
        Collections.sort(arrayList2);
        this.d = a.R(arrayList2);
        alqq alqqVar2 = (alqq) aihfVar.instance;
        if ((alqqVar2.c & 8) != 0) {
            alqs alqsVar = alqqVar2.h;
            str = (alqsVar == null ? alqs.a : alqsVar).c;
        } else {
            str = "";
        }
        this.e = str;
        apvq apvqVar = ((alqq) aihfVar.instance).j;
        apvs apvsVar = (apvqVar == null ? apvq.a : apvqVar).b;
        this.E = (apvsVar == null ? apvs.a : apvsVar).b;
    }

    @Override // defpackage.wkf
    public final String Y() {
        if (!this.D) {
            return "NO_CACHE_KEY_VALUE";
        }
        dov dovVarE = E();
        dovVarE.E("clientContext", this.a);
        dovVarE.F("packages", this.c);
        dovVarE.F("availableAssets", this.d);
        String str = this.e;
        if (!str.isEmpty()) {
            dovVarE.F("currentlyPlayingVideoId", str);
        }
        apvu apvuVar = this.b;
        if ((apvuVar.b & 8) != 0) {
            int iAS = a.aS(apvuVar.f);
            if (iAS == 0) {
                iAS = 1;
            }
            dovVarE.E("entryCommentType", iAS - 1);
        }
        if ((apvuVar.b & 2) != 0) {
            int iAV = acfz.aV(apvuVar.d);
            if (iAV == 0) {
                iAV = 1;
            }
            dovVarE.E("entrySurface", iAV - 1);
        }
        if ((apvuVar.b & 1) != 0) {
            int iAU = acfz.aU(apvuVar.c);
            if (iAU == 0) {
                iAU = 1;
            }
            dovVarE.E("remixType", iAU - 1);
        }
        if ((apvuVar.b & 4) != 0) {
            int iAX = a.aX(apvuVar.e);
            if (iAX == 0) {
                iAX = 1;
            }
            dovVarE.E("entryCreationSource", iAX - 1);
        }
        if (this.E) {
            dovVarE.G("hideShareFooterButton", true);
        }
        return dovVarE.D();
    }

    @Override // defpackage.wkf
    protected final void b() {
    }
}
