package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.widget.RemoteViews;
import app.rive.semantics.SemanticState;
import com.google.android.apps.youtube.music.R;
import java.text.DateFormat;
import java.util.Locale;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class pzk implements pyt {
    private static final agsn b = agsn.h("GnpSdk");
    private final pha c;
    private final Context d;
    private final pav e;
    private final plt f;

    public pzk(pha phaVar, Context context, pls plsVar, pav pavVar) {
        phaVar.getClass();
        context.getClass();
        plsVar.getClass();
        pavVar.getClass();
        this.c = phaVar;
        this.d = context;
        this.e = pavVar;
        this.f = plsVar.c;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x005c  */
    private final Object f(plx plxVar, pot potVar, plb plbVar, awoq awoqVar) {
        pzg pzgVar;
        aidq aidqVar = potVar.o;
        aiet aietVar = aidqVar.x;
        if (aietVar == null) {
            aietVar = aiet.a;
        }
        boolean z = true;
        aidx aidxVar = aietVar.b == 1 ? (aidx) aietVar.c : aidx.a;
        aidxVar.getClass();
        if ((aidxVar.b & 1) == 0) {
            pzgVar = null;
        } else {
            aieg aiegVar = aidxVar.c;
            if (aiegVar == null) {
                aiegVar = aieg.a;
            }
            aiegVar.getClass();
            String str = aiegVar.b;
            str.getClass();
            if (str.length() == 0) {
                String str2 = aiegVar.d;
                str2.getClass();
                if (str2.length() == 0) {
                    pzgVar = null;
                }
            }
            awml awmlVarE = nqz.e(this.d, aidxVar);
            pzgVar = new pzg(aiegVar, ((Number) awmlVarE.a).intValue(), ((Number) awmlVarE.b).intValue());
        }
        if ((pzgVar != null ? pzgVar.a : null) == null) {
            return new pkv(new IllegalStateException("No image found in enlarged image template"), pkx.w);
        }
        pha phaVar = this.c;
        aieg aiegVar2 = pzgVar.a;
        int i = pzgVar.b;
        int i2 = pzgVar.c;
        if (!auuw.i() && !aidqVar.B) {
            z = false;
        }
        return phaVar.b(plxVar, aiegVar2, i, i2, z, plbVar, awoqVar);
    }

    private final void g(plx plxVar, pot potVar, String str) {
        ((agsj) b.c()).t(str);
        paw pawVarA = this.e.a(ahyy.FAILED_TO_APPLY_CUSTOMIZATION);
        pawVarA.f(plxVar);
        pawVarA.b(potVar);
        ((pbc) pawVarA).u = 2;
        pawVarA.a();
    }

    private final void h(RemoteViews remoteViews, int i, String str, pot potVar) {
        Integer numValueOf;
        Integer num;
        aidq aidqVar = potVar.o;
        if ((aidqVar.b & SemanticState.Obscured) != 0) {
            numValueOf = Integer.valueOf(aidqVar.q);
        } else {
            plt pltVar = this.f;
            if (pltVar == null || (num = pltVar.c) == null) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(this.d.getResources().getColor(num.intValue()));
            }
        }
        if (numValueOf != null) {
            remoteViews.setInt(i, str, numValueOf.intValue());
        }
    }

    private static final void i(aidg aidgVar, atp atpVar) {
        int iAS;
        boolean z = false;
        if (aidgVar.g.size() > 0 && (iAS = a.aS(aidgVar.f)) != 0 && iAS == 2) {
            z = true;
        }
        if (atpVar == null || z) {
            return;
        }
        atpVar.c(null);
    }

    @Override // defpackage.pyt
    public final int a() {
        return 1;
    }

    @Override // defpackage.pyt
    public final pot b(pot potVar) {
        potVar.getClass();
        if (qnl.ac(this.d)) {
            return potVar;
        }
        poo pooVar = new poo(potVar);
        pooVar.A(potVar.a);
        return pooVar.a();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.pyt
    public final Object c(plx plxVar, pot potVar, pzq pzqVar, plb plbVar, awoq awoqVar) throws Throwable {
        pzh pzhVar;
        int i;
        Object objE;
        atr atrVar;
        if (awoqVar instanceof pzh) {
            pzhVar = (pzh) awoqVar;
            int i2 = pzhVar.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pzhVar.c = i2 - Integer.MIN_VALUE;
            } else {
                pzhVar = new pzh(this, awoqVar);
            }
        } else {
            pzhVar = new pzh(this, awoqVar);
        }
        pzh pzhVar2 = pzhVar;
        Object obj = pzhVar2.a;
        Object obj2 = awox.a;
        int i3 = pzhVar2.c;
        if (i3 == 0) {
            atqp.j(obj);
            aiet aietVar = potVar.o.x;
            if (aietVar == null) {
                aietVar = aiet.a;
            }
            if (aietVar.b != 1) {
                i = 4;
            } else if (auuw.g()) {
                i = 2;
            } else {
                g(plxVar, potVar, "EnlargedImage flag is not enabled.");
                i = 1;
            }
            if (i != 2) {
                return nqy.g(i);
            }
            atr atrVar2 = pzqVar.a;
            if (qnl.ac(this.d)) {
                pzhVar2.d = atrVar2;
                pzhVar2.c = 1;
                objE = d(plxVar, potVar, pzqVar, plbVar, pzhVar2);
                if (objE == obj2) {
                    return obj2;
                }
            } else {
                pzhVar2.d = atrVar2;
                pzhVar2.c = 2;
                objE = e(plxVar, potVar, pzqVar, plbVar, pzhVar2);
                if (objE == obj2) {
                    return obj2;
                }
            }
            obj = objE;
            atrVar = atrVar2;
        } else {
            if (i3 != 1 && i3 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            atrVar = pzhVar2.d;
            atqp.j(obj);
        }
        pys pysVar = (pys) obj;
        if (pysVar != pys.a) {
            return pysVar;
        }
        ((Bundle) grj.o(atrVar).a).putInt("chime.richCollapsedView", 1);
        return pysVar;
    }

    /* JADX WARN: Code duplicated, block: B:56:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:57:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:61:0x0103  */
    /* JADX WARN: Code duplicated, block: B:63:0x0107  */
    /* JADX WARN: Code duplicated, block: B:68:0x0121  */
    /* JADX WARN: Code duplicated, block: B:69:0x0125  */
    /* JADX WARN: Code duplicated, block: B:71:0x0154  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object d(plx plxVar, pot potVar, pzq pzqVar, plb plbVar, awoq awoqVar) throws Throwable {
        pzi pziVar;
        atr atrVar;
        float f;
        aidg aidgVar;
        atp atpVar;
        atp atpVar2;
        aidg aidgVar2;
        Bitmap bitmap;
        aidf aidfVar;
        int i;
        pot potVar2 = potVar;
        if (awoqVar instanceof pzi) {
            pziVar = (pzi) awoqVar;
            int i2 = pziVar.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pziVar.d = i2 - Integer.MIN_VALUE;
            } else {
                pziVar = new pzi(this, awoqVar);
            }
        } else {
            pziVar = new pzi(this, awoqVar);
        }
        Object obj = pziVar.b;
        Object obj2 = awox.a;
        int i3 = pziVar.d;
        if (i3 == 0) {
            atqp.j(obj);
            atrVar = pzqVar.a;
            auu auuVar = pzqVar.b;
            aidq aidqVar = potVar2.o;
            aiet aietVar = aidqVar.x;
            if (aietVar == null) {
                aietVar = aiet.a;
            }
            aidx aidxVar = aietVar.b == 1 ? (aidx) aietVar.c : aidx.a;
            aidxVar.getClass();
            aieg aiegVar = aidxVar.c;
            if (aiegVar == null) {
                aiegVar = aieg.a;
            }
            aiegVar.getClass();
            f = aidxVar.d;
            aidgVar = aidqVar.c == 7 ? (aidg) aidqVar.d : aidg.a;
            aidgVar.getClass();
            atpVar = auuVar instanceof atp ? (atp) auuVar : null;
            if (nqz.f(aiegVar, f, aidgVar) && atpVar != null) {
                atpVar.b = true;
                i(aidgVar, atpVar);
                return pys.a;
            }
            if (auuw.h()) {
                bitmap = pzqVar.d;
            } else {
                pziVar.e = potVar2;
                pziVar.f = atrVar;
                pziVar.g = aidgVar;
                pziVar.h = atpVar;
                pziVar.a = f;
                pziVar.d = 1;
                Object objF = f(plxVar, potVar2, plbVar, pziVar);
                if (objF == obj2) {
                    return obj2;
                }
                atp atpVar3 = atpVar;
                obj = objF;
                atpVar2 = atpVar3;
                aidgVar2 = aidgVar;
            }
            if (bitmap == null) {
                ((agsj) b.c()).t("Image was not downloaded");
                return pys.c;
            }
            if (f > 0.0f || f >= 1.0f) {
                aidfVar = aidgVar.h;
                if (aidfVar == null) {
                    aidfVar = aidf.a;
                }
                if (a.aS(aidfVar.b) != 3) {
                    atrVar.o(bitmap);
                    i(aidgVar, atpVar);
                    return pys.a;
                }
            }
            atrVar.o(null);
            if (true != auuw.a.io().j()) {
                i = R.layout.singular_view_no_header_android_s_layout;
            } else {
                i = R.layout.singular_view_no_header_android_s_layout_line2;
            }
            String packageName = this.d.getPackageName();
            packageName.getClass();
            RemoteViews remoteViews = new RemoteViews(packageName, i);
            aidq aidqVar2 = potVar2.o;
            remoteViews.setTextViewText(R.id.notification_title, aidqVar2.e);
            remoteViews.setTextViewText(R.id.notification_text, aidqVar2.f);
            remoteViews.setImageViewBitmap(R.id.image, bitmap);
            atrVar.i(remoteViews);
            return pys.a;
        }
        if (i3 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        float f2 = pziVar.a;
        atpVar2 = pziVar.h;
        aidgVar2 = pziVar.g;
        atrVar = pziVar.f;
        pot potVar3 = pziVar.e;
        atqp.j(obj);
        f = f2;
        potVar2 = potVar3;
        pky pkyVar = (pky) obj;
        int iAu = a.au(pkyVar);
        if (iAu != 0) {
            if (iAu != 1) {
                throw new awmj();
            }
            pku pkuVar = (pku) pkyVar;
            ((agsj) ((agsj) b.c()).j(pkuVar.b())).t("Image was not downloaded");
            return pkuVar instanceof plc ? pys.d : pys.c;
        }
        Bitmap bitmap2 = (Bitmap) ((pla) pkyVar).a;
        atpVar = atpVar2;
        bitmap = bitmap2;
        aidgVar = aidgVar2;
        if (bitmap == null) {
            ((agsj) b.c()).t("Image was not downloaded");
            return pys.c;
        }
        if (f > 0.0f) {
            aidfVar = aidgVar.h;
            if (aidfVar == null) {
                aidfVar = aidf.a;
            }
            if (a.aS(aidfVar.b) != 3) {
                atrVar.o(bitmap);
                i(aidgVar, atpVar);
                return pys.a;
            }
        } else {
            aidfVar = aidgVar.h;
            if (aidfVar == null) {
                aidfVar = aidf.a;
            }
            if (a.aS(aidfVar.b) != 3) {
                atrVar.o(bitmap);
                i(aidgVar, atpVar);
                return pys.a;
            }
        }
        atrVar.o(null);
        if (true != auuw.a.io().j()) {
            i = R.layout.singular_view_no_header_android_s_layout;
        } else {
            i = R.layout.singular_view_no_header_android_s_layout_line2;
        }
        String packageName2 = this.d.getPackageName();
        packageName2.getClass();
        RemoteViews remoteViews2 = new RemoteViews(packageName2, i);
        aidq aidqVar3 = potVar2.o;
        remoteViews2.setTextViewText(R.id.notification_title, aidqVar3.e);
        remoteViews2.setTextViewText(R.id.notification_text, aidqVar3.f);
        remoteViews2.setImageViewBitmap(R.id.image, bitmap);
        atrVar.i(remoteViews2);
        return pys.a;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0288  */
    /* JADX WARN: Code duplicated, block: B:40:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:42:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:44:0x0101  */
    /* JADX WARN: Code duplicated, block: B:45:0x0107  */
    /* JADX WARN: Code duplicated, block: B:48:0x015b  */
    /* JADX WARN: Code duplicated, block: B:51:0x0166  */
    /* JADX WARN: Code duplicated, block: B:53:0x016b  */
    /* JADX WARN: Code duplicated, block: B:56:0x0178  */
    /* JADX WARN: Code duplicated, block: B:63:0x0193  */
    /* JADX WARN: Code duplicated, block: B:66:0x0199  */
    /* JADX WARN: Code duplicated, block: B:67:0x019e  */
    /* JADX WARN: Code duplicated, block: B:70:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:73:0x01ba A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:74:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:76:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:77:0x020b  */
    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    /* JADX WARN: Code duplicated, block: B:81:0x0244  */
    /* JADX WARN: Code duplicated, block: B:84:0x024a  */
    /* JADX WARN: Code duplicated, block: B:85:0x024f  */
    /* JADX WARN: Code duplicated, block: B:88:0x0255  */
    /* JADX WARN: Code duplicated, block: B:91:0x0265  */
    /* JADX WARN: Code duplicated, block: B:97:0x027b  */
    /* JADX WARN: Instruction removed from duplicated block: B:74:0x01bc, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:76:0x01ec, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:77:0x020b, please report this as an issue */
    public final Object e(plx plxVar, pot potVar, pzq pzqVar, plb plbVar, awoq awoqVar) throws Throwable {
        pzj pzjVar;
        pzq pzqVar2;
        Bitmap bitmap;
        pzl pzlVarE;
        Context context;
        float f;
        int i;
        float f2;
        RemoteViews remoteViews;
        plt pltVar;
        aidq aidqVar;
        long j;
        aiet aietVar;
        aidx aidxVar;
        aidw aidwVar;
        String str;
        int i2;
        atyv atyvVar;
        atyv atyvVar2;
        aiet aietVar2;
        aidx aidxVar2;
        int iAV;
        String string;
        int i3;
        CharSequence charSequence;
        pot potVar2 = potVar;
        if (awoqVar instanceof pzj) {
            pzjVar = (pzj) awoqVar;
            int i4 = pzjVar.c;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                pzjVar.c = i4 - Integer.MIN_VALUE;
            } else {
                pzjVar = new pzj(this, awoqVar);
            }
        } else {
            pzjVar = new pzj(this, awoqVar);
        }
        Object objF = pzjVar.a;
        Object obj = awox.a;
        int i5 = pzjVar.c;
        if (i5 == 0) {
            atqp.j(objF);
            int i6 = auuw.e().b;
            int iAS = a.aS(i6);
            if (iAS == 0 || iAS == 1) {
                g(plxVar, potVar2, "Enlarged image feature is unspecified for this device type.");
            } else {
                int iAS2 = a.aS(i6);
                if (iAS2 == 0 || iAS2 != 2) {
                    if (auuw.h()) {
                        bitmap = pzqVar.d;
                        pzqVar2 = pzqVar;
                    } else {
                        pzjVar.d = potVar2;
                        pzjVar.e = pzqVar;
                        pzjVar.c = 1;
                        objF = f(plxVar, potVar2, plbVar, pzjVar);
                        if (objF == obj) {
                            return obj;
                        }
                        pzqVar2 = pzqVar;
                    }
                    if (bitmap == null) {
                        ((agsj) b.c()).t("Image was not downloaded");
                        return pys.c;
                    }
                    String str2 = Build.MANUFACTURER;
                    str2.getClass();
                    Locale locale = Locale.US;
                    locale.getClass();
                    str2.toLowerCase(locale).getClass();
                    atr atrVar = pzqVar2.a;
                    pzlVarE = auuw.e();
                    atrVar.o(null);
                    int i7 = pzlVarE.f;
                    context = this.d;
                    int iE = nqy.e(i7, context);
                    int iE2 = nqy.e(pzlVarE.g, context);
                    int iE3 = nqy.e(pzlVarE.h, context);
                    float f3 = nqy.f(pzlVarE.e, context);
                    int iE4 = nqy.e(pzlVarE.j, context);
                    f = nqy.f(pzlVarE.i, context);
                    i = pzlVarE.k;
                    if (i != 0) {
                        f2 = nqy.f(i, context);
                    } else {
                        f2 = f;
                    }
                    int iE5 = nqy.e(pzlVarE.l, context);
                    String packageName = context.getPackageName();
                    packageName.getClass();
                    remoteViews = new RemoteViews(packageName, R.layout.singular_view_layout);
                    remoteViews.setViewPadding(R.id.notification_header, iE, iE2, 0, iE3);
                    remoteViews.setViewPadding(R.id.notification_title, iE4, 0, 0, iE5);
                    remoteViews.setViewPadding(R.id.notification_text, iE4, 0, 0, 0);
                    remoteViews.setTextViewTextSize(R.id.notification_header_title, 0, f3);
                    remoteViews.setTextViewTextSize(R.id.notification_header_timestamp, 0, f3);
                    remoteViews.setTextViewTextSize(R.id.notification_title, 0, f2);
                    remoteViews.setTextViewTextSize(R.id.notification_text, 0, f);
                    pltVar = this.f;
                    if (pltVar != null) {
                        remoteViews.setImageViewResource(R.id.notification_header_small_icon, pltVar.a);
                    }
                    if (pzlVarE.c) {
                        h(remoteViews, R.id.notification_header_small_icon, "setColorFilter", potVar2);
                    }
                    if (pltVar != null) {
                        remoteViews.setTextViewText(R.id.notification_header_title, context.getString(pltVar.b));
                    }
                    if (pzlVarE.d) {
                        h(remoteViews, R.id.notification_header_title, "setTextColor", potVar2);
                    }
                    aidqVar = potVar2.o;
                    j = aidqVar.h / 1000;
                    if (aidqVar.t && j != 0) {
                        aietVar2 = aidqVar.x;
                        if (aietVar2 == null) {
                            aietVar2 = aiet.a;
                        }
                        if (aietVar2.b == 1) {
                            aidxVar2 = (aidx) aietVar2.c;
                        } else {
                            aidxVar2 = aidx.a;
                        }
                        iAV = a.aV(aidxVar2.f);
                        if (iAV == 0) {
                            iAV = 1;
                        }
                        string = context.getString(R.string.notification_bullet);
                        string.getClass();
                        i3 = iAV - 1;
                        if (i3 != 2) {
                            charSequence = string + ' ' + DateFormat.getTimeInstance(3).format(Long.valueOf(j));
                        } else if (i3 != 3) {
                            DateFormat timeInstance = DateFormat.getTimeInstance(3);
                            Long lValueOf = Long.valueOf(j);
                            charSequence = string + ' ' + timeInstance.format(lValueOf) + ' ' + DateFormat.getDateInstance(3).format(lValueOf);
                        } else {
                            charSequence = string + ' ' + DateFormat.getDateInstance(3).format(Long.valueOf(j));
                        }
                        remoteViews.setTextViewText(R.id.notification_header_timestamp, charSequence);
                    }
                    remoteViews.setTextViewText(R.id.notification_title, aidqVar.e);
                    remoteViews.setTextViewText(R.id.notification_text, aidqVar.f);
                    remoteViews.setImageViewBitmap(R.id.image, bitmap);
                    aietVar = aidqVar.x;
                    if (aietVar == null) {
                        aietVar = aiet.a;
                    }
                    if (aietVar.b == 1) {
                        aidxVar = (aidx) aietVar.c;
                    } else {
                        aidxVar = aidx.a;
                    }
                    aidwVar = aidxVar.e;
                    if (aidwVar == null) {
                        aidwVar = aidw.a;
                    }
                    aidwVar.getClass();
                    str = aidwVar.c;
                    str.getClass();
                    if (str.length() > 0) {
                        i2 = aidwVar.b;
                        if ((i2 & 2) != 0 && (i2 & 4) != 0) {
                            remoteViews.setTextViewText(R.id.notification_image_badge_text, aidwVar.c);
                            atyvVar = aidwVar.d;
                            if (atyvVar == null) {
                                atyvVar = atyv.a;
                            }
                            remoteViews.setTextColor(R.id.notification_image_badge_text, nqw.d(atyvVar));
                            atyvVar2 = aidwVar.e;
                            if (atyvVar2 == null) {
                                atyvVar2 = atyv.a;
                            }
                            remoteViews.setInt(R.id.notification_image_badge_background, "setColorFilter", nqw.d(atyvVar2));
                            remoteViews.setViewVisibility(R.id.notification_image_badge, 0);
                        }
                    }
                    atrVar.i(remoteViews);
                    return pys.a;
                }
                g(plxVar, potVar2, "Enlarged image NESTED_VIEWS layout is not supported.");
            }
            return nqy.g(3);
        }
        if (i5 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        pzqVar2 = pzjVar.e;
        potVar2 = pzjVar.d;
        atqp.j(objF);
        pky pkyVar = (pky) objF;
        int iAu = a.au(pkyVar);
        if (iAu != 0) {
            if (iAu != 1) {
                throw new awmj();
            }
            pku pkuVar = (pku) pkyVar;
            ((agsj) ((agsj) b.c()).j(pkuVar.b())).t("Image was not downloaded");
            return pkuVar instanceof plc ? pys.d : pys.c;
        }
        bitmap = (Bitmap) ((pla) pkyVar).a;
        if (bitmap == null) {
            ((agsj) b.c()).t("Image was not downloaded");
            return pys.c;
        }
        String str3 = Build.MANUFACTURER;
        str3.getClass();
        Locale locale2 = Locale.US;
        locale2.getClass();
        str3.toLowerCase(locale2).getClass();
        atr atrVar2 = pzqVar2.a;
        pzlVarE = auuw.e();
        atrVar2.o(null);
        int i8 = pzlVarE.f;
        context = this.d;
        int iE6 = nqy.e(i8, context);
        int iE7 = nqy.e(pzlVarE.g, context);
        int iE8 = nqy.e(pzlVarE.h, context);
        float f4 = nqy.f(pzlVarE.e, context);
        int iE9 = nqy.e(pzlVarE.j, context);
        f = nqy.f(pzlVarE.i, context);
        i = pzlVarE.k;
        if (i != 0) {
            f2 = nqy.f(i, context);
        } else {
            f2 = f;
        }
        int iE10 = nqy.e(pzlVarE.l, context);
        String packageName2 = context.getPackageName();
        packageName2.getClass();
        remoteViews = new RemoteViews(packageName2, R.layout.singular_view_layout);
        remoteViews.setViewPadding(R.id.notification_header, iE6, iE7, 0, iE8);
        remoteViews.setViewPadding(R.id.notification_title, iE9, 0, 0, iE10);
        remoteViews.setViewPadding(R.id.notification_text, iE9, 0, 0, 0);
        remoteViews.setTextViewTextSize(R.id.notification_header_title, 0, f4);
        remoteViews.setTextViewTextSize(R.id.notification_header_timestamp, 0, f4);
        remoteViews.setTextViewTextSize(R.id.notification_title, 0, f2);
        remoteViews.setTextViewTextSize(R.id.notification_text, 0, f);
        pltVar = this.f;
        if (pltVar != null) {
            remoteViews.setImageViewResource(R.id.notification_header_small_icon, pltVar.a);
        }
        if (pzlVarE.c) {
            h(remoteViews, R.id.notification_header_small_icon, "setColorFilter", potVar2);
        }
        if (pltVar != null) {
            remoteViews.setTextViewText(R.id.notification_header_title, context.getString(pltVar.b));
        }
        if (pzlVarE.d) {
            h(remoteViews, R.id.notification_header_title, "setTextColor", potVar2);
        }
        aidqVar = potVar2.o;
        j = aidqVar.h / 1000;
        if (aidqVar.t) {
            aietVar2 = aidqVar.x;
            if (aietVar2 == null) {
                aietVar2 = aiet.a;
            }
            if (aietVar2.b == 1) {
                aidxVar2 = (aidx) aietVar2.c;
            } else {
                aidxVar2 = aidx.a;
            }
            iAV = a.aV(aidxVar2.f);
            if (iAV == 0) {
                iAV = 1;
            }
            string = context.getString(R.string.notification_bullet);
            string.getClass();
            i3 = iAV - 1;
            if (i3 != 2) {
                charSequence = string + ' ' + DateFormat.getTimeInstance(3).format(Long.valueOf(j));
            } else if (i3 != 3) {
                DateFormat timeInstance2 = DateFormat.getTimeInstance(3);
                Long lValueOf2 = Long.valueOf(j);
                charSequence = string + ' ' + timeInstance2.format(lValueOf2) + ' ' + DateFormat.getDateInstance(3).format(lValueOf2);
            } else {
                charSequence = string + ' ' + DateFormat.getDateInstance(3).format(Long.valueOf(j));
            }
            remoteViews.setTextViewText(R.id.notification_header_timestamp, charSequence);
        }
        remoteViews.setTextViewText(R.id.notification_title, aidqVar.e);
        remoteViews.setTextViewText(R.id.notification_text, aidqVar.f);
        remoteViews.setImageViewBitmap(R.id.image, bitmap);
        aietVar = aidqVar.x;
        if (aietVar == null) {
            aietVar = aiet.a;
        }
        if (aietVar.b == 1) {
            aidxVar = (aidx) aietVar.c;
        } else {
            aidxVar = aidx.a;
        }
        aidwVar = aidxVar.e;
        if (aidwVar == null) {
            aidwVar = aidw.a;
        }
        aidwVar.getClass();
        str = aidwVar.c;
        str.getClass();
        if (str.length() > 0) {
            i2 = aidwVar.b;
            if ((i2 & 2) != 0) {
                remoteViews.setTextViewText(R.id.notification_image_badge_text, aidwVar.c);
                atyvVar = aidwVar.d;
                if (atyvVar == null) {
                    atyvVar = atyv.a;
                }
                remoteViews.setTextColor(R.id.notification_image_badge_text, nqw.d(atyvVar));
                atyvVar2 = aidwVar.e;
                if (atyvVar2 == null) {
                    atyvVar2 = atyv.a;
                }
                remoteViews.setInt(R.id.notification_image_badge_background, "setColorFilter", nqw.d(atyvVar2));
                remoteViews.setViewVisibility(R.id.notification_image_badge, 0);
            }
        }
        atrVar2.i(remoteViews);
        return pys.a;
    }
}
