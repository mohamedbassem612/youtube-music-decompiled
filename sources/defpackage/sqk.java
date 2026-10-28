package defpackage;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Size;
import com.google.android.libraries.youtube.creation.editor.ShortsPlayerView;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import j$.lang.Iterable$EL;
import j$.time.Duration;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.stream.Collector;
import j$.util.stream.Stream;
import java.io.File;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class sqk implements avni {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ sqk(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r7v34, types: [awqg, java.lang.Object] */
    @Override // defpackage.avni
    public final void a(Object obj) {
        ofg ofgVarK;
        weh wehVar;
        stb stbVar;
        switch (this.$cid) {
            case 0:
                ((sql) this.a).l.loadUrl((String) obj);
                break;
            case 1:
                aaxo aaxoVar = (aaxo) obj;
                sqb sqbVar = (sqb) this.a;
                abnr abnrVar = sqbVar.d.a;
                abnr abnrVar2 = aaxoVar.a;
                abnr abnrVar3 = abnr.FULLSCREEN;
                sqbVar.d = aaxoVar;
                aaxo aaxoVar2 = sqbVar.d;
                sga sgaVar = sqbVar.c;
                sgaVar.b = aaxoVar2;
                if (sqbVar.e) {
                    boolean z = abnrVar2 == abnrVar3;
                    if (!(abnrVar == abnrVar3)) {
                        if (z) {
                            zdj zdjVar = sqbVar.f;
                            ofgVarK = zdjVar != null ? zdjVar.l() : null;
                            smc smcVar = sqbVar.b;
                            if (smcVar.p() != null) {
                                sqbVar.A(smcVar.p().l, ofgVarK, sgaVar);
                            }
                            sqbVar.B(smcVar.W(), ofgVarK);
                        }
                    } else if (!z) {
                        zdj zdjVar2 = sqbVar.f;
                        ofgVarK = zdjVar2 != null ? zdjVar2.k() : null;
                        smc smcVar2 = sqbVar.b;
                        if (smcVar2.p() != null) {
                            sqbVar.A(smcVar2.p().q, ofgVarK, sgaVar);
                        }
                        sqbVar.B(smcVar2.T(), ofgVarK);
                    }
                }
                break;
            case 2:
                ((syn) this.a).g(Long.valueOf(((aazk) obj).a));
                break;
            case 3:
                weo weoVar = (weo) obj;
                if (weoVar != null && (wehVar = weoVar.c) != null) {
                    Object obj2 = this.a;
                    List customEmojis = ((ajxv) wehVar).getCustomEmojis();
                    srd srdVar = (srd) obj2;
                    aeiv aeivVar = srdVar.j;
                    aeivVar.j(customEmojis, false);
                    if (aeivVar.k() && (stbVar = srdVar.g) != null) {
                        stbVar.g();
                        srdVar.g.i();
                        break;
                    }
                }
                break;
            case 4:
                ajxv ajxvVar = (ajxv) obj;
                List customEmojis2 = ajxvVar.getCustomEmojis();
                boolean zIsEmpty = ajxvVar.getCustomEmojis().isEmpty();
                srd srdVar2 = (srd) this.a;
                srdVar2.j.j(customEmojis2, zIsEmpty);
                stb stbVar2 = srdVar2.g;
                if (stbVar2 != null) {
                    stbVar2.g();
                    srdVar2.g.j();
                }
                break;
            case 5:
                ((srd) this.a).j.j(null, true);
                ((agrc) ((agrc) ((agrc) srd.a.b()).j((Throwable) obj)).k("com/google/android/libraries/youtube/comment/controller/CommentDialogController", "maybeShowCommentDialog", (char) 1050, "CommentDialogController.java")).t("Cound not fetch emojis for comments in the entity store.");
                break;
            case 6:
                adxv adxvVar = ((srp) this.a).e;
                alnj alnjVar = (alnj) obj;
                if (adxvVar != null && (alnjVar.b & 2) != 0) {
                    apok apokVar = alnjVar.f;
                    if (apokVar == null) {
                        apokVar = apok.a;
                    }
                    adxvVar.a(apokVar, new srm(0));
                    break;
                }
                break;
            case 7:
                ssz sszVar = (ssz) this.a;
                sszVar.p(sszVar.N.R().booleanValue());
                break;
            case 8:
                ((ssz) this.a).H = Long.valueOf(((aazk) obj).a);
                break;
            case 9:
                abnl abnlVarN = ((aazq) obj).b.n();
                if (abnlVarN != null) {
                    ssz sszVar2 = (ssz) this.a;
                    if (!TextUtils.equals(abnlVarN.w(), sszVar2.G)) {
                        sszVar2.dismiss();
                    }
                }
                break;
            case 10:
                aaxo aaxoVar3 = (aaxo) obj;
                abnr abnrVar4 = aaxoVar3.a;
                Object obj3 = this.a;
                if (abnrVar4 == abnr.FULLSCREEN || abnrVar4 == abnr.MINIMIZED) {
                    ((ssz) obj3).B.hide();
                } else if (abnrVar4 == abnr.DEFAULT) {
                    ((ssz) obj3).B.show();
                }
                ((ssz) obj3).F = aaxoVar3.d;
                break;
            case 11:
                ((agrc) ((agrc) ((agrc) stl.a.b()).j((Throwable) obj)).k("com/google/android/libraries/youtube/comment/util/CommentEntityUtil", "resetComposerButtons", 25, "CommentEntityUtil.java")).w("Error parsing bytes for CommentEntityUtil resetComposerButtons with entityKey: %s", this.a);
                break;
            case 12:
                ((agrc) ((agrc) ((agrc) stl.a.b()).j((Throwable) obj)).k("com/google/android/libraries/youtube/comment/util/CommentEntityUtil", "getDismissCommand", 52, "CommentEntityUtil.java")).w("Error parsing bytes for CommentEntityUtil getDismissCommand with entityKey: %s", this.a);
                break;
            case 13:
                ((agrc) ((agrc) ((agrc) stl.a.b()).j((Throwable) obj)).k("com/google/android/libraries/youtube/comment/util/CommentEntityUtil", "clearText", 71, "CommentEntityUtil.java")).w("Error parsing bytes for CommentEntityUtil clearText with entityKey: %s", this.a);
                break;
            case 14:
                ((sxj) this.a).a((ambw) obj);
                break;
            case 15:
                this.a.invoke(obj);
                break;
            case 16:
                trh trhVar = (trh) this.a;
                trhVar.k = (Throwable) obj;
                trhVar.g();
                break;
            case 17:
                ((ukd) this.a).d(((Boolean) obj).booleanValue());
                break;
            case 18:
                final vft vftVar = (vft) obj;
                Optional.empty();
                ListenableFuture listenableFutureI = vftVar.I();
                Object obj4 = this.a;
                tvj tvjVar = new tvj(obj4, 12);
                final ulp ulpVar = (ulp) obj4;
                taf.k(ulpVar.d, listenableFutureI, tvjVar, new twi() { // from class: ulm
                    /* JADX WARN: Code duplicated, block: B:23:0x00fc  */
                    /* JADX WARN: Code duplicated, block: B:25:0x010f  */
                    /* JADX WARN: Code duplicated, block: B:29:0x0124  */
                    /* JADX WARN: Code duplicated, block: B:33:0x015a  */
                    /* JADX WARN: Code duplicated, block: B:36:0x0163  */
                    /* JADX WARN: Code duplicated, block: B:39:0x0188 A[DONT_INVERT] */
                    /* JADX WARN: Code duplicated, block: B:40:0x018a  */
                    /* JADX WARN: Code duplicated, block: B:42:0x0190  */
                    /* JADX WARN: Code duplicated, block: B:44:0x019a  */
                    /* JADX WARN: Code duplicated, block: B:47:0x0230  */
                    /* JADX WARN: Code duplicated, block: B:49:0x0234  */
                    /* JADX WARN: Code duplicated, block: B:51:0x0287  */
                    /* JADX WARN: Code duplicated, block: B:53:0x028b  */
                    /* JADX WARN: Code duplicated, block: B:55:0x0293  */
                    /* JADX WARN: Code duplicated, block: B:57:0x029b  */
                    /* JADX WARN: Code duplicated, block: B:59:? A[RETURN, SYNTHETIC] */
                    @Override // defpackage.twi
                    public final void a(Object obj5) {
                        Optional optionalEmpty;
                        int iMax;
                        Size size;
                        sla slaVar;
                        uld uldVar;
                        qun qunVar;
                        bog bogVar;
                        vfs vfsVarG;
                        uxj uxjVar;
                        Uri uri;
                        umi umiVar;
                        roq roqVar;
                        Object size2;
                        long jIntValue;
                        Size size3;
                        Optional optional = (Optional) obj5;
                        optional.getClass();
                        boolean zIsEmpty2 = optional.isEmpty();
                        ulp ulpVar2 = ulpVar;
                        if (zIsEmpty2) {
                            ((agrc) ((agrc) ulp.a.c()).k("com/google/android/libraries/youtube/creation/editor/ShortsEditViewModel", "updateProjectState", 943, "ShortsEditViewModel.java")).t("Project unexpectedly missing ComposedVideo.");
                            zvl zvlVar = ulpVar2.x;
                            zvj zvjVarA = zvk.a();
                            zvjVarA.c(ajtv.ERROR_LEVEL_ERROR);
                            zvjVarA.j = 16;
                            zvjVarA.d("[ShortsCreation][Android][Edit] Null ComposedVideo on prepare video");
                            zvlVar.a(zvjVarA.a());
                            return;
                        }
                        ugr ugrVar = (ugr) optional.get();
                        ShortsPlayerView shortsPlayerView = ulpVar2.E;
                        Size size4 = shortsPlayerView == null ? new Size(0, 0) : new Size(shortsPlayerView.getMeasuredWidth(), shortsPlayerView.getMeasuredHeight());
                        vft vftVar2 = vftVar;
                        ulpVar2.s = new Size(ugrVar.b, ugrVar.c);
                        ulj uljVar = ulpVar2.v;
                        Size size5 = ulpVar2.s;
                        if (!vft.D(vftVar2)) {
                            if (vftVar2 == null || !"TrimProjectState".equals(vftVar2.G())) {
                                optionalEmpty = Optional.empty();
                            } else {
                                iMax = Math.max(size5.getWidth(), size5.getHeight());
                            }
                            float fMin = Math.min(size4.getWidth() / size5.getWidth(), size4.getHeight() / size5.getHeight());
                            size = new Size((int) (size5.getWidth() * fMin), (int) (size5.getHeight() * fMin));
                            slaVar = new sla(size, 5);
                            if (true == optionalEmpty.isPresent()) {
                                Object obj6 = optionalEmpty.get();
                                size2 = slaVar.a;
                                jIntValue = ((Integer) obj6).intValue();
                                if (jIntValue != 0) {
                                    size3 = (Size) size2;
                                    if (size3.getWidth() <= jIntValue || size3.getHeight() > jIntValue) {
                                        float f = jIntValue;
                                        float fMin2 = Math.min(f / size3.getWidth(), f / size3.getHeight());
                                        size2 = new Size((int) (size3.getWidth() * fMin2), (int) (size3.getHeight() * fMin2));
                                    }
                                }
                                optionalEmpty = Optional.ofNullable(size2);
                            }
                            uldVar = (uld) uljVar.k();
                            uldVar.v = optionalEmpty;
                            qunVar = uldVar.q;
                            if (qunVar != null) {
                                qunVar.d(uldVar.v);
                            }
                            if (uldVar.t == null) {
                                uldVar.t = size;
                                Iterable$EL.forEach(uldVar.b, new tsd(size, 9));
                            }
                            ulpVar2.p = ugrVar.a;
                            ulpVar2.q = ugrVar.d;
                            vftVar2.F().isPresent();
                            bogVar = ulpVar2.d;
                            vfsVarG = ulpVar2.g();
                            if (vftVar2 != null) {
                                throw new NullPointerException("Null shortsProjectState");
                            }
                            if (vfsVarG != null) {
                                throw new NullPointerException("Null shortsEditorProjectState");
                            }
                            uxjVar = ulpVar2.h;
                            uri = ulpVar2.p;
                            if (uri != null) {
                                throw new NullPointerException("Null sourceVideoUri");
                            }
                            Long lValueOf = Long.valueOf(ulpVar2.q);
                            umiVar = ulpVar2.H;
                            if (umiVar == null) {
                                umiVar = new umi();
                            }
                            umi umiVar2 = umiVar;
                            use useVar = ulpVar2.t;
                            useVar.getClass();
                            final ukz ukzVar = ulpVar2.f;
                            final ula ulaVar = new ula(vftVar2, vfsVarG, uxjVar, uri, lValueOf, size4, umiVar2, useVar, ulpVar2);
                            szq szqVar = new szq(ukzVar, 20);
                            TimeUnit timeUnit = TimeUnit.SECONDS;
                            ahey aheyVar = ukzVar.b;
                            ahew ahewVarSchedule = aheyVar.schedule(szqVar, 5L, timeUnit);
                            agjz agjzVar = new agjz(4);
                            vft vftVar3 = ulaVar.a;
                            vftVar3.J();
                            afxd afxdVarH = afxd.f(vftVar3.d()).h(new ahcy() { // from class: uku
                                /* JADX WARN: Code duplicated, block: B:100:0x01ca  */
                                /* JADX WARN: Code duplicated, block: B:102:0x01ce  */
                                /* JADX WARN: Code duplicated, block: B:105:0x01dd A[DONT_INVERT] */
                                /* JADX WARN: Code duplicated, block: B:106:0x01df  */
                                /* JADX WARN: Code duplicated, block: B:108:0x01e3  */
                                /* JADX WARN: Code duplicated, block: B:111:0x01f1  */
                                /* JADX WARN: Code duplicated, block: B:112:0x01f3  */
                                /* JADX WARN: Code duplicated, block: B:115:0x01fa  */
                                /* JADX WARN: Code duplicated, block: B:116:0x01fd  */
                                /* JADX WARN: Code duplicated, block: B:118:0x0201  */
                                /* JADX WARN: Code duplicated, block: B:119:0x0209  */
                                /* JADX WARN: Code duplicated, block: B:122:0x0214  */
                                /* JADX WARN: Code duplicated, block: B:123:0x0217  */
                                /* JADX WARN: Code duplicated, block: B:126:0x0229  */
                                /* JADX WARN: Code duplicated, block: B:127:0x023c  */
                                /* JADX WARN: Code duplicated, block: B:131:0x0249  */
                                /* JADX WARN: Code duplicated, block: B:132:0x024e  */
                                /* JADX WARN: Code duplicated, block: B:135:0x0256  */
                                /* JADX WARN: Code duplicated, block: B:136:0x0271 A[PHI: r18 r20
                                  0x0271: PHI (r18v2 auhs) = (r18v1 auhs), (r18v1 auhs), (r18v7 auhs) binds: [B:67:0x014b, B:134:0x0254, B:64:0x0131] A[DONT_GENERATE, DONT_INLINE]
                                  0x0271: PHI (r20v2 auhs) = (r20v1 auhs), (r20v1 auhs), (r20v4 auhs) binds: [B:67:0x014b, B:134:0x0254, B:64:0x0131] A[DONT_GENERATE, DONT_INLINE]] */
                                /* JADX WARN: Code duplicated, block: B:97:0x01c3  */
                                /* JADX WARN: Code duplicated, block: B:99:0x01c7  */
                                /* JADX WARN: Type inference failed for: r11v2, types: [java.lang.Object, java.util.concurrent.Executor] */
                                /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, java.util.concurrent.Executor] */
                                @Override // defpackage.ahcy
                                public final ListenableFuture a(Object obj7) {
                                    ListenableFuture listenableFutureG;
                                    auhs auhsVar;
                                    auhs auhsVar2;
                                    boolean z2;
                                    augu auguVar;
                                    boolean z3;
                                    augu auguVarF;
                                    aimw aimwVar;
                                    int iB;
                                    umg umgVarA;
                                    augu auguVar2;
                                    augy augyVarH;
                                    boolean z4;
                                    augu auguVar3;
                                    boolean z5;
                                    int i;
                                    int i2;
                                    aimw aimwVarC;
                                    int i3;
                                    aimw aimwVarC2;
                                    aihf builder;
                                    aimw aimwVar2;
                                    agkj agkjVar;
                                    int i4;
                                    boolean z6;
                                    agkj agkjVar2;
                                    boolean z7;
                                    auhs auhsVar3 = (auhs) obj7;
                                    ukz ukzVar2 = ukzVar;
                                    final ula ulaVar2 = ulaVar;
                                    vfs vfsVar = ulaVar2.b;
                                    auhs auhsVar4 = vfsVar.e;
                                    if (auhsVar4 == null) {
                                        return ahng.n(new ukw(uvn.e(auhsVar3, ukzVar2.f.getApplicationContext()), false));
                                    }
                                    cf cfVar = ukzVar2.f;
                                    aaok aaokVar = ukzVar2.m;
                                    boolean zD = aaokVar.D();
                                    agkj agkjVar3 = umh.a;
                                    cfVar.getClass();
                                    xpl xplVar = new xpl(cfVar);
                                    auhq auhqVar = (auhq) auhsVar4.toBuilder();
                                    auhqVar.getClass();
                                    int size6 = auhsVar4.d.size();
                                    int i5 = 0;
                                    boolean z8 = false;
                                    while (i5 < size6) {
                                        augy augyVar = (augy) auhsVar4.d.get(i5);
                                        augyVar.getClass();
                                        int i6 = augyVar.c;
                                        if (i6 == 110) {
                                            auhb auhbVarV = (auhb) augyVar.d;
                                            auhbVarV.getClass();
                                            if ((auhbVarV.b & 16) != 0) {
                                                String str = auhbVarV.g;
                                                str.getClass();
                                                if (zD) {
                                                    agkjVar2 = umh.c;
                                                    z7 = true;
                                                } else {
                                                    agkjVar2 = umh.d;
                                                    z7 = false;
                                                }
                                                i4 = -16777216;
                                                String str2 = (String) agkjVar2.get(str);
                                                if (str2 != null) {
                                                    str = str2;
                                                }
                                                if (!awrc.c(str, auhbVarV.g)) {
                                                    aihf builder2 = auhbVarV.toBuilder();
                                                    builder2.getClass();
                                                    atqn.x(str, builder2);
                                                    auhbVarV = atqn.v(builder2);
                                                }
                                                z6 = z7;
                                            } else {
                                                i4 = -16777216;
                                                z6 = zD;
                                            }
                                            int i7 = auhbVarV.e;
                                            boolean z9 = i7 != 0;
                                            auhsVar = auhsVar4;
                                            int i8 = auhbVarV.f;
                                            boolean z10 = i8 != 0;
                                            if (!z9) {
                                                i7 = z10 ? i8 : auhbVarV.d;
                                            }
                                            umg umgVarA2 = umh.a(i7, xplVar, z6);
                                            if (umgVarA2 != null) {
                                                boolean z11 = z9 && (auhbVarV.e & i4) != i4;
                                                aihf builder3 = auhbVarV.toBuilder();
                                                builder3.getClass();
                                                if (z9) {
                                                    auhsVar2 = auhsVar3;
                                                    int i9 = z11 ? umgVarA2.c : umgVarA2.a;
                                                    int i10 = auhbVarV.e & (-16777216);
                                                    builder3.copyOnWrite();
                                                    int i11 = i9;
                                                    auhb auhbVar = (auhb) builder3.instance;
                                                    boolean z12 = z11;
                                                    auhbVar.b |= 4;
                                                    auhbVar.e = (i11 & 16777215) | i10;
                                                    atqn.w(z12 ? umgVarA2.d : umgVarA2.b, builder3);
                                                } else {
                                                    auhsVar2 = auhsVar3;
                                                    if (z10) {
                                                        atqn.w(umgVarA2.b, builder3);
                                                        int i12 = umgVarA2.a;
                                                        builder3.copyOnWrite();
                                                        auhb auhbVar2 = (auhb) builder3.instance;
                                                        auhbVar2.b |= 8;
                                                        auhbVar2.f = i12;
                                                    } else {
                                                        atqn.w(umgVarA2.a, builder3);
                                                    }
                                                }
                                                auhbVarV = atqn.v(builder3);
                                            } else {
                                                auhsVar2 = auhsVar3;
                                            }
                                            if (awrc.c(auhbVarV, augyVar.c == 110 ? (auhb) augyVar.d : auhb.a)) {
                                                augyVarH = augyVar;
                                            } else {
                                                jrr jrrVar = (jrr) augyVar.toBuilder();
                                                jrrVar.getClass();
                                                atxy.k(auhbVarV, jrrVar);
                                                augyVarH = atxy.h(jrrVar);
                                            }
                                        } else {
                                            auhsVar = auhsVar4;
                                            auhsVar2 = auhsVar3;
                                            if (i6 == 101) {
                                                augu auguVarF2 = (augu) augyVar.d;
                                                auguVarF2.getClass();
                                                if ((auguVarF2.b & 32) != 0) {
                                                    auir auirVarA = auir.a(auguVarF2.h);
                                                    if (auirVarA == null) {
                                                        auirVarA = auir.UNRECOGNIZED;
                                                    }
                                                    if (zD) {
                                                        agkjVar = umh.a;
                                                        z2 = true;
                                                    } else {
                                                        agkjVar = umh.b;
                                                        z2 = false;
                                                    }
                                                    auir auirVar = (auir) agkjVar.get(auirVarA);
                                                    if (auirVar != null) {
                                                        auirVarA = auirVar;
                                                    }
                                                    auir auirVarA2 = auir.a(auguVarF2.h);
                                                    if (auirVarA2 == null) {
                                                        auirVarA2 = auir.UNRECOGNIZED;
                                                    }
                                                    if (auirVarA != auirVarA2) {
                                                        aihf builder4 = auguVarF2.toBuilder();
                                                        builder4.getClass();
                                                        builder4.copyOnWrite();
                                                        augu auguVar4 = (augu) builder4.instance;
                                                        auguVar4.h = auirVarA.getNumber();
                                                        auguVar4.b |= 32;
                                                        auguVarF2 = atqo.f(builder4);
                                                    }
                                                } else {
                                                    z2 = zD;
                                                }
                                                if ((auguVarF2.b & 8) != 0) {
                                                    aimw aimwVar3 = auguVarF2.f;
                                                    if (aimwVar3 == null) {
                                                        aimwVar3 = aimw.a;
                                                    }
                                                    auguVar = auguVarF2;
                                                    z3 = aimwVar3.f != 0.0d;
                                                    auguVarF = auguVar;
                                                    if (z3) {
                                                        aimwVar = auguVarF.f;
                                                        if (aimwVar == null) {
                                                            aimwVar = aimw.a;
                                                        }
                                                    } else {
                                                        aimwVar = auguVarF.e;
                                                        if (aimwVar == null) {
                                                            aimwVar = aimw.a;
                                                        }
                                                    }
                                                    aimwVar.getClass();
                                                    iB = ujq.b(aimwVar);
                                                    umgVarA = umh.a(iB, xplVar, z2);
                                                    if (umgVarA != null) {
                                                        if (z3) {
                                                            aimwVar2 = auguVarF.f;
                                                            if (aimwVar2 == null) {
                                                                aimwVar2 = aimw.a;
                                                            }
                                                            z4 = z3;
                                                            auguVar3 = auguVarF;
                                                            z5 = aimwVar2.f < 1.0d;
                                                            if (z5) {
                                                                i = umgVarA.c;
                                                            } else {
                                                                i = umgVarA.a;
                                                            }
                                                            if (z4) {
                                                                i2 = (i & 16777215) | (iB & (-16777216));
                                                            } else {
                                                                i2 = umgVarA.a;
                                                            }
                                                            aimwVarC = ujq.c(i2);
                                                            aimwVarC.getClass();
                                                            if (z5) {
                                                                i3 = umgVarA.d;
                                                            } else {
                                                                i3 = umgVarA.b;
                                                            }
                                                            aimwVarC2 = ujq.c(i3);
                                                            aimwVarC2.getClass();
                                                            builder = auguVar3.toBuilder();
                                                            builder.getClass();
                                                            if (z4) {
                                                                builder.copyOnWrite();
                                                                augu auguVar5 = (augu) builder.instance;
                                                                auguVar5.f = aimwVarC;
                                                                auguVar5.b |= 8;
                                                                atqo.g(aimwVarC2, builder);
                                                            } else {
                                                                atqo.g(aimwVarC, builder);
                                                            }
                                                            auguVarF = atqo.f(builder);
                                                        } else {
                                                            z4 = z3;
                                                            auguVar3 = auguVarF;
                                                        }
                                                        if (z5) {
                                                            i = umgVarA.c;
                                                        } else {
                                                            i = umgVarA.a;
                                                        }
                                                        if (z4) {
                                                            i2 = (i & 16777215) | (iB & (-16777216));
                                                        } else {
                                                            i2 = umgVarA.a;
                                                        }
                                                        aimwVarC = ujq.c(i2);
                                                        aimwVarC.getClass();
                                                        if (z5) {
                                                            i3 = umgVarA.d;
                                                        } else {
                                                            i3 = umgVarA.b;
                                                        }
                                                        aimwVarC2 = ujq.c(i3);
                                                        aimwVarC2.getClass();
                                                        builder = auguVar3.toBuilder();
                                                        builder.getClass();
                                                        if (z4) {
                                                            builder.copyOnWrite();
                                                            augu auguVar6 = (augu) builder.instance;
                                                            auguVar6.f = aimwVarC;
                                                            auguVar6.b |= 8;
                                                            atqo.g(aimwVarC2, builder);
                                                        } else {
                                                            atqo.g(aimwVarC, builder);
                                                        }
                                                        auguVarF = atqo.f(builder);
                                                    }
                                                    if (augyVar.c == 101) {
                                                        auguVar2 = (augu) augyVar.d;
                                                    } else {
                                                        auguVar2 = augu.a;
                                                    }
                                                    if (awrc.c(auguVarF, auguVar2)) {
                                                        augyVarH = augyVar;
                                                    } else {
                                                        jrr jrrVar2 = (jrr) augyVar.toBuilder();
                                                        jrrVar2.getClass();
                                                        jrrVar2.copyOnWrite();
                                                        augy augyVar2 = (augy) jrrVar2.instance;
                                                        augyVar2.d = auguVarF;
                                                        augyVar2.c = 101;
                                                        augyVarH = atxy.h(jrrVar2);
                                                    }
                                                } else {
                                                    auguVar = auguVarF2;
                                                }
                                                auguVarF = auguVar;
                                                if (z3) {
                                                    aimwVar = auguVarF.f;
                                                    if (aimwVar == null) {
                                                        aimwVar = aimw.a;
                                                    }
                                                } else {
                                                    aimwVar = auguVarF.e;
                                                    if (aimwVar == null) {
                                                        aimwVar = aimw.a;
                                                    }
                                                }
                                                aimwVar.getClass();
                                                iB = ujq.b(aimwVar);
                                                umgVarA = umh.a(iB, xplVar, z2);
                                                if (umgVarA != null) {
                                                    if (z3) {
                                                        aimwVar2 = auguVarF.f;
                                                        if (aimwVar2 == null) {
                                                            aimwVar2 = aimw.a;
                                                        }
                                                        z4 = z3;
                                                        auguVar3 = auguVarF;
                                                        if (aimwVar2.f < 1.0d) {
                                                        }
                                                        if (z5) {
                                                            i = umgVarA.c;
                                                        } else {
                                                            i = umgVarA.a;
                                                        }
                                                        if (z4) {
                                                            i2 = (i & 16777215) | (iB & (-16777216));
                                                        } else {
                                                            i2 = umgVarA.a;
                                                        }
                                                        aimwVarC = ujq.c(i2);
                                                        aimwVarC.getClass();
                                                        if (z5) {
                                                            i3 = umgVarA.d;
                                                        } else {
                                                            i3 = umgVarA.b;
                                                        }
                                                        aimwVarC2 = ujq.c(i3);
                                                        aimwVarC2.getClass();
                                                        builder = auguVar3.toBuilder();
                                                        builder.getClass();
                                                        if (z4) {
                                                            builder.copyOnWrite();
                                                            augu auguVar7 = (augu) builder.instance;
                                                            auguVar7.f = aimwVarC;
                                                            auguVar7.b |= 8;
                                                            atqo.g(aimwVarC2, builder);
                                                        } else {
                                                            atqo.g(aimwVarC, builder);
                                                        }
                                                        auguVarF = atqo.f(builder);
                                                    } else {
                                                        z4 = z3;
                                                        auguVar3 = auguVarF;
                                                    }
                                                    if (z5) {
                                                        i = umgVarA.c;
                                                    } else {
                                                        i = umgVarA.a;
                                                    }
                                                    if (z4) {
                                                        i2 = (i & 16777215) | (iB & (-16777216));
                                                    } else {
                                                        i2 = umgVarA.a;
                                                    }
                                                    aimwVarC = ujq.c(i2);
                                                    aimwVarC.getClass();
                                                    if (z5) {
                                                        i3 = umgVarA.d;
                                                    } else {
                                                        i3 = umgVarA.b;
                                                    }
                                                    aimwVarC2 = ujq.c(i3);
                                                    aimwVarC2.getClass();
                                                    builder = auguVar3.toBuilder();
                                                    builder.getClass();
                                                    if (z4) {
                                                        builder.copyOnWrite();
                                                        augu auguVar8 = (augu) builder.instance;
                                                        auguVar8.f = aimwVarC;
                                                        auguVar8.b |= 8;
                                                        atqo.g(aimwVarC2, builder);
                                                    } else {
                                                        atqo.g(aimwVarC, builder);
                                                    }
                                                    auguVarF = atqo.f(builder);
                                                }
                                                if (augyVar.c == 101) {
                                                    auguVar2 = (augu) augyVar.d;
                                                } else {
                                                    auguVar2 = augu.a;
                                                }
                                                if (awrc.c(auguVarF, auguVar2)) {
                                                    jrr jrrVar3 = (jrr) augyVar.toBuilder();
                                                    jrrVar3.getClass();
                                                    jrrVar3.copyOnWrite();
                                                    augy augyVar3 = (augy) jrrVar3.instance;
                                                    augyVar3.d = auguVarF;
                                                    augyVar3.c = 101;
                                                    augyVarH = atxy.h(jrrVar3);
                                                } else {
                                                    augyVarH = augyVar;
                                                }
                                            } else {
                                                augyVarH = augyVar;
                                            }
                                        }
                                        if (!awrc.c(augyVarH, augyVar)) {
                                            atqn.B(auhqVar);
                                            auhqVar.copyOnWrite();
                                            auhs auhsVar5 = (auhs) auhqVar.instance;
                                            auhsVar5.d();
                                            auhsVar5.d.set(i5, augyVarH);
                                            z8 = true;
                                        }
                                        i5++;
                                        auhsVar3 = auhsVar2;
                                        auhsVar4 = auhsVar;
                                    }
                                    auhs auhsVar6 = auhsVar4;
                                    final auhs auhsVar7 = auhsVar3;
                                    auhs auhsVarZ = atqn.z(auhqVar);
                                    if (true != z8) {
                                        auhsVarZ = auhsVar6;
                                    }
                                    ukw ukwVar = new ukw(auhsVarZ, z8);
                                    final auhs auhsVar8 = ukwVar.a;
                                    boolean z13 = ukwVar.b;
                                    if (z13) {
                                        vfsVar.b(auhsVar8);
                                    }
                                    if (aaokVar.K()) {
                                        final xsc xscVar = ukzVar2.n;
                                        auhsVar7.getClass();
                                        final agkz agkzVarC = uvn.c(auhsVar8);
                                        agkzVarC.getClass();
                                        final agke agkeVar = vfsVar.f;
                                        agkeVar.getClass();
                                        final agke agkeVar2 = vfsVar.g;
                                        agkeVar2.getClass();
                                        LinkedHashSet linkedHashSet = new LinkedHashSet();
                                        Iterator it = agkeVar.iterator();
                                        while (it.hasNext()) {
                                            auhs auhsVar9 = ((auew) it.next()).c;
                                            if (auhsVar9 == null) {
                                                auhsVar9 = auhs.a;
                                            }
                                            agkz agkzVarC2 = uvn.c(auhsVar9);
                                            agkzVarC2.getClass();
                                            linkedHashSet.addAll(agkzVarC2);
                                        }
                                        Iterator it2 = agkeVar2.iterator();
                                        while (it2.hasNext()) {
                                            auhs auhsVar10 = ((auew) it2.next()).c;
                                            if (auhsVar10 == null) {
                                                auhsVar10 = auhs.a;
                                            }
                                            agkz agkzVarC3 = uvn.c(auhsVar10);
                                            agkzVarC3.getClass();
                                            linkedHashSet.addAll(agkzVarC3);
                                        }
                                        final Set setAw = atqq.aw(linkedHashSet);
                                        Set setR = atqq.r(agkzVarC, setAw);
                                        if (setR.isEmpty()) {
                                            listenableFutureG = ahng.n(auhsVar8);
                                        } else {
                                            listenableFutureG = afxd.f(uvn.d((Context) xscVar.a, setR, ulaVar2.a.j(), xscVar.b)).g(new rwj(new awqg() { // from class: uki
                                                /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, zvl] */
                                                @Override // defpackage.awqg
                                                public final Object invoke(Object obj8) {
                                                    boolean z14;
                                                    agkz agkzVar = (agkz) obj8;
                                                    agkzVar.getClass();
                                                    boolean zIsEmpty3 = agkzVar.isEmpty();
                                                    auhs auhsVarU = auhsVar8;
                                                    if (!zIsEmpty3) {
                                                        agkz agkzVar2 = agkzVarC;
                                                        boolean z15 = true;
                                                        if (!agkzVar2.isEmpty()) {
                                                            Iterator<E> it3 = agkzVar2.iterator();
                                                            while (true) {
                                                                if (!it3.hasNext()) {
                                                                    z14 = false;
                                                                    break;
                                                                }
                                                                if (agkzVar.contains((Uri) it3.next())) {
                                                                    z14 = true;
                                                                    break;
                                                                }
                                                            }
                                                        } else {
                                                            z14 = false;
                                                            break;
                                                        }
                                                        Set set = setAw;
                                                        if (!set.isEmpty()) {
                                                            Iterator it4 = set.iterator();
                                                            do {
                                                                if (!it4.hasNext()) {
                                                                    z15 = false;
                                                                    break;
                                                                }
                                                            } while (!agkzVar.contains((Uri) it4.next()));
                                                        } else {
                                                            z15 = false;
                                                            break;
                                                        }
                                                        ula ulaVar3 = ulaVar2;
                                                        if (z14 || z15) {
                                                            ulaVar3.g.n(z14);
                                                        }
                                                        xsc xscVar2 = xscVar;
                                                        if (z14) {
                                                            auhs auhsVar11 = auhsVar7;
                                                            agke agkeVarA = uvn.a(auhsVarU, agkzVar);
                                                            agkeVarA.getClass();
                                                            auhsVarU = xscVar2.U(ulaVar3, auhsVarU, auhsVar11, agkeVarA);
                                                        }
                                                        if (z15) {
                                                            ulaVar3.b.c(auhsVarU, xscVar2.T(agkeVar, agkzVar), xscVar2.T(agkeVar2, agkzVar));
                                                            ?? r6 = xscVar2.c;
                                                            zvj zvjVarA2 = zvk.a();
                                                            zvjVarA2.c(ajtv.ERROR_LEVEL_WARNING);
                                                            zvjVarA2.j = 40;
                                                            zvjVarA2.d("DraftMediaSourceValidator: Sanitized missing media segment from composition history");
                                                            r6.a(zvjVarA2.a());
                                                        }
                                                    }
                                                    return auhsVarU;
                                                }
                                            }, 13), MoreExecutors.directExecutor());
                                        }
                                    } else {
                                        xsc xscVar2 = ukzVar2.n;
                                        auhsVar7.getClass();
                                        File fileJ = ulaVar2.a.j();
                                        agkz agkzVarC4 = uvn.c(auhsVar8);
                                        Context context = (Context) xscVar2.a;
                                        ?? r6 = xscVar2.b;
                                        listenableFutureG = afxd.f(ahno.ar(uvn.d(context, agkzVarC4, fileJ, r6), new rwj(auhsVar8, 17), r6)).g(new rwj(new ukj(auhsVar8, ulaVar2, xscVar2, auhsVar7, 0), 14), MoreExecutors.directExecutor());
                                    }
                                    return afxd.f(listenableFutureG).g(new zjq(z13, 1), MoreExecutors.directExecutor());
                                }
                            }, MoreExecutors.directExecutor()).h(new ahcy() { // from class: ukv
                                /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, vab] */
                                /* JADX WARN: Type inference failed for: r9v12, types: [java.lang.Object, qvm] */
                                @Override // defpackage.ahcy
                                public final ListenableFuture a(Object obj7) {
                                    ListenableFuture listenableFutureE;
                                    ListenableFuture listenableFutureN;
                                    agke agkeVarN;
                                    ukw ukwVar = (ukw) obj7;
                                    auhs auhsVar = ukwVar.a;
                                    boolean z2 = ukwVar.b;
                                    Duration durationL = usj.l(auhsVar);
                                    int i = 4;
                                    agjz agjzVar2 = new agjz(4);
                                    int i2 = auhsVar.b & 1;
                                    ula ulaVar2 = ulaVar;
                                    if (i2 != 0) {
                                        agjzVar2.h(new utb(ulaVar2.c, ahng.au(durationL)));
                                    }
                                    ukz ukzVar2 = ukzVar;
                                    agjzVar2.h(new uta(ulaVar2.d));
                                    agjzVar2.h(ukzVar2.e);
                                    agke agkeVarG = agjzVar2.g();
                                    int i3 = 0;
                                    agqs agqsVarListIterator = agkeVarG.listIterator(0);
                                    auhs auhsVarA = auhsVar;
                                    while (agqsVarListIterator.hasNext()) {
                                        auhsVarA = ((usx) agqsVarListIterator.next()).a(auhsVarA);
                                    }
                                    use useVar2 = ulaVar2.e;
                                    qvm qvmVar = qvm.a;
                                    usd usdVar = useVar2.c;
                                    if (usdVar != null) {
                                        listenableFutureE = ahng.n(usdVar);
                                    } else if (useVar2.d.F()) {
                                        listenableFutureE = ahno.ap(new tsn(useVar2, auhsVarA, i, null), useVar2.a);
                                    } else {
                                        Optional optionalEmpty2 = auhsVarA.g.size() == 0 ? Optional.empty() : Optional.of((aufd) auhsVarA.g.get(0));
                                        qze qzeVar = new qze(useVar2, ukzVar2.d, qvmVar, 8);
                                        if (true == optionalEmpty2.isPresent()) {
                                            Object obj8 = optionalEmpty2.get();
                                            Object obj9 = qzeVar.a;
                                            ?? r12 = qzeVar.c;
                                            ?? r9 = qzeVar.b;
                                            aufd aufdVar = (aufd) obj8;
                                            apsr apsrVar = aufdVar.g;
                                            if (apsrVar == null) {
                                                apsrVar = apsr.a;
                                            }
                                            if (apsrVar.b == 4) {
                                                apsr apsrVar2 = aufdVar.g;
                                                if (apsrVar2 == null) {
                                                    apsrVar2 = apsr.a;
                                                }
                                                apse apseVar = apsrVar2.b == 4 ? (apse) apsrVar2.c : apse.a;
                                                uzy uzyVarA = uzz.a();
                                                uzyVarA.b(apseVar.c);
                                                uzyVarA.c(apseVar.d);
                                                uzz uzzVarA = uzyVarA.a();
                                                if (((aufdVar.c == 2 ? (aufe) aufdVar.d : aufe.a).b & 1) != 0) {
                                                    int i4 = aufdVar.e;
                                                    if (i4 == 1001) {
                                                        aufc aufcVar = (i4 == 1001 ? (aufl) aufdVar.f : aufl.a).c;
                                                        if (aufcVar == null) {
                                                            aufcVar = aufc.a;
                                                        }
                                                        agkeVarN = agke.n(aufcVar.b);
                                                    } else {
                                                        agkeVarN = agpi.a;
                                                    }
                                                    listenableFutureN = ape.f(new usp((vab) r12, uzzVarA, aufdVar, agkeVarN, (qvm) r9, 0));
                                                } else {
                                                    Executor executor = ((use) obj9).b;
                                                    r12.f(uzzVarA);
                                                    listenableFutureN = ape.f(new usl(aufdVar, r12, r9, executor));
                                                }
                                            } else {
                                                listenableFutureN = ahng.n(Optional.empty());
                                            }
                                            optionalEmpty2 = Optional.ofNullable(listenableFutureN);
                                        }
                                        listenableFutureE = ahcs.e((ListenableFuture) optionalEmpty2.orElse(ahng.n(Optional.empty())), afwl.a(new tvm(useVar2, auhsVarA, 4)), useVar2.a);
                                    }
                                    return afxd.f(listenableFutureE).g(new ukt(auhsVar, z2, i3), MoreExecutors.directExecutor());
                                }
                            }, MoreExecutors.directExecutor());
                            afxd afxdVarG = afxd.f(ahno.av(afxdVarH).k(new hlm(ukzVar, (ListenableFuture) afxdVarH, ulaVar, agjzVar, 13), aheyVar)).g(new tvm(ukzVar, ulaVar, 3), ukzVar.a);
                            afxdVarG.addListener(new ull(ahewVarSchedule, 1), aheyVar);
                            taf.k(bogVar, afxdVarG, new tvj(ulpVar2, 13), new tvj(ulpVar2, 14));
                            roqVar = ulpVar2.J;
                            if (roqVar != null) {
                                if (!(vftVar2 instanceof vfr)) {
                                    throw null;
                                }
                                agke agkeVar = agpi.a;
                                Stream streamFlatMap = Collection.EL.stream(agkeVar).flatMap(new snm(12));
                                Collector collector = aghu.b;
                                agkz agkzVar = (agkz) streamFlatMap.collect(collector);
                                agkz agkzVar2 = (agkz) Collection.EL.stream(agkeVar).filter(new sde(11)).map(new snm(11)).collect(collector);
                                agpr agprVar = agpr.a;
                                agkx agkxVar = new agkx();
                                agkxVar.j(agkzVar);
                                agkxVar.j(agkzVar2);
                                agkxVar.j(agprVar);
                                ((awku) roqVar.a).kk(agkxVar.g());
                            }
                        }
                        vfr vfrVar = (vfr) vftVar2;
                        iMax = 1280;
                        if (((vxz) ulpVar2.P.b).m(82, 45401570L)) {
                            int i = vfrVar.p;
                        }
                        optionalEmpty = Optional.of(Integer.valueOf(iMax));
                        float fMin3 = Math.min(size4.getWidth() / size5.getWidth(), size4.getHeight() / size5.getHeight());
                        size = new Size((int) (size5.getWidth() * fMin3), (int) (size5.getHeight() * fMin3));
                        slaVar = new sla(size, 5);
                        if (true == optionalEmpty.isPresent()) {
                            Object obj7 = optionalEmpty.get();
                            size2 = slaVar.a;
                            jIntValue = ((Integer) obj7).intValue();
                            if (jIntValue != 0) {
                                size3 = (Size) size2;
                                if (size3.getWidth() <= jIntValue) {
                                    float f2 = jIntValue;
                                    float fMin4 = Math.min(f2 / size3.getWidth(), f2 / size3.getHeight());
                                    size2 = new Size((int) (size3.getWidth() * fMin4), (int) (size3.getHeight() * fMin4));
                                } else {
                                    float f3 = jIntValue;
                                    float fMin5 = Math.min(f3 / size3.getWidth(), f3 / size3.getHeight());
                                    size2 = new Size((int) (size3.getWidth() * fMin5), (int) (size3.getHeight() * fMin5));
                                }
                            }
                            optionalEmpty = Optional.ofNullable(size2);
                        }
                        uldVar = (uld) uljVar.k();
                        uldVar.v = optionalEmpty;
                        qunVar = uldVar.q;
                        if (qunVar != null) {
                            qunVar.d(uldVar.v);
                        }
                        if (uldVar.t == null) {
                            uldVar.t = size;
                            Iterable$EL.forEach(uldVar.b, new tsd(size, 9));
                        }
                        ulpVar2.p = ugrVar.a;
                        ulpVar2.q = ugrVar.d;
                        vftVar2.F().isPresent();
                        bogVar = ulpVar2.d;
                        vfsVarG = ulpVar2.g();
                        if (vftVar2 != null) {
                            throw new NullPointerException("Null shortsProjectState");
                        }
                        if (vfsVarG != null) {
                            throw new NullPointerException("Null shortsEditorProjectState");
                        }
                        uxjVar = ulpVar2.h;
                        uri = ulpVar2.p;
                        if (uri != null) {
                            throw new NullPointerException("Null sourceVideoUri");
                        }
                        Long lValueOf2 = Long.valueOf(ulpVar2.q);
                        umiVar = ulpVar2.H;
                        if (umiVar == null) {
                            umiVar = new umi();
                        }
                        umi umiVar3 = umiVar;
                        use useVar2 = ulpVar2.t;
                        useVar2.getClass();
                        final ukz ukzVar2 = ulpVar2.f;
                        final ula ulaVar2 = new ula(vftVar2, vfsVarG, uxjVar, uri, lValueOf2, size4, umiVar3, useVar2, ulpVar2);
                        szq szqVar2 = new szq(ukzVar2, 20);
                        TimeUnit timeUnit2 = TimeUnit.SECONDS;
                        ahey aheyVar2 = ukzVar2.b;
                        ahew ahewVarSchedule2 = aheyVar2.schedule(szqVar2, 5L, timeUnit2);
                        agjz agjzVar2 = new agjz(4);
                        vft vftVar4 = ulaVar2.a;
                        vftVar4.J();
                        afxd afxdVarH2 = afxd.f(vftVar4.d()).h(new ahcy() { // from class: uku
                            /* JADX WARN: Code duplicated, block: B:100:0x01ca  */
                            /* JADX WARN: Code duplicated, block: B:102:0x01ce  */
                            /* JADX WARN: Code duplicated, block: B:105:0x01dd A[DONT_INVERT] */
                            /* JADX WARN: Code duplicated, block: B:106:0x01df  */
                            /* JADX WARN: Code duplicated, block: B:108:0x01e3  */
                            /* JADX WARN: Code duplicated, block: B:111:0x01f1  */
                            /* JADX WARN: Code duplicated, block: B:112:0x01f3  */
                            /* JADX WARN: Code duplicated, block: B:115:0x01fa  */
                            /* JADX WARN: Code duplicated, block: B:116:0x01fd  */
                            /* JADX WARN: Code duplicated, block: B:118:0x0201  */
                            /* JADX WARN: Code duplicated, block: B:119:0x0209  */
                            /* JADX WARN: Code duplicated, block: B:122:0x0214  */
                            /* JADX WARN: Code duplicated, block: B:123:0x0217  */
                            /* JADX WARN: Code duplicated, block: B:126:0x0229  */
                            /* JADX WARN: Code duplicated, block: B:127:0x023c  */
                            /* JADX WARN: Code duplicated, block: B:131:0x0249  */
                            /* JADX WARN: Code duplicated, block: B:132:0x024e  */
                            /* JADX WARN: Code duplicated, block: B:135:0x0256  */
                            /* JADX WARN: Code duplicated, block: B:136:0x0271 A[PHI: r18 r20
                              0x0271: PHI (r18v2 auhs) = (r18v1 auhs), (r18v1 auhs), (r18v7 auhs) binds: [B:67:0x014b, B:134:0x0254, B:64:0x0131] A[DONT_GENERATE, DONT_INLINE]
                              0x0271: PHI (r20v2 auhs) = (r20v1 auhs), (r20v1 auhs), (r20v4 auhs) binds: [B:67:0x014b, B:134:0x0254, B:64:0x0131] A[DONT_GENERATE, DONT_INLINE]] */
                            /* JADX WARN: Code duplicated, block: B:97:0x01c3  */
                            /* JADX WARN: Code duplicated, block: B:99:0x01c7  */
                            /* JADX WARN: Type inference failed for: r11v2, types: [java.lang.Object, java.util.concurrent.Executor] */
                            /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, java.util.concurrent.Executor] */
                            @Override // defpackage.ahcy
                            public final ListenableFuture a(Object obj8) {
                                ListenableFuture listenableFutureG;
                                auhs auhsVar;
                                auhs auhsVar2;
                                boolean z2;
                                augu auguVar;
                                boolean z3;
                                augu auguVarF;
                                aimw aimwVar;
                                int iB;
                                umg umgVarA;
                                augu auguVar2;
                                augy augyVarH;
                                boolean z4;
                                augu auguVar3;
                                boolean z5;
                                int i2;
                                int i3;
                                aimw aimwVarC;
                                int i4;
                                aimw aimwVarC2;
                                aihf builder;
                                aimw aimwVar2;
                                agkj agkjVar;
                                int i5;
                                boolean z6;
                                agkj agkjVar2;
                                boolean z7;
                                auhs auhsVar3 = (auhs) obj8;
                                ukz ukzVar3 = ukzVar2;
                                final ula ulaVar3 = ulaVar2;
                                vfs vfsVar = ulaVar3.b;
                                auhs auhsVar4 = vfsVar.e;
                                if (auhsVar4 == null) {
                                    return ahng.n(new ukw(uvn.e(auhsVar3, ukzVar3.f.getApplicationContext()), false));
                                }
                                cf cfVar = ukzVar3.f;
                                aaok aaokVar = ukzVar3.m;
                                boolean zD = aaokVar.D();
                                agkj agkjVar3 = umh.a;
                                cfVar.getClass();
                                xpl xplVar = new xpl(cfVar);
                                auhq auhqVar = (auhq) auhsVar4.toBuilder();
                                auhqVar.getClass();
                                int size6 = auhsVar4.d.size();
                                int i6 = 0;
                                boolean z8 = false;
                                while (i6 < size6) {
                                    augy augyVar = (augy) auhsVar4.d.get(i6);
                                    augyVar.getClass();
                                    int i7 = augyVar.c;
                                    if (i7 == 110) {
                                        auhb auhbVarV = (auhb) augyVar.d;
                                        auhbVarV.getClass();
                                        if ((auhbVarV.b & 16) != 0) {
                                            String str = auhbVarV.g;
                                            str.getClass();
                                            if (zD) {
                                                agkjVar2 = umh.c;
                                                z7 = true;
                                            } else {
                                                agkjVar2 = umh.d;
                                                z7 = false;
                                            }
                                            i5 = -16777216;
                                            String str2 = (String) agkjVar2.get(str);
                                            if (str2 != null) {
                                                str = str2;
                                            }
                                            if (!awrc.c(str, auhbVarV.g)) {
                                                aihf builder2 = auhbVarV.toBuilder();
                                                builder2.getClass();
                                                atqn.x(str, builder2);
                                                auhbVarV = atqn.v(builder2);
                                            }
                                            z6 = z7;
                                        } else {
                                            i5 = -16777216;
                                            z6 = zD;
                                        }
                                        int i8 = auhbVarV.e;
                                        boolean z9 = i8 != 0;
                                        auhsVar = auhsVar4;
                                        int i9 = auhbVarV.f;
                                        boolean z10 = i9 != 0;
                                        if (!z9) {
                                            i8 = z10 ? i9 : auhbVarV.d;
                                        }
                                        umg umgVarA2 = umh.a(i8, xplVar, z6);
                                        if (umgVarA2 != null) {
                                            boolean z11 = z9 && (auhbVarV.e & i5) != i5;
                                            aihf builder3 = auhbVarV.toBuilder();
                                            builder3.getClass();
                                            if (z9) {
                                                auhsVar2 = auhsVar3;
                                                int i10 = z11 ? umgVarA2.c : umgVarA2.a;
                                                int i11 = auhbVarV.e & (-16777216);
                                                builder3.copyOnWrite();
                                                int i12 = i10;
                                                auhb auhbVar = (auhb) builder3.instance;
                                                boolean z12 = z11;
                                                auhbVar.b |= 4;
                                                auhbVar.e = (i12 & 16777215) | i11;
                                                atqn.w(z12 ? umgVarA2.d : umgVarA2.b, builder3);
                                            } else {
                                                auhsVar2 = auhsVar3;
                                                if (z10) {
                                                    atqn.w(umgVarA2.b, builder3);
                                                    int i13 = umgVarA2.a;
                                                    builder3.copyOnWrite();
                                                    auhb auhbVar2 = (auhb) builder3.instance;
                                                    auhbVar2.b |= 8;
                                                    auhbVar2.f = i13;
                                                } else {
                                                    atqn.w(umgVarA2.a, builder3);
                                                }
                                            }
                                            auhbVarV = atqn.v(builder3);
                                        } else {
                                            auhsVar2 = auhsVar3;
                                        }
                                        if (awrc.c(auhbVarV, augyVar.c == 110 ? (auhb) augyVar.d : auhb.a)) {
                                            augyVarH = augyVar;
                                        } else {
                                            jrr jrrVar = (jrr) augyVar.toBuilder();
                                            jrrVar.getClass();
                                            atxy.k(auhbVarV, jrrVar);
                                            augyVarH = atxy.h(jrrVar);
                                        }
                                    } else {
                                        auhsVar = auhsVar4;
                                        auhsVar2 = auhsVar3;
                                        if (i7 == 101) {
                                            augu auguVarF2 = (augu) augyVar.d;
                                            auguVarF2.getClass();
                                            if ((auguVarF2.b & 32) != 0) {
                                                auir auirVarA = auir.a(auguVarF2.h);
                                                if (auirVarA == null) {
                                                    auirVarA = auir.UNRECOGNIZED;
                                                }
                                                if (zD) {
                                                    agkjVar = umh.a;
                                                    z2 = true;
                                                } else {
                                                    agkjVar = umh.b;
                                                    z2 = false;
                                                }
                                                auir auirVar = (auir) agkjVar.get(auirVarA);
                                                if (auirVar != null) {
                                                    auirVarA = auirVar;
                                                }
                                                auir auirVarA2 = auir.a(auguVarF2.h);
                                                if (auirVarA2 == null) {
                                                    auirVarA2 = auir.UNRECOGNIZED;
                                                }
                                                if (auirVarA != auirVarA2) {
                                                    aihf builder4 = auguVarF2.toBuilder();
                                                    builder4.getClass();
                                                    builder4.copyOnWrite();
                                                    augu auguVar4 = (augu) builder4.instance;
                                                    auguVar4.h = auirVarA.getNumber();
                                                    auguVar4.b |= 32;
                                                    auguVarF2 = atqo.f(builder4);
                                                }
                                            } else {
                                                z2 = zD;
                                            }
                                            if ((auguVarF2.b & 8) != 0) {
                                                aimw aimwVar3 = auguVarF2.f;
                                                if (aimwVar3 == null) {
                                                    aimwVar3 = aimw.a;
                                                }
                                                auguVar = auguVarF2;
                                                z3 = aimwVar3.f != 0.0d;
                                                auguVarF = auguVar;
                                                if (z3) {
                                                    aimwVar = auguVarF.f;
                                                    if (aimwVar == null) {
                                                        aimwVar = aimw.a;
                                                    }
                                                } else {
                                                    aimwVar = auguVarF.e;
                                                    if (aimwVar == null) {
                                                        aimwVar = aimw.a;
                                                    }
                                                }
                                                aimwVar.getClass();
                                                iB = ujq.b(aimwVar);
                                                umgVarA = umh.a(iB, xplVar, z2);
                                                if (umgVarA != null) {
                                                    if (z3) {
                                                        aimwVar2 = auguVarF.f;
                                                        if (aimwVar2 == null) {
                                                            aimwVar2 = aimw.a;
                                                        }
                                                        z4 = z3;
                                                        auguVar3 = auguVarF;
                                                        z5 = aimwVar2.f < 1.0d;
                                                        if (z5) {
                                                            i2 = umgVarA.c;
                                                        } else {
                                                            i2 = umgVarA.a;
                                                        }
                                                        if (z4) {
                                                            i3 = (i2 & 16777215) | (iB & (-16777216));
                                                        } else {
                                                            i3 = umgVarA.a;
                                                        }
                                                        aimwVarC = ujq.c(i3);
                                                        aimwVarC.getClass();
                                                        if (z5) {
                                                            i4 = umgVarA.d;
                                                        } else {
                                                            i4 = umgVarA.b;
                                                        }
                                                        aimwVarC2 = ujq.c(i4);
                                                        aimwVarC2.getClass();
                                                        builder = auguVar3.toBuilder();
                                                        builder.getClass();
                                                        if (z4) {
                                                            builder.copyOnWrite();
                                                            augu auguVar8 = (augu) builder.instance;
                                                            auguVar8.f = aimwVarC;
                                                            auguVar8.b |= 8;
                                                            atqo.g(aimwVarC2, builder);
                                                        } else {
                                                            atqo.g(aimwVarC, builder);
                                                        }
                                                        auguVarF = atqo.f(builder);
                                                    } else {
                                                        z4 = z3;
                                                        auguVar3 = auguVarF;
                                                    }
                                                    if (z5) {
                                                        i2 = umgVarA.c;
                                                    } else {
                                                        i2 = umgVarA.a;
                                                    }
                                                    if (z4) {
                                                        i3 = (i2 & 16777215) | (iB & (-16777216));
                                                    } else {
                                                        i3 = umgVarA.a;
                                                    }
                                                    aimwVarC = ujq.c(i3);
                                                    aimwVarC.getClass();
                                                    if (z5) {
                                                        i4 = umgVarA.d;
                                                    } else {
                                                        i4 = umgVarA.b;
                                                    }
                                                    aimwVarC2 = ujq.c(i4);
                                                    aimwVarC2.getClass();
                                                    builder = auguVar3.toBuilder();
                                                    builder.getClass();
                                                    if (z4) {
                                                        builder.copyOnWrite();
                                                        augu auguVar9 = (augu) builder.instance;
                                                        auguVar9.f = aimwVarC;
                                                        auguVar9.b |= 8;
                                                        atqo.g(aimwVarC2, builder);
                                                    } else {
                                                        atqo.g(aimwVarC, builder);
                                                    }
                                                    auguVarF = atqo.f(builder);
                                                }
                                                if (augyVar.c == 101) {
                                                    auguVar2 = (augu) augyVar.d;
                                                } else {
                                                    auguVar2 = augu.a;
                                                }
                                                if (awrc.c(auguVarF, auguVar2)) {
                                                    augyVarH = augyVar;
                                                } else {
                                                    jrr jrrVar3 = (jrr) augyVar.toBuilder();
                                                    jrrVar3.getClass();
                                                    jrrVar3.copyOnWrite();
                                                    augy augyVar3 = (augy) jrrVar3.instance;
                                                    augyVar3.d = auguVarF;
                                                    augyVar3.c = 101;
                                                    augyVarH = atxy.h(jrrVar3);
                                                }
                                            } else {
                                                auguVar = auguVarF2;
                                            }
                                            auguVarF = auguVar;
                                            if (z3) {
                                                aimwVar = auguVarF.f;
                                                if (aimwVar == null) {
                                                    aimwVar = aimw.a;
                                                }
                                            } else {
                                                aimwVar = auguVarF.e;
                                                if (aimwVar == null) {
                                                    aimwVar = aimw.a;
                                                }
                                            }
                                            aimwVar.getClass();
                                            iB = ujq.b(aimwVar);
                                            umgVarA = umh.a(iB, xplVar, z2);
                                            if (umgVarA != null) {
                                                if (z3) {
                                                    aimwVar2 = auguVarF.f;
                                                    if (aimwVar2 == null) {
                                                        aimwVar2 = aimw.a;
                                                    }
                                                    z4 = z3;
                                                    auguVar3 = auguVarF;
                                                    if (aimwVar2.f < 1.0d) {
                                                    }
                                                    if (z5) {
                                                        i2 = umgVarA.c;
                                                    } else {
                                                        i2 = umgVarA.a;
                                                    }
                                                    if (z4) {
                                                        i3 = (i2 & 16777215) | (iB & (-16777216));
                                                    } else {
                                                        i3 = umgVarA.a;
                                                    }
                                                    aimwVarC = ujq.c(i3);
                                                    aimwVarC.getClass();
                                                    if (z5) {
                                                        i4 = umgVarA.d;
                                                    } else {
                                                        i4 = umgVarA.b;
                                                    }
                                                    aimwVarC2 = ujq.c(i4);
                                                    aimwVarC2.getClass();
                                                    builder = auguVar3.toBuilder();
                                                    builder.getClass();
                                                    if (z4) {
                                                        builder.copyOnWrite();
                                                        augu auguVar10 = (augu) builder.instance;
                                                        auguVar10.f = aimwVarC;
                                                        auguVar10.b |= 8;
                                                        atqo.g(aimwVarC2, builder);
                                                    } else {
                                                        atqo.g(aimwVarC, builder);
                                                    }
                                                    auguVarF = atqo.f(builder);
                                                } else {
                                                    z4 = z3;
                                                    auguVar3 = auguVarF;
                                                }
                                                if (z5) {
                                                    i2 = umgVarA.c;
                                                } else {
                                                    i2 = umgVarA.a;
                                                }
                                                if (z4) {
                                                    i3 = (i2 & 16777215) | (iB & (-16777216));
                                                } else {
                                                    i3 = umgVarA.a;
                                                }
                                                aimwVarC = ujq.c(i3);
                                                aimwVarC.getClass();
                                                if (z5) {
                                                    i4 = umgVarA.d;
                                                } else {
                                                    i4 = umgVarA.b;
                                                }
                                                aimwVarC2 = ujq.c(i4);
                                                aimwVarC2.getClass();
                                                builder = auguVar3.toBuilder();
                                                builder.getClass();
                                                if (z4) {
                                                    builder.copyOnWrite();
                                                    augu auguVar11 = (augu) builder.instance;
                                                    auguVar11.f = aimwVarC;
                                                    auguVar11.b |= 8;
                                                    atqo.g(aimwVarC2, builder);
                                                } else {
                                                    atqo.g(aimwVarC, builder);
                                                }
                                                auguVarF = atqo.f(builder);
                                            }
                                            if (augyVar.c == 101) {
                                                auguVar2 = (augu) augyVar.d;
                                            } else {
                                                auguVar2 = augu.a;
                                            }
                                            if (awrc.c(auguVarF, auguVar2)) {
                                                jrr jrrVar4 = (jrr) augyVar.toBuilder();
                                                jrrVar4.getClass();
                                                jrrVar4.copyOnWrite();
                                                augy augyVar4 = (augy) jrrVar4.instance;
                                                augyVar4.d = auguVarF;
                                                augyVar4.c = 101;
                                                augyVarH = atxy.h(jrrVar4);
                                            } else {
                                                augyVarH = augyVar;
                                            }
                                        } else {
                                            augyVarH = augyVar;
                                        }
                                    }
                                    if (!awrc.c(augyVarH, augyVar)) {
                                        atqn.B(auhqVar);
                                        auhqVar.copyOnWrite();
                                        auhs auhsVar5 = (auhs) auhqVar.instance;
                                        auhsVar5.d();
                                        auhsVar5.d.set(i6, augyVarH);
                                        z8 = true;
                                    }
                                    i6++;
                                    auhsVar3 = auhsVar2;
                                    auhsVar4 = auhsVar;
                                }
                                auhs auhsVar6 = auhsVar4;
                                final auhs auhsVar7 = auhsVar3;
                                auhs auhsVarZ = atqn.z(auhqVar);
                                if (true != z8) {
                                    auhsVarZ = auhsVar6;
                                }
                                ukw ukwVar = new ukw(auhsVarZ, z8);
                                final auhs auhsVar8 = ukwVar.a;
                                boolean z13 = ukwVar.b;
                                if (z13) {
                                    vfsVar.b(auhsVar8);
                                }
                                if (aaokVar.K()) {
                                    final xsc xscVar = ukzVar3.n;
                                    auhsVar7.getClass();
                                    final agkz agkzVarC = uvn.c(auhsVar8);
                                    agkzVarC.getClass();
                                    final List agkeVar2 = vfsVar.f;
                                    agkeVar2.getClass();
                                    final List agkeVar3 = vfsVar.g;
                                    agkeVar3.getClass();
                                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                                    Iterator it = agkeVar2.iterator();
                                    while (it.hasNext()) {
                                        auhs auhsVar9 = ((auew) it.next()).c;
                                        if (auhsVar9 == null) {
                                            auhsVar9 = auhs.a;
                                        }
                                        agkz agkzVarC2 = uvn.c(auhsVar9);
                                        agkzVarC2.getClass();
                                        linkedHashSet.addAll(agkzVarC2);
                                    }
                                    Iterator it2 = agkeVar3.iterator();
                                    while (it2.hasNext()) {
                                        auhs auhsVar10 = ((auew) it2.next()).c;
                                        if (auhsVar10 == null) {
                                            auhsVar10 = auhs.a;
                                        }
                                        agkz agkzVarC3 = uvn.c(auhsVar10);
                                        agkzVarC3.getClass();
                                        linkedHashSet.addAll(agkzVarC3);
                                    }
                                    final Set setAw = atqq.aw(linkedHashSet);
                                    Set setR = atqq.r(agkzVarC, setAw);
                                    if (setR.isEmpty()) {
                                        listenableFutureG = ahng.n(auhsVar8);
                                    } else {
                                        listenableFutureG = afxd.f(uvn.d((Context) xscVar.a, setR, ulaVar3.a.j(), xscVar.b)).g(new rwj(new awqg() { // from class: uki
                                            /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, zvl] */
                                            @Override // defpackage.awqg
                                            public final Object invoke(Object obj9) {
                                                boolean z14;
                                                agkz agkzVar3 = (agkz) obj9;
                                                agkzVar3.getClass();
                                                boolean zIsEmpty3 = agkzVar3.isEmpty();
                                                auhs auhsVarU = auhsVar8;
                                                if (!zIsEmpty3) {
                                                    agkz agkzVar4 = agkzVarC;
                                                    boolean z15 = true;
                                                    if (!agkzVar4.isEmpty()) {
                                                        Iterator<E> it3 = agkzVar4.iterator();
                                                        while (true) {
                                                            if (!it3.hasNext()) {
                                                                z14 = false;
                                                                break;
                                                            }
                                                            if (agkzVar3.contains((Uri) it3.next())) {
                                                                z14 = true;
                                                                break;
                                                            }
                                                        }
                                                    } else {
                                                        z14 = false;
                                                        break;
                                                    }
                                                    Set set = setAw;
                                                    if (!set.isEmpty()) {
                                                        Iterator it4 = set.iterator();
                                                        do {
                                                            if (!it4.hasNext()) {
                                                                z15 = false;
                                                                break;
                                                            }
                                                        } while (!agkzVar3.contains((Uri) it4.next()));
                                                    } else {
                                                        z15 = false;
                                                        break;
                                                    }
                                                    ula ulaVar4 = ulaVar3;
                                                    if (z14 || z15) {
                                                        ulaVar4.g.n(z14);
                                                    }
                                                    xsc xscVar2 = xscVar;
                                                    if (z14) {
                                                        auhs auhsVar11 = auhsVar7;
                                                        agke agkeVarA = uvn.a(auhsVarU, agkzVar3);
                                                        agkeVarA.getClass();
                                                        auhsVarU = xscVar2.U(ulaVar4, auhsVarU, auhsVar11, agkeVarA);
                                                    }
                                                    if (z15) {
                                                        ulaVar4.b.c(auhsVarU, xscVar2.T(agkeVar2, agkzVar3), xscVar2.T(agkeVar3, agkzVar3));
                                                        ?? r6 = xscVar2.c;
                                                        zvj zvjVarA2 = zvk.a();
                                                        zvjVarA2.c(ajtv.ERROR_LEVEL_WARNING);
                                                        zvjVarA2.j = 40;
                                                        zvjVarA2.d("DraftMediaSourceValidator: Sanitized missing media segment from composition history");
                                                        r6.a(zvjVarA2.a());
                                                    }
                                                }
                                                return auhsVarU;
                                            }
                                        }, 13), MoreExecutors.directExecutor());
                                    }
                                } else {
                                    xsc xscVar2 = ukzVar3.n;
                                    auhsVar7.getClass();
                                    File fileJ = ulaVar3.a.j();
                                    agkz agkzVarC4 = uvn.c(auhsVar8);
                                    Context context = (Context) xscVar2.a;
                                    ?? r6 = xscVar2.b;
                                    listenableFutureG = afxd.f(ahno.ar(uvn.d(context, agkzVarC4, fileJ, r6), new rwj(auhsVar8, 17), r6)).g(new rwj(new ukj(auhsVar8, ulaVar3, xscVar2, auhsVar7, 0), 14), MoreExecutors.directExecutor());
                                }
                                return afxd.f(listenableFutureG).g(new zjq(z13, 1), MoreExecutors.directExecutor());
                            }
                        }, MoreExecutors.directExecutor()).h(new ahcy() { // from class: ukv
                            /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, vab] */
                            /* JADX WARN: Type inference failed for: r9v12, types: [java.lang.Object, qvm] */
                            @Override // defpackage.ahcy
                            public final ListenableFuture a(Object obj8) {
                                ListenableFuture listenableFutureE;
                                ListenableFuture listenableFutureN;
                                agke agkeVarN;
                                ukw ukwVar = (ukw) obj8;
                                auhs auhsVar = ukwVar.a;
                                boolean z2 = ukwVar.b;
                                Duration durationL = usj.l(auhsVar);
                                int i2 = 4;
                                agjz agjzVar3 = new agjz(4);
                                int i3 = auhsVar.b & 1;
                                ula ulaVar3 = ulaVar2;
                                if (i3 != 0) {
                                    agjzVar3.h(new utb(ulaVar3.c, ahng.au(durationL)));
                                }
                                ukz ukzVar3 = ukzVar2;
                                agjzVar3.h(new uta(ulaVar3.d));
                                agjzVar3.h(ukzVar3.e);
                                agke agkeVarG = agjzVar3.g();
                                int i4 = 0;
                                agqs agqsVarListIterator = agkeVarG.listIterator(0);
                                auhs auhsVarA = auhsVar;
                                while (agqsVarListIterator.hasNext()) {
                                    auhsVarA = ((usx) agqsVarListIterator.next()).a(auhsVarA);
                                }
                                use useVar3 = ulaVar3.e;
                                qvm qvmVar = qvm.a;
                                usd usdVar = useVar3.c;
                                if (usdVar != null) {
                                    listenableFutureE = ahng.n(usdVar);
                                } else if (useVar3.d.F()) {
                                    listenableFutureE = ahno.ap(new tsn(useVar3, auhsVarA, i2, null), useVar3.a);
                                } else {
                                    Optional optionalEmpty2 = auhsVarA.g.size() == 0 ? Optional.empty() : Optional.of((aufd) auhsVarA.g.get(0));
                                    qze qzeVar = new qze(useVar3, ukzVar3.d, qvmVar, 8);
                                    if (true == optionalEmpty2.isPresent()) {
                                        Object obj9 = optionalEmpty2.get();
                                        Object obj10 = qzeVar.a;
                                        ?? r12 = qzeVar.c;
                                        ?? r9 = qzeVar.b;
                                        aufd aufdVar = (aufd) obj9;
                                        apsr apsrVar = aufdVar.g;
                                        if (apsrVar == null) {
                                            apsrVar = apsr.a;
                                        }
                                        if (apsrVar.b == 4) {
                                            apsr apsrVar2 = aufdVar.g;
                                            if (apsrVar2 == null) {
                                                apsrVar2 = apsr.a;
                                            }
                                            apse apseVar = apsrVar2.b == 4 ? (apse) apsrVar2.c : apse.a;
                                            uzy uzyVarA = uzz.a();
                                            uzyVarA.b(apseVar.c);
                                            uzyVarA.c(apseVar.d);
                                            uzz uzzVarA = uzyVarA.a();
                                            if (((aufdVar.c == 2 ? (aufe) aufdVar.d : aufe.a).b & 1) != 0) {
                                                int i5 = aufdVar.e;
                                                if (i5 == 1001) {
                                                    aufc aufcVar = (i5 == 1001 ? (aufl) aufdVar.f : aufl.a).c;
                                                    if (aufcVar == null) {
                                                        aufcVar = aufc.a;
                                                    }
                                                    agkeVarN = agke.n(aufcVar.b);
                                                } else {
                                                    agkeVarN = agpi.a;
                                                }
                                                listenableFutureN = ape.f(new usp((vab) r12, uzzVarA, aufdVar, agkeVarN, (qvm) r9, 0));
                                            } else {
                                                Executor executor = ((use) obj10).b;
                                                r12.f(uzzVarA);
                                                listenableFutureN = ape.f(new usl(aufdVar, r12, r9, executor));
                                            }
                                        } else {
                                            listenableFutureN = ahng.n(Optional.empty());
                                        }
                                        optionalEmpty2 = Optional.ofNullable(listenableFutureN);
                                    }
                                    listenableFutureE = ahcs.e((ListenableFuture) optionalEmpty2.orElse(ahng.n(Optional.empty())), afwl.a(new tvm(useVar3, auhsVarA, 4)), useVar3.a);
                                }
                                return afxd.f(listenableFutureE).g(new ukt(auhsVar, z2, i4), MoreExecutors.directExecutor());
                            }
                        }, MoreExecutors.directExecutor());
                        afxd afxdVarG2 = afxd.f(ahno.av(afxdVarH2).k(new hlm(ukzVar2, (ListenableFuture) afxdVarH2, ulaVar2, agjzVar2, 13), aheyVar2)).g(new tvm(ukzVar2, ulaVar2, 3), ukzVar2.a);
                        afxdVarG2.addListener(new ull(ahewVarSchedule2, 1), aheyVar2);
                        taf.k(bogVar, afxdVarG2, new tvj(ulpVar2, 13), new tvj(ulpVar2, 14));
                        roqVar = ulpVar2.J;
                        if (roqVar != null) {
                            if (!(vftVar2 instanceof vfr)) {
                                throw null;
                            }
                            agke agkeVar2 = agpi.a;
                            Stream streamFlatMap2 = Collection.EL.stream(agkeVar2).flatMap(new snm(12));
                            Collector collector2 = aghu.b;
                            agkz agkzVar3 = (agkz) streamFlatMap2.collect(collector2);
                            agkz agkzVar4 = (agkz) Collection.EL.stream(agkeVar2).filter(new sde(11)).map(new snm(11)).collect(collector2);
                            agpr agprVar2 = agpr.a;
                            agkx agkxVar2 = new agkx();
                            agkxVar2.j(agkzVar3);
                            agkxVar2.j(agkzVar4);
                            agkxVar2.j(agprVar2);
                            ((awku) roqVar.a).kk(agkxVar2.g());
                        }
                    }
                });
                break;
            case 19:
                ((ulp) this.a).m((Throwable) obj, "Error loading project state.");
                break;
            default:
                ((ulp) this.a).m((Throwable) obj, "Error when handling Media Generation Visibility change.");
                break;
        }
    }
}
