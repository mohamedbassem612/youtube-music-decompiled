package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.ToggleButton;
import app.rive.semantics.SemanticState;
import com.google.android.apps.youtube.music.R;
import java.util.HashMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class jgw implements adma {
    public final vxe a;
    private final Context b;
    private final admd c;
    private final aduv d;
    private final ToggleButton e;

    public jgw(Context context, vxe vxeVar, aduv aduvVar) {
        context.getClass();
        this.b = context;
        aduvVar.getClass();
        this.d = aduvVar;
        jdw jdwVar = new jdw(context);
        this.c = jdwVar;
        vxeVar.getClass();
        this.a = vxeVar;
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.toggle_button_item, (ViewGroup) null);
        this.e = (ToggleButton) viewInflate;
        jdwVar.c(viewInflate);
    }

    private final Drawable e(int i, adly adlyVar) {
        Context context = this.b;
        Drawable drawableD = dl.d(context, i);
        if (drawableD == null) {
            return null;
        }
        int iB = adlyVar.b("toggleButtonIconSizeResId", -1);
        if (iB == -1) {
            return drawableD;
        }
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(iB);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        drawableD.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawableD.draw(canvas);
        return new BitmapDrawable(context.getResources(), bitmapCreateBitmap);
    }

    @Override // defpackage.adma
    public final View a() {
        return ((jdw) this.c).a;
    }

    public final void d(ajno ajnoVar) {
        aliz alizVarA;
        int i = ajnoVar.b;
        if ((1048576 & i) != 0 && !ajnoVar.c) {
            ToggleButton toggleButton = this.e;
            aiqe aiqeVar = ajnoVar.l;
            if (aiqeVar == null) {
                aiqeVar = aiqe.a;
            }
            kro.aa(toggleButton, aiqeVar);
            return;
        }
        if ((i & 2097152) != 0 && ajnoVar.c) {
            ToggleButton toggleButton2 = this.e;
            aiqe aiqeVar2 = ajnoVar.m;
            if (aiqeVar2 == null) {
                aiqeVar2 = aiqe.a;
            }
            kro.aa(toggleButton2, aiqeVar2);
            return;
        }
        aiqd aiqdVar = ajnoVar.k;
        if (aiqdVar == null) {
            aiqdVar = aiqd.a;
        }
        if ((aiqdVar.b & 2) != 0) {
            ToggleButton toggleButton3 = this.e;
            aiqd aiqdVar2 = ajnoVar.k;
            if (aiqdVar2 == null) {
                aiqdVar2 = aiqd.a;
            }
            toggleButton3.setContentDescription(aiqdVar2.c);
            return;
        }
        aduv aduvVar = this.d;
        if (aduvVar instanceof izf) {
            izf izfVar = (izf) aduvVar;
            int i2 = ajnoVar.b;
            if ((i2 & SemanticState.Obscured) == 0 || (i2 & 32) == 0) {
                return;
            }
            if (ajnoVar.c) {
                alja aljaVar = ajnoVar.h;
                if (aljaVar == null) {
                    aljaVar = alja.a;
                }
                alizVarA = aliz.a(aljaVar.c);
                if (alizVarA == null) {
                    alizVarA = aliz.UNKNOWN;
                }
            } else {
                alja aljaVar2 = ajnoVar.e;
                if (aljaVar2 == null) {
                    aljaVar2 = alja.a;
                }
                alizVarA = aliz.a(aljaVar2.c);
                if (alizVarA == null) {
                    alizVarA = aliz.UNKNOWN;
                }
            }
            int iB = izfVar.b(alizVarA);
            if (iB != 0) {
                this.e.setContentDescription(this.b.getString(iB));
            }
        }
    }

    @Override // defpackage.adma
    public final /* synthetic */ void hU(final adly adlyVar, Object obj) {
        alay alayVar;
        alay alayVar2;
        final heg hegVar = (heg) obj;
        adlyVar.b.w(new xgj(((ajno) hegVar.a).n, (amud) null), null);
        ToggleButton toggleButton = this.e;
        toggleButton.setOnCheckedChangeListener(null);
        toggleButton.setText((CharSequence) null);
        ajno ajnoVar = (ajno) hegVar.a;
        if ((ajnoVar.b & 64) != 0) {
            alayVar = ajnoVar.f;
            if (alayVar == null) {
                alayVar = alay.a;
            }
        } else {
            alayVar = null;
        }
        Spanned spannedK = ackj.k(null, alayVar, null, false);
        ajno ajnoVar2 = (ajno) hegVar.a;
        if ((ajnoVar2.b & SemanticState.Multiline) != 0) {
            alayVar2 = ajnoVar2.i;
            if (alayVar2 == null) {
                alayVar2 = alay.a;
            }
        } else {
            alayVar2 = null;
        }
        toggleButton.setTextOn(ackj.k(null, alayVar2, null, false));
        toggleButton.setTextOff(spannedK);
        if (TextUtils.isEmpty(spannedK)) {
            toggleButton.setTextSize(0.0f);
        } else {
            toggleButton.setTextSize(0, this.b.getResources().getDimension(R.dimen.small_font_size));
        }
        int i = ((ajno) hegVar.a).b;
        if ((i & SemanticState.Obscured) != 0 && (i & 32) != 0) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            int[] iArr = {android.R.attr.state_checked};
            aduv aduvVar = this.d;
            alja aljaVar = ((ajno) hegVar.a).h;
            if (aljaVar == null) {
                aljaVar = alja.a;
            }
            aliz alizVarA = aliz.a(aljaVar.c);
            if (alizVarA == null) {
                alizVarA = aliz.UNKNOWN;
            }
            stateListDrawable.addState(iArr, e(aduvVar.a(alizVarA), adlyVar));
            int[] iArr2 = new int[0];
            alja aljaVar2 = ((ajno) hegVar.a).e;
            if (aljaVar2 == null) {
                aljaVar2 = alja.a;
            }
            aliz alizVarA2 = aliz.a(aljaVar2.c);
            if (alizVarA2 == null) {
                alizVarA2 = aliz.UNKNOWN;
            }
            stateListDrawable.addState(iArr2, e(aduvVar.a(alizVarA2), adlyVar));
            toggleButton.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, stateListDrawable);
        }
        toggleButton.setChecked(((ajno) hegVar.a).c);
        d((ajno) hegVar.a);
        toggleButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: jgv
            /* JADX WARN: Code duplicated, block: B:16:0x005d  */
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                ajwo ajwoVar;
                HashMap map;
                Object objC;
                heg hegVar2 = hegVar;
                aihf builder = ((aihn) hegVar2.a).toBuilder();
                builder.copyOnWrite();
                ajno ajnoVar3 = (ajno) builder.instance;
                ajnoVar3.b |= 2;
                ajnoVar3.c = z;
                hegVar2.a((ajno) builder.build());
                jgw jgwVar = this.a;
                if (z) {
                    ajno ajnoVar4 = (ajno) hegVar2.a;
                    if ((ajnoVar4.b & SemanticState.LiveRegion) != 0) {
                        ajwoVar = ajnoVar4.g;
                        if (ajwoVar == null) {
                            ajwoVar = ajwo.a;
                        }
                        adly adlyVar2 = adlyVar;
                        map = new HashMap();
                        map.put("com.google.android.libraries.youtube.innertube.endpoint.tag", hegVar2);
                        objC = adlyVar2.c("sectionListController");
                        if (objC != null) {
                            map.put("sectionListController", objC);
                        }
                        jgwVar.a.c(ajwoVar, map);
                    }
                } else {
                    ajno ajnoVar5 = (ajno) hegVar2.a;
                    if ((ajnoVar5.b & 32768) != 0) {
                        ajwoVar = ajnoVar5.j;
                        if (ajwoVar == null) {
                            ajwoVar = ajwo.a;
                        }
                        adly adlyVar3 = adlyVar;
                        map = new HashMap();
                        map.put("com.google.android.libraries.youtube.innertube.endpoint.tag", hegVar2);
                        objC = adlyVar3.c("sectionListController");
                        if (objC != null) {
                            map.put("sectionListController", objC);
                        }
                        jgwVar.a.c(ajwoVar, map);
                    }
                }
                jgwVar.d((ajno) hegVar2.a);
            }
        });
        this.c.e(adlyVar);
    }

    @Override // defpackage.adma
    public final void b(admh admhVar) {
    }
}
