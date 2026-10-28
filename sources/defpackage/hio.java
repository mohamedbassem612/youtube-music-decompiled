package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.media.MediaBrowserCompat$MediaItem;
import android.text.TextUtils;
import com.google.android.apps.youtube.music.R;
import j$.util.Optional;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class hio implements hiq {
    private static final agrf b = agrf.h("com/google/android/apps/youtube/music/mediabrowser/content/MusicBrowserItemTree");
    private static final agke c = agke.t(hui.a, hui.b, hui.c, hui.d);
    public final aunn a;
    private final Context d;
    private final aunn e;
    private final aunn f;
    private final aunn g;
    private final aunn h;
    private final aunn i;
    private final aunn j;
    private final zne k;
    private final xhc l;
    private final ConcurrentHashMap m = new ConcurrentHashMap();
    private final ConcurrentHashMap n = new ConcurrentHashMap();
    private final Map o = new ConcurrentHashMap();
    private Set p;
    private MediaBrowserCompat$MediaItem q;
    private MediaBrowserCompat$MediaItem r;
    private MediaBrowserCompat$MediaItem s;
    private boolean t;

    public hio(Context context, aunn aunnVar, aunn aunnVar2, aunn aunnVar3, aunn aunnVar4, aunn aunnVar5, aunn aunnVar6, aunn aunnVar7, zne zneVar) {
        this.d = context;
        this.e = aunnVar;
        this.a = aunnVar2;
        this.f = aunnVar3;
        this.g = aunnVar4;
        this.h = aunnVar5;
        this.i = aunnVar6;
        this.j = aunnVar7;
        this.k = zneVar;
        this.l = (xhc) hhs.b.get(zneVar);
        agpr agprVar = agpr.a;
        agprVar.getClass();
        this.p = agprVar;
    }

    private final abx A(znf znfVar) {
        return E(this.m, znfVar);
    }

    private final void B(abx abxVar, List list) {
        C(this.m, abxVar, list);
    }

    private final void C(Map map, abx abxVar, List list) {
        boolean z;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            MediaBrowserCompat$MediaItem mediaBrowserCompat$MediaItem = (MediaBrowserCompat$MediaItem) it.next();
            znf znfVar = znf.a;
            abx abxVarE = E(map, yno.ai(mediaBrowserCompat$MediaItem.a()));
            abxVarE.d = mediaBrowserCompat$MediaItem;
            arrayList.add(abxVarE);
        }
        List list2 = abxVar.a;
        if (list2 != null && list2.size() == arrayList.size()) {
            int size = list2.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    z = true;
                    break;
                }
                if (awrc.c(((abx) list2.get(i)).c, ((abx) arrayList.get(i)).c)) {
                    Object obj = ((abx) list2.get(i)).d;
                    Object obj2 = ((abx) arrayList.get(i)).d;
                    if (obj == null) {
                        if (obj2 == null) {
                            i++;
                        }
                    } else if (obj2 != null) {
                        MediaBrowserCompat$MediaItem mediaBrowserCompat$MediaItem2 = (MediaBrowserCompat$MediaItem) obj;
                        MediaBrowserCompat$MediaItem mediaBrowserCompat$MediaItem3 = (MediaBrowserCompat$MediaItem) obj2;
                        if (TextUtils.equals(mediaBrowserCompat$MediaItem2.a(), mediaBrowserCompat$MediaItem3.a())) {
                            if (TextUtils.equals(mediaBrowserCompat$MediaItem2.a.b, mediaBrowserCompat$MediaItem3.a.b)) {
                                i++;
                            }
                        }
                    }
                }
                z = false;
                break;
            }
        }
        z = false;
        break;
        abxVar.a = arrayList;
        if (((vxz) this.j.io()).l(6, 45680102L, false) && abxVar.b && !z) {
            ((isw) this.i.io()).h((znf) abxVar.c);
        }
    }

    private static final abx D(Map map, znf znfVar) {
        if (znfVar == null || !map.containsKey(znfVar)) {
            return null;
        }
        return (abx) map.get(znfVar);
    }

    private static final abx E(Map map, znf znfVar) {
        Object abxVar = map.get(znfVar);
        if (abxVar == null) {
            abxVar = new abx(znfVar);
            map.put(znfVar, abxVar);
        }
        return (abx) abxVar;
    }

    private final void s(amzx amzxVar, ConcurrentMap concurrentMap) {
        if (amzxVar.i.size() != 0) {
            ArrayList arrayList = new ArrayList(amzxVar.i.size());
            for (amzx amzxVar2 : amzxVar.i) {
                if ((amzxVar2.b & 2) != 0) {
                    try {
                        Optional optionalI = ((hin) this.e.io()).i(amzxVar2, this.p, this.k);
                        if (optionalI.isPresent()) {
                            Object obj = optionalI.get();
                            u((MediaBrowserCompat$MediaItem) obj);
                            arrayList.add(obj);
                            v(((MediaBrowserCompat$MediaItem) obj).a(), amzxVar2.q.G());
                            amzxVar2.getClass();
                            s(amzxVar2, concurrentMap);
                        }
                    } catch (IllegalArgumentException e) {
                        zvp.a(zvn.b, zvm.n, e.getMessage());
                    }
                }
            }
            if ((amzxVar.b & 2) == 0 || arrayList.isEmpty()) {
                return;
            }
            znf znfVar = znf.a;
            C(concurrentMap, E(concurrentMap, yno.ai(amzxVar.e)), arrayList);
        }
    }

    private final void t(znf znfVar, List list, boolean z, boolean z2) {
        abx abxVarZ = z(znfVar);
        if (abxVarZ == null) {
            if (!z2) {
                return;
            }
            abxVarZ = A(znfVar);
            z2 = true;
        }
        List listA = abxVarZ.a();
        if (listA == null) {
            if (!z2) {
                return;
            }
            listA = new ArrayList();
            B(abxVarZ, listA);
        }
        HashSet hashSet = new HashSet();
        Iterator it = listA.iterator();
        while (it.hasNext()) {
            hashSet.add(((MediaBrowserCompat$MediaItem) it.next()).a());
        }
        ArrayList<MediaBrowserCompat$MediaItem> arrayList = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            MediaBrowserCompat$MediaItem mediaBrowserCompat$MediaItem = (MediaBrowserCompat$MediaItem) it2.next();
            if (hashSet.add(mediaBrowserCompat$MediaItem.a())) {
                arrayList.add(mediaBrowserCompat$MediaItem);
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList(listA);
        if (z) {
            arrayList2.addAll(0, arrayList);
        } else {
            arrayList2.addAll(arrayList);
        }
        B(abxVarZ, arrayList2);
        for (MediaBrowserCompat$MediaItem mediaBrowserCompat$MediaItem2 : arrayList) {
            anfb anfbVarC = yno.ai(mediaBrowserCompat$MediaItem2.a()).c();
            if (anfbVarC != null) {
                ajwo ajwoVar = anfbVarC.e;
                if (ajwoVar == null) {
                    ajwoVar = ajwo.a;
                }
                if ((ajwoVar.b & 1) != 0) {
                    String strA = mediaBrowserCompat$MediaItem2.a();
                    ajwo ajwoVar2 = anfbVarC.e;
                    if (ajwoVar2 == null) {
                        ajwoVar2 = ajwo.a;
                    }
                    v(strA, ajwoVar2.c.G());
                }
            }
        }
    }

    private final void u(MediaBrowserCompat$MediaItem mediaBrowserCompat$MediaItem) {
        Bundle bundle = mediaBrowserCompat$MediaItem.a.f;
        if (bundle == null || !bundle.getBoolean("com.google.android.apps.youtube.music.mediabrowser.IS_LAST_PLAYED")) {
            return;
        }
        this.q = mediaBrowserCompat$MediaItem;
    }

    private final void v(String str, byte[] bArr) {
        if (str == null || this.l == null) {
            return;
        }
        this.o.put(str, bArr);
    }

    private final List w(List list, ConcurrentMap concurrentMap) {
        if (list.isEmpty()) {
            agke agkeVar = agpi.a;
            agkeVar.getClass();
            return agkeVar;
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            amzx amzxVar = (amzx) it.next();
            s(amzxVar, concurrentMap);
            try {
                Optional optionalI = ((hin) this.e.io()).i(amzxVar, this.p, this.k);
                if (optionalI.isPresent()) {
                    Object obj = optionalI.get();
                    Bundle bundle = ((MediaBrowserCompat$MediaItem) obj).a.f;
                    if (bundle != null && bundle.getBoolean("com.google.android.apps.youtube.music.mediabrowser.IS_RECOMMENDED")) {
                        this.r = (MediaBrowserCompat$MediaItem) obj;
                    }
                    u((MediaBrowserCompat$MediaItem) obj);
                    arrayList.add(obj);
                    v(((MediaBrowserCompat$MediaItem) obj).a(), amzxVar.q.G());
                }
            } catch (IllegalArgumentException e) {
                ((agrc) ((agrc) b.b()).j(e).k("com/google/android/apps/youtube/music/mediabrowser/content/MusicBrowserItemTree", "getTopLevelMediaItemsAndFillTree", 452, "MusicBrowserItemTree.kt")).t("Failed to create MediaItem.");
                zvp.a(zvn.b, zvm.n, e.getMessage());
            }
        }
        agke agkeVarN = agke.n(arrayList);
        agkeVarN.getClass();
        return agkeVarN;
    }

    private static final boolean x(znf znfVar) {
        anfb anfbVarC = znfVar.c();
        return (anfbVarC == null || (anfbVarC.b & 1) == 0) ? false : true;
    }

    private static final boolean y(Map map, znf znfVar) {
        List listA;
        abx abxVar = (abx) map.get(znfVar);
        return (abxVar == null || (listA = abxVar.a()) == null || listA.isEmpty()) ? false : true;
    }

    private final abx z(znf znfVar) {
        return D(this.m, znfVar);
    }

    @Override // defpackage.hiq
    public final zne a() {
        return this.k;
    }

    @Override // defpackage.hiq
    public final ajwo b(hjy hjyVar, znf znfVar) {
        i(hjyVar, znfVar);
        return znfVar.a();
    }

    @Override // defpackage.hiq
    public final void c(znf znfVar, MediaBrowserCompat$MediaItem mediaBrowserCompat$MediaItem) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(mediaBrowserCompat$MediaItem);
        t(znfVar, arrayList, true, true);
    }

    @Override // defpackage.hiq
    public final void d(hjn hjnVar) {
        A(hjnVar.j).b();
    }

    @Override // defpackage.hiq
    public final void e() {
        this.m.clear();
        this.n.clear();
        this.o.clear();
    }

    @Override // defpackage.hiq
    public final void f(amzz amzzVar) {
        amzzVar.getClass();
        this.s = ((hin) this.e.io()).c(amzzVar);
    }

    @Override // defpackage.hiq
    public final void g(List list, amzl amzlVar, hjn hjnVar, Set set, byte[] bArr) {
        list.getClass();
        set.getClass();
        this.p = set;
        xhc xhcVar = this.l;
        if (xhcVar != null) {
            aunn aunnVar = this.g;
            ((xgn) aunnVar.io()).b(xhcVar, null, null);
            ((xgn) aunnVar.io()).d(new xgj(bArr));
        }
        if (!((vxz) this.j.io()).l(6, 45680102L, false)) {
            ((hin) this.e.io()).j();
        }
        List<MediaBrowserCompat$MediaItem> listW = w(list, this.m);
        if (!listW.isEmpty()) {
            B(A(this.k.a()), listW);
            Object objIo = this.i.io();
            objIo.getClass();
            isw iswVar = (isw) objIo;
            for (MediaBrowserCompat$MediaItem mediaBrowserCompat$MediaItem : listW) {
                if (mediaBrowserCompat$MediaItem.b()) {
                    iswVar.h(yno.ai(mediaBrowserCompat$MediaItem.a()));
                }
            }
        }
        hin hinVar = (hin) this.e.io();
        String str = hjnVar.e.b;
        hinVar.k();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.hiq
    public final void h(Map map, hjo hjoVar) {
        String string;
        this.n.clear();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        agqs agqsVarListIterator = c.listIterator(0);
        agqsVarListIterator.getClass();
        while (agqsVarListIterator.hasNext()) {
            E next = agqsVarListIterator.next();
            next.getClass();
            hui huiVar = (hui) next;
            List list = (List) map.get(huiVar);
            if (list != null && !list.isEmpty()) {
                int iMin = Math.min(5, list.size());
                int iOrdinal = huiVar.ordinal();
                if (iOrdinal == 0) {
                    string = this.d.getString(R.string.search_shelf_top_result_title);
                } else if (iOrdinal == 1) {
                    string = this.d.getString(R.string.library_songs_shelf_title);
                } else if (iOrdinal != 2) {
                    string = iOrdinal != 3 ? null : this.d.getString(R.string.library_albums_shelf_title);
                } else {
                    string = this.d.getString(R.string.library_playlists_shelf_title);
                }
                if (string != null) {
                    linkedHashMap.put(string, list.subList(0, iMin));
                }
            }
        }
        taf.g(((jgc) this.a.io()).e(linkedHashMap), new gsu(this, hjoVar.b, hjoVar, 14, (byte[]) null));
    }

    @Override // defpackage.hiq
    public final void i(hjy hjyVar, znf znfVar) {
        anfb anfbVarC;
        argn argnVar;
        hjyVar.getClass();
        znfVar.getClass();
        Map map = this.o;
        String str = znfVar.l;
        byte[] bArr = (byte[]) map.get(str);
        xhc xhcVar = this.l;
        if (xhcVar == null || bArr == null) {
            return;
        }
        aunn aunnVar = this.g;
        ((xgn) aunnVar.io()).o(ameb.INTERACTION_LOGGING_GESTURE_TYPE_GENERIC_CLICK, new xgj(bArr), null);
        Context context = this.d;
        if (txz.g(context) && x(znfVar) && q(znfVar)) {
            anfb anfbVarC2 = znfVar.c();
            if (anfbVarC2 != null) {
                ajwo ajwoVar = anfbVarC2.e;
                if (ajwoVar == null) {
                    ajwoVar = ajwo.a;
                }
                aihf builder = ajwoVar.toBuilder();
                builder.getClass();
                aihh aihhVar = (aihh) builder;
                xgt xgtVarA = ((xgn) aunnVar.io()).a();
                byte[] bArr2 = (byte[]) map.get(str);
                if (bArr2 != null) {
                    aigj aigjVarV = aigj.v(bArr2);
                    if (awrc.c((xgtVarA == null || (argnVar = xgtVarA.e) == null) ? null : argnVar.c, aigjVarV)) {
                        return;
                    }
                    aihhVar.copyOnWrite();
                    ajwo ajwoVar2 = (ajwo) aihhVar.instance;
                    aigjVarV.getClass();
                    ajwoVar2.b |= 1;
                    ajwoVar2.c = aigjVarV;
                } else {
                    aihf aihfVarCreateBuilder = aoar.a.createBuilder();
                    String strI = ((xgn) aunnVar.io()).i();
                    aihfVarCreateBuilder.copyOnWrite();
                    aoar aoarVar = (aoar) aihfVarCreateBuilder.instance;
                    strI.getClass();
                    aoarVar.b |= 1;
                    aoarVar.c = strI;
                    int iIntValue = Integer.valueOf(xgtVarA != null ? xgtVarA.f : xhcVar.a).intValue();
                    aihfVarCreateBuilder.copyOnWrite();
                    aoar aoarVar2 = (aoar) aihfVarCreateBuilder.instance;
                    aoarVar2.b |= 2;
                    aoarVar2.d = iIntValue;
                    aihhVar.e(aoaq.b, aihfVarCreateBuilder.build());
                }
                aihn aihnVarBuild = aihhVar.build();
                aihnVarBuild.getClass();
                ((xgn) aunnVar.io()).b(xhb.a(182119), (ajwo) aihnVarBuild, null);
                return;
            }
            return;
        }
        if (txz.g(context) && !x(znfVar)) {
            ((xgn) aunnVar.io()).b(xhcVar, null, null);
            return;
        }
        if (!x(znfVar) || (anfbVarC = znfVar.c()) == null) {
            return;
        }
        ajwo ajwoVar3 = anfbVarC.e;
        if (ajwoVar3 == null) {
            ajwoVar3 = ajwo.a;
        }
        aihf builder2 = ajwoVar3.toBuilder();
        builder2.getClass();
        aihh aihhVar2 = (aihh) builder2;
        xgt xgtVarA2 = ((xgn) aunnVar.io()).a();
        Integer numValueOf = xgtVarA2 != null ? Integer.valueOf(xgtVarA2.f) : null;
        if (!map.containsKey(str) || (numValueOf != null && numValueOf.intValue() == 182119)) {
            aihf aihfVarCreateBuilder2 = aoar.a.createBuilder();
            String strI2 = ((xgn) aunnVar.io()).i();
            aihfVarCreateBuilder2.copyOnWrite();
            aoar aoarVar3 = (aoar) aihfVarCreateBuilder2.instance;
            strI2.getClass();
            aoarVar3.b |= 1;
            aoarVar3.c = strI2;
            if (numValueOf == null) {
                numValueOf = Integer.valueOf(xhcVar.a);
            }
            int iIntValue2 = numValueOf.intValue();
            aihfVarCreateBuilder2.copyOnWrite();
            aoar aoarVar4 = (aoar) aihfVarCreateBuilder2.instance;
            aoarVar4.b |= 2;
            aoarVar4.d = iIntValue2;
            aihhVar2.e(aoaq.b, aihfVarCreateBuilder2.build());
        } else {
            aigj aigjVarV2 = aigj.v((byte[]) map.get(str));
            aihhVar2.copyOnWrite();
            ajwo ajwoVar4 = (ajwo) aihhVar2.instance;
            aigjVarV2.getClass();
            ajwoVar4.b |= 1;
            ajwoVar4.c = aigjVarV2;
        }
        aihn aihnVarBuild2 = aihhVar2.build();
        aihnVarBuild2.getClass();
        ((abea) this.f.io()).a().b(xhb.a(3832), (ajwo) aihnVarBuild2, null);
    }

    @Override // defpackage.hiq
    public final void j(znf znfVar, String str) {
        ((abea) this.f.io()).a().r(str);
    }

    @Override // defpackage.hiq
    public final void k(znf znfVar, List list) {
        t(znfVar, list, false, false);
    }

    @Override // defpackage.hiq
    public final void l(znf znfVar, znf znfVar2) {
        List listA;
        MediaBrowserCompat$MediaItem mediaBrowserCompat$MediaItemO;
        abx abxVar = (abx) this.m.get(znfVar);
        if (abxVar == null || (listA = abxVar.a()) == null || (mediaBrowserCompat$MediaItemO = hmy.O(listA, znfVar2)) == null) {
            return;
        }
        ArrayList arrayList = new ArrayList(listA);
        arrayList.remove(mediaBrowserCompat$MediaItemO);
        B(abxVar, arrayList);
    }

    @Override // defpackage.hiq
    public final void m(Map map) {
        map.getClass();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Map.Entry entry : map.entrySet()) {
            znf znfVar = (znf) entry.getKey();
            List list = (List) entry.getValue();
            n(znfVar, list);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String strA = ((MediaBrowserCompat$MediaItem) it.next()).a();
                if (strA != null && strA.length() > 0) {
                    linkedHashSet.add(strA);
                }
            }
        }
        for (Object obj : this.m.values()) {
            obj.getClass();
            abx abxVar = (abx) obj;
            Object obj2 = abxVar.c;
            if (!map.containsKey(obj2) || !linkedHashSet.contains(((znf) obj2).l)) {
                if (!map.containsKey(obj2)) {
                    List list2 = abxVar.a;
                    abxVar.a = null;
                    if (((vxz) this.j.io()).l(6, 45680102L, false) && abxVar.b && list2 != null) {
                        ((isw) this.i.io()).h((znf) obj2);
                    }
                }
                if (!linkedHashSet.contains(((znf) obj2).l)) {
                    abxVar.d = null;
                }
            }
        }
    }

    @Override // defpackage.hiq
    public final void n(znf znfVar, List list) {
        znfVar.getClass();
        list.getClass();
        B(A(znfVar), list);
    }

    @Override // defpackage.hiq
    public final void o(hjn hjnVar) {
        abx abxVarZ;
        List listA;
        hjy hjyVarA = hjnVar.a();
        znf znfVar = hjnVar.j;
        i(hjyVarA, znfVar);
        MediaBrowserCompat$MediaItem mediaBrowserCompat$MediaItem = this.r;
        if (awrc.c(znfVar.l, mediaBrowserCompat$MediaItem != null ? mediaBrowserCompat$MediaItem.a() : null)) {
            MediaBrowserCompat$MediaItem mediaBrowserCompat$MediaItem2 = this.s;
            MediaBrowserCompat$MediaItem mediaBrowserCompat$MediaItem3 = this.r;
            if (!this.t) {
                String strA = mediaBrowserCompat$MediaItem2 != null ? mediaBrowserCompat$MediaItem2.a() : null;
                if (strA != null && strA.length() != 0 && mediaBrowserCompat$MediaItem3 != null && (abxVarZ = z(yno.ai(mediaBrowserCompat$MediaItem3.a()))) != null && (listA = abxVarZ.a()) != null) {
                    ArrayList arrayList = new ArrayList(listA.size() + 1);
                    arrayList.add(0, mediaBrowserCompat$MediaItem2);
                    arrayList.addAll(listA);
                    B(abxVarZ, arrayList);
                    this.t = true;
                    String strA2 = mediaBrowserCompat$MediaItem2.a();
                    if (strA2 != null) {
                        ((hja) this.h.io()).e(this.k, strA2);
                    }
                }
            }
        }
        abx abxVarA = A(znfVar);
        abxVarA.b();
        List listA2 = abxVarA.a();
        if (listA2 != null) {
            hjnVar.c(listA2, null);
            return;
        }
        abx abxVarD = D(this.n, znfVar);
        if (abxVarD != null) {
            abxVarD.b();
            List listA3 = abxVarD.a();
            if (listA3 != null) {
                hjnVar.c(listA3, null);
                return;
            }
        }
        hjnVar.c(agpi.a, null);
    }

    @Override // defpackage.hiq
    public final void p(anzs anzsVar) {
        List listA;
        Object objR;
        MediaBrowserCompat$MediaItem mediaBrowserCompat$MediaItem = this.q;
        if (mediaBrowserCompat$MediaItem != null) {
            MediaBrowserCompat$MediaItem mediaBrowserCompat$MediaItemD = ((hin) this.e.io()).d(anzsVar);
            znf znfVar = znf.a;
            abx abxVarZ = z(yno.ai(mediaBrowserCompat$MediaItem.a()));
            if (abxVarZ == null || (listA = abxVarZ.a()) == null) {
                return;
            }
            List listAr = atqq.ar(listA);
            Iterator it = listAr.iterator();
            while (true) {
                objR = null;
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                MediaBrowserCompat$MediaItem mediaBrowserCompat$MediaItem2 = (MediaBrowserCompat$MediaItem) next;
                if (mediaBrowserCompat$MediaItem2.a() != null) {
                    String strA = mediaBrowserCompat$MediaItem2.a();
                    if (strA != null) {
                        ajwo ajwoVar = ajwo.a;
                        ajwoVar.getClass();
                        anfb anfbVarC = yno.ai(strA).c();
                        if (anfbVarC != null && (anfbVarC.b & 1) != 0) {
                            ajwo ajwoVar2 = anfbVarC.e;
                            if (ajwoVar2 != null) {
                                ajwoVar = ajwoVar2;
                            }
                            ajwoVar.getClass();
                        }
                        objR = gzj.R(ajwoVar);
                    }
                    ajwo ajwoVar3 = anzsVar.f;
                    if (ajwoVar3 == null) {
                        ajwoVar3 = ajwo.a;
                    }
                    if (awrc.c(objR, gzj.R(ajwoVar3))) {
                        objR = next;
                        break;
                    }
                }
            }
            MediaBrowserCompat$MediaItem mediaBrowserCompat$MediaItem3 = (MediaBrowserCompat$MediaItem) objR;
            if (mediaBrowserCompat$MediaItem3 != null) {
                listAr.remove(mediaBrowserCompat$MediaItem3);
            }
            listAr.add(0, mediaBrowserCompat$MediaItemD);
            B(abxVarZ, listAr);
            ((isw) this.i.io()).h((znf) abxVarZ.c);
        }
    }

    @Override // defpackage.hiq
    public final boolean q(znf znfVar) {
        znfVar.getClass();
        return y(this.m, znfVar) || y(this.n, znfVar);
    }

    @Override // defpackage.hiq
    public final void r(List list, hjo hjoVar) {
        list.getClass();
        ConcurrentHashMap concurrentHashMap = this.n;
        concurrentHashMap.clear();
        hjoVar.b(w(list, concurrentHashMap));
    }
}
