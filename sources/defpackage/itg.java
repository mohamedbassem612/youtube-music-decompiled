package defpackage;

import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;
import com.google.android.apps.youtube.music.R;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Collection;
import j$.util.Objects;
import j$.util.Optional;
import j$.util.stream.Collector;
import j$.util.stream.Collectors;
import j$.util.stream.Stream;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class itg implements agek {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ itg(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r0v42, types: [java.lang.Object, java.util.Collection] */
    @Override // defpackage.agek
    public final Object apply(Object obj) {
        ArrayList arrayList;
        String string;
        long count;
        String string2;
        long count2;
        int i = 11;
        int i2 = 12;
        int i3 = 20;
        int i4 = 0;
        int i5 = 3;
        int i6 = 1;
        switch (this.$cid) {
            case 0:
                return (List) Collection.EL.stream((List) obj).map(new hqs(this.a, i3)).collect(Collectors.toList());
            case 1:
                try {
                    return (List) ((itj) this.a).c.m((List) obj).get();
                } catch (Exception unused) {
                    return agpi.a;
                }
            case 2:
                ((agrc) ((agrc) ((agrc) itq.a.b().i(agso.a, "SideloadedBrowsePage")).j((ExecutionException) obj)).k("com/google/android/apps/youtube/music/sideloaded/service/SideloadedBrowsePageGenerationService", "addChipsByElements", 825, "SideloadedBrowsePageGenerationService.java")).t("Failed to get music library chip bar element.");
                return this.a;
            case 3:
                hcg hcgVar = (hcg) obj;
                Optional optional = hcgVar.a;
                ahno.F(optional.isPresent());
                return ((itr) this.a).a((anjx) optional.get(), anjx.class, anne.class, hcgVar, hmy.ag(hcgVar.f, 1));
            case 4:
                hcg hcgVar2 = (hcg) obj;
                Optional optional2 = hcgVar2.a;
                ahno.F(optional2.isPresent());
                return ((itr) this.a).a((ankr) optional2.get(), ankr.class, anpf.class, hcgVar2, hmy.ag(hcgVar2.f, 3));
            case 5:
                hcg hcgVar3 = (hcg) obj;
                Optional optional3 = hcgVar3.a;
                ahno.F(optional3.isPresent());
                return ((itr) this.a).a((anuk) optional3.get(), anuk.class, annx.class, hcgVar3, hmy.ag(hcgVar3.f, 2));
            case 6:
                hcg hcgVar4 = (hcg) obj;
                Optional optional4 = hcgVar4.a;
                ahno.F(optional4.isPresent());
                return (annx) ((itu) this.a).g.ap(anuk.class, annx.class, (anuk) optional4.get(), hmy.ag(hcgVar4.f, 2));
            case 7:
                Boolean bool = (Boolean) obj;
                ((iuf) this.a).m = true != Objects.equals(bool, Boolean.TRUE) ? 3 : 2;
                return bool;
            case 8:
                return hmy.Q((String) this.a, (Cursor) obj);
            case 9:
                Stream map = Collection.EL.stream(this.a).map(new itm(6));
                Collector collector = aghu.b;
                agkz agkzVar = (agkz) map.collect(collector);
                agkz agkzVar2 = (agkz) Collection.EL.stream((agke) obj).map(new itm(7)).collect(collector);
                if (agkzVar2.containsAll(agkzVar)) {
                    return aost.ALL;
                }
                Stream stream = Collection.EL.stream(agkzVar);
                agkzVar2.getClass();
                return stream.anyMatch(new ibz(agkzVar2, 4)) ? aost.SOME : aost.NONE;
            case 10:
                List list = (List) obj;
                if (list.isEmpty()) {
                    return list;
                }
                Object obj2 = this.a;
                iuf iufVar = (iuf) obj2;
                aheo aheoVarG = iufVar.o.G(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, new String[]{"_id"}, "is_music=1 AND title IS NOT NULL", null, null).c(afwl.f(new itw(i6)), iufVar.d).g();
                ListenableFuture listenableFutureV = ((hfn) iufVar.g.io()).V();
                ahud ahudVarAv = ahno.av(aheoVarG, listenableFutureV);
                itc itcVar = new itc(aheoVarG, listenableFutureV, i5);
                Executor executor = iufVar.c;
                taf.j(ahno.as(ahudVarAv.k(itcVar, executor), new isv(obj2, i), executor), new ihw(i3));
                return list;
            case 11:
                aimq aimqVar = (aimq) obj;
                ((hfn) ((iuf) this.a).i.io()).af(aimqVar.d, aimqVar.e);
                return null;
            case 12:
                ((iuf) this.a).l = 3;
                return Boolean.FALSE;
            case 13:
                ((iuf) this.a).m = 3;
                return Boolean.FALSE;
            case 14:
                return this.a;
            case 15:
                List<anuk> list2 = (List) obj;
                arrayList = new ArrayList(list2.size());
                for (anuk anukVar : list2) {
                    Object obj3 = this.a;
                    iuo iuoVar = (iuo) obj3;
                    Cursor cursorQuery = iuoVar.e.query(ixt.o(Uri.parse(hef.p(anukVar))), new String[]{"audio_id"}, null, null, "play_order");
                    try {
                        if (cursorQuery.moveToFirst()) {
                            string = cursorQuery.getString(cursorQuery.getColumnIndex("audio_id"));
                            count = cursorQuery.getCount();
                        } else {
                            string = "";
                            count = 0;
                        }
                        jku.b(cursorQuery);
                        anui anuiVarD = anukVar.d();
                        anuiVarD.ap(Long.valueOf(count));
                        anuiVarD.an(ixt.w(iuoVar.b, ixt.l(string), R.drawable.playlist_empty_state, iuoVar.i.l(263, 45828915L, false)));
                        ((wbz) iuoVar.f.io()).c();
                        arrayList.add(anuiVarD.aq());
                    } catch (Throwable th) {
                        jku.b(cursorQuery);
                        throw th;
                    }
                }
                break;
            case 16:
                Stream map2 = Collection.EL.stream(this.a).map(new itm(i2));
                Collector collector2 = aghu.b;
                agkz agkzVar3 = (agkz) map2.collect(collector2);
                agkz agkzVar4 = (agkz) Collection.EL.stream((agke) obj).map(new itm(16)).collect(collector2);
                if (agkzVar4.containsAll(agkzVar3)) {
                    return aost.ALL;
                }
                Stream stream2 = Collection.EL.stream(agkzVar3);
                agkzVar4.getClass();
                return stream2.anyMatch(new ibz(agkzVar4, 9)) ? aost.SOME : aost.NONE;
            case 17:
                List<anuk> list3 = (List) obj;
                arrayList = new ArrayList(list3.size());
                for (anuk anukVar2 : list3) {
                    Object obj4 = this.a;
                    iuo iuoVar2 = (iuo) obj4;
                    Cursor cursorQuery2 = iuoVar2.e.query(ixt.o(Uri.parse(hef.p(anukVar2))), new String[]{"album_id"}, null, null, "play_order");
                    try {
                        if (cursorQuery2.moveToFirst()) {
                            string2 = cursorQuery2.getString(cursorQuery2.getColumnIndex("album_id"));
                            count2 = cursorQuery2.getCount();
                        } else {
                            string2 = "";
                            count2 = 0;
                        }
                        jku.b(cursorQuery2);
                        anui anuiVarD2 = anukVar2.d();
                        anuiVarD2.ap(Long.valueOf(count2));
                        ((wbz) iuoVar2.f.io()).c();
                        arrayList.add(new hch(anuiVarD2.aq(), string2));
                    } catch (Throwable th2) {
                        jku.b(cursorQuery2);
                        throw th2;
                    }
                }
                break;
            case 18:
                return hmy.Q((String) this.a, (Cursor) obj);
            case 19:
                Boolean bool2 = (Boolean) obj;
                ((iuo) this.a).h = true != Objects.equals(bool2, Boolean.TRUE) ? 3 : 2;
                return bool2;
            default:
                List list4 = (List) obj;
                if (list4.isEmpty()) {
                    return list4;
                }
                Object obj5 = this.a;
                iuo iuoVar3 = (iuo) obj5;
                aheo aheoVarG2 = iuoVar3.n.G(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, new String[]{"_id"}, "is_music=1 AND title IS NOT NULL", null, null).c(afwl.f(new itw(i)), iuoVar3.d).g();
                ListenableFuture listenableFutureV2 = iuoVar3.k.V();
                ahud ahudVarAv2 = ahno.av(aheoVarG2, listenableFutureV2);
                itc itcVar2 = new itc(aheoVarG2, listenableFutureV2, i2);
                Executor executor2 = iuoVar3.c;
                taf.j(ahno.as(ahudVarAv2.k(itcVar2, executor2), new isv(obj5, 17), executor2), new iul(i4));
                return list4;
        }
        return arrayList;
    }
}
