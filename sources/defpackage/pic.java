package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import com.google.android.apps.youtube.music.R;
import com.google.common.util.concurrent.ListenableFuture;
import j$.time.Duration;
import j$.time.Instant;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class pic implements pgt {
    public static final agsn a = agsn.h("GnpSdk");
    public final Context b;
    public final pls c;
    public final piy d;
    public final pgy e;
    public final pav f;
    public final awmd g;
    public final mbc h;
    public final pha i;
    public final awou j;
    private final pbk k;
    private final pcn l;
    private final pcn m;
    private final awou n;

    public pic(Context context, pls plsVar, pbk pbkVar, piy piyVar, pgy pgyVar, pav pavVar, awmd awmdVar, mbc mbcVar, pha phaVar, pcn pcnVar, pcn pcnVar2, awou awouVar, awou awouVar2) {
        context.getClass();
        plsVar.getClass();
        pbkVar.getClass();
        piyVar.getClass();
        pgyVar.getClass();
        pavVar.getClass();
        awmdVar.getClass();
        mbcVar.getClass();
        phaVar.getClass();
        awouVar.getClass();
        awouVar2.getClass();
        this.b = context;
        this.c = plsVar;
        this.k = pbkVar;
        this.d = piyVar;
        this.e = pgyVar;
        this.f = pavVar;
        this.g = awmdVar;
        this.h = mbcVar;
        this.i = phaVar;
        this.l = pcnVar;
        this.m = pcnVar2;
        this.n = awouVar;
        this.j = awouVar2;
    }

    public static final void h(atr atrVar, auu auuVar, aidq aidqVar, pgu pguVar) {
        boolean z = auuVar == null || (auuVar instanceof atq) || nwc.b(aidqVar);
        pgu pguVar2 = pgu.e;
        aido aidoVar = aidqVar.k;
        if (aidoVar == null) {
            aidoVar = aido.a;
        }
        if (aidoVar.h && qnl.aa(36) && z) {
            String str = aidqVar.e;
            str.getClass();
            if (str.length() <= 0 || pguVar == pguVar2) {
                return;
            }
            atrVar.e(2, true);
            atrVar.b().putBoolean("android.requestPromotedOngoing", true);
            String str2 = aidqVar.w;
            str2.getClass();
            if (str2.length() > 0) {
                String str3 = aidqVar.w;
                atrVar.g = str3;
                if (Build.VERSION.SDK_INT < 36) {
                    atrVar.b().putString("android.shortCriticalText", str3);
                }
            }
        }
    }

    public static final boolean j(plx plxVar) {
        return plxVar.b() instanceof pxo;
    }

    public static final Duration k(aigu aiguVar) {
        pky pkvVar;
        pkx pkxVar = pkx.d;
        try {
            pkvVar = new pla(aext.v(aiguVar));
        } catch (Exception e) {
            pkvVar = new pkv(e, pkxVar);
        }
        return (Duration) pkvVar.d();
    }

    public static final Instant l(aijp aijpVar) {
        pky pkvVar;
        pkx pkxVar = pkx.d;
        try {
            Instant instantAx = ahng.ax(aijpVar);
            instantAx.getClass();
            pkvVar = new pla(instantAx);
        } catch (Exception e) {
            pkvVar = new pkv(e, pkxVar);
        }
        return (Instant) pkvVar.d();
    }

    private final int n() {
        return this.b.getResources().getDimensionPixelSize(R.dimen.notifications_icon_size);
    }

    @Override // defpackage.pgt
    public final Object a(String str, plx plxVar, pot potVar, boolean z, plb plbVar, pzn pznVar, awoq awoqVar) {
        return awro.p(this.n, new phy(this, plxVar, potVar, plbVar, z, pznVar, str, null), awoqVar);
    }

    @Override // defpackage.pgt
    public final Object b(String str, plx plxVar, List list, pzn pznVar, awoq awoqVar) {
        return awro.p(this.n, new pia(list, this, plxVar, str, pznVar, null), awoqVar);
    }

    public final Bitmap c(aidq aidqVar, List list) {
        if (list.isEmpty()) {
            return null;
        }
        int iAS = a.aS(aidqVar.s);
        if (iAS == 0) {
            iAS = 1;
        }
        int i = iAS - 1;
        pbk pbkVar = this.k;
        if (i == 2) {
            return pbkVar.a(n(), list);
        }
        int iN = n();
        d();
        return pbkVar.b(iN, list);
    }

    public final plt d() {
        plt pltVar = this.c.c;
        if (pltVar != null) {
            return pltVar;
        }
        throw new IllegalArgumentException("SystemTrayNotificationConfig must be set in GnpConfig for showing system tray notifications.");
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:33:0x010e  */
    /* JADX WARN: Code duplicated, block: B:36:0x0118  */
    /* JADX WARN: Code duplicated, block: B:37:0x0127  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Object, java.util.Iterator] */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.lang.Object, pzu] */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r7v11, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v19 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x010e -> B:34:0x0114). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object e(defpackage.aut r8, defpackage.aidb r9, defpackage.plx r10, defpackage.pot r11, defpackage.awoq r12) {
        /*
            Method dump skipped, instruction units count: 346
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pic.e(aut, aidb, plx, pot, awoq):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object f(atr atrVar, String str, plx plxVar, pot potVar, pos posVar, pzn pznVar, aidq aidqVar, awoq awoqVar) throws Throwable {
        pht phtVar;
        aidq aidqVar2;
        pzn pznVar2;
        if (awoqVar instanceof pht) {
            phtVar = (pht) awoqVar;
            int i = phtVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                phtVar.c = i - Integer.MIN_VALUE;
            } else {
                phtVar = new pht(this, awoqVar);
            }
        } else {
            phtVar = new pht(this, awoqVar);
        }
        pht phtVar2 = phtVar;
        Object objC = phtVar2.a;
        awox awoxVar = awox.a;
        int i2 = phtVar2.c;
        if (i2 == 0) {
            atqp.j(objC);
            piy piyVar = this.d;
            phtVar2.d = atrVar;
            phtVar2.g = posVar;
            phtVar2.e = pznVar;
            phtVar2.f = aidqVar;
            phtVar2.c = 1;
            objC = piy.c(piyVar, str, plxVar, potVar, posVar, pznVar, phtVar2);
            if (objC == awoxVar) {
                return awoxVar;
            }
            aidqVar2 = aidqVar;
            pznVar2 = pznVar;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aidq aidqVar3 = phtVar2.f;
            pzn pznVar3 = phtVar2.e;
            posVar = phtVar2.g;
            atr atrVar2 = phtVar2.d;
            atqp.j(objC);
            aidqVar2 = aidqVar3;
            pznVar2 = pznVar3;
            atrVar = atrVar2;
        }
        PendingIntent pendingIntent = (PendingIntent) objC;
        HashSet hashSet = new HashSet();
        Bundle bundle = new Bundle();
        String str2 = posVar.f;
        if (str2.length() == 0) {
            str2 = posVar.b;
        }
        aamo aamoVar = new aamo(str2, bundle, hashSet);
        String str3 = posVar.b;
        Bundle bundle2 = new Bundle();
        CharSequence charSequenceC = atr.c(str3);
        ArrayList arrayList = new ArrayList();
        arrayList.add(aamoVar);
        atrVar.g(aag.h(null, charSequenceC, pendingIntent, bundle2, arrayList));
        if (pznVar2 != null) {
            aiie aiieVar = pznVar2.b;
            aiieVar.getClass();
            if (!aiieVar.isEmpty() && !nwa.a(aidqVar2)) {
                aiie aiieVar2 = pznVar2.b;
                aiieVar2.getClass();
                atrVar.p = (CharSequence[]) aiieVar2.toArray(new String[0]);
            }
        }
        return awmy.a;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:110:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:163:0x02ee  */
    /* JADX WARN: Code duplicated, block: B:170:0x0307  */
    /* JADX WARN: Code duplicated, block: B:174:0x030f  */
    /* JADX WARN: Code duplicated, block: B:181:0x0328  */
    /* JADX WARN: Code duplicated, block: B:182:0x032e  */
    /* JADX WARN: Code duplicated, block: B:184:0x0331 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:185:0x0333  */
    /* JADX WARN: Code duplicated, block: B:186:0x0336  */
    /* JADX WARN: Code duplicated, block: B:187:0x033a A[PHI: r17
      0x033a: PHI (r17v6 char) = (r17v5 char), (r17v7 char) binds: [B:183:0x032f, B:185:0x0333] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:190:0x034e  */
    /* JADX WARN: Code duplicated, block: B:192:0x035c  */
    /* JADX WARN: Code duplicated, block: B:193:0x0361  */
    /* JADX WARN: Code duplicated, block: B:196:0x036e  */
    /* JADX WARN: Code duplicated, block: B:198:0x0375  */
    /* JADX WARN: Code duplicated, block: B:199:0x037a  */
    /* JADX WARN: Code duplicated, block: B:201:0x038b  */
    /* JADX WARN: Code duplicated, block: B:203:0x0390  */
    /* JADX WARN: Code duplicated, block: B:204:0x0395  */
    /* JADX WARN: Code duplicated, block: B:207:0x039b  */
    /* JADX WARN: Code duplicated, block: B:210:0x03a8  */
    /* JADX WARN: Code duplicated, block: B:212:0x03ad  */
    /* JADX WARN: Code duplicated, block: B:213:0x03b2  */
    /* JADX WARN: Code duplicated, block: B:216:0x03b8  */
    /* JADX WARN: Code duplicated, block: B:219:0x03c4  */
    /* JADX WARN: Code duplicated, block: B:221:0x03cf  */
    /* JADX WARN: Code duplicated, block: B:222:0x03d4  */
    /* JADX WARN: Code duplicated, block: B:225:0x03da  */
    /* JADX WARN: Code duplicated, block: B:227:0x03ec  */
    /* JADX WARN: Code duplicated, block: B:233:0x0413 A[DONT_INVERT, PHI: r20
      0x0413: PHI (r20v6 aue) = (r20v1 aue), (r20v7 aue) binds: [B:232:0x0411, B:186:0x0336] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:234:0x0415  */
    /* JADX WARN: Code duplicated, block: B:235:0x0423  */
    /* JADX WARN: Code duplicated, block: B:237:0x042f  */
    /* JADX WARN: Code duplicated, block: B:238:0x0434  */
    /* JADX WARN: Code duplicated, block: B:242:0x0452 A[LOOP:3: B:240:0x044c->B:242:0x0452, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:246:0x046f  */
    /* JADX WARN: Code duplicated, block: B:248:0x0475  */
    /* JADX WARN: Code duplicated, block: B:250:0x0479  */
    /* JADX WARN: Code duplicated, block: B:253:0x0486  */
    /* JADX WARN: Code duplicated, block: B:255:0x048a  */
    /* JADX WARN: Code duplicated, block: B:258:0x04ad  */
    /* JADX WARN: Code duplicated, block: B:277:0x04ed  */
    /* JADX WARN: Code duplicated, block: B:278:0x04f6  */
    /* JADX WARN: Code duplicated, block: B:329:0x0635  */
    /* JADX WARN: Code duplicated, block: B:333:0x064b  */
    /* JADX WARN: Code duplicated, block: B:336:0x0653  */
    /* JADX WARN: Code duplicated, block: B:337:0x0659  */
    /* JADX WARN: Code duplicated, block: B:359:0x0401 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:361:0x03f5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:375:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:376:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    /* JADX WARN: Code restructure failed: missing block: B:314:0x05ea, code lost:
    
        if (r0.hasNext() == false) goto L325;
     */
    /* JADX WARN: Code restructure failed: missing block: B:324:0x061c, code lost:
    
        if (r0.hasNext() == false) goto L325;
     */
    /* JADX WARN: Code restructure failed: missing block: B:325:0x061e, code lost:
    
        defpackage.avk.b(r3, (java.lang.String) r4.b);
     */
    /* JADX WARN: Code restructure failed: missing block: B:326:0x0626, code lost:
    
        r0 = (defpackage.atz) r0.next();
        java.util.Collections.singletonList(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:327:0x0631, code lost:
    
        throw null;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(defpackage.plx r20, defpackage.pot r21, defpackage.pzn r22, defpackage.aidq r23, android.graphics.Bitmap r24, java.util.Map r25, android.graphics.Bitmap r26, defpackage.atr r27, defpackage.awoq r28) {
        /*
            Method dump skipped, instruction units count: 1686
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pic.g(plx, pot, pzn, aidq, android.graphics.Bitmap, java.util.Map, android.graphics.Bitmap, atr, awoq):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object i(aidq aidqVar, plx plxVar, pot potVar, awoq awoqVar) {
        phw phwVar;
        if (awoqVar instanceof phw) {
            phwVar = (phw) awoqVar;
            int i = phwVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                phwVar.c = i - Integer.MIN_VALUE;
            } else {
                phwVar = new phw(this, awoqVar);
            }
        } else {
            phwVar = new phw(this, awoqVar);
        }
        phw phwVar2 = phwVar;
        Object objE = phwVar2.a;
        Object obj = awox.a;
        int i2 = phwVar2.c;
        if (i2 == 0) {
            atqp.j(objE);
            aidb aidbVar = aidqVar.c == 29 ? (aidb) aidqVar.d : aidb.a;
            aidbVar.getClass();
            aut autVar = new aut();
            int i3 = aidbVar.b;
            if (i3 == 1) {
                autVar.c = true;
                aus ausVar = new aus(1);
                atyv atyvVar = ((aicx) aidbVar.c).b;
                if (atyvVar == null) {
                    atyvVar = atyv.a;
                }
                ausVar.c = nqw.d(atyvVar);
                autVar.g(atqq.H(ausVar));
            } else {
                aida aidaVar = i3 == 2 ? (aida) aidbVar.c : aida.a;
                aidaVar.getClass();
                autVar.b = aidaVar.c;
                autVar.d = aidaVar.b;
                aiie<aicz> aiieVar = aidaVar.e;
                aiieVar.getClass();
                List arrayList = new ArrayList(atqq.N(aiieVar, 10));
                for (aicz aiczVar : aiieVar) {
                    aus ausVar2 = new aus(aiczVar.c);
                    if ((aiczVar.b & 2) != 0) {
                        atyv atyvVar2 = aiczVar.d;
                        if (atyvVar2 == null) {
                            atyvVar2 = atyv.a;
                        }
                        ausVar2.c = nqw.d(atyvVar2);
                    }
                    arrayList.add(ausVar2);
                }
                autVar.g(arrayList);
                aiie<aicy> aiieVar2 = aidaVar.f;
                aiieVar2.getClass();
                ArrayList<aur> arrayList2 = new ArrayList(atqq.N(aiieVar2, 10));
                for (aicy aicyVar : aiieVar2) {
                    aur aurVar = new aur(aicyVar.c);
                    if ((aicyVar.b & 2) != 0) {
                        atyv atyvVar3 = aicyVar.d;
                        if (atyvVar3 == null) {
                            atyvVar3 = atyv.a;
                        }
                        aurVar.c = nqw.d(atyvVar3);
                    }
                    arrayList2.add(aurVar);
                }
                if (autVar.a == null) {
                    autVar.a = new ArrayList();
                }
                autVar.a.clear();
                for (aur aurVar2 : arrayList2) {
                    if (autVar.a == null) {
                        autVar.a = new ArrayList();
                    }
                    if (aurVar2.a > 0) {
                        autVar.a.add(aurVar2);
                    }
                }
            }
            phwVar2.c = 1;
            objE = e(autVar, aidbVar, plxVar, potVar, phwVar2);
            if (objE == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            atqp.j(objE);
        }
        return (aut) objE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r11v7, types: [java.lang.CharSequence, java.lang.Object] */
    public final Object m(pot potVar, avc avcVar, Bitmap bitmap, awoq awoqVar) throws Throwable {
        phu phuVar;
        ListenableFuture listenableFutureN;
        avc avcVar2;
        Bitmap bitmap2;
        aidn aidnVar;
        aidm aidmVar;
        String str;
        Object obj;
        IconCompat iconCompatF;
        wjg wjgVar;
        if (awoqVar instanceof phu) {
            phuVar = (phu) awoqVar;
            int i = phuVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                phuVar.c = i - Integer.MIN_VALUE;
            } else {
                phuVar = new phu(this, awoqVar);
            }
        } else {
            phuVar = new phu(this, awoqVar);
        }
        Object obj2 = phuVar.a;
        awox awoxVar = awox.a;
        int i2 = phuVar.c;
        if (i2 == 0) {
            atqp.j(obj2);
            aidq aidqVar = potVar.o;
            aidn aidnVar2 = aidqVar.c == 27 ? (aidn) aidqVar.d : aidn.a;
            aidnVar2.getClass();
            aidm aidmVar2 = aidnVar2.e;
            if (aidmVar2 == null) {
                aidmVar2 = aidm.a;
            }
            aidmVar2.getClass();
            String str2 = aidmVar2.b;
            str2.getClass();
            agev agevVarA = nvt.a(this.l, nvj.b(potVar));
            if (!agevVarA.g()) {
                ((agsj) a.b()).w("NotificationShortcutIntentProvider must be provided to create a shortcut. Skipping shortcut creation for thread ID: %s", potVar.a);
                return null;
            }
            zhg zhgVar = (zhg) agevVarA.c();
            nvj.b(potVar);
            phuVar.d = avcVar;
            phuVar.e = bitmap;
            phuVar.f = aidnVar2;
            phuVar.g = aidmVar2;
            phuVar.h = str2;
            phuVar.c = 1;
            if (((vxz) zhgVar.a).l(24, 45718674L, false)) {
                listenableFutureN = ahng.n(new Intent());
            } else {
                Context context = (Context) zhgVar.b;
                Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
                if (launchIntentForPackage == null) {
                    launchIntentForPackage = new Intent();
                }
                listenableFutureN = ahng.n(launchIntentForPackage);
            }
            Object objAd = awrc.ad(listenableFutureN, phuVar);
            obj = awoxVar;
            if (objAd != awoxVar) {
                avcVar2 = avcVar;
                bitmap2 = bitmap;
                aidnVar = aidnVar2;
                aidmVar = aidmVar2;
                obj2 = objAd;
                str = str2;
            }
            obj = wjgVar;
            return obj;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        str = phuVar.h;
        aidmVar = phuVar.g;
        aidnVar = phuVar.f;
        bitmap2 = phuVar.e;
        avcVar2 = phuVar.d;
        atqp.j(obj2);
        Intent intent = (Intent) obj2;
        String str3 = aidmVar.c;
        if (str3.length() == 0) {
            aidh aidhVar = aidnVar.c;
            if (aidhVar == null) {
                aidhVar = aidh.a;
            }
            str3 = aidhVar.b;
        }
        str3.getClass();
        if (bitmap2 != null) {
            iconCompatF = IconCompat.f(bitmap2);
        } else {
            iconCompatF = (aidnVar.i && a.aN()) ? null : avcVar2.b;
        }
        Context context2 = this.b;
        wjgVar = new wjg(null);
        wjgVar.e = context2;
        wjgVar.b = str;
        wjgVar.d = str3;
        wjgVar.c = new Intent[]{intent};
        wjgVar.a = true;
        wjgVar.f = new avc[]{avcVar2};
        wjgVar.h = iconCompatF;
        if (TextUtils.isEmpty(wjgVar.d)) {
            throw new IllegalArgumentException("Shortcut must have a non-empty label");
        }
        if (wjgVar.c == null) {
            obj = wjgVar;
            throw new IllegalArgumentException("Shortcut must have an intent");
        }
        obj = wjgVar;
        return obj;
    }
}
