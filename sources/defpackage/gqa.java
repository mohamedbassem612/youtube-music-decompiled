package defpackage;

import android.content.Context;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import com.google.android.apps.youtube.music.R;
import com.google.android.apps.youtube.music.offline.appsearch.schema.MusicOfflineAlbumAppSearchDocument;
import com.google.android.apps.youtube.music.offline.appsearch.schema.MusicOfflinePlaylistAppSearchDocument;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.stream.Collectors;
import j$.util.stream.Stream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class gqa implements agek {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;

    public /* synthetic */ gqa(Object obj, Object obj2, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v41, types: [java.lang.Object, zwa] */
    /* JADX WARN: Type inference failed for: r0v49, types: [java.lang.Object, zwa] */
    /* JADX WARN: Type inference failed for: r12v82, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v17, types: [java.lang.Object, wer] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.agek
    public final Object apply(Object obj) {
        Object musicOfflineAlbumAppSearchDocument;
        int i = 2;
        int i2 = 14;
        int i3 = 0;
        switch (this.$cid) {
            case 0:
                return ((gqh) this.a).e((woo) this.b, (wfy) ((acjy) obj), gnl.a);
            case 1:
                ((MediaMetadataRetriever) obj).setDataSource((Context) this.a, (Uri) this.b);
                return null;
            case 2:
                return ((gqh) this.a).e((woo) this.b, (wfy) ((acjy) obj), gnl.a);
            case 3:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                Object obj2 = this.a;
                if (zBooleanValue) {
                    return ((gqs) obj2).d((String) this.b);
                }
                gqs gqsVar = (gqs) obj2;
                cf cfVar = gqsVar.e;
                jin jinVar = gqsVar.g;
                Context applicationContext = cfVar.getApplicationContext();
                jio jioVarE = jin.e();
                ((jik) jioVarE).k(applicationContext.getText(R.string.empty_offline_song_list_title));
                jinVar.d(jioVarE.b());
                return Optional.empty();
            case 4:
                amzv amzvVar = (amzv) obj;
                ((kwq) this.b).t((hev) this.a, amzvVar);
                return amzvVar;
            case 5:
                aihh aihhVar = (aihh) ((aihn) this.a).toBuilder();
                Object obj3 = this.b;
                aihl aihlVar = aohu.a;
                aihf builder = ((aihn) obj3).toBuilder();
                float fLongValue = ((Long) obj).longValue();
                builder.copyOnWrite();
                aoht aohtVar = (aoht) builder.instance;
                aohtVar.b |= 16;
                aohtVar.f = fLongValue;
                aihhVar.e(aihlVar, (aoht) builder.build());
                return (ajwo) aihhVar.build();
            case 6:
                Map map = (Map) obj;
                ((agrc) ((agrc) hia.b.c()).k("com/google/android/apps/youtube/music/mediabrowser/content/LocalContentFetcher", "prepareSideloadedTreeAsync", 620, "LocalContentFetcher.java")).t("Finish fetching sideloaded media items.");
                Object obj4 = this.a;
                Object obj5 = ((hia) obj4).s;
                Object obj6 = this.b;
                synchronized (obj5) {
                    if (map != null) {
                        if (!map.isEmpty()) {
                            ((isr) ((hia) obj4).f.io()).d((String) obj6);
                            if (map.containsKey(gzl.d)) {
                                ((hir) ((hia) obj4).d.io()).a(gzl.g).m(hia.e(map));
                            }
                            return Boolean.TRUE;
                        }
                    }
                    return Boolean.FALSE;
                }
            case 7:
                List list = (List) Collection.EL.stream((List) obj).filter(new gqk(i2)).map(new hnf(12)).collect(Collectors.toList());
                anjx anjxVar = (anjx) this.b;
                String strA = aaka.a(anjxVar.getAudioPlaylistId());
                String strY = ((hnm) this.a).c.y();
                String title = anjxVar.getTitle();
                agke agkeVarQ = agke.q(anjxVar.getArtistDisplayName());
                agke agkeVar = true == agkeVarQ.isEmpty() ? null : agkeVarQ;
                List list2 = (List) Collection.EL.stream(list).map(new hnf(13)).collect(Collectors.toList());
                musicOfflineAlbumAppSearchDocument = new MusicOfflineAlbumAppSearchDocument(strA, strY, title, true == list2.isEmpty() ? null : list2, agkeVar);
                break;
            case 8:
                int i4 = 15;
                List list3 = (List) Collection.EL.stream((List) obj).filter(new gqk(i4)).map(new hnf(i2)).collect(Collectors.toList());
                anuk anukVar = (anuk) this.b;
                String strA2 = aaka.a(anukVar.getPlaylistId());
                String strY2 = ((hnm) this.a).c.y();
                String title2 = anukVar.getTitle();
                String ownerDisplayName = anukVar.getOwnerDisplayName();
                List list4 = (List) Collection.EL.stream(list3).map(new hnf(i4)).collect(Collectors.toList());
                musicOfflineAlbumAppSearchDocument = new MusicOfflinePlaylistAppSearchDocument(strA2, strY2, title2, ownerDisplayName, true == list4.isEmpty() ? null : list4);
                break;
            case 9:
                return hcg.h(((hpk) this.a).f.b(), "PPSE", (agke) this.b, hpb.e((List) obj));
            case 10:
                Optional optional = (Optional) obj;
                return optional.isPresent() ? Optional.of(((tzk) optional.get()).I(((hps) this.a).a.e(this.b))) : Optional.empty();
            case 11:
                return (ArrayList) Collection.EL.stream((agke) obj).map(new hph(this.a, this.b, i)).collect(Collectors.toCollection(new hcd(11)));
            case 12:
                Object obj7 = this.a;
                Object obj8 = this.b;
                Optional optionalOfNullable = (Optional) obj;
                hqb hqbVar = new hqb(obj7, obj8, i3);
                if (true == optionalOfNullable.isPresent()) {
                    Object obj9 = optionalOfNullable.get();
                    Object obj10 = hqbVar.a;
                    ?? r1 = hqbVar.b;
                    ((hqg) obj10).f(r1, (weh) obj9);
                    optionalOfNullable = Optional.ofNullable(r1);
                }
                return (wer) optionalOfNullable.orElse(obj8);
            case 13:
                Optional optional2 = (Optional) obj;
                if (optional2.isEmpty()) {
                    return null;
                }
                ?? r0 = this.b;
                Object obj11 = this.a;
                if (optional2.get() instanceof anjq) {
                    anjo anjoVarE = ((anjq) optional2.get()).d();
                    aihf aihfVar = anjoVarE.a;
                    akmx akmxVar = akmx.DOWNLOAD_SYNC_STATE_OUT_OF_DATE;
                    aihfVar.copyOnWrite();
                    anjr anjrVar = (anjr) aihfVar.instance;
                    anjr anjrVar2 = anjr.a;
                    anjrVar.g = akmxVar.d;
                    anjrVar.b |= 8;
                    hsd hsdVar = (hsd) obj11;
                    hsdVar.e.e(r0);
                    hsdVar.h(r0, anjoVarE.am());
                    return null;
                }
                if (!(optional2.get() instanceof anuc)) {
                    return null;
                }
                anua anuaVarE = ((anuc) optional2.get()).d();
                aihf aihfVar2 = anuaVarE.a;
                akmx akmxVar2 = akmx.DOWNLOAD_SYNC_STATE_OUT_OF_DATE;
                aihfVar2.copyOnWrite();
                anud anudVar = (anud) aihfVar2.instance;
                anud anudVar2 = anud.a;
                anudVar.g = akmxVar2.d;
                anudVar.b |= 16;
                hsd hsdVar2 = (hsd) obj11;
                hsdVar2.e.e(r0);
                hsdVar2.h(r0, anuaVarE.am());
                return null;
            case 14:
                aluf alufVar = (aluf) obj;
                if (alufVar.c.isEmpty()) {
                    ((hsj) this.a).e.e(new aahx((String) this.b, 1));
                }
                return Optional.of(aamo.b((aohb) alufVar.c.get(0)));
            case 15:
                int i5 = hvo.e;
                ((hfn) this.a).z((String) this.b);
                return null;
            case 16:
                Stream stream = Collection.EL.stream((List) obj);
                String strW = ((abnl) this.b).w();
                Object obj12 = this.a;
                return (agke) stream.filter(new iab(obj12, strW, i3)).map(new hqs(((iad) obj12).c, i2)).collect(aghu.a);
            case 17:
                hth hthVar = (hth) obj;
                boolean zIsEmpty = hthVar.b().isEmpty();
                Object obj13 = this.a;
                if (zIsEmpty) {
                    ((iaw) obj13).g();
                    return Boolean.TRUE;
                }
                iaw iawVar = (iaw) obj13;
                hpd hpdVar = iawVar.a;
                if (hpdVar.q(hthVar)) {
                    iawVar.f(hthVar, (String) this.b);
                    return Boolean.TRUE;
                }
                if (hpdVar.c(hthVar) == aamp.PLAYABLE) {
                    return Boolean.FALSE;
                }
                iawVar.h(false);
                return Boolean.TRUE;
            case 18:
                aihf builder2 = ((aimh) obj).toBuilder();
                String strB = ((ibg) this.a).b();
                Object obj14 = this.b;
                obj14.getClass();
                builder2.copyOnWrite();
                aimh aimhVar = (aimh) builder2.instance;
                aiip aiipVar = aimhVar.b;
                if (!aiipVar.b) {
                    aimhVar.b = aiipVar.a();
                }
                aimhVar.b.put(strB, obj14);
                return (aimh) builder2.build();
            case 19:
                aihf builder3 = ((aimf) obj).toBuilder();
                String strO = ((kjc) ((hwz) this.a).a).o();
                Object obj15 = this.b;
                obj15.getClass();
                builder3.copyOnWrite();
                aimf aimfVar = (aimf) builder3.instance;
                aiip aiipVar2 = aimfVar.b;
                if (!aiipVar2.b) {
                    aimfVar.b = aiipVar2.a();
                }
                aimfVar.b.put(strO, obj15);
                return (aimf) builder3.build();
            default:
                aihf builder4 = ((aimj) obj).toBuilder();
                String strO2 = ((idx) this.a).e.o();
                aihf aihfVarCreateBuilder = aiml.a.createBuilder();
                ?? r12 = this.b;
                int size = r12.size();
                while (i3 < size) {
                    abke abkeVar = (abke) r12.get(i3);
                    aihf aihfVarCreateBuilder2 = aimk.a.createBuilder();
                    if (abkeVar instanceof hzf) {
                        aoun aounVar = ((hzf) abkeVar).a;
                        aihfVarCreateBuilder2.copyOnWrite();
                        aimk aimkVar = (aimk) aihfVarCreateBuilder2.instance;
                        aounVar.getClass();
                        aimkVar.c = aounVar;
                        aimkVar.b = 1;
                    } else if (abkeVar instanceof hzg) {
                        aouu aouuVar = ((hzg) abkeVar).a;
                        aihfVarCreateBuilder2.copyOnWrite();
                        aimk aimkVar2 = (aimk) aihfVarCreateBuilder2.instance;
                        aouuVar.getClass();
                        aimkVar2.c = aouuVar;
                        aimkVar2.b = 2;
                    }
                    aihfVarCreateBuilder.copyOnWrite();
                    aiml aimlVar = (aiml) aihfVarCreateBuilder.instance;
                    aimk aimkVar3 = (aimk) aihfVarCreateBuilder2.build();
                    aimkVar3.getClass();
                    aiie aiieVar = aimlVar.b;
                    if (!aiieVar.c()) {
                        aimlVar.b = aihn.mutableCopy(aiieVar);
                    }
                    aimlVar.b.add(aimkVar3);
                    i3++;
                }
                builder4.ay(strO2, (aiml) aihfVarCreateBuilder.build());
                return (aimj) builder4.build();
        }
        return musicOfflineAlbumAppSearchDocument;
    }

    public /* synthetic */ gqa(kwq kwqVar, hev hevVar, int i) {
        this.$cid = i;
        this.b = kwqVar;
        this.a = hevVar;
    }
}
