package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.net.Uri;
import android.os.Build;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.emoji.widget.EmojiTextView;
import com.google.android.apps.youtube.music.R;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class vgp extends vhf implements View.OnClickListener {
    private EmojiTextView A;
    public final FrameLayout s;
    public final ImageView t;
    public Bitmap u;
    public final vhg v;
    private final vic x;
    private final bog y;
    private aqcr z;

    public vgp(View view, vhg vhgVar, vic vicVar, bog bogVar) {
        super(view);
        this.s = (FrameLayout) view.findViewById(R.id.dynamic_sticker_container);
        this.t = (ImageView) view.findViewById(R.id.sticker);
        this.v = vhgVar;
        this.x = vicVar;
        this.y = bogVar;
    }

    private final View E(Context context, int i, int i2) {
        View viewInflate = LayoutInflater.from(new ContextThemeWrapper(context, i2)).inflate(i, new FrameLayout(context));
        TextView textView = (TextView) viewInflate.findViewById(R.id.text);
        alay alayVar = this.z.d;
        if (alayVar == null) {
            alayVar = alay.a;
        }
        Spanned spannedK = ackj.k(null, alayVar, null, false);
        textView.setText(spannedK);
        textView.setAllCaps(true);
        this.t.setContentDescription(spannedK != null ? spannedK.toString() : "");
        return viewInflate;
    }

    private final void F(aqcr aqcrVar) {
        vhg vhgVar = this.v;
        if (vhgVar.z() != null) {
            vhgVar.z().o(ameb.INTERACTION_LOGGING_GESTURE_TYPE_GENERIC_CLICK, yno.fh(aqcrVar), null);
        }
    }

    private final void G(aqcr aqcrVar) {
        alay alayVar = aqcrVar.d;
        if (alayVar == null) {
            alayVar = alay.a;
        }
        ImageView imageView = this.t;
        Spanned spannedK = ackj.k(null, alayVar, null, false);
        imageView.setContentDescription(spannedK != null ? spannedK.toString() : "");
    }

    @Override // defpackage.vhf
    public final void C() {
        apji apjiVar = this.w;
        aihl aihlVar = aqct.b;
        aihl aihlVarCheckIsLite = aihn.checkIsLite(aihlVar);
        apjiVar.c(aihlVarCheckIsLite);
        if (!apjiVar.j.n(aihlVarCheckIsLite.d)) {
            throw new IllegalArgumentException("renderer missing");
        }
        apji apjiVar2 = this.w;
        aihl aihlVarCheckIsLite2 = aihn.checkIsLite(aihlVar);
        apjiVar2.c(aihlVarCheckIsLite2);
        Object objK = apjiVar2.j.k(aihlVarCheckIsLite2.d);
        this.z = (aqcr) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK));
        ImageView imageView = this.t;
        Context context = imageView.getContext();
        int i = this.z.c;
        int iBi = a.bi(i);
        if (iBi == 0) {
            iBi = 1;
        }
        switch (iBi - 1) {
            case 1:
                Bitmap bitmapFu = yno.fu(context, E(context, R.layout.location_sticker, ((Integer) vgw.a.get(vgw.b)).intValue()));
                this.u = bitmapFu;
                imageView.setImageBitmap(bitmapFu);
                break;
            case 2:
                View viewE = E(context, R.layout.user_mention_sticker, ((Integer) vho.a.get(vho.b)).intValue());
                ((ImageView) viewE.findViewById(R.id.icon)).getDrawable().setTint(this.v.h.c.getColor(R.color.yt_dark_blue));
                Bitmap bitmapFu2 = yno.fu(context, viewE);
                this.u = bitmapFu2;
                imageView.setImageBitmap(bitmapFu2);
                break;
            case 3:
                EmojiTextView emojiTextView = this.A;
                if (emojiTextView == null) {
                    emojiTextView = (EmojiTextView) ((ViewStub) this.s.findViewById(R.id.unicode_emoji_sticker_stub)).inflate();
                    this.A = emojiTextView;
                }
                emojiTextView.setTextSize(1, (int) (Math.min(this.s.getLayoutParams().height - (context.getResources().getDimensionPixelSize(R.dimen.unicode_emoji_sticker_padding) << 1), context.getResources().getDimensionPixelSize(R.dimen.dynamic_sticker_max_height)) / context.getResources().getDisplayMetrics().scaledDensity));
                EmojiTextView emojiTextView2 = this.A;
                alay alayVar = this.z.d;
                if (alayVar == null) {
                    alayVar = alay.a;
                }
                emojiTextView2.setText(ackj.k(null, alayVar, null, false));
                break;
            case 4:
                View viewInflate = LayoutInflater.from(context).inflate(R.layout.date_sticker, new FrameLayout(context));
                ((TextView) viewInflate.findViewById(R.id.date)).setText(new SimpleDateFormat("d", Locale.getDefault()).format(new Date()));
                Bitmap bitmapFu3 = yno.fu(context, viewInflate);
                this.u = bitmapFu3;
                imageView.setImageBitmap(bitmapFu3);
                G(this.z);
                break;
            case 5:
                View viewInflate2 = LayoutInflater.from(context).inflate(R.layout.time_sticker, new FrameLayout(context));
                ((TextView) viewInflate2.findViewById(R.id.time)).setText(new SimpleDateFormat("h:mm", Locale.getDefault()).format(new Date()));
                ((TextView) viewInflate2.findViewById(R.id.am_pm_indicator)).setText(Calendar.getInstance().getDisplayName(9, 1, Locale.getDefault()));
                Bitmap bitmapFu4 = yno.fu(context, viewInflate2);
                this.u = bitmapFu4;
                imageView.setImageBitmap(bitmapFu4);
                G(this.z);
                break;
            case 6:
            default:
                int iBi2 = a.bi(i);
                int i2 = iBi2 != 0 ? iBi2 : 1;
                StringBuilder sb = new StringBuilder("unexpected type: ");
                sb.append(i2 - 1);
                throw new IllegalArgumentException(sb.toString());
            case 7:
                Bitmap bitmapFu5 = yno.fu(context, E(context, R.layout.video_sticker_picker, R.style.NormalDynamicSticker));
                this.u = bitmapFu5;
                imageView.setImageBitmap(bitmapFu5);
                break;
            case 8:
                ImageView imageView2 = (ImageView) LayoutInflater.from(context).inflate(R.layout.day_of_week_sticker, (ViewGroup) null);
                this.x.a(Uri.parse("https://www.gstatic.com/youtube/kazoo/server/assets/stickers/day_of_week_" + ((String) vie.c.get(Integer.valueOf(Calendar.getInstance().get(7)))) + ".png"), new vgo(this, imageView2, context));
                break;
            case 9:
                Bitmap bitmapFu6 = yno.fu(context, E(context, R.layout.link_sticker, R.style.NormalDynamicSticker));
                this.u = bitmapFu6;
                imageView.setImageBitmap(bitmapFu6);
                break;
        }
        this.s.setOnClickListener(this);
        aqcr aqcrVar = this.z;
        vhg vhgVar = this.v;
        if (vhgVar.z() != null) {
            vhgVar.z().w(yno.fh(aqcrVar), null);
        }
    }

    @Override // defpackage.vhf
    public final void D() {
        this.t.setImageDrawable(null);
        Bitmap bitmap = this.u;
        if (bitmap != null) {
            bitmap.recycle();
            this.u = null;
        }
        EmojiTextView emojiTextView = this.A;
        if (emojiTextView != null) {
            emojiTextView.setText((CharSequence) null);
        }
        this.z = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v25, types: [bog, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v10, types: [java.lang.Object, xgm] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        aqcr aqcrVar = this.z;
        int i = aqcrVar.c;
        int iBi = a.bi(i);
        int i2 = 1;
        if (iBi == 0) {
            iBi = 1;
        }
        int i3 = 0;
        int i4 = 4;
        int i5 = 2;
        switch (iBi - 1) {
            case 1:
                F(aqcrVar);
                vhg vhgVar = this.v;
                aihh aihhVar = (aihh) apji.a.createBuilder();
                aihhVar.e(aqct.b, this.z);
                apji apjiVar = (apji) aihhVar.build();
                vgw vgwVar = vhgVar.g;
                boolean z = vhgVar.s;
                vgwVar.n = apjiVar;
                vgwVar.o = z;
                if (!vgwVar.e || aebx.b(vgwVar.c)) {
                    vgwVar.b();
                    return;
                }
                vgwVar.i = vgwVar.a();
                aebz aebzVar = vgwVar.i;
                ArrayList arrayList = aebzVar.c;
                int size = arrayList.size();
                for (int i6 = 0; i6 < size; i6++) {
                    aebt aebtVar = (aebt) arrayList.get(i6);
                    aebx aebxVar = aebzVar.e;
                    aeby aebyVar = aebzVar.a;
                    Activity activityA = aebyVar.a();
                    String[] strArrD = aebx.d(activityA, aebtVar.a);
                    aiie aiieVar = ((ainr) aebxVar.e.c()).b;
                    if (!aiieVar.isEmpty()) {
                        for (String str : strArrD) {
                            if (activityA.checkSelfPermission(str) != 0 && aiieVar.contains(str) && !activityA.shouldShowRequestPermissionRationale(str)) {
                                if (Build.VERSION.SDK_INT >= 30) {
                                    break;
                                }
                                aebs.i(R.string.reel_permission_open_settings_location).gT(aebyVar.a.getFragmentManager(), "openSettingsDialog");
                                Runnable runnable = aebzVar.d;
                                return;
                            }
                        }
                    }
                }
                aebzVar.a();
                return;
            case 2:
                F(aqcrVar);
                vhg vhgVar2 = this.v;
                aihh aihhVar2 = (aihh) apji.a.createBuilder();
                aihhVar2.e(aqct.b, this.z);
                vho vhoVar = vhgVar2.h;
                vhoVar.g.b();
                vhoVar.d.setVisibility(0);
                vhx vhxVar = vhoVar.e;
                EditText editText = vhxVar.d;
                if (!TextUtils.isEmpty(editText.getText())) {
                    editText.setText("");
                }
                editText.requestFocus();
                tuk.m(editText);
                vhxVar.b(vhxVar.a.getString(R.string.user_mention_search_view_results_box_hint));
                vhz vhzVar = vhxVar.c;
                vhzVar.h = vhzVar.k.af(16);
                vhzVar.b(2);
                return;
            case 3:
                vhg vhgVar3 = this.v;
                vhgVar3.m.b(this.w, this.y);
                this.s.removeView(this.A);
                F(this.z);
                vhgVar3.p.a();
                EmojiTextView emojiTextView = this.A;
                String string = emojiTextView.getText().toString();
                final via viaVar = vhgVar3.t;
                vge vgeVar = (vge) viaVar.a;
                if (!vgeVar.a(string).isEmpty()) {
                    viaVar.c.hB().l(new xgj(xhb.b(65452)));
                }
                aihf aihfVarCreateBuilder = augv.a.createBuilder();
                aihfVarCreateBuilder.copyOnWrite();
                augv augvVar = (augv) aihfVarCreateBuilder.instance;
                string.getClass();
                augvVar.b |= 2;
                augvVar.d = string;
                agke agkeVarA = vgeVar.a(string);
                if (!agkeVarA.isEmpty()) {
                    aihf aihfVarCreateBuilder2 = auhj.a.createBuilder();
                    aihfVarCreateBuilder2.copyOnWrite();
                    auhj auhjVar = (auhj) aihfVarCreateBuilder2.instance;
                    string.getClass();
                    auhjVar.b |= 1;
                    auhjVar.c = string;
                    aihfVarCreateBuilder2.copyOnWrite();
                    auhj auhjVar2 = (auhj) aihfVarCreateBuilder2.instance;
                    aiie aiieVar2 = auhjVar2.d;
                    if (!aiieVar2.c()) {
                        auhjVar2.d = aihn.mutableCopy(aiieVar2);
                    }
                    aifs.addAll(agkeVarA, auhjVar2.d);
                    auhj auhjVar3 = (auhj) aihfVarCreateBuilder2.build();
                    aihfVarCreateBuilder.copyOnWrite();
                    augv augvVar2 = (augv) aihfVarCreateBuilder.instance;
                    auhjVar3.getClass();
                    augvVar2.e = auhjVar3;
                    augvVar2.b |= 4;
                }
                jrr jrrVar = (jrr) augy.a.createBuilder();
                jrrVar.copyOnWrite();
                augy augyVar = (augy) jrrVar.instance;
                augv augvVar3 = (augv) aihfVarCreateBuilder.build();
                augvVar3.getClass();
                augyVar.d = augvVar3;
                augyVar.c = 106;
                yno.fJ((Activity) viaVar.d, (zf) viaVar.e, emojiTextView, jrrVar, new vih() { // from class: vgf
                    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, viz] */
                    @Override // defpackage.vih
                    public final void a(jrr jrrVar2, vbu vbuVar) {
                        zak zakVar = new zak(null, null);
                        zakVar.c(vbuVar);
                        zakVar.d(Float.valueOf(0.2f));
                        vja vjaVarB = zakVar.b();
                        via viaVar2 = viaVar;
                        viaVar2.f.g(jrrVar2, vjaVarB);
                        augy augyVar2 = (augy) jrrVar2.instance;
                        auhj auhjVar4 = (augyVar2.c == 106 ? (augv) augyVar2.d : augv.a).e;
                        if (auhjVar4 == null) {
                            auhjVar4 = auhj.a;
                        }
                        if (auhjVar4.d.size() > 1) {
                            ((vhn) viaVar2.b).f(vbuVar.e, vbuVar.d);
                        }
                    }
                });
                return;
            case 4:
                F(aqcrVar);
                vhg vhgVar4 = this.v;
                vhgVar4.m.b(this.w, this.y);
                vhgVar4.p.a();
                Bitmap bitmap = this.u;
                boolean z2 = vhgVar4.s;
                aihf aihfVarCreateBuilder3 = auas.a.createBuilder();
                aihfVarCreateBuilder3.copyOnWrite();
                auas auasVar = (auas) aihfVarCreateBuilder3.instance;
                auasVar.b |= 1;
                auasVar.e = z2;
                auad auadVar = auad.a;
                aihfVarCreateBuilder3.copyOnWrite();
                auas auasVar2 = (auas) aihfVarCreateBuilder3.instance;
                auadVar.getClass();
                auasVar2.d = auadVar;
                auasVar2.c = 9;
                vil vilVar = vhgVar4.u;
                boolean zE = vilVar.d.E();
                aihfVarCreateBuilder3.copyOnWrite();
                auas auasVar3 = (auas) aihfVarCreateBuilder3.instance;
                auasVar3.b |= 2;
                auasVar3.f = zE;
                auas auasVar4 = (auas) aihfVarCreateBuilder3.build();
                aihf aihfVarCreateBuilder4 = auat.a.createBuilder();
                aihfVarCreateBuilder4.copyOnWrite();
                auat auatVar = (auat) aihfVarCreateBuilder4.instance;
                auasVar4.getClass();
                auatVar.e = auasVar4;
                auatVar.b |= 4;
                vilVar.b.getClass();
                yno.fG(vilVar.a, vilVar.c, bitmap, aihfVarCreateBuilder4, new vij(i2));
                return;
            case 5:
                F(aqcrVar);
                vhg vhgVar5 = this.v;
                vhgVar5.m.b(this.w, this.y);
                vhgVar5.p.a();
                Bitmap bitmap2 = this.u;
                boolean z3 = vhgVar5.s;
                aihf aihfVarCreateBuilder5 = auas.a.createBuilder();
                aihfVarCreateBuilder5.copyOnWrite();
                auas auasVar5 = (auas) aihfVarCreateBuilder5.instance;
                auasVar5.b |= 1;
                auasVar5.e = z3;
                auba aubaVar = auba.a;
                aihfVarCreateBuilder5.copyOnWrite();
                auas auasVar6 = (auas) aihfVarCreateBuilder5.instance;
                aubaVar.getClass();
                auasVar6.d = aubaVar;
                auasVar6.c = 8;
                vil vilVar2 = vhgVar5.j;
                boolean zE2 = vilVar2.d.E();
                aihfVarCreateBuilder5.copyOnWrite();
                auas auasVar7 = (auas) aihfVarCreateBuilder5.instance;
                auasVar7.b |= 2;
                auasVar7.f = zE2;
                auas auasVar8 = (auas) aihfVarCreateBuilder5.build();
                aihf aihfVarCreateBuilder6 = auat.a.createBuilder();
                aihfVarCreateBuilder6.copyOnWrite();
                auat auatVar2 = (auat) aihfVarCreateBuilder6.instance;
                auasVar8.getClass();
                auatVar2.e = auasVar8;
                auatVar2.b |= 4;
                vilVar2.b.getClass();
                yno.fG(vilVar2.a, vilVar2.c, bitmap2, aihfVarCreateBuilder6, new vij(i5));
                return;
            case 6:
            default:
                int iBi2 = a.bi(i);
                i2 = iBi2 != 0 ? iBi2 : 1;
                StringBuilder sb = new StringBuilder("unexpected type: ");
                sb.append(i2 - 1);
                throw new IllegalArgumentException(sb.toString());
            case 7:
                F(aqcrVar);
                vhg vhgVar6 = this.v;
                apji apjiVar2 = this.w;
                xpl xplVar = vhgVar6.v;
                ((vhd) xplVar.a).b(apjiVar2, xplVar.b);
                throw new IllegalStateException("Not implemented");
            case 8:
                F(aqcrVar);
                vhg vhgVar7 = this.v;
                vhgVar7.m.b(this.w, this.y);
                vhgVar7.p.a();
                Bitmap bitmap3 = this.u;
                vie vieVar = vhgVar7.k;
                xgm xgmVar = vieVar.f;
                boolean z4 = vhgVar7.s;
                xgmVar.hB().l(new xgj(xhb.b(65452)));
                aihf aihfVarCreateBuilder7 = auas.a.createBuilder();
                aihfVarCreateBuilder7.copyOnWrite();
                auas auasVar9 = (auas) aihfVarCreateBuilder7.instance;
                auasVar9.b |= 1;
                auasVar9.e = z4;
                aihf aihfVarCreateBuilder8 = auae.a.createBuilder();
                aihf aihfVarCreateBuilder9 = auaf.a.createBuilder();
                auag auagVar = vie.a;
                aihfVarCreateBuilder9.copyOnWrite();
                auaf auafVar = (auaf) aihfVarCreateBuilder9.instance;
                auafVar.c = auagVar.d;
                auafVar.b |= 1;
                agkz agkzVar = vie.b;
                aihfVarCreateBuilder9.copyOnWrite();
                auaf auafVar2 = (auaf) aihfVarCreateBuilder9.instance;
                aihv aihvVar = auafVar2.d;
                if (!aihvVar.c()) {
                    auafVar2.d = aihn.mutableCopy(aihvVar);
                }
                Iterator<E> it = agkzVar.iterator();
                while (it.hasNext()) {
                    auafVar2.d.h(((auag) it.next()).d);
                }
                auaf auafVar3 = (auaf) aihfVarCreateBuilder9.build();
                aihfVarCreateBuilder8.copyOnWrite();
                auae auaeVar = (auae) aihfVarCreateBuilder8.instance;
                auafVar3.getClass();
                auaeVar.d = auafVar3;
                auaeVar.b |= 2;
                aihfVarCreateBuilder7.copyOnWrite();
                auas auasVar10 = (auas) aihfVarCreateBuilder7.instance;
                auae auaeVar2 = (auae) aihfVarCreateBuilder8.build();
                auaeVar2.getClass();
                auasVar10.d = auaeVar2;
                auasVar10.c = 12;
                aihfVarCreateBuilder7.copyOnWrite();
                auas auasVar11 = (auas) aihfVarCreateBuilder7.instance;
                auasVar11.b |= 2;
                auasVar11.f = true;
                auas auasVar12 = (auas) aihfVarCreateBuilder7.build();
                aihf aihfVarCreateBuilder10 = auat.a.createBuilder();
                aihfVarCreateBuilder10.copyOnWrite();
                auat auatVar3 = (auat) aihfVarCreateBuilder10.instance;
                auasVar12.getClass();
                auatVar3.e = auasVar12;
                auatVar3.b |= 4;
                Matrix matrix = new Matrix();
                matrix.preScale(0.5f, 0.5f, 0.5f, 0.5f);
                aimy aimyVarFL = yno.fL(matrix);
                aihfVarCreateBuilder10.copyOnWrite();
                auat auatVar4 = (auat) aihfVarCreateBuilder10.instance;
                aimyVarFL.getClass();
                auatVar4.f = aimyVarFL;
                auatVar4.b |= 8;
                yno.fG(vieVar.d, vieVar.h, bitmap3, aihfVarCreateBuilder10, new vid(vieVar, i3));
                return;
            case 9:
                F(aqcrVar);
                vhg vhgVar8 = this.v;
                vhgVar8.m.b(this.w, this.y);
                vik vikVar = vhgVar8.l;
                try {
                    vhl vhlVar = vikVar.d;
                    if (((Boolean) taf.a(vhlVar.d, vhlVar.e.c(), new vdm(vhlVar, i4)).get()).booleanValue()) {
                        vikVar.e.e();
                    } else {
                        vikVar.f.e();
                    }
                    break;
                } catch (Exception e) {
                    ((agrc) ((agrc) ((agrc) vik.a.b()).j(e)).k("com/google/android/libraries/youtube/creation/videoeffects/stickers/LinkStickerController", "showLinkEntryScreen", 'U', "LinkStickerController.java")).t("Error reading from protoDataStore");
                }
                this.v.p.a();
                return;
        }
    }
}
