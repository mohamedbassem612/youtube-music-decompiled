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
public final class hvz implements View.OnClickListener, abdz {
    private final Context a;
    private final ImageView b;
    private final View c;
    private final ImageView d;
    private final xgn e;
    private avmn f;
    private final avlh g;
    private final abea h;
    private final adxj i;
    private final aesp j;

    public hvz(Context context, aesp aespVar, xgn xgnVar, abea abeaVar, adxj adxjVar, ImageView imageView, View view) {
        this.a = context;
        this.c = view;
        this.d = imageView;
        this.j = aespVar;
        this.e = xgnVar;
        this.h = abeaVar;
        this.i = adxjVar;
        ImageView imageView2 = (ImageView) view.findViewById(R.id.playback_control_icon);
        this.b = imageView2;
        imageView2.setImageResource(adxjVar.b(arqz.le));
        view.setOnClickListener(this);
        this.g = aespVar.s();
        hvy hvyVar = new hvy(this, aespVar);
        bac.s(view);
        view.setAccessibilityDelegate(hvyVar.getBridge());
    }

    public final String a(ibv ibvVar) {
        ibv ibvVar2 = ibv.LOOP_OFF;
        int iOrdinal = ibvVar.ordinal();
        if (iOrdinal == 0) {
            return this.a.getString(R.string.accessibility_repeat_off);
        }
        if (iOrdinal == 1) {
            return this.a.getString(R.string.accessibility_repeat_on);
        }
        if (iOrdinal == 2) {
            return this.a.getString(R.string.accessibility_repeat_one);
        }
        if (iOrdinal == 3) {
            return this.a.getString(R.string.accessibility_repeat_disabled);
        }
        throw new RuntimeException(null, null);
    }

    public final void c() {
        adxj adxjVar = this.i;
        ibv ibvVarQ = this.j.q();
        arqz arqzVar = arqz.le;
        int iB = adxjVar.b(arqzVar);
        ImageView imageView = this.d;
        imageView.setVisibility(8);
        ibv ibvVar = ibv.LOOP_OFF;
        int iOrdinal = ibvVarQ.ordinal();
        float f = 1.0f;
        if (iOrdinal == 0) {
            iB = adxjVar.b(arqzVar);
        } else if (iOrdinal == 1) {
            iB = adxjVar.b(arqzVar);
            imageView.setVisibility(0);
        } else if (iOrdinal == 2) {
            iB = adxjVar.b(arqz.ld);
        } else if (iOrdinal == 3) {
            TypedValue typedValue = new TypedValue();
            this.a.getResources().getValue(R.dimen.disabled_icon_alpha, typedValue, true);
            int iB2 = adxjVar.b(arqzVar);
            f = typedValue.getFloat();
            iB = iB2;
        }
        ImageView imageView2 = this.b;
        imageView2.setAlpha(f);
        imageView2.setImageDrawable(new aduk(this.a, iB).a());
        this.c.setContentDescription(a(ibvVarQ));
    }

    public final void d() {
        avmn avmnVar = this.f;
        if (avmnVar != null && !avmnVar.f()) {
            awka.f((AtomicReference) this.f);
        }
        this.h.j(this);
    }

    public final void e() {
        d();
        this.f = this.g.i(new abwr(1)).al(new hjd(this, 19), new hpw(4));
        this.h.e(this);
    }

    @Override // defpackage.abdz
    public final void hn(abdy abdyVar) {
        if (Objects.equals(abdyVar, abdy.b)) {
            this.e.l(new xgj(xhb.b(51548)));
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        aesp aespVar = this.j;
        aespVar.u();
        ameb amebVar = ameb.INTERACTION_LOGGING_GESTURE_TYPE_GENERIC_CLICK;
        xgj xgjVar = new xgj(xhb.b(51548));
        ibv ibvVarQ = aespVar.q();
        aihf aihfVarCreateBuilder = amdd.a.createBuilder();
        aihf aihfVarCreateBuilder2 = amde.a.createBuilder();
        ibv ibvVar = ibv.LOOP_OFF;
        int iOrdinal = ibvVarQ.ordinal();
        int i = 2;
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                i = 3;
            } else if (iOrdinal == 2) {
                i = 4;
            } else if (iOrdinal != 3) {
                i = 1;
            }
        }
        xgn xgnVar = this.e;
        aihfVarCreateBuilder2.copyOnWrite();
        amde amdeVar = (amde) aihfVarCreateBuilder2.instance;
        amdeVar.c = i - 1;
        amdeVar.b |= 1;
        aihfVarCreateBuilder.copyOnWrite();
        amdd amddVar = (amdd) aihfVarCreateBuilder.instance;
        amde amdeVar2 = (amde) aihfVarCreateBuilder2.build();
        amdeVar2.getClass();
        amddVar.n = amdeVar2;
        amddVar.b |= 268435456;
        xgnVar.o(amebVar, xgjVar, (amdd) aihfVarCreateBuilder.build());
    }
}
