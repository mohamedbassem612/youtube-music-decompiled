package defpackage;

import android.content.Context;
import android.util.TypedValue;
import android.view.View;
import android.widget.ImageView;
import com.google.android.apps.youtube.music.R;
import j$.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hwy implements View.OnClickListener, abdz {
    private final aunn a;
    private final aunn b;
    private final View c;
    private final ImageView d;
    private final ImageView e;
    private final float f;
    private final Context g;
    private final aunn h;
    private final adxj i;
    private avmn j;

    public hwy(Context context, aunn aunnVar, aunn aunnVar2, aunn aunnVar3, adxj adxjVar, ImageView imageView, View view) {
        this.a = aunnVar;
        this.b = aunnVar2;
        this.c = view;
        this.e = imageView;
        this.g = context;
        this.h = aunnVar3;
        this.i = adxjVar;
        TypedValue typedValue = new TypedValue();
        context.getResources().getValue(R.dimen.disabled_icon_alpha, typedValue, true);
        this.f = typedValue.getFloat();
        ImageView imageView2 = (ImageView) view.findViewById(R.id.playback_control_icon);
        this.d = imageView2;
        view.setOnClickListener(this);
        imageView2.setImageResource(adxjVar.b(arqz.mu));
        imageView.setPadding(context.getResources().getDimensionPixelSize(R.dimen.queue_shuffle_button_indicator_padding_start), imageView.getPaddingTop(), context.getResources().getDimensionPixelSize(R.dimen.queue_shuffle_button_indicator_padding_end), imageView.getPaddingBottom());
        hwx hwxVar = new hwx(this, aunnVar);
        bac.s(view);
        view.setAccessibilityDelegate(hwxVar.getBridge());
    }

    public final String a(icz iczVar) {
        int iOrdinal = iczVar.ordinal();
        if (iOrdinal == 0) {
            return this.g.getString(R.string.accessibility_shuffle_off);
        }
        if (iOrdinal == 1) {
            return this.g.getString(R.string.accessibility_shuffle_on);
        }
        if (iOrdinal == 2) {
            return this.g.getString(R.string.accessibility_shuffle_disabled);
        }
        throw new RuntimeException(null, null);
    }

    public final void c() {
        int iB;
        icz iczVarB = ((jan) this.a.io()).b();
        ImageView imageView = this.e;
        imageView.setVisibility(8);
        int iOrdinal = iczVarB.ordinal();
        float f = 1.0f;
        if (iOrdinal == 0) {
            iB = this.i.b(arqz.mu);
        } else if (iOrdinal == 1) {
            int iB2 = this.i.b(arqz.mu);
            imageView.setVisibility(0);
            iB = iB2;
        } else {
            if (iOrdinal != 2) {
                throw new AssertionError("Unknown shuffle mode");
            }
            iB = this.i.b(arqz.mu);
            f = this.f;
        }
        ImageView imageView2 = this.d;
        imageView2.setAlpha(f);
        imageView2.setImageDrawable(new aduk(this.g, iB).a());
        this.c.setContentDescription(a(iczVarB));
    }

    public final void d() {
        avmn avmnVar = this.j;
        if (avmnVar != null && !avmnVar.f()) {
            awka.f((AtomicReference) this.j);
        }
        ((abea) this.h.io()).j(this);
    }

    public final void e() {
        d();
        this.j = ((jan) this.a.io()).d().i(new abwr(1)).al(new hwd(this, 14), new hpw(14));
        ((abea) this.h.io()).e(this);
    }

    @Override // defpackage.abdz
    public final void hn(abdy abdyVar) {
        if (Objects.equals(abdyVar, abdy.b)) {
            ((xgn) this.b.io()).l(new xgj(xhb.b(45468)));
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        aunn aunnVar = this.a;
        ((jan) aunnVar.io()).f();
        icz iczVarB = ((jan) aunnVar.io()).b();
        xgn xgnVar = (xgn) this.b.io();
        ameb amebVar = ameb.INTERACTION_LOGGING_GESTURE_TYPE_GENERIC_CLICK;
        xgj xgjVar = new xgj(xhb.b(45468));
        aihf aihfVarCreateBuilder = amdd.a.createBuilder();
        aihf aihfVarCreateBuilder2 = amcx.a.createBuilder();
        icz iczVar = icz.b;
        aihfVarCreateBuilder2.copyOnWrite();
        amcx amcxVar = (amcx) aihfVarCreateBuilder2.instance;
        amcxVar.c = (iczVarB == iczVar ? 2 : 3) - 1;
        amcxVar.b |= 1;
        aihfVarCreateBuilder.copyOnWrite();
        amdd amddVar = (amdd) aihfVarCreateBuilder.instance;
        amcx amcxVar2 = (amcx) aihfVarCreateBuilder2.build();
        amcxVar2.getClass();
        amddVar.l = amcxVar2;
        amddVar.b |= 32768;
        xgnVar.o(amebVar, xgjVar, (amdd) aihfVarCreateBuilder.build());
    }
}
