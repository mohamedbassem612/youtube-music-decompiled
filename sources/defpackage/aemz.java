package defpackage;

import android.content.Context;
import android.content.pm.ResolveInfo;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.youtube.music.R;
import j$.util.Objects;
import java.util.HashMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aemz implements View.OnClickListener, adma {
    private final View a;
    private final ImageView b;
    private final TextView c;
    private final adia d;
    private final float e;
    private final float f;
    private aptq g;
    private final aekx h;

    public aemz(Context context, aekx aekxVar, adhv adhvVar) {
        this.h = aekxVar;
        View viewInflate = View.inflate(context, R.layout.share_target_service_update, null);
        this.a = viewInflate;
        ImageView imageView = (ImageView) viewInflate.findViewById(R.id.icon);
        this.b = imageView;
        this.c = (TextView) viewInflate.findViewById(R.id.title);
        this.d = new adia(adhvVar, imageView, false);
        this.e = viewInflate.getAlpha();
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(android.R.attr.disabledAlpha, typedValue, true);
        this.f = typedValue.getFloat();
        viewInflate.setOnClickListener(this);
    }

    @Override // defpackage.adma
    public final View a() {
        return this.a;
    }

    @Override // defpackage.adma
    public final void b(admh admhVar) {
        this.g = null;
        this.b.setImageDrawable(null);
        this.d.a();
        this.c.setText((CharSequence) null);
    }

    public final void d(aptq aptqVar, CharSequence charSequence, Drawable drawable) {
        if (Objects.equals(this.g, aptqVar)) {
            this.c.setText(charSequence);
            this.b.setImageDrawable(drawable);
            boolean z = this.h.j;
            View view = this.a;
            if (!z) {
                view.setAlpha(this.f);
            } else {
                view.animate().alpha(this.e).start();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x003e  */
    /* JADX WARN: Code duplicated, block: B:23:0x0048  */
    /* JADX WARN: Code duplicated, block: B:24:0x0054  */
    /* JADX WARN: Code duplicated, block: B:26:0x005e  */
    /* JADX WARN: Code duplicated, block: B:29:0x0081  */
    /* JADX WARN: Code duplicated, block: B:30:0x0084  */
    /* JADX WARN: Code duplicated, block: B:33:0x008f  */
    /* JADX WARN: Code duplicated, block: B:35:0x0095  */
    /* JADX WARN: Code duplicated, block: B:39:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:41:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:42:0x00a9  */
    @Override // defpackage.adma
    public final /* synthetic */ void hU(adly adlyVar, Object obj) {
        axq axqVar;
        ResolveInfo resolveInfo;
        float f;
        alay alayVar;
        aqmh aqmhVar;
        aptq aptqVar = (aptq) obj;
        this.g = aptqVar;
        View view = this.a;
        view.setTag(aptqVar);
        view.setAlpha(0.0f);
        int i = aptqVar.b;
        int i2 = i & 4;
        aekx aekxVar = this.h;
        byte[] bArr = null;
        if (i2 == 0 || (i & 8) == 0) {
            axqVar = (axq) aekxVar.g.get(aptqVar);
            if (axqVar != null) {
                d(aptqVar, (CharSequence) axqVar.a, (Drawable) axqVar.b);
            } else {
                resolveInfo = (ResolveInfo) aekxVar.f.get(aptqVar);
                if (resolveInfo != null) {
                    int i3 = 15;
                    taf.i(aekxVar.i.submit(new aalq(aekxVar, resolveInfo, i3, bArr)), aekxVar.h, new abwu(17), new rjy(aekxVar, aptqVar, this, i3), null);
                } else {
                    if (aekxVar.j) {
                        f = this.e;
                    } else {
                        f = this.f;
                    }
                    view.setAlpha(f);
                    if ((aptqVar.b & 8) != 0) {
                        adia adiaVar = this.d;
                        aqmhVar = aptqVar.f;
                        if (aqmhVar == null) {
                            aqmhVar = aqmh.a;
                        }
                        adiaVar.f(aqmhVar, null);
                    }
                    TextView textView = this.c;
                    if ((aptqVar.b & 4) != 0) {
                        alayVar = aptqVar.e;
                        if (alayVar == null) {
                            alayVar = alay.a;
                        }
                    } else {
                        alayVar = null;
                    }
                    textView.setText(ackj.k(null, alayVar, null, false));
                }
            }
        } else {
            aptj aptjVar = aptqVar.c;
            if (aptjVar == null) {
                aptjVar = aptj.a;
            }
            if (aptjVar.c != 97) {
                aptj aptjVar2 = aptqVar.c;
                if ((aptjVar2 == null ? aptj.a : aptjVar2).c != 98) {
                    if (aptjVar2 == null) {
                        aptjVar2 = aptj.a;
                    }
                    if (aptjVar2.c != 99) {
                        axqVar = (axq) aekxVar.g.get(aptqVar);
                        if (axqVar != null) {
                            d(aptqVar, (CharSequence) axqVar.a, (Drawable) axqVar.b);
                        } else {
                            resolveInfo = (ResolveInfo) aekxVar.f.get(aptqVar);
                            if (resolveInfo != null) {
                                int i4 = 15;
                                taf.i(aekxVar.i.submit(new aalq(aekxVar, resolveInfo, i4, bArr)), aekxVar.h, new abwu(17), new rjy(aekxVar, aptqVar, this, i4), null);
                            }
                        }
                    }
                }
            }
            if (aekxVar.j) {
                f = this.e;
            } else {
                f = this.f;
            }
            view.setAlpha(f);
            if ((aptqVar.b & 8) != 0) {
                adia adiaVar2 = this.d;
                aqmhVar = aptqVar.f;
                if (aqmhVar == null) {
                    aqmhVar = aqmh.a;
                }
                adiaVar2.f(aqmhVar, null);
            }
            TextView textView2 = this.c;
            if ((aptqVar.b & 4) != 0) {
                alayVar = aptqVar.e;
                if (alayVar == null) {
                    alayVar = alay.a;
                }
            } else {
                alayVar = null;
            }
            textView2.setText(ackj.k(null, alayVar, null, false));
        }
        aekxVar.e.w(new xgj(aptqVar.h, (amud) null), aekx.g(aptqVar));
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        aekx aekxVar = this.h;
        if (aekxVar.j) {
            aptq aptqVar = (aptq) view.getTag();
            aekxVar.d.c(new aeld());
            HashMap map = new HashMap();
            map.put("com.google.android.libraries.youtube.innertube.endpoint.tag", aekxVar);
            vxe vxeVar = aekxVar.b;
            map.put("endpoint_resolver_override", vxeVar);
            xgn xgnVar = aekxVar.e;
            map.put("interaction_logger_override", xgnVar);
            map.put("com.google.android.libraries.youtube.logging.interaction_logger", xgnVar);
            map.put("click_tracking_params", aptqVar.h.G());
            amdd amddVarG = aekx.g(aptqVar);
            if (amddVarG != null) {
                map.put("client_data_override", amddVarG);
            }
            String str = aekxVar.k;
            ajwo ajwoVar = aptqVar.g;
            if (ajwoVar == null) {
                ajwoVar = ajwo.a;
            }
            aihh aihhVar = (aihh) ajwoVar.toBuilder();
            if (aihhVar.c(appo.b)) {
                aihf builder = ((appo) aihhVar.b(appo.b)).toBuilder();
                appo appoVar = (appo) builder.instance;
                if ((appoVar.c & 1) != 0) {
                    almy almyVar = appoVar.d;
                    if (almyVar == null) {
                        almyVar = almy.a;
                    }
                    aihf builder2 = almyVar.toBuilder();
                    String strC = typ.c(str);
                    builder2.copyOnWrite();
                    almy almyVar2 = (almy) builder2.instance;
                    almyVar2.b |= 4;
                    almyVar2.c = strC;
                    builder.copyOnWrite();
                    appo appoVar2 = (appo) builder.instance;
                    almy almyVar3 = (almy) builder2.build();
                    almyVar3.getClass();
                    appoVar2.d = almyVar3;
                    appoVar2.c |= 1;
                }
                appo appoVar3 = (appo) builder.instance;
                if ((appoVar3.c & 2) != 0) {
                    almw almwVar = appoVar3.e;
                    if (almwVar == null) {
                        almwVar = almw.a;
                    }
                    aihf builder3 = almwVar.toBuilder();
                    builder3.copyOnWrite();
                    almw almwVar2 = (almw) builder3.instance;
                    almwVar2.b |= 2;
                    almwVar2.d = false;
                    builder.copyOnWrite();
                    appo appoVar4 = (appo) builder.instance;
                    almw almwVar3 = (almw) builder3.build();
                    almwVar3.getClass();
                    appoVar4.e = almwVar3;
                    appoVar4.c |= 2;
                }
                aihhVar.e(appo.b, (appo) builder.build());
            }
            vxeVar.c((ajwo) aihhVar.build(), map);
            aekxVar.c.a(true);
        }
    }
}
