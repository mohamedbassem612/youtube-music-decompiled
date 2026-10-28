package defpackage;

import android.app.Notification;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.widget.RemoteViews;
import app.rive.semantics.SemanticState;
import com.google.android.apps.youtube.music.R;
import j$.time.Duration;
import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.LocalTime;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class phy extends awpk implements awqk {
    Object a;
    Object b;
    Object c;
    Object d;
    Object e;
    int f;
    int g;
    final /* synthetic */ pic h;
    final /* synthetic */ plx i;
    final /* synthetic */ pot j;
    final /* synthetic */ plb k;
    final /* synthetic */ boolean l;
    final /* synthetic */ pzn m;
    final /* synthetic */ String n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public phy(pic picVar, plx plxVar, pot potVar, plb plbVar, boolean z, pzn pznVar, String str, awoq awoqVar) {
        super(2, awoqVar);
        this.h = picVar;
        this.i = plxVar;
        this.j = potVar;
        this.k = plbVar;
        this.l = z;
        this.m = pznVar;
        this.n = str;
    }

    @Override // defpackage.awpe
    public final awoq create(Object obj, awoq awoqVar) {
        return new phy(this.h, this.i, this.j, this.k, this.l, this.m, this.n, awoqVar);
    }

    @Override // defpackage.awqk
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((phy) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
    }

    /* JADX WARN: Code duplicated, block: B:115:0x024c  */
    /* JADX WARN: Code duplicated, block: B:125:0x0263  */
    /* JADX WARN: Code duplicated, block: B:178:0x0362  */
    /* JADX WARN: Code duplicated, block: B:180:0x0386  */
    /* JADX WARN: Code duplicated, block: B:181:0x038b  */
    /* JADX WARN: Code duplicated, block: B:184:0x0394  */
    /* JADX WARN: Code duplicated, block: B:187:0x039b  */
    /* JADX WARN: Code duplicated, block: B:188:0x03a0  */
    /* JADX WARN: Code duplicated, block: B:191:0x03b7  */
    /* JADX WARN: Code duplicated, block: B:194:0x03c3  */
    /* JADX WARN: Code duplicated, block: B:197:0x03ca  */
    /* JADX WARN: Code duplicated, block: B:199:0x03d8  */
    /* JADX WARN: Code duplicated, block: B:201:0x03e3  */
    /* JADX WARN: Code duplicated, block: B:203:0x03fd  */
    /* JADX WARN: Code duplicated, block: B:205:0x0403  */
    /* JADX WARN: Code duplicated, block: B:206:0x0408  */
    /* JADX WARN: Code duplicated, block: B:361:0x0696  */
    /* JADX WARN: Code duplicated, block: B:363:0x0699  */
    /* JADX WARN: Code duplicated, block: B:365:0x069c  */
    /* JADX WARN: Code duplicated, block: B:368:0x06a6 A[Catch: Exception -> 0x0747, TryCatch #3 {Exception -> 0x0747, blocks: (B:367:0x06a1, B:394:0x06ed, B:396:0x0701, B:400:0x0708, B:404:0x0714, B:405:0x072c, B:406:0x0746, B:368:0x06a6, B:370:0x06ac, B:373:0x06b5, B:375:0x06bd, B:378:0x06c5, B:380:0x06c9, B:382:0x06cd, B:386:0x06d4, B:388:0x06dc, B:390:0x06e4), top: B:590:0x06a1 }] */
    /* JADX WARN: Code duplicated, block: B:373:0x06b5 A[Catch: Exception -> 0x0747, TryCatch #3 {Exception -> 0x0747, blocks: (B:367:0x06a1, B:394:0x06ed, B:396:0x0701, B:400:0x0708, B:404:0x0714, B:405:0x072c, B:406:0x0746, B:368:0x06a6, B:370:0x06ac, B:373:0x06b5, B:375:0x06bd, B:378:0x06c5, B:380:0x06c9, B:382:0x06cd, B:386:0x06d4, B:388:0x06dc, B:390:0x06e4), top: B:590:0x06a1 }] */
    /* JADX WARN: Code duplicated, block: B:378:0x06c5 A[Catch: Exception -> 0x0747, TryCatch #3 {Exception -> 0x0747, blocks: (B:367:0x06a1, B:394:0x06ed, B:396:0x0701, B:400:0x0708, B:404:0x0714, B:405:0x072c, B:406:0x0746, B:368:0x06a6, B:370:0x06ac, B:373:0x06b5, B:375:0x06bd, B:378:0x06c5, B:380:0x06c9, B:382:0x06cd, B:386:0x06d4, B:388:0x06dc, B:390:0x06e4), top: B:590:0x06a1 }] */
    /* JADX WARN: Code duplicated, block: B:385:0x06d3  */
    /* JADX WARN: Code duplicated, block: B:393:0x06ec  */
    /* JADX WARN: Code duplicated, block: B:396:0x0701 A[Catch: Exception -> 0x0747, TryCatch #3 {Exception -> 0x0747, blocks: (B:367:0x06a1, B:394:0x06ed, B:396:0x0701, B:400:0x0708, B:404:0x0714, B:405:0x072c, B:406:0x0746, B:368:0x06a6, B:370:0x06ac, B:373:0x06b5, B:375:0x06bd, B:378:0x06c5, B:380:0x06c9, B:382:0x06cd, B:386:0x06d4, B:388:0x06dc, B:390:0x06e4), top: B:590:0x06a1 }] */
    /* JADX WARN: Code duplicated, block: B:398:0x0705  */
    /* JADX WARN: Code duplicated, block: B:399:0x0707  */
    /* JADX WARN: Code duplicated, block: B:402:0x0711  */
    /* JADX WARN: Code duplicated, block: B:403:0x0713  */
    /* JADX WARN: Code duplicated, block: B:405:0x072c A[Catch: Exception -> 0x0747, TryCatch #3 {Exception -> 0x0747, blocks: (B:367:0x06a1, B:394:0x06ed, B:396:0x0701, B:400:0x0708, B:404:0x0714, B:405:0x072c, B:406:0x0746, B:368:0x06a6, B:370:0x06ac, B:373:0x06b5, B:375:0x06bd, B:378:0x06c5, B:380:0x06c9, B:382:0x06cd, B:386:0x06d4, B:388:0x06dc, B:390:0x06e4), top: B:590:0x06a1 }] */
    /* JADX WARN: Code duplicated, block: B:414:0x0759  */
    /* JADX WARN: Code duplicated, block: B:416:0x0765  */
    /* JADX WARN: Code duplicated, block: B:418:0x076e  */
    /* JADX WARN: Code duplicated, block: B:420:0x0776  */
    /* JADX WARN: Code duplicated, block: B:423:0x077c  */
    /* JADX WARN: Code duplicated, block: B:425:0x077f  */
    /* JADX WARN: Code duplicated, block: B:426:0x0781  */
    /* JADX WARN: Code duplicated, block: B:427:0x0783  */
    /* JADX WARN: Code duplicated, block: B:498:0x08c2 A[PHI: r17
      0x08c2: PHI (r17v9 java.lang.Object) = (r17v7 java.lang.Object), (r17v7 java.lang.Object), (r17v7 java.lang.Object), (r17v10 java.lang.Object) binds: [B:528:0x0953, B:533:0x096a, B:535:0x0975, B:497:0x08b5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:499:0x08c5  */
    /* JADX WARN: Code duplicated, block: B:501:0x08e2 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:502:0x08e4  */
    /* JADX WARN: Code duplicated, block: B:505:0x08eb  */
    /* JADX WARN: Code duplicated, block: B:506:0x08f0  */
    /* JADX WARN: Code duplicated, block: B:509:0x08f7  */
    /* JADX WARN: Code duplicated, block: B:510:0x0901  */
    /* JADX WARN: Code duplicated, block: B:512:0x0907  */
    /* JADX WARN: Code duplicated, block: B:515:0x091e  */
    /* JADX WARN: Code duplicated, block: B:518:0x0926  */
    /* JADX WARN: Code duplicated, block: B:51:0x0145  */
    /* JADX WARN: Code duplicated, block: B:520:0x0929  */
    /* JADX WARN: Code duplicated, block: B:521:0x092e  */
    /* JADX WARN: Code duplicated, block: B:524:0x0940  */
    /* JADX WARN: Code duplicated, block: B:525:0x094d  */
    /* JADX WARN: Code duplicated, block: B:527:0x0950  */
    /* JADX WARN: Code duplicated, block: B:529:0x0955 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:530:0x0957  */
    /* JADX WARN: Code duplicated, block: B:531:0x095c  */
    /* JADX WARN: Code duplicated, block: B:534:0x096c  */
    /* JADX WARN: Code duplicated, block: B:536:0x0977  */
    /* JADX WARN: Code duplicated, block: B:537:0x0996 A[PHI: r2 r17
      0x0996: PHI (r2v34 ??) = (r2v30 ??), (r2v35 ??) binds: [B:526:0x094e, B:496:0x08b3] A[DONT_GENERATE, DONT_INLINE]
      0x0996: PHI (r17v8 java.lang.Object) = (r17v7 java.lang.Object), (r17v10 java.lang.Object) binds: [B:526:0x094e, B:496:0x08b3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:539:0x0999  */
    /* JADX WARN: Code duplicated, block: B:542:0x09a2  */
    /* JADX WARN: Code duplicated, block: B:545:0x09e2  */
    /* JADX WARN: Code duplicated, block: B:549:0x09f2  */
    /* JADX WARN: Code duplicated, block: B:551:0x09f6  */
    /* JADX WARN: Code duplicated, block: B:554:0x09fc  */
    /* JADX WARN: Code duplicated, block: B:555:0x0a05  */
    /* JADX WARN: Code duplicated, block: B:557:0x0a09  */
    /* JADX WARN: Code duplicated, block: B:560:0x0a16  */
    /* JADX WARN: Code duplicated, block: B:561:0x0a1b  */
    /* JADX WARN: Code duplicated, block: B:564:0x0a2e  */
    /* JADX WARN: Code duplicated, block: B:567:0x0a3b  */
    /* JADX WARN: Code duplicated, block: B:568:0x0a40  */
    /* JADX WARN: Code duplicated, block: B:571:0x0a6a  */
    /* JADX WARN: Code duplicated, block: B:576:0x0a7e  */
    /* JADX WARN: Code duplicated, block: B:578:0x0a96  */
    /* JADX WARN: Code duplicated, block: B:581:0x0aa3  */
    /* JADX WARN: Code duplicated, block: B:590:0x06a1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:602:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:603:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:86:0x020a  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v133 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v145 */
    /* JADX WARN: Type inference failed for: r0v146, types: [auu, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v147 */
    /* JADX WARN: Type inference failed for: r0v152 */
    /* JADX WARN: Type inference failed for: r0v153, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v154 */
    /* JADX WARN: Type inference failed for: r0v155 */
    /* JADX WARN: Type inference failed for: r0v159 */
    /* JADX WARN: Type inference failed for: r0v26 */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r2v30 */
    /* JADX WARN: Type inference failed for: r2v33 */
    /* JADX WARN: Type inference failed for: r2v34 */
    /* JADX WARN: Type inference failed for: r2v35, types: [auo] */
    /* JADX WARN: Type inference failed for: r2v44 */
    /* JADX WARN: Type inference failed for: r2v45 */
    /* JADX WARN: Type inference failed for: r4v5, types: [int] */
    /* JADX WARN: Type inference failed for: r4v52 */
    /* JADX WARN: Type inference failed for: r4v57 */
    /* JADX WARN: Type inference failed for: r6v28, types: [atr] */
    /* JADX WARN: Type inference failed for: r7v89 */
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
    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) throws Throwable {
        boolean z;
        Object objA;
        Object obj2;
        ?? r4;
        String str;
        pgu pguVar;
        boolean z2;
        int i;
        Object obj3;
        ?? r0;
        Object obj4;
        Object next;
        Object obj5;
        Object obj6;
        Object obj7;
        pic picVar;
        plx plxVar;
        pot potVar;
        pzn pznVar;
        aidq aidqVar;
        int i2;
        Object obj8;
        Bitmap bitmap;
        Uri uri;
        List list;
        int i3;
        aidg aidgVar;
        atp atpVar;
        int iAS;
        int i4;
        String str2;
        ?? auoVar;
        int i5;
        aidg aidgVar2;
        String str3;
        String str4;
        ?? r1;
        Iterator it;
        Object obj9;
        auk auiVar;
        int i6;
        auk augVar;
        pky pkvVar;
        LocalDate localDate;
        int iAW;
        int i7;
        int i8;
        atyw atywVar;
        int i9;
        int i10;
        int i11;
        int i12;
        boolean zA;
        Integer numValueOf;
        Integer numValueOf2;
        Integer numValueOf3;
        boolean z3;
        boolean z4;
        boolean z5;
        pky pkvVar2;
        int i13;
        int i14;
        int i15;
        aul aulVar;
        Object obj10;
        Object obj11;
        Object obj12;
        Object obj13;
        Object objI;
        Bitmap bitmap2;
        RemoteViews remoteViews;
        aidq aidqVar2;
        aidg aidgVar3;
        aidf aidfVar;
        aide aideVar;
        int i16;
        int i17;
        ?? r2;
        ?? r3;
        Object objP;
        pic picVar2;
        plx plxVar2;
        aidq aidqVar3;
        Notification notification;
        String str5;
        aidp aidpVar;
        aidp aidpVar2;
        String str6;
        CharSequence string;
        aidp aidpVar3;
        String str7;
        CharSequence quantityString;
        Context context;
        atr atrVar;
        Integer num;
        phy phyVar = this;
        awox awoxVar = awox.a;
        int i18 = phyVar.g;
        if (i18 == 0) {
            atqp.j(obj);
            pic picVar3 = phyVar.h;
            plx plxVar3 = phyVar.i;
            pot potVar2 = phyVar.j;
            aidq aidqVar4 = potVar2.o;
            String str8 = aidqVar4.e;
            str8.getClass();
            if (str8.length() != 0 || nwa.a(aidqVar4)) {
                aidh aidhVar = (aidqVar4.c == 27 ? (aidn) aidqVar4.d : aidn.a).c;
                if (aidhVar == null) {
                    aidhVar = aidh.a;
                }
                String str9 = aidhVar.b;
                str9.getClass();
                if (str9.length() > 0) {
                    if ((aidqVar4.c == 27 ? (aidn) aidqVar4.d : aidn.a).d.isEmpty()) {
                        String str10 = potVar2.a;
                        paw pawVarA = picVar3.f.a(ahyy.INSUFFICIENT_DATA_NO_CONVERSATION_MESSAGES);
                        ((pbc) pawVarA).r = 2;
                        pawVarA.f(plxVar3);
                        pawVarA.b(potVar2);
                        pawVarA.a();
                        ((pwf) picVar3.g.io()).m(picVar3.b.getPackageName(), picVar3.c.a, Build.VERSION.SDK_INT, "INSUFFICIENT_DATA");
                    }
                }
                if (qnl.ac(picVar3.b)) {
                    aidf aidfVar2 = (aidqVar4.c == 7 ? (aidg) aidqVar4.d : aidg.a).h;
                    if (aidfVar2 == null) {
                        aidfVar2 = aidf.a;
                    }
                    if (a.aS(aidfVar2.b) == 3) {
                        z = true;
                    } else {
                        z = false;
                    }
                } else {
                    z = false;
                }
                pha phaVar = picVar3.i;
                plb plbVar = phyVar.k;
                phyVar.a = aidqVar4;
                phyVar.f = z ? 1 : 0;
                phyVar.g = 1;
                objA = phaVar.a(plxVar3, potVar2, plbVar, z, phyVar);
                r4 = z;
                obj2 = aidqVar4;
                if (objA == awoxVar) {
                    return awoxVar;
                }
            } else {
                String str11 = potVar2.a;
                paw pawVarA2 = picVar3.f.a(ahyy.INSUFFICIENT_DATA_NO_TITLE);
                ((pbc) pawVarA2).r = 2;
                pawVarA2.f(plxVar3);
                pawVarA2.b(potVar2);
                pawVarA2.a();
                ((pwf) picVar3.g.io()).m(picVar3.b.getPackageName(), picVar3.c.a, Build.VERSION.SDK_INT, "INSUFFICIENT_DATA");
            }
            ((agsj) pic.a.b()).B("Payload contains insufficient data to display the notification. Account ID [%s], ThreadId [%s].", plxVar3 != null ? new Long(plxVar3.a) : "NULL", potVar2.a);
            return null;
        }
        if (i18 == 1) {
            int i19 = phyVar.f;
            Object obj14 = phyVar.a;
            atqp.j(obj);
            r4 = i19;
            obj2 = obj14;
            objA = obj;
        } else if (i18 == 2) {
            int i20 = phyVar.f;
            Object obj15 = phyVar.d;
            Object obj16 = phyVar.c;
            Object obj17 = phyVar.b;
            Object obj18 = phyVar.a;
            atqp.j(obj);
            obj4 = obj15;
            obj3 = obj16;
            obj5 = obj18;
            r0 = i20;
            obj6 = obj17;
            obj7 = obj6;
            picVar = phyVar.h;
            plxVar = phyVar.i;
            potVar = phyVar.j;
            pznVar = phyVar.m;
            phyVar.a = obj5;
            phyVar.b = obj7;
            phyVar.c = obj3;
            phyVar.d = obj4;
            phyVar.g = 3;
            if (r0 != 0) {
                bitmap2 = (Bitmap) atqq.Z(((pgz) obj7).b);
                String packageName = picVar.b.getPackageName();
                packageName.getClass();
                remoteViews = new RemoteViews(packageName, R.layout.side_by_side_android_s_layout);
                aidqVar2 = (aidq) obj5;
                if (aidqVar2.c == 7) {
                    aidgVar3 = (aidg) aidqVar2.d;
                } else {
                    aidgVar3 = aidg.a;
                }
                aidgVar3.getClass();
                aidfVar = aidgVar3.h;
                if (aidfVar == null) {
                    aidfVar = aidf.a;
                }
                if (aidfVar.b == 2) {
                    aideVar = (aide) aidfVar.c;
                } else {
                    aideVar = aide.a;
                }
                aideVar.getClass();
                remoteViews.setTextViewText(R.id.expanded_notification_title, aidgVar3.b);
                remoteViews.setTextViewText(R.id.expanded_notification_body, aidgVar3.c);
                if (bitmap2 != null) {
                    remoteViews.setImageViewBitmap(R.id.expanded_notification_image, bitmap2);
                }
                i16 = aideVar.b;
                if (i16 > 0) {
                    remoteViews.setInt(R.id.expanded_notification_title, "setMaxLines", i16);
                }
                i17 = aideVar.c;
                if (i17 > 0) {
                    remoteViews.setInt(R.id.expanded_notification_body, "setMaxLines", i17);
                }
                ((atr) obj3).D = remoteViews;
                objI = new atw();
            } else {
                aidqVar = (aidq) obj5;
                if (!nwa.a(aidqVar)) {
                    pgz pgzVar = (pgz) obj7;
                    phyVar = this;
                    objI = picVar.g(plxVar, potVar, pznVar, aidqVar, pgzVar.e, pgzVar.f, pgzVar.g, (atr) obj3, this);
                } else {
                    if (nwc.b(aidqVar)) {
                        objI = picVar.i(aidqVar, plxVar, potVar, phyVar);
                    } else {
                        i2 = aidqVar.c;
                        if (i2 == 30 || !qnl.aa(37)) {
                            obj8 = obj4;
                            pgz pgzVar2 = (pgz) obj7;
                            bitmap = (Bitmap) atqq.Z(pgzVar2.b);
                            uri = (Uri) atqq.Y(pgzVar2.c.values());
                            list = pgzVar2.d;
                            if ((bitmap == null || uri != null) && (i3 = aidqVar.c) == 7) {
                                if (i3 == 7) {
                                    aidgVar = (aidg) aidqVar.d;
                                } else {
                                    aidgVar = aidg.a;
                                }
                                aidgVar.getClass();
                                if (bitmap != null) {
                                    atp atpVar2 = new atp();
                                    atpVar2.d(bitmap);
                                    atpVar = atpVar2;
                                } else if (a.aO()) {
                                    atp atpVar3 = new atp();
                                    atpVar3.a = aaj.g(Icon.createWithContentUri(uri));
                                    atpVar = atpVar3;
                                } else {
                                    auoVar = 0;
                                }
                                iAS = a.aS(aidgVar.f);
                                if (iAS == 0) {
                                    iAS = 1;
                                }
                                i4 = iAS - 1;
                                if (i4 == 1) {
                                    atpVar.c(picVar.c(aidqVar, list));
                                } else if (i4 == 2) {
                                    atpVar.c(null);
                                }
                                str2 = aidgVar.b;
                                str2.getClass();
                                auoVar = atpVar;
                                if (str2.length() > 0) {
                                    String str12 = aidgVar.b;
                                    str12.getClass();
                                    atpVar.e(nwc.a(str12));
                                }
                            } else {
                                auoVar = 0;
                            }
                            if (auoVar == 0) {
                                auoVar = atpVar;
                                i5 = aidqVar.c;
                                if (i5 != 7) {
                                    r1 = 0;
                                } else {
                                    if (i5 == 7) {
                                        aidgVar2 = (aidg) aidqVar.d;
                                    } else {
                                        aidgVar2 = aidg.a;
                                    }
                                    aidgVar2.getClass();
                                    str3 = aidgVar2.b;
                                    str3.getClass();
                                    if (str3.length() > 0) {
                                        str4 = aidgVar2.c;
                                        str4.getClass();
                                        if (str4.length() > 0) {
                                            atq atqVar = new atq();
                                            String str13 = aidgVar2.b;
                                            str13.getClass();
                                            atqVar.d(nwc.a(str13));
                                            String str14 = aidgVar2.c;
                                            str14.getClass();
                                            atqVar.c(nwc.a(str14));
                                            r1 = atqVar;
                                        } else {
                                            r1 = 0;
                                        }
                                    } else {
                                        r1 = 0;
                                    }
                                }
                            } else {
                                auoVar = atpVar;
                                r1 = auoVar;
                            }
                        } else {
                            aicv aicvVar = i2 == 30 ? (aicv) aidqVar.d : aicv.a;
                            aicvVar.getClass();
                            auoVar = new auo();
                            Iterator it2 = aicvVar.c.iterator();
                            while (it2.hasNext()) {
                                aicu aicuVar = (aicu) it2.next();
                                aicr aicrVar = aicuVar.b;
                                if (aicrVar == null) {
                                    aicrVar = aicr.a;
                                }
                                aicrVar.getClass();
                                int iOrdinal = aicq.a(aicrVar.b).ordinal();
                                if (iOrdinal == 0) {
                                    it = it2;
                                    obj9 = obj4;
                                    auiVar = new aui((aicrVar.b == 1 ? (aico) aicrVar.c : aico.a).b, null);
                                } else if (iOrdinal == 1) {
                                    it = it2;
                                    obj9 = obj4;
                                    aicn aicnVar = aicrVar.b == 2 ? (aicn) aicrVar.c : aicn.a;
                                    aicnVar.getClass();
                                    auiVar = (aicnVar.b & 2) != 0 ? new auh((int) aicnVar.c, aicnVar.d) : new auh((int) aicnVar.c, null);
                                } else if (iOrdinal != 2) {
                                    if (iOrdinal == 3) {
                                        it = it2;
                                        aicl aiclVar = aicrVar.b == 4 ? (aicl) aicrVar.c : aicl.a;
                                        aiclVar.getClass();
                                        atyw atywVar2 = aiclVar.b;
                                        if (atywVar2 == null) {
                                            atywVar2 = atyw.a;
                                        }
                                        atywVar2.getClass();
                                        pkx pkxVar = pkx.d;
                                        try {
                                            int i21 = atyy.a;
                                            int i22 = atywVar2.b;
                                            int i23 = atywVar2.c;
                                            int i24 = atywVar2.d;
                                            if (i22 == 0) {
                                                i9 = i23;
                                                i10 = 0;
                                            } else if (i23 == 0) {
                                                if (i24 == 0) {
                                                    i11 = 5;
                                                } else {
                                                    i10 = i22;
                                                    i9 = 0;
                                                }
                                                i12 = i11 - 1;
                                                obj9 = obj4;
                                                if (i12 == 0) {
                                                    zA = false;
                                                    numValueOf = Integer.valueOf(atywVar2.b);
                                                    numValueOf2 = Integer.valueOf(atywVar2.c);
                                                    numValueOf3 = Integer.valueOf(atywVar2.d);
                                                    if (zA) {
                                                        throw new IllegalArgumentException(ahno.E("Date is invalid. See type/date.proto definition for valid values. Year (%s) must be [1-9999], or 0 if specifying a month and day without a year. Month (%s) must be [1-12], or 0 if specifying a year without a month and day. Day (%s) must be [1-31] and valid for the year and month specified, or 0 if specifying a year or year and month without a day.", numValueOf, numValueOf2, numValueOf3));
                                                    }
                                                    if (atywVar2.b > 0) {
                                                        z3 = true;
                                                    } else {
                                                        z3 = false;
                                                    }
                                                    ahno.G(z3, "Year must be specified.");
                                                    if (atywVar2.d > 0) {
                                                        z4 = true;
                                                    } else {
                                                        z4 = false;
                                                    }
                                                    ahno.G(z4, "Day must be specified.");
                                                    LocalDate localDateOf = LocalDate.of(atywVar2.b, atywVar2.c, atywVar2.d);
                                                    localDateOf.getClass();
                                                    pkvVar = new pla(localDateOf);
                                                    localDate = (LocalDate) pkvVar.d();
                                                    if (localDate == null) {
                                                        agsj agsjVar = (agsj) pic.a.c();
                                                        atywVar = aiclVar.b;
                                                        if (atywVar == null) {
                                                            atywVar = atyw.a;
                                                        }
                                                        agsjVar.w("Failed to parse FixedDate value: %s", atywVar);
                                                    } else {
                                                        iAW = a.aW(aiclVar.c);
                                                        if (iAW == 0) {
                                                            iAW = 1;
                                                        }
                                                        i7 = iAW - 2;
                                                        if (i7 != 2) {
                                                            i8 = 1;
                                                        } else if (i7 != 3) {
                                                            i8 = 0;
                                                        } else {
                                                            i8 = 2;
                                                        }
                                                        augVar = new auf(localDate, i8);
                                                        auiVar = augVar;
                                                    }
                                                } else {
                                                    if (i12 != 1) {
                                                        if (i22 % 4 == 0 || (i22 % 100 == 0 && i22 % 400 != 0)) {
                                                            z5 = false;
                                                        } else {
                                                            z5 = true;
                                                        }
                                                        if (!atyy.a(i22, 9999) && atyy.a(i23, 12) && atyy.b(i24, i23, z5)) {
                                                            zA = true;
                                                        } else {
                                                            zA = false;
                                                        }
                                                    } else if (i12 == 2) {
                                                        if (i12 != 3) {
                                                            try {
                                                                zA = atyy.a(i22, 9999);
                                                            } catch (Exception e) {
                                                                e = e;
                                                                pkvVar = new pkv(e, pkxVar);
                                                            }
                                                        } else if (atyy.a(i22, 9999) || !atyy.a(i23, 12)) {
                                                            zA = false;
                                                        } else {
                                                            zA = true;
                                                        }
                                                    } else if (atyy.a(i23, 12) || !atyy.b(i24, i23, true)) {
                                                        zA = false;
                                                    } else {
                                                        zA = true;
                                                    }
                                                    numValueOf = Integer.valueOf(atywVar2.b);
                                                    numValueOf2 = Integer.valueOf(atywVar2.c);
                                                    numValueOf3 = Integer.valueOf(atywVar2.d);
                                                    if (zA) {
                                                        throw new IllegalArgumentException(ahno.E("Date is invalid. See type/date.proto definition for valid values. Year (%s) must be [1-9999], or 0 if specifying a month and day without a year. Month (%s) must be [1-12], or 0 if specifying a year without a month and day. Day (%s) must be [1-31] and valid for the year and month specified, or 0 if specifying a year or year and month without a day.", numValueOf, numValueOf2, numValueOf3));
                                                    }
                                                    if (atywVar2.b > 0) {
                                                        z3 = true;
                                                    } else {
                                                        z3 = false;
                                                    }
                                                    ahno.G(z3, "Year must be specified.");
                                                    if (atywVar2.d > 0) {
                                                        z4 = true;
                                                    } else {
                                                        z4 = false;
                                                    }
                                                    ahno.G(z4, "Day must be specified.");
                                                    LocalDate localDateOf2 = LocalDate.of(atywVar2.b, atywVar2.c, atywVar2.d);
                                                    localDateOf2.getClass();
                                                    pkvVar = new pla(localDateOf2);
                                                    localDate = (LocalDate) pkvVar.d();
                                                    if (localDate == null) {
                                                        agsj agsjVar2 = (agsj) pic.a.c();
                                                        atywVar = aiclVar.b;
                                                        if (atywVar == null) {
                                                            atywVar = atyw.a;
                                                        }
                                                        agsjVar2.w("Failed to parse FixedDate value: %s", atywVar);
                                                    } else {
                                                        iAW = a.aW(aiclVar.c);
                                                        if (iAW == 0) {
                                                            iAW = 1;
                                                        }
                                                        i7 = iAW - 2;
                                                        if (i7 != 2) {
                                                            i8 = 1;
                                                        } else if (i7 != 3) {
                                                            i8 = 0;
                                                        } else {
                                                            i8 = 2;
                                                        }
                                                        augVar = new auf(localDate, i8);
                                                        auiVar = augVar;
                                                    }
                                                }
                                            } else {
                                                i10 = i22;
                                                i9 = i23;
                                            }
                                            if (i10 == 0 && i9 != 0 && i24 != 0) {
                                                i11 = 3;
                                            } else if (i10 == 0 || i9 == 0 || i24 != 0) {
                                                i11 = (i10 == 0 || i9 == 0 || i24 == 0) ? 1 : 2;
                                            } else {
                                                i11 = 4;
                                            }
                                            i12 = i11 - 1;
                                            obj9 = obj4;
                                            if (i12 == 0) {
                                                zA = false;
                                                numValueOf = Integer.valueOf(atywVar2.b);
                                                numValueOf2 = Integer.valueOf(atywVar2.c);
                                                numValueOf3 = Integer.valueOf(atywVar2.d);
                                                if (zA) {
                                                    throw new IllegalArgumentException(ahno.E("Date is invalid. See type/date.proto definition for valid values. Year (%s) must be [1-9999], or 0 if specifying a month and day without a year. Month (%s) must be [1-12], or 0 if specifying a year without a month and day. Day (%s) must be [1-31] and valid for the year and month specified, or 0 if specifying a year or year and month without a day.", numValueOf, numValueOf2, numValueOf3));
                                                }
                                                if (atywVar2.b > 0) {
                                                    z3 = true;
                                                } else {
                                                    z3 = false;
                                                }
                                                ahno.G(z3, "Year must be specified.");
                                                if (atywVar2.d > 0) {
                                                    z4 = true;
                                                } else {
                                                    z4 = false;
                                                }
                                                ahno.G(z4, "Day must be specified.");
                                                LocalDate localDateOf3 = LocalDate.of(atywVar2.b, atywVar2.c, atywVar2.d);
                                                localDateOf3.getClass();
                                                pkvVar = new pla(localDateOf3);
                                                localDate = (LocalDate) pkvVar.d();
                                                if (localDate == null) {
                                                    agsj agsjVar3 = (agsj) pic.a.c();
                                                    atywVar = aiclVar.b;
                                                    if (atywVar == null) {
                                                        atywVar = atyw.a;
                                                    }
                                                    agsjVar3.w("Failed to parse FixedDate value: %s", atywVar);
                                                } else {
                                                    iAW = a.aW(aiclVar.c);
                                                    if (iAW == 0) {
                                                        iAW = 1;
                                                    }
                                                    i7 = iAW - 2;
                                                    if (i7 != 2) {
                                                        i8 = 1;
                                                    } else if (i7 != 3) {
                                                        i8 = 0;
                                                    } else {
                                                        i8 = 2;
                                                    }
                                                    augVar = new auf(localDate, i8);
                                                    auiVar = augVar;
                                                }
                                            } else {
                                                if (i12 != 1) {
                                                    if (i22 % 4 == 0) {
                                                        z5 = false;
                                                    } else {
                                                        z5 = false;
                                                    }
                                                    if (!atyy.a(i22, 9999)) {
                                                    }
                                                    zA = false;
                                                } else if (i12 == 2) {
                                                    if (atyy.a(i23, 12)) {
                                                    }
                                                    zA = false;
                                                } else if (i12 != 3) {
                                                    zA = atyy.a(i22, 9999);
                                                } else {
                                                    if (atyy.a(i22, 9999)) {
                                                    }
                                                    zA = false;
                                                }
                                                numValueOf = Integer.valueOf(atywVar2.b);
                                                numValueOf2 = Integer.valueOf(atywVar2.c);
                                                numValueOf3 = Integer.valueOf(atywVar2.d);
                                                if (zA) {
                                                    throw new IllegalArgumentException(ahno.E("Date is invalid. See type/date.proto definition for valid values. Year (%s) must be [1-9999], or 0 if specifying a month and day without a year. Month (%s) must be [1-12], or 0 if specifying a year without a month and day. Day (%s) must be [1-31] and valid for the year and month specified, or 0 if specifying a year or year and month without a day.", numValueOf, numValueOf2, numValueOf3));
                                                }
                                                if (atywVar2.b > 0) {
                                                    z3 = true;
                                                } else {
                                                    z3 = false;
                                                }
                                                ahno.G(z3, "Year must be specified.");
                                                if (atywVar2.d > 0) {
                                                    z4 = true;
                                                } else {
                                                    z4 = false;
                                                }
                                                ahno.G(z4, "Day must be specified.");
                                                LocalDate localDateOf4 = LocalDate.of(atywVar2.b, atywVar2.c, atywVar2.d);
                                                localDateOf4.getClass();
                                                pkvVar = new pla(localDateOf4);
                                                localDate = (LocalDate) pkvVar.d();
                                                if (localDate == null) {
                                                    agsj agsjVar4 = (agsj) pic.a.c();
                                                    atywVar = aiclVar.b;
                                                    if (atywVar == null) {
                                                        atywVar = atyw.a;
                                                    }
                                                    agsjVar4.w("Failed to parse FixedDate value: %s", atywVar);
                                                } else {
                                                    iAW = a.aW(aiclVar.c);
                                                    if (iAW == 0) {
                                                        iAW = 1;
                                                    }
                                                    i7 = iAW - 2;
                                                    if (i7 != 2) {
                                                        i8 = 1;
                                                    } else if (i7 != 3) {
                                                        i8 = 0;
                                                    } else {
                                                        i8 = 2;
                                                    }
                                                    augVar = new auf(localDate, i8);
                                                    auiVar = augVar;
                                                }
                                            }
                                        } catch (Exception e2) {
                                            e = e2;
                                            obj9 = obj4;
                                        }
                                    } else if (iOrdinal != 4) {
                                        if (iOrdinal != 5) {
                                            ((agsj) pic.a.c()).w("Unsupported MetricValue case: %s", aicq.a(aicrVar.b));
                                        } else {
                                            aict aictVar = aicrVar.b == 6 ? (aict) aicrVar.c : aict.a;
                                            aictVar.getClass();
                                            int iAT = a.aT(aictVar.d);
                                            if (iAT == 0) {
                                                iAT = 1;
                                            }
                                            int i25 = iAT + (-2) != 2 ? 1 : 2;
                                            int iOrdinal2 = aics.a(aictVar.b).ordinal();
                                            if (iOrdinal2 == 0) {
                                                aijp aijpVar = aictVar.b == 2 ? (aijp) aictVar.c : aijp.a;
                                                aijpVar.getClass();
                                                Instant instantL = pic.l(aijpVar);
                                                if (instantL != null) {
                                                    aulVar = new aul(instantL, null, null, false, i25);
                                                    it = it2;
                                                    auiVar = aulVar;
                                                    obj9 = obj4;
                                                }
                                            } else if (iOrdinal2 == 1) {
                                                aijp aijpVar2 = aictVar.b == 3 ? (aijp) aictVar.c : aijp.a;
                                                aijpVar2.getClass();
                                                Instant instantL2 = pic.l(aijpVar2);
                                                if (instantL2 != null) {
                                                    aulVar = new aul(instantL2, null, null, true, i25);
                                                    it = it2;
                                                    auiVar = aulVar;
                                                    obj9 = obj4;
                                                }
                                            } else if (iOrdinal2 == 2) {
                                                aigu aiguVar = aictVar.b == 4 ? (aigu) aictVar.c : aigu.a;
                                                aiguVar.getClass();
                                                Duration durationK = pic.k(aiguVar);
                                                if (durationK != null) {
                                                    aulVar = new aul(null, null, durationK, false, i25);
                                                    it = it2;
                                                    auiVar = aulVar;
                                                    obj9 = obj4;
                                                }
                                            } else if (iOrdinal2 != 3) {
                                                ((agsj) pic.a.c()).w("Unsupported TimeDifference typeCase: %s", aics.a(aictVar.b));
                                            } else {
                                                aigu aiguVar2 = aictVar.b == 5 ? (aigu) aictVar.c : aigu.a;
                                                aiguVar2.getClass();
                                                Duration durationK2 = pic.k(aiguVar2);
                                                if (durationK2 != null) {
                                                    aulVar = new aul(null, null, durationK2, true, i25);
                                                    it = it2;
                                                    auiVar = aulVar;
                                                    obj9 = obj4;
                                                }
                                            }
                                        }
                                        it = it2;
                                        obj9 = obj4;
                                    } else {
                                        aicp aicpVar = aicrVar.b == 5 ? (aicp) aicrVar.c : aicp.a;
                                        aicpVar.getClass();
                                        atyx atyxVar = aicpVar.b;
                                        if (atyxVar == null) {
                                            atyxVar = atyx.a;
                                        }
                                        atyxVar.getClass();
                                        pkx pkxVar2 = pkx.d;
                                        try {
                                            int i26 = atza.a;
                                            int i27 = atyxVar.b;
                                            boolean z6 = i27 >= 0 && i27 <= 23 && (i13 = atyxVar.c) >= 0 && i13 <= 59 && (i14 = atyxVar.d) >= 0 && i14 <= 59 && (i15 = atyxVar.e) >= 0 && i15 <= 999999999;
                                            it = it2;
                                            try {
                                                Object[] objArr = {23, 59, 59, 999999999, Integer.valueOf(atyxVar.b), Integer.valueOf(atyxVar.c), Integer.valueOf(atyxVar.d), Integer.valueOf(atyxVar.e)};
                                                if (!z6) {
                                                    throw new IllegalArgumentException(ahno.E("Proto TimeOfDay argument is invalid. The class required: 0 <= hours <= %s, 0 <= minutes <= %s, 0 <= seconds <= %s, 0 <= nanos <= %s. Received: hours = %s, minutes = %s, seconds = %s, nanos = %s.", objArr));
                                                }
                                                LocalTime localTimeOf = LocalTime.of(atyxVar.b, atyxVar.c, atyxVar.d, atyxVar.e);
                                                localTimeOf.getClass();
                                                pkvVar2 = new pla(localTimeOf);
                                                LocalTime localTime = (LocalTime) pkvVar2.d();
                                                if (localTime == null) {
                                                    agsj agsjVar5 = (agsj) pic.a.c();
                                                    atyx atyxVar2 = aicpVar.b;
                                                    if (atyxVar2 == null) {
                                                        atyxVar2 = atyx.a;
                                                    }
                                                    agsjVar5.w("Failed to parse FixedTime value: %s", atyxVar2);
                                                    obj9 = obj4;
                                                } else {
                                                    auiVar = new auj(localTime);
                                                    obj9 = obj4;
                                                }
                                            } catch (Exception e3) {
                                                e = e3;
                                                pkvVar2 = new pkv(e, pkxVar2);
                                            }
                                        } catch (Exception e4) {
                                            e = e4;
                                            it = it2;
                                        }
                                    }
                                    auiVar = null;
                                } else {
                                    it = it2;
                                    obj9 = obj4;
                                    aicm aicmVar = aicrVar.b == 3 ? (aicm) aicrVar.c : aicm.a;
                                    aicmVar.getClass();
                                    String str15 = aicmVar.d;
                                    if ((aicmVar.b & 2) == 0) {
                                        str15 = null;
                                    }
                                    Integer numValueOf4 = Integer.valueOf(aicmVar.e);
                                    numValueOf4.intValue();
                                    if ((aicmVar.b & 4) == 0) {
                                        numValueOf4 = null;
                                    }
                                    Integer numValueOf5 = Integer.valueOf(aicmVar.f);
                                    numValueOf5.intValue();
                                    if ((aicmVar.b & 8) == 0) {
                                        numValueOf5 = null;
                                    }
                                    if (numValueOf4 == null && numValueOf5 == null) {
                                        augVar = new aug((float) aicmVar.c, str15, 0, 2);
                                        auiVar = augVar;
                                    } else {
                                        auiVar = new aug((float) aicmVar.c, str15, numValueOf4 != null ? numValueOf4.intValue() : 0, numValueOf5 != null ? numValueOf5.intValue() : 2);
                                    }
                                }
                                if (auiVar == null) {
                                    ((agsj) pic.a.c()).w("Skipping metric '%s' due to invalid or empty value.", aicuVar.c);
                                } else {
                                    String str16 = aicuVar.c;
                                    str16.getClass();
                                    int iBd = a.bd(aicuVar.d);
                                    if (iBd == 0) {
                                        iBd = 1;
                                    }
                                    int i28 = iBd - 2;
                                    if (i28 == 1) {
                                        i6 = 1;
                                    } else if (i28 == 2) {
                                        i6 = 2;
                                    } else if (i28 != 3) {
                                        i6 = i28 != 4 ? 0 : 4;
                                    } else {
                                        i6 = 3;
                                    }
                                    auoVar.g(new aum(auiVar, str16, i6));
                                }
                                obj4 = obj9;
                                it2 = it;
                            }
                            obj8 = obj4;
                            if ((aicvVar.b & 1) != 0) {
                                int i29 = aicvVar.d;
                                if (i29 < -1 || i29 >= auoVar.e().size()) {
                                    auoVar.e().size();
                                } else {
                                    auoVar.b = i29;
                                }
                            }
                            if (auoVar.e().isEmpty()) {
                                ((agsj) pic.a.c()).t("MetricStyle has no valid metrics, falling back.");
                                r1 = 0;
                            } else {
                                auoVar = atpVar;
                                r1 = auoVar;
                            }
                        }
                    }
                    if (r1 != awoxVar) {
                        return awoxVar;
                    }
                    obj10 = obj3;
                    obj11 = obj7;
                    obj12 = obj5;
                    obj13 = obj8;
                    r2 = r1;
                    r3 = (auu) r2;
                    if (r3 != 0) {
                        ((atr) obj10).r(r3);
                    }
                    pic picVar4 = phyVar.h;
                    String str17 = phyVar.n;
                    plx plxVar4 = phyVar.i;
                    pot potVar3 = phyVar.j;
                    pzn pznVar2 = phyVar.m;
                    phyVar.a = obj12;
                    phyVar.b = obj11;
                    phyVar.c = obj10;
                    phyVar.d = obj13;
                    phyVar.e = r3;
                    phyVar.g = 4;
                    objP = awro.p(picVar4.j, new pib(potVar3, picVar4, (atr) obj10, str17, plxVar4, pznVar2, (aidq) obj12, null), phyVar);
                    if (objP != awoxVar) {
                        objP = awmy.a;
                    }
                    if (objP == awoxVar) {
                        return awoxVar;
                    }
                }
            }
            obj8 = obj4;
            r1 = objI;
            if (r1 != awoxVar) {
                return awoxVar;
            }
            obj10 = obj3;
            obj11 = obj7;
            obj12 = obj5;
            obj13 = obj8;
            r2 = r1;
            r3 = (auu) r2;
            if (r3 != 0) {
                ((atr) obj10).r(r3);
            }
            pic picVar5 = phyVar.h;
            String str18 = phyVar.n;
            plx plxVar5 = phyVar.i;
            pot potVar4 = phyVar.j;
            pzn pznVar3 = phyVar.m;
            phyVar.a = obj12;
            phyVar.b = obj11;
            phyVar.c = obj10;
            phyVar.d = obj13;
            phyVar.e = r3;
            phyVar.g = 4;
            objP = awro.p(picVar5.j, new pib(potVar4, picVar5, (atr) obj10, str18, plxVar5, pznVar3, (aidq) obj12, null), phyVar);
            if (objP != awoxVar) {
                objP = awmy.a;
            }
            if (objP == awoxVar) {
                return awoxVar;
            }
        } else if (i18 != 3) {
            r3 = phyVar.e;
            obj13 = phyVar.d;
            obj10 = phyVar.c;
            obj11 = phyVar.b;
            obj12 = phyVar.a;
            atqp.j(obj);
        } else {
            Object obj19 = phyVar.d;
            Object obj20 = phyVar.c;
            Object obj21 = phyVar.b;
            Object obj22 = phyVar.a;
            atqp.j(obj);
            obj12 = obj22;
            obj11 = obj21;
            obj10 = obj20;
            obj13 = obj19;
            r2 = obj;
            r3 = (auu) r2;
            if (r3 != 0) {
                ((atr) obj10).r(r3);
            }
            pic picVar6 = phyVar.h;
            String str19 = phyVar.n;
            plx plxVar6 = phyVar.i;
            pot potVar5 = phyVar.j;
            pzn pznVar4 = phyVar.m;
            phyVar.a = obj12;
            phyVar.b = obj11;
            phyVar.c = obj10;
            phyVar.d = obj13;
            phyVar.e = r3;
            phyVar.g = 4;
            objP = awro.p(picVar6.j, new pib(potVar5, picVar6, (atr) obj10, str19, plxVar6, pznVar4, (aidq) obj12, null), phyVar);
            if (objP != awoxVar) {
                objP = awmy.a;
            }
            if (objP == awoxVar) {
                return awoxVar;
            }
        }
        picVar2 = phyVar.h;
        plxVar2 = phyVar.i;
        aidqVar3 = (aidq) obj12;
        if ((aidqVar3.b & SemanticState.Hidden) != 0) {
            aidpVar = aidqVar3.m;
            if (aidpVar == null) {
                aidpVar = aidp.a;
            }
            if (aidpVar.b) {
                ((atr) obj10).A = 1;
                notification = null;
            } else {
                aidpVar2 = aidqVar3.m;
                if (aidpVar2 == null) {
                    aidpVar2 = aidp.a;
                }
                str6 = aidpVar2.c;
                str6.getClass();
                if (str6.length() > 0) {
                    string = nwc.a(str6);
                } else {
                    string = picVar2.b.getString(picVar2.d().b);
                    string.getClass();
                }
                aidpVar3 = aidqVar3.m;
                if (aidpVar3 == null) {
                    aidpVar3 = aidp.a;
                }
                str7 = aidpVar3.d;
                str7.getClass();
                if (str7.length() > 0) {
                    quantityString = nwc.a(str7);
                } else {
                    quantityString = picVar2.b.getResources().getQuantityString(R.plurals.public_notification_text, 1);
                    quantityString.getClass();
                }
                context = picVar2.b;
                atrVar = new atr(context, null);
                atrVar.l(string);
                atrVar.k(quantityString);
                atrVar.q(picVar2.d().a);
                if (plxVar2 != null && pic.j(plxVar2)) {
                    atrVar.s(plxVar2.b);
                }
                num = picVar2.d().c;
                if (num != null) {
                    atrVar.z = context.getColor(num.intValue());
                }
                Notification notificationA = atrVar.a();
                notificationA.getClass();
                ((atr) obj10).B = notificationA;
                notification = notificationA;
            }
        } else {
            notification = null;
        }
        str5 = aidqVar3.j;
        str5.getClass();
        if (str5.length() > 0) {
            ((atr) obj10).x = aidqVar3.j;
        }
        atr atrVar2 = (atr) obj10;
        auu auuVar = (auu) r3;
        pic.h(atrVar2, auuVar, aidqVar3, (pgu) obj13);
        pgz pgzVar3 = (pgz) obj11;
        return new pzq(atrVar2, auuVar, notification, pgzVar3.h, pgzVar3.i);
        pic picVar7 = phyVar.h;
        pgz pgzVar4 = (pgz) objA;
        Context context2 = picVar7.b;
        atr atrVar3 = new atr(context2, null);
        aidq aidqVar5 = (aidq) obj2;
        String str20 = aidqVar5.e;
        str20.getClass();
        atrVar3.l(nwc.a(str20));
        String str21 = aidqVar5.f;
        str21.getClass();
        atrVar3.k(nwc.a(str21));
        int iBc = a.bc(aidqVar5.l);
        if (iBc == 0) {
            iBc = 1;
        }
        atrVar3.l = nwc.c(iBc);
        atrVar3.e(8, true);
        atrVar3.q(picVar7.d().a);
        plx plxVar7 = phyVar.i;
        pot potVar6 = phyVar.j;
        aidq aidqVar6 = potVar6.o;
        if ((aidqVar6.b & 131072) != 0) {
            str = aidqVar6.v;
        } else {
            str = (plxVar7 != null && pic.j(plxVar7) && picVar7.d().g) ? plxVar7.b : null;
        }
        if (str != null && str.length() != 0) {
            atrVar3.s(str);
        }
        String str22 = aidqVar5.p;
        str22.getClass();
        if (str22.length() > 0) {
            atrVar3.t(aidqVar5.p);
        }
        pgy pgyVar = picVar7.e;
        String strA = pgyVar.a(potVar6);
        if (strA != null) {
            Iterator it3 = pgyVar.c().iterator();
            do {
                if (!it3.hasNext()) {
                    next = null;
                    break;
                }
                next = it3.next();
            } while (!awrc.c(((pgv) next).a, strA));
            pgv pgvVar = (pgv) next;
            if (pgvVar != null) {
                pguVar = pgvVar.c;
            } else {
                pguVar = null;
            }
        } else {
            pguVar = null;
        }
        boolean z7 = pguVar == pgu.c || pguVar == pgu.f;
        aido aidoVar = aidqVar5.k;
        if (aidoVar == null) {
            aidoVar = aido.a;
        }
        if (aidoVar.f || z7) {
            atrVar3.e(16, false);
        } else {
            atrVar3.e(16, true);
        }
        aido aidoVar2 = aidqVar5.k;
        if (aidoVar2 == null) {
            aidoVar2 = aido.a;
        }
        if (aidoVar2.b) {
            atrVar3.e(2, true);
        }
        if (phyVar.l) {
            z2 = true;
        } else {
            aido aidoVar3 = aidqVar5.k;
            if (aidoVar3 == null) {
                aidoVar3 = aido.a;
            }
            if (aidoVar3.g) {
                z2 = true;
            } else {
                z2 = false;
            }
        }
        if (z2 || !picVar7.d().e) {
            atrVar3.u(null);
            i = 0;
        } else {
            aido aidoVar4 = aidqVar5.k;
            if (aidoVar4 == null) {
                aidoVar4 = aido.a;
            }
            if (aidoVar4.c) {
                atrVar3.u(null);
                i = 0;
            } else {
                i = 2;
            }
        }
        if (!z2 && picVar7.d().d) {
            aido aidoVar5 = aidqVar5.k;
            if (aidoVar5 == null) {
                aidoVar5 = aido.a;
            }
            if (!aidoVar5.d) {
                picVar7.d();
                i |= 1;
            }
        }
        if (!z2 && picVar7.d().f) {
            aido aidoVar6 = aidqVar5.k;
            if (aidoVar6 == null) {
                aidoVar6 = aido.a;
            }
            if (!aidoVar6.e) {
                picVar7.d();
                i |= 4;
            }
        }
        atrVar3.m(i);
        pgyVar.d(atrVar3, potVar6);
        if (z2) {
            atrVar3.H = 1;
        }
        if ((aidqVar5.b & SemanticState.Obscured) != 0) {
            atrVar3.z = aidqVar5.q;
        } else {
            Integer num2 = picVar7.d().c;
            if (num2 != null) {
                atrVar3.z = context2.getColor(num2.intValue());
            }
        }
        int iAU = a.aU(aidqVar5.u);
        if (iAU == 0 || iAU == 1) {
            long j = aidqVar5.h;
            if (j > 0) {
                atrVar3.v(j / 1000);
            }
        } else {
            long epochMilli = potVar6.h;
            if (epochMilli <= 0) {
                epochMilli = picVar7.h.f().toEpochMilli();
            }
            atrVar3.v(epochMilli);
        }
        if ((aidqVar5.b & 32768) != 0) {
            atrVar3.m = aidqVar5.t;
        }
        String str23 = aidqVar5.r;
        str23.getClass();
        if (str23.length() > 0) {
            atrVar3.v = aidqVar5.r;
        }
        Bitmap bitmapC = picVar7.c(aidqVar5, pgzVar4.a);
        if (bitmapC != null) {
            atrVar3.o(bitmapC);
        }
        awou awouVar = picVar7.j;
        phx phxVar = new phx(atrVar3, picVar7, phyVar.n, plxVar7, potVar6, phyVar.m, null);
        phyVar.a = obj2;
        phyVar.b = pgzVar4;
        phyVar.c = atrVar3;
        phyVar.d = pguVar;
        phyVar.f = r4;
        phyVar.g = 2;
        if (awro.p(awouVar, phxVar, phyVar) == awoxVar) {
            return awoxVar;
        }
        obj3 = atrVar3;
        r0 = r4;
        obj4 = pguVar;
        obj6 = pgzVar4;
        obj5 = obj2;
        obj7 = obj6;
        picVar = phyVar.h;
        plxVar = phyVar.i;
        potVar = phyVar.j;
        pznVar = phyVar.m;
        phyVar.a = obj5;
        phyVar.b = obj7;
        phyVar.c = obj3;
        phyVar.d = obj4;
        phyVar.g = 3;
        if (r0 != 0) {
            bitmap2 = (Bitmap) atqq.Z(((pgz) obj7).b);
            String packageName2 = picVar.b.getPackageName();
            packageName2.getClass();
            remoteViews = new RemoteViews(packageName2, R.layout.side_by_side_android_s_layout);
            aidqVar2 = (aidq) obj5;
            if (aidqVar2.c == 7) {
                aidgVar3 = (aidg) aidqVar2.d;
            } else {
                aidgVar3 = aidg.a;
            }
            aidgVar3.getClass();
            aidfVar = aidgVar3.h;
            if (aidfVar == null) {
                aidfVar = aidf.a;
            }
            if (aidfVar.b == 2) {
                aideVar = (aide) aidfVar.c;
            } else {
                aideVar = aide.a;
            }
            aideVar.getClass();
            remoteViews.setTextViewText(R.id.expanded_notification_title, aidgVar3.b);
            remoteViews.setTextViewText(R.id.expanded_notification_body, aidgVar3.c);
            if (bitmap2 != null) {
                remoteViews.setImageViewBitmap(R.id.expanded_notification_image, bitmap2);
            }
            i16 = aideVar.b;
            if (i16 > 0) {
                remoteViews.setInt(R.id.expanded_notification_title, "setMaxLines", i16);
            }
            i17 = aideVar.c;
            if (i17 > 0) {
                remoteViews.setInt(R.id.expanded_notification_body, "setMaxLines", i17);
            }
            ((atr) obj3).D = remoteViews;
            objI = new atw();
        } else {
            aidqVar = (aidq) obj5;
            if (!nwa.a(aidqVar)) {
                if (nwc.b(aidqVar)) {
                    objI = picVar.i(aidqVar, plxVar, potVar, phyVar);
                } else {
                    i2 = aidqVar.c;
                    if (i2 == 30) {
                        obj8 = obj4;
                        pgz pgzVar5 = (pgz) obj7;
                        bitmap = (Bitmap) atqq.Z(pgzVar5.b);
                        uri = (Uri) atqq.Y(pgzVar5.c.values());
                        list = pgzVar5.d;
                        if (bitmap == null) {
                            if (i3 == 7) {
                                aidgVar = (aidg) aidqVar.d;
                            } else {
                                aidgVar = aidg.a;
                            }
                            aidgVar.getClass();
                            if (bitmap != null) {
                                atp atpVar4 = new atp();
                                atpVar4.d(bitmap);
                                atpVar = atpVar4;
                            } else if (a.aO()) {
                                atp atpVar5 = new atp();
                                atpVar5.a = aaj.g(Icon.createWithContentUri(uri));
                                atpVar = atpVar5;
                            } else {
                                auoVar = 0;
                            }
                            iAS = a.aS(aidgVar.f);
                            if (iAS == 0) {
                                iAS = 1;
                            }
                            i4 = iAS - 1;
                            if (i4 == 1) {
                                atpVar.c(picVar.c(aidqVar, list));
                            } else if (i4 == 2) {
                                atpVar.c(null);
                            }
                            str2 = aidgVar.b;
                            str2.getClass();
                            auoVar = atpVar;
                            if (str2.length() > 0) {
                                String str110 = aidgVar.b;
                                str110.getClass();
                                atpVar.e(nwc.a(str110));
                            }
                        } else {
                            if (i3 == 7) {
                                aidgVar = (aidg) aidqVar.d;
                            } else {
                                aidgVar = aidg.a;
                            }
                            aidgVar.getClass();
                            if (bitmap != null) {
                                atp atpVar6 = new atp();
                                atpVar6.d(bitmap);
                                atpVar = atpVar6;
                            } else if (a.aO()) {
                                atp atpVar7 = new atp();
                                atpVar7.a = aaj.g(Icon.createWithContentUri(uri));
                                atpVar = atpVar7;
                            } else {
                                auoVar = 0;
                            }
                            iAS = a.aS(aidgVar.f);
                            if (iAS == 0) {
                                iAS = 1;
                            }
                            i4 = iAS - 1;
                            if (i4 == 1) {
                                atpVar.c(picVar.c(aidqVar, list));
                            } else if (i4 == 2) {
                                atpVar.c(null);
                            }
                            str2 = aidgVar.b;
                            str2.getClass();
                            auoVar = atpVar;
                            if (str2.length() > 0) {
                                String str111 = aidgVar.b;
                                str111.getClass();
                                atpVar.e(nwc.a(str111));
                            }
                        }
                        if (auoVar == 0) {
                            auoVar = atpVar;
                            i5 = aidqVar.c;
                            if (i5 != 7) {
                                r1 = 0;
                            } else {
                                if (i5 == 7) {
                                    aidgVar2 = (aidg) aidqVar.d;
                                } else {
                                    aidgVar2 = aidg.a;
                                }
                                aidgVar2.getClass();
                                str3 = aidgVar2.b;
                                str3.getClass();
                                if (str3.length() > 0) {
                                    str4 = aidgVar2.c;
                                    str4.getClass();
                                    if (str4.length() > 0) {
                                        atq atqVar2 = new atq();
                                        String str112 = aidgVar2.b;
                                        str112.getClass();
                                        atqVar2.d(nwc.a(str112));
                                        String str113 = aidgVar2.c;
                                        str113.getClass();
                                        atqVar2.c(nwc.a(str113));
                                        r1 = atqVar2;
                                    } else {
                                        r1 = 0;
                                    }
                                } else {
                                    r1 = 0;
                                }
                            }
                        } else {
                            auoVar = atpVar;
                            r1 = auoVar;
                        }
                    } else {
                        obj8 = obj4;
                        pgz pgzVar6 = (pgz) obj7;
                        bitmap = (Bitmap) atqq.Z(pgzVar6.b);
                        uri = (Uri) atqq.Y(pgzVar6.c.values());
                        list = pgzVar6.d;
                        if (bitmap == null) {
                            if (i3 == 7) {
                                aidgVar = (aidg) aidqVar.d;
                            } else {
                                aidgVar = aidg.a;
                            }
                            aidgVar.getClass();
                            if (bitmap != null) {
                                atp atpVar8 = new atp();
                                atpVar8.d(bitmap);
                                atpVar = atpVar8;
                            } else if (a.aO()) {
                                atp atpVar9 = new atp();
                                atpVar9.a = aaj.g(Icon.createWithContentUri(uri));
                                atpVar = atpVar9;
                            } else {
                                auoVar = 0;
                            }
                            iAS = a.aS(aidgVar.f);
                            if (iAS == 0) {
                                iAS = 1;
                            }
                            i4 = iAS - 1;
                            if (i4 == 1) {
                                atpVar.c(picVar.c(aidqVar, list));
                            } else if (i4 == 2) {
                                atpVar.c(null);
                            }
                            str2 = aidgVar.b;
                            str2.getClass();
                            auoVar = atpVar;
                            if (str2.length() > 0) {
                                String str114 = aidgVar.b;
                                str114.getClass();
                                atpVar.e(nwc.a(str114));
                            }
                        } else {
                            if (i3 == 7) {
                                aidgVar = (aidg) aidqVar.d;
                            } else {
                                aidgVar = aidg.a;
                            }
                            aidgVar.getClass();
                            if (bitmap != null) {
                                atp atpVar10 = new atp();
                                atpVar10.d(bitmap);
                                atpVar = atpVar10;
                            } else if (a.aO()) {
                                atp atpVar11 = new atp();
                                atpVar11.a = aaj.g(Icon.createWithContentUri(uri));
                                atpVar = atpVar11;
                            } else {
                                auoVar = 0;
                            }
                            iAS = a.aS(aidgVar.f);
                            if (iAS == 0) {
                                iAS = 1;
                            }
                            i4 = iAS - 1;
                            if (i4 == 1) {
                                atpVar.c(picVar.c(aidqVar, list));
                            } else if (i4 == 2) {
                                atpVar.c(null);
                            }
                            str2 = aidgVar.b;
                            str2.getClass();
                            auoVar = atpVar;
                            if (str2.length() > 0) {
                                String str115 = aidgVar.b;
                                str115.getClass();
                                atpVar.e(nwc.a(str115));
                            }
                        }
                        if (auoVar == 0) {
                            auoVar = atpVar;
                            i5 = aidqVar.c;
                            if (i5 != 7) {
                                r1 = 0;
                            } else {
                                if (i5 == 7) {
                                    aidgVar2 = (aidg) aidqVar.d;
                                } else {
                                    aidgVar2 = aidg.a;
                                }
                                aidgVar2.getClass();
                                str3 = aidgVar2.b;
                                str3.getClass();
                                if (str3.length() > 0) {
                                    str4 = aidgVar2.c;
                                    str4.getClass();
                                    if (str4.length() > 0) {
                                        atq atqVar3 = new atq();
                                        String str116 = aidgVar2.b;
                                        str116.getClass();
                                        atqVar3.d(nwc.a(str116));
                                        String str117 = aidgVar2.c;
                                        str117.getClass();
                                        atqVar3.c(nwc.a(str117));
                                        r1 = atqVar3;
                                    } else {
                                        r1 = 0;
                                    }
                                } else {
                                    r1 = 0;
                                }
                            }
                        } else {
                            auoVar = atpVar;
                            r1 = auoVar;
                        }
                    }
                }
                if (r1 != awoxVar) {
                    return awoxVar;
                }
                obj10 = obj3;
                obj11 = obj7;
                obj12 = obj5;
                obj13 = obj8;
                r2 = r1;
                r3 = (auu) r2;
                if (r3 != 0) {
                    ((atr) obj10).r(r3);
                }
                pic picVar8 = phyVar.h;
                String str118 = phyVar.n;
                plx plxVar8 = phyVar.i;
                pot potVar7 = phyVar.j;
                pzn pznVar5 = phyVar.m;
                phyVar.a = obj12;
                phyVar.b = obj11;
                phyVar.c = obj10;
                phyVar.d = obj13;
                phyVar.e = r3;
                phyVar.g = 4;
                objP = awro.p(picVar8.j, new pib(potVar7, picVar8, (atr) obj10, str118, plxVar8, pznVar5, (aidq) obj12, null), phyVar);
                if (objP != awoxVar) {
                    objP = awmy.a;
                }
                if (objP == awoxVar) {
                    return awoxVar;
                }
                picVar2 = phyVar.h;
                plxVar2 = phyVar.i;
                aidqVar3 = (aidq) obj12;
                if ((aidqVar3.b & SemanticState.Hidden) != 0) {
                    aidpVar = aidqVar3.m;
                    if (aidpVar == null) {
                        aidpVar = aidp.a;
                    }
                    if (aidpVar.b) {
                        ((atr) obj10).A = 1;
                        notification = null;
                    } else {
                        aidpVar2 = aidqVar3.m;
                        if (aidpVar2 == null) {
                            aidpVar2 = aidp.a;
                        }
                        str6 = aidpVar2.c;
                        str6.getClass();
                        if (str6.length() > 0) {
                            string = nwc.a(str6);
                        } else {
                            string = picVar2.b.getString(picVar2.d().b);
                            string.getClass();
                        }
                        aidpVar3 = aidqVar3.m;
                        if (aidpVar3 == null) {
                            aidpVar3 = aidp.a;
                        }
                        str7 = aidpVar3.d;
                        str7.getClass();
                        if (str7.length() > 0) {
                            quantityString = nwc.a(str7);
                        } else {
                            quantityString = picVar2.b.getResources().getQuantityString(R.plurals.public_notification_text, 1);
                            quantityString.getClass();
                        }
                        context = picVar2.b;
                        atrVar = new atr(context, null);
                        atrVar.l(string);
                        atrVar.k(quantityString);
                        atrVar.q(picVar2.d().a);
                        if (plxVar2 != null) {
                            atrVar.s(plxVar2.b);
                        }
                        num = picVar2.d().c;
                        if (num != null) {
                            atrVar.z = context.getColor(num.intValue());
                        }
                        Notification notificationA2 = atrVar.a();
                        notificationA2.getClass();
                        ((atr) obj10).B = notificationA2;
                        notification = notificationA2;
                    }
                } else {
                    notification = null;
                }
                str5 = aidqVar3.j;
                str5.getClass();
                if (str5.length() > 0) {
                    ((atr) obj10).x = aidqVar3.j;
                }
                atr atrVar4 = (atr) obj10;
                auu auuVar2 = (auu) r3;
                pic.h(atrVar4, auuVar2, aidqVar3, (pgu) obj13);
                pgz pgzVar7 = (pgz) obj11;
                return new pzq(atrVar4, auuVar2, notification, pgzVar7.h, pgzVar7.i);
            }
            pgz pgzVar8 = (pgz) obj7;
            phyVar = this;
            objI = picVar.g(plxVar, potVar, pznVar, aidqVar, pgzVar8.e, pgzVar8.f, pgzVar8.g, (atr) obj3, this);
        }
        obj8 = obj4;
        r1 = objI;
        if (r1 != awoxVar) {
            return awoxVar;
        }
        obj10 = obj3;
        obj11 = obj7;
        obj12 = obj5;
        obj13 = obj8;
        r2 = r1;
        r3 = (auu) r2;
        if (r3 != 0) {
            ((atr) obj10).r(r3);
        }
        pic picVar9 = phyVar.h;
        String str119 = phyVar.n;
        plx plxVar9 = phyVar.i;
        pot potVar8 = phyVar.j;
        pzn pznVar6 = phyVar.m;
        phyVar.a = obj12;
        phyVar.b = obj11;
        phyVar.c = obj10;
        phyVar.d = obj13;
        phyVar.e = r3;
        phyVar.g = 4;
        objP = awro.p(picVar9.j, new pib(potVar8, picVar9, (atr) obj10, str119, plxVar9, pznVar6, (aidq) obj12, null), phyVar);
        if (objP != awoxVar) {
            objP = awmy.a;
        }
        if (objP == awoxVar) {
            return awoxVar;
        }
        picVar2 = phyVar.h;
        plxVar2 = phyVar.i;
        aidqVar3 = (aidq) obj12;
        if ((aidqVar3.b & SemanticState.Hidden) != 0) {
            aidpVar = aidqVar3.m;
            if (aidpVar == null) {
                aidpVar = aidp.a;
            }
            if (aidpVar.b) {
                ((atr) obj10).A = 1;
                notification = null;
            } else {
                aidpVar2 = aidqVar3.m;
                if (aidpVar2 == null) {
                    aidpVar2 = aidp.a;
                }
                str6 = aidpVar2.c;
                str6.getClass();
                if (str6.length() > 0) {
                    string = nwc.a(str6);
                } else {
                    string = picVar2.b.getString(picVar2.d().b);
                    string.getClass();
                }
                aidpVar3 = aidqVar3.m;
                if (aidpVar3 == null) {
                    aidpVar3 = aidp.a;
                }
                str7 = aidpVar3.d;
                str7.getClass();
                if (str7.length() > 0) {
                    quantityString = nwc.a(str7);
                } else {
                    quantityString = picVar2.b.getResources().getQuantityString(R.plurals.public_notification_text, 1);
                    quantityString.getClass();
                }
                context = picVar2.b;
                atrVar = new atr(context, null);
                atrVar.l(string);
                atrVar.k(quantityString);
                atrVar.q(picVar2.d().a);
                if (plxVar2 != null) {
                    atrVar.s(plxVar2.b);
                }
                num = picVar2.d().c;
                if (num != null) {
                    atrVar.z = context.getColor(num.intValue());
                }
                Notification notificationA3 = atrVar.a();
                notificationA3.getClass();
                ((atr) obj10).B = notificationA3;
                notification = notificationA3;
            }
        } else {
            notification = null;
        }
        str5 = aidqVar3.j;
        str5.getClass();
        if (str5.length() > 0) {
            ((atr) obj10).x = aidqVar3.j;
        }
        atr atrVar5 = (atr) obj10;
        auu auuVar3 = (auu) r3;
        pic.h(atrVar5, auuVar3, aidqVar3, (pgu) obj13);
        pgz pgzVar9 = (pgz) obj11;
        return new pzq(atrVar5, auuVar3, notification, pgzVar9.h, pgzVar9.i);
    }
}
