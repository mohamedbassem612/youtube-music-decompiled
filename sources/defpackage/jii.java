package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.Spanned;
import android.view.ContextThemeWrapper;
import android.view.View;
import app.rive.semantics.SemanticState;
import com.google.android.apps.youtube.music.R;
import com.google.android.libraries.youtube.common.ui.YouTubeButton;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.HashMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class jii implements View.OnClickListener {
    public final YouTubeButton a;
    public ajno b;
    public final ijt c;
    private final Context d;
    private final vxe e;
    private final tts f;
    private final tfq g;

    public jii(Context context, tfq tfqVar, tts ttsVar, vxe vxeVar, ijt ijtVar, YouTubeButton youTubeButton) {
        this.d = context;
        this.g = tfqVar;
        this.f = ttsVar;
        this.e = vxeVar;
        this.a = youTubeButton;
        this.c = ijtVar;
    }

    private final void f(int i, int i2) {
        Drawable drawableD = dl.d(new ContextThemeWrapper(this.d, i), i2);
        if (drawableD != null) {
            tym.Z(this.a, drawableD);
        }
    }

    public final String a() {
        ajno ajnoVar = this.b;
        if (ajnoVar != null) {
            int i = ajnoVar.b;
            if ((i & SemanticState.LiveRegion) != 0) {
                ajwo ajwoVar = ajnoVar.g;
                if (ajwoVar == null) {
                    ajwoVar = ajwo.a;
                }
                aihl aihlVarCheckIsLite = aihn.checkIsLite(aixb.b);
                ajwoVar.c(aihlVarCheckIsLite);
                Object objK = ajwoVar.j.k(aihlVarCheckIsLite.d);
                return ((aixb) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK))).c;
            }
            if ((i & 32768) != 0) {
                ajwo ajwoVar2 = ajnoVar.j;
                if (ajwoVar2 == null) {
                    ajwoVar2 = ajwo.a;
                }
                aihl aihlVarCheckIsLite2 = aihn.checkIsLite(apjg.b);
                ajwoVar2.c(aihlVarCheckIsLite2);
                Object objK2 = ajwoVar2.j.k(aihlVarCheckIsLite2.d);
                return ((apjg) (objK2 == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK2))).c;
            }
        }
        return null;
    }

    public final void b() {
        this.a.setVisibility(8);
        this.b = null;
    }

    public final void c(boolean z) {
        alay alayVar;
        alay alayVar2;
        e(z);
        ajno ajnoVar = this.b;
        if (z) {
            if (ajnoVar != null) {
                if ((ajnoVar.b & SemanticState.Multiline) != 0) {
                    alayVar2 = ajnoVar.i;
                    if (alayVar2 == null) {
                        alayVar2 = alay.a;
                    }
                } else {
                    alayVar2 = null;
                }
                Spanned spannedK = ackj.k(null, alayVar2, null, false);
                YouTubeButton youTubeButton = this.a;
                youTubeButton.setText(spannedK);
                youTubeButton.setTextColor(this.d.getColor(R.color.ytm_color_black));
                f(R.style.WidgetTheme_WhiteButton, R.drawable.rounded_large_corner_white_button_shape);
                return;
            }
            return;
        }
        if (ajnoVar != null) {
            if ((ajnoVar.b & 64) != 0) {
                alayVar = ajnoVar.f;
                if (alayVar == null) {
                    alayVar = alay.a;
                }
            } else {
                alayVar = null;
            }
            Spanned spannedK2 = ackj.k(null, alayVar, null, false);
            YouTubeButton youTubeButton2 = this.a;
            youTubeButton2.setText(spannedK2);
            youTubeButton2.setTextColor(this.d.getColor(R.color.ytm_color_white));
            f(R.style.WidgetTheme_TransparentButton, R.drawable.rounded_large_corner_transparent_button_shape);
        }
    }

    public final void d() {
        String strA;
        ajno ajnoVar = this.b;
        if (ajnoVar == null || (strA = a()) == null) {
            return;
        }
        ((ConcurrentHashMap) this.c.a).put(strA, Boolean.valueOf(ajnoVar.c));
    }

    public final void e(boolean z) {
        ajno ajnoVar = this.b;
        if (ajnoVar == null || z == ajnoVar.c) {
            return;
        }
        aihf builder = ajnoVar.toBuilder();
        builder.copyOnWrite();
        ajno ajnoVar2 = (ajno) builder.instance;
        ajnoVar2.b |= 2;
        ajnoVar2.c = z;
        this.b = (ajno) builder.build();
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ajwo ajwoVar;
        ajno ajnoVar = this.b;
        if (ajnoVar != null) {
            if (!this.g.h()) {
                this.f.a();
                return;
            }
            if (ajnoVar.c) {
                if ((ajnoVar.b & 32768) == 0) {
                    return;
                }
            } else if ((ajnoVar.b & SemanticState.LiveRegion) == 0) {
                return;
            }
            HashMap map = new HashMap();
            map.put("com.google.android.libraries.youtube.innertube.endpoint.tag", ajnoVar);
            if (ajnoVar.c) {
                ajwoVar = ajnoVar.j;
                if (ajwoVar == null) {
                    ajwoVar = ajwo.a;
                }
                map.put("removeCommandListener", new gtg(this, 7));
            } else {
                ajwoVar = ajnoVar.g;
                if (ajwoVar == null) {
                    ajwoVar = ajwo.a;
                }
                map.put("addCommandListener", new gtg(this, 6));
            }
            c(!ajnoVar.c);
            this.e.c(ajwoVar, map);
        }
    }
}
