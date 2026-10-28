package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Paint;
import android.net.Uri;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Size;
import android.view.View;
import app.rive.Alignment;
import app.rive.Artboard;
import app.rive.Fit;
import app.rive.FontAsset;
import app.rive.ImageAsset;
import app.rive.RiveCanvasSession;
import app.rive.RiveFile;
import app.rive.RiveFileSource;
import app.rive.RiveInitializationException;
import app.rive.RiveSemanticsMode;
import app.rive.StateMachine;
import app.rive.ViewModelInstance;
import app.rive.ViewModelSource;
import app.rive.core.CommandQueue;
import app.rive.semantics.SemanticState;
import com.google.android.apps.youtube.music.R;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.android.libraries.youtube.media.interfaces.CuePointDataProviderWrapper;
import com.google.android.libraries.youtube.media.player.exo2.platypus.ExecutorImpl;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protos.youtube.elements.CommandOuterClass$Command;
import j$.time.Duration;
import j$.util.DesugarCollections;
import j$.util.Objects;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.regex.Pattern;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public /* synthetic */ class acfz {
    public acfz(hno hnoVar, Executor executor, Handler handler) {
        hnoVar.getClass();
        executor.getClass();
        handler.getClass();
        new Paint(3);
    }

    public static ajnf A(akdd akddVar) {
        if ((akddVar.b & SemanticState.Focused) == 0) {
            return null;
        }
        ajng ajngVar = akddVar.h;
        if (ajngVar == null) {
            ajngVar = ajng.a;
        }
        ajnf ajnfVar = ajngVar.c;
        return ajnfVar == null ? ajnf.a : ajnfVar;
    }

    public static ajnf B(akdd akddVar) {
        if ((akddVar.b & 64) == 0) {
            return null;
        }
        ajng ajngVar = akddVar.g;
        if (ajngVar == null) {
            ajngVar = ajng.a;
        }
        ajnf ajnfVar = ajngVar.c;
        return ajnfVar == null ? ajnf.a : ajnfVar;
    }

    public static CharSequence C(CharSequence[] charSequenceArr) {
        CharSequence charSequenceConcat = null;
        if (charSequenceArr != null) {
            CharSequence charSequenceConcat2 = TextUtils.concat(System.getProperty("line.separator"), System.getProperty("line.separator"));
            for (CharSequence charSequence : charSequenceArr) {
                charSequenceConcat = charSequenceConcat == null ? charSequence : TextUtils.concat(charSequenceConcat, charSequenceConcat2, charSequence);
            }
        }
        return charSequenceConcat;
    }

    public static CharSequence D(akdd akddVar) {
        alay alayVar;
        ajnf ajnfVarA = A(akddVar);
        if (ajnfVarA != null) {
            alay alayVar2 = ajnfVarA.m;
            if (alayVar2 == null) {
                alayVar2 = alay.a;
            }
            return ackj.k(null, alayVar2, null, false);
        }
        if ((akddVar.b & 67108864) != 0) {
            alayVar = akddVar.q;
            if (alayVar == null) {
                alayVar = alay.a;
            }
        } else {
            alayVar = null;
        }
        return ackj.k(null, alayVar, null, false);
    }

    public static CharSequence E(akdd akddVar) {
        alay alayVar;
        ajnf ajnfVarB = B(akddVar);
        if (ajnfVarB != null) {
            alay alayVar2 = ajnfVarB.m;
            if (alayVar2 == null) {
                alayVar2 = alay.a;
            }
            return ackj.k(null, alayVar2, null, false);
        }
        if ((akddVar.b & 33554432) != 0) {
            alayVar = akddVar.p;
            if (alayVar == null) {
                alayVar = alay.a;
            }
        } else {
            alayVar = null;
        }
        return ackj.k(null, alayVar, null, false);
    }

    public static ajnf F(aihh aihhVar) {
        aihhVar.copyOnWrite();
        ajnf ajnfVar = (ajnf) aihhVar.instance;
        ajnf ajnfVar2 = ajnf.a;
        ajnfVar.d = 39;
        ajnfVar.c = 1;
        return (ajnf) aihhVar.build();
    }

    public static ajnf G(aihh aihhVar) {
        aihhVar.copyOnWrite();
        ajnf ajnfVar = (ajnf) aihhVar.instance;
        ajnf ajnfVar2 = ajnf.a;
        ajnfVar.d = 42;
        ajnfVar.c = 1;
        return (ajnf) aihhVar.build();
    }

    public static /* synthetic */ aihh H(String str, CommandOuterClass$Command commandOuterClass$Command) {
        if (str == null) {
            return null;
        }
        aihh aihhVar = (aihh) ajnf.a.createBuilder();
        alay alayVarC = ackj.c(str);
        aihhVar.copyOnWrite();
        ajnf ajnfVar = (ajnf) aihhVar.instance;
        alayVarC.getClass();
        ajnfVar.m = alayVarC;
        ajnfVar.b |= 64;
        if (commandOuterClass$Command != null) {
            aihh aihhVar2 = (aihh) ajwo.a.createBuilder();
            aihhVar2.e(akrx.a, commandOuterClass$Command);
            aihhVar.copyOnWrite();
            ajnf ajnfVar2 = (ajnf) aihhVar.instance;
            ajwo ajwoVar = (ajwo) aihhVar2.build();
            ajwoVar.getClass();
            ajnfVar2.s = ajwoVar;
            ajnfVar2.b |= SemanticState.Multiline;
        }
        return aihhVar;
    }

    public static void I(View view, boolean z) {
        if (view != null) {
            view.setVisibility(true != z ? 8 : 0);
        }
    }

    public static /* synthetic */ String J(Object[] objArr, Class cls) {
        String[] strArrSplit = "currentPageCommand".split(";");
        StringBuilder sb = new StringBuilder();
        sb.append(cls.getSimpleName());
        sb.append('[');
        int i = 0;
        while (true) {
            int length = strArrSplit.length;
            if (i >= length) {
                sb.append(']');
                return sb.toString();
            }
            sb.append(strArrSplit[i]);
            sb.append('=');
            sb.append(objArr[i]);
            if (i != length - 1) {
                sb.append(", ");
            }
            i++;
        }
    }

    public static double K(int i, int i2, int i3, int i4) {
        double d = ((double) i4) / ((double) i3);
        double d2 = ((double) i2) / ((double) i);
        return d > d2 ? (d / d2) - 1.0d : (d2 / d) - 1.0d;
    }

    public static Size L(int i, int i2, int i3, int i4) {
        if (i > 0 && i3 > 0) {
            double d = i2;
            double d2 = i;
            double d3 = d / d2;
            double d4 = ((double) i4) / ((double) i3);
            if (d3 < d4 && d4 != 0.0d) {
                i = (int) (d / d4);
            } else if (d3 > d4) {
                i2 = (int) (d2 * d4);
            }
        }
        return new Size(i, i2);
    }

    public static boolean M(Context context, float f) {
        if (context == null) {
            return false;
        }
        float fI = twm.i(context);
        float fG = twm.g(context);
        if (fI == 0.0f) {
            return false;
        }
        float f2 = fG / fI;
        return f2 > 1.9f && f2 <= f;
    }

    public static amdd N(acul aculVar, apfp apfpVar, apfu apfuVar, boolean z) {
        apft apftVarA = aawr.A(apfpVar, apfuVar);
        synchronized (aculVar) {
        }
        aihf aihfVarCreateBuilder = amdd.a.createBuilder();
        amdo amdoVar = ((amdd) aihfVarCreateBuilder.instance).o;
        if (amdoVar == null) {
            amdoVar = amdo.a;
        }
        aihf builder = amdoVar.toBuilder();
        builder.copyOnWrite();
        amdo amdoVar2 = (amdo) builder.instance;
        amdoVar2.d = apftVarA.g;
        amdoVar2.b |= 8;
        if (z && apfpVar != null && (apfpVar.d & 262144) != 0) {
            String str = apfpVar.U;
            builder.copyOnWrite();
            amdo amdoVar3 = (amdo) builder.instance;
            str.getClass();
            amdoVar3.b |= 16;
            amdoVar3.e = str;
        }
        aihfVarCreateBuilder.copyOnWrite();
        amdd amddVar = (amdd) aihfVarCreateBuilder.instance;
        amdo amdoVar4 = (amdo) builder.build();
        amdoVar4.getClass();
        amddVar.o = amdoVar4;
        amddVar.c |= 1;
        return (amdd) aihfVarCreateBuilder.build();
    }

    public static aoar O(ajwo ajwoVar) {
        if (ajwoVar != null) {
            aihl aihlVar = aoaq.b;
            aihl aihlVarCheckIsLite = aihn.checkIsLite(aihlVar);
            ajwoVar.c(aihlVarCheckIsLite);
            if (ajwoVar.j.n(aihlVarCheckIsLite.d)) {
                aihl aihlVarCheckIsLite2 = aihn.checkIsLite(aihlVar);
                ajwoVar.c(aihlVarCheckIsLite2);
                Object objK = ajwoVar.j.k(aihlVarCheckIsLite2.d);
                return (aoar) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK));
            }
        }
        return null;
    }

    public static aihf P(ajwo ajwoVar) {
        if (ajwoVar != null) {
            aihl aihlVar = aoaq.b;
            aihl aihlVarCheckIsLite = aihn.checkIsLite(aihlVar);
            ajwoVar.c(aihlVarCheckIsLite);
            if (ajwoVar.j.n(aihlVarCheckIsLite.d)) {
                aihl aihlVarCheckIsLite2 = aihn.checkIsLite(aihlVar);
                ajwoVar.c(aihlVarCheckIsLite2);
                Object objK = ajwoVar.j.k(aihlVarCheckIsLite2.d);
                return ((aoar) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK))).toBuilder();
            }
        }
        return aoar.a.createBuilder();
    }

    public static Integer Q(Context context, int i) {
        if (i == 1) {
            return null;
        }
        try {
            if (aecm.b(context) == 2) {
                return aecm.v(context, i);
            }
            int i2 = i - 1;
            if (i2 == 112) {
                return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_mobile_light_outline_rim));
            }
            switch (i2) {
                case 1:
                    return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_light_additive_background));
                case 2:
                    return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_light_additive_background_inverse));
                case 3:
                    return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_mobile_light_default_base_background));
                case 4:
                    return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_light_brand_red_contrast));
                case 5:
                    return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_light_button_chip_background_hover));
                case 6:
                    return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_light_call_to_action));
                case 7:
                    return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_light_call_to_action_hover));
                case 8:
                    return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_light_call_to_action_inverse));
                case 9:
                    return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_light_error_background_red));
                case 10:
                    return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_light_error_indicator));
                case 11:
                    return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_light_error_indicator_inverse));
                case 12:
                    return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_light_default_genai_1));
                case 13:
                    return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_light_default_genai_1_additive));
                case 14:
                    return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_light_default_genai_2));
                case 15:
                    return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_light_default_genai_2_additive));
                case 16:
                    return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_light_default_genai_3));
                case 17:
                    return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_light_default_genai_3_additive));
                case 18:
                    return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_light_default_genai_4));
                case 19:
                    return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_light_default_genai_4_additive));
                case 20:
                    return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_light_inverted_background));
                case 21:
                    return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_light_inverted_background_hover));
                case 22:
                    return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_light_keyboard_background));
                case 23:
                    return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_light_keyboard_background_action));
                case 24:
                    return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_light_keyboard_background_bar));
                case 25:
                    return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_light_keyboard_background_emoji));
                case 26:
                    return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_light_keyboard_background_key));
                case 27:
                    return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_light_keyboard_background_key_alt));
                case 28:
                    return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_light_keyboard_background_switch));
                case 29:
                    return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_light_keyboard_divider));
                case 30:
                    return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_light_keyboard_text_action));
                case 31:
                    return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_light_keyboard_text_character));
                case 32:
                    return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_light_keyboard_text_chevron));
                case 33:
                    return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_light_keyboard_text_icon));
                case 34:
                    return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_light_keyboard_text_symbol));
                case 35:
                    return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_light_menu_background));
                case 36:
                    return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_mobile_light_default_default_default_outline));
                case 37:
                    return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_light_default_outline_inverse));
                case 38:
                    return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_light_overlay_additive_background));
                case 39:
                    return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_mobile_light_default_overlay_background_brand));
                case 40:
                    return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_light_overlay_background_extra_light));
                case 41:
                    return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_mobile_light_default_default_overlay_background_heavy));
                case 42:
                    return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_mobile_light_default_default_overlay_background_light));
                case 43:
                    return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_mobile_light_default_default_overlay_background_medium));
                case 44:
                    return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_mobile_light_default_default_overlay_background_medium_light));
                case 45:
                    return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_light_overlay_background_solid));
                case 46:
                    return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_mobile_light_default_default_overlay_button_primary));
                case 47:
                    return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_mobile_light_default_default_overlay_button_secondary));
                case 48:
                    return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_light_overlay_call_to_action));
                case 49:
                    return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_light_overlay_green));
                case 50:
                    return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_mobile_light_default_default_overlay_text_disabled));
                case 51:
                    return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_light_overlay_text_primary));
                case 52:
                    return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_mobile_light_default_default_overlay_text_secondary));
                case 53:
                    return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_mobile_light_default_raised_background));
                case 54:
                    return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_light_red_indicator));
                case 55:
                    return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_light_static_black));
                case 56:
                    return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_light_static_brand_black));
                case 57:
                    return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_light_static_brand_red));
                case 58:
                    return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_light_static_brand_white));
                case 59:
                    return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_light_static_clear_black));
                case 60:
                    return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_light_static_clear_color));
                case 61:
                    return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_light_static_grey));
                case 62:
                    return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_light_static_white_background));
                case 63:
                    return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_light_status_bar));
                case 64:
                    return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_light_suggested_action));
                case 65:
                    return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_light_suggested_action_hover));
                case 66:
                    return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_light_suggested_action_inverse));
                case 67:
                    return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_light_system_bar));
                case 68:
                    return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_light_text_disabled));
                case 69:
                    return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_light_text_disabled_inverse));
                case 70:
                    return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_light_text_primary));
                case 71:
                    return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_mobile_light_default_default_text_primary_inverse));
                case 72:
                    return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_light_text_secondary));
                case 73:
                    return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_mobile_light_default_text_secondary_inverse));
                case 74:
                    return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_light_themed_green));
                case 75:
                    return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_light_themed_green_inverse));
                case 76:
                    return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_light_themed_overlay_background));
                case 77:
                    return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_light_touch_response));
                case 78:
                    return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_light_touch_response_inverse));
                case 79:
                    return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_light_wordmark_text));
                case 80:
                    return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_light_background_complete));
                case 81:
                    return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_light_background_warning));
                case 82:
                    return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_light_frosted_glass_desktop));
                case 83:
                    return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_light_frosted_glass_mobile));
                case 84:
                    return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_light_mono_filled_hover));
                case 85:
                    return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_light_mono_filled_hover_inverse));
                case 86:
                    return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_light_mono_tonal_hover));
                case 87:
                    return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_light_mono_tonal_hover_inverse));
                case 88:
                    return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_light_default_outline_inverse_opaque));
                case 89:
                    return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_light_outline_opaque));
                case 90:
                    return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_light_overlay_background_medium_heavy));
                case 91:
                    return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_light_overlay_button_secondary_darker));
                case 92:
                    return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_light_overlay_call_to_action_hover));
                case 93:
                    return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_light_overlay_filled_hover));
                case 94:
                    return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_light_default_overlay_text_primary_inverse));
                case 95:
                    return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_light_overlay_tonal_hover));
                case 96:
                    return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_light_overlay_touch_response));
                case 97:
                    return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_light_overlay_touch_response_inverse));
                case 98:
                    return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_light_shadow_medium));
                case 99:
                    return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_light_text_complete));
                case 100:
                    return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_light_text_error));
                case 101:
                    return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_light_text_warning));
                case 102:
                    return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_light_feed_vibrant_gradient1));
                case 103:
                    return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_light_feed_vibrant_gradient2));
                case 104:
                    return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_light_feed_vibrant_gradient3));
                case 105:
                    return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_light_static_ad_yellow));
                case 106:
                    return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_light_static_magenta));
                case 107:
                    return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_light_static_medium_magenta));
                default:
                    switch (i2) {
                        case 117:
                            return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_light_overlay_outline_rim));
                        case 118:
                            return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_light_outline_rim_inverse));
                        case 119:
                            return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_light_overlay_outline));
                        case 120:
                            return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_light_overlay_outline_inverse));
                        case 121:
                            return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_light_overlay_outline_rim_inverse));
                        case 122:
                            return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_light_default_overlay_solid_background));
                        case 123:
                            return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_light_overlay_solid_background_inverse));
                        case com.google.cardboard.sdk.R.styleable.AppCompatTheme_windowMinWidthMajor /* 124 */:
                            return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_light_overlay_solid_rim));
                        case com.google.cardboard.sdk.R.styleable.AppCompatTheme_windowMinWidthMinor /* 125 */:
                            return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_light_overlay_solid_rim_inverse));
                        case com.google.cardboard.sdk.R.styleable.AppCompatTheme_windowNoTitle /* 126 */:
                            return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_light_overlay_solid_wash));
                        case 127:
                            return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_light_overlay_solid_wash_inverse));
                        case SemanticState.Focused /* 128 */:
                            return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_light_overlay_tonal_background));
                        case 129:
                            return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_light_overlay_tonal_background_inverse));
                        case 130:
                            return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_light_overlay_tonal_rim));
                        case 131:
                            return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_light_overlay_tonal_rim_inverse));
                        case 132:
                            return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_light_overlay_tonal_wash));
                        case 133:
                            return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_light_overlay_tonal_wash_inverse));
                        case 134:
                            return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_light_default_solid_background));
                        case 135:
                            return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_light_default_solid_background_inverse));
                        case 136:
                            return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_mobile_light_solid_rim));
                        case 137:
                            return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_light_solid_rim_inverse));
                        case 138:
                            return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_mobile_light_solid_wash));
                        case 139:
                            return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_light_solid_wash_inverse));
                        case 140:
                            return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_light_tonal_background));
                        case 141:
                            return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_light_tonal_background_inverse));
                        case 142:
                            return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_mobile_light_tonal_rim));
                        case 143:
                            return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_light_tonal_rim_inverse));
                        case 144:
                            return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_mobile_light_tonal_wash));
                        case 145:
                            return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_light_tonal_wash_inverse));
                        case 146:
                            return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_light_static_dark_grey));
                        case 147:
                            return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_light_icon_warning));
                        case 148:
                            return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_light_blue_4));
                        case 149:
                            return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_light_green_6));
                        case 150:
                            return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_light_grey_4));
                        case 151:
                            return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_light_grey_6));
                        case 152:
                            return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_light_purple_6));
                        case 153:
                            return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_light_red_3));
                        case 154:
                            return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_light_red_4));
                        case 155:
                            return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_light_blue_1));
                        case 156:
                            return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_light_blue_2));
                        case 157:
                            return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_light_blue_3));
                        case 158:
                            return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_light_blue_5));
                        case 159:
                            return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_light_blue_6));
                        case 160:
                            return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_light_blue_7));
                        case 161:
                            return Integer.valueOf(context.getColor(R.color.yt_sys_color_baseline_outline_wash));
                        default:
                            return null;
                    }
            }
        } catch (Resources.NotFoundException unused) {
            return null;
        }
    }

    public static apji R(aqhl aqhlVar) {
        aqhm aqhmVar = aqhlVar.f;
        if (aqhmVar == null) {
            aqhmVar = aqhm.a;
        }
        if ((aqhmVar.b & 1) == 0) {
            if ((aqhlVar.b & 16) == 0) {
                return null;
            }
            apji apjiVar = aqhlVar.i;
            return apjiVar == null ? apji.a : apjiVar;
        }
        aqhm aqhmVar2 = aqhlVar.f;
        if (aqhmVar2 == null) {
            aqhmVar2 = aqhm.a;
        }
        apji apjiVar2 = aqhmVar2.c;
        return apjiVar2 == null ? apji.a : apjiVar2;
    }

    public static apji S(aqhl aqhlVar) {
        aqhm aqhmVar = aqhlVar.f;
        if (aqhmVar == null) {
            aqhmVar = aqhm.a;
        }
        if ((aqhmVar.b & 4) == 0) {
            if ((aqhlVar.b & 64) == 0) {
                return null;
            }
            apji apjiVar = aqhlVar.k;
            return apjiVar == null ? apji.a : apjiVar;
        }
        aqhm aqhmVar2 = aqhlVar.f;
        if (aqhmVar2 == null) {
            aqhmVar2 = aqhm.a;
        }
        apji apjiVar2 = aqhmVar2.e;
        return apjiVar2 == null ? apji.a : apjiVar2;
    }

    public static apji T(aqhl aqhlVar) {
        aqhm aqhmVar = aqhlVar.f;
        if (aqhmVar == null) {
            aqhmVar = aqhm.a;
        }
        if ((aqhmVar.b & 2) == 0) {
            if ((aqhlVar.b & 32) == 0) {
                return null;
            }
            apji apjiVar = aqhlVar.j;
            return apjiVar == null ? apji.a : apjiVar;
        }
        aqhm aqhmVar2 = aqhlVar.f;
        if (aqhmVar2 == null) {
            aqhmVar2 = aqhm.a;
        }
        apji apjiVar2 = aqhmVar2.d;
        return apjiVar2 == null ? apji.a : apjiVar2;
    }

    public static boolean U(aqhl aqhlVar) {
        aiie<aqhs> aiieVar = aqhlVar.g;
        aiieVar.getClass();
        if (aiieVar.isEmpty()) {
            return false;
        }
        for (aqhs aqhsVar : aiieVar) {
            int i = aqhsVar.c;
            if (i == 1) {
                if (((i == 1 ? (aoij) aqhsVar.d : aoij.a).b & 1) != 0) {
                    int i2 = aqhsVar.c;
                    int iAS = a.aS((i2 == 1 ? (aoij) aqhsVar.d : aoij.a).c);
                    if (iAS == 0 || iAS != 2) {
                        int iAS2 = a.aS((i2 == 1 ? (aoij) aqhsVar.d : aoij.a).c);
                        if (iAS2 == 0 || iAS2 == 1) {
                        }
                    }
                    return true;
                }
                continue;
            }
        }
        return false;
    }

    public static boolean V(assm assmVar) {
        assmVar.getClass();
        return assmVar.d.size() > 0;
    }

    public static boolean W(assm assmVar) {
        assmVar.getClass();
        if (!V(assmVar)) {
            return false;
        }
        aiie aiieVar = assmVar.d;
        aiieVar.getClass();
        if (!aiieVar.isEmpty()) {
            Iterator<E> it = aiieVar.iterator();
            while (it.hasNext()) {
                if ((((aqhl) it.next()).b & 1) == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public static adqc X(adqs adqsVar) {
        return adqsVar.b().b;
    }

    public static adql Y(adqs adqsVar) {
        return adqsVar.b().a;
    }

    public static adqq Z(adqs adqsVar) {
        return new adqq(((adqn) adqsVar).a);
    }

    public static long a(acfw acfwVar) {
        if (acfwVar != null) {
            return acfwVar.b();
        }
        return 0L;
    }

    public static void aA(double d, aihf aihfVar) {
        aihfVar.copyOnWrite();
        arby arbyVar = (arby) aihfVar.instance;
        arby arbyVar2 = arby.a;
        arbyVar.b |= 2;
        arbyVar.d = d;
    }

    public static /* synthetic */ aqot aB(aihf aihfVar) {
        aihn aihnVarBuild = aihfVar.build();
        aihnVarBuild.getClass();
        return (aqot) aihnVarBuild;
    }

    public static /* synthetic */ void aC(aihf aihfVar) {
        List listUnmodifiableList = DesugarCollections.unmodifiableList(((aqot) aihfVar.instance).d);
        listUnmodifiableList.getClass();
        new aikl(listUnmodifiableList);
    }

    public static /* synthetic */ aqkh aD(aihf aihfVar) {
        aihn aihnVarBuild = aihfVar.build();
        aihnVarBuild.getClass();
        return (aqkh) aihnVarBuild;
    }

    public static void aE(ajwe ajweVar, aihf aihfVar) {
        aihfVar.copyOnWrite();
        aqkh aqkhVar = (aqkh) aihfVar.instance;
        aqkh aqkhVar2 = aqkh.a;
        aqkhVar.d = ajweVar;
        aqkhVar.b |= 2;
    }

    public static /* synthetic */ aqhm aF(aihf aihfVar) {
        aihn aihnVarBuild = aihfVar.build();
        aihnVarBuild.getClass();
        return (aqhm) aihnVarBuild;
    }

    public static void aG(apji apjiVar, aihf aihfVar) {
        aihfVar.copyOnWrite();
        aqhm aqhmVar = (aqhm) aihfVar.instance;
        aqhm aqhmVar2 = aqhm.a;
        aqhmVar.c = apjiVar;
        aqhmVar.b |= 1;
    }

    public static void aH(apji apjiVar, aihf aihfVar) {
        aihfVar.copyOnWrite();
        aqhm aqhmVar = (aqhm) aihfVar.instance;
        aqhm aqhmVar2 = aqhm.a;
        aqhmVar.e = apjiVar;
        aqhmVar.b |= 4;
    }

    public static void aI(apji apjiVar, aihf aihfVar) {
        aihfVar.copyOnWrite();
        aqhm aqhmVar = (aqhm) aihfVar.instance;
        aqhm aqhmVar2 = aqhm.a;
        aqhmVar.d = apjiVar;
        aqhmVar.b |= 2;
    }

    public static /* synthetic */ aqhl aJ(aihf aihfVar) {
        aihn aihnVarBuild = aihfVar.build();
        aihnVarBuild.getClass();
        return (aqhl) aihnVarBuild;
    }

    public static void aK(String str, aihf aihfVar) {
        aihfVar.copyOnWrite();
        aqhl aqhlVar = (aqhl) aihfVar.instance;
        aqhl aqhlVar2 = aqhl.a;
        aqhlVar.b |= 1;
        aqhlVar.e = str;
    }

    public static void aL(aqhm aqhmVar, aihf aihfVar) {
        aihfVar.copyOnWrite();
        aqhl aqhlVar = (aqhl) aihfVar.instance;
        aqhl aqhlVar2 = aqhl.a;
        aqhlVar.f = aqhmVar;
        aqhlVar.b |= 2;
    }

    public static void aM(aqhn aqhnVar, aihf aihfVar) {
        aihfVar.copyOnWrite();
        aqhl aqhlVar = (aqhl) aihfVar.instance;
        aqhl aqhlVar2 = aqhl.a;
        aqhlVar.d = aqhnVar;
        aqhlVar.c = 5;
    }

    public static /* synthetic */ void aN(aihf aihfVar) {
        List listUnmodifiableList = DesugarCollections.unmodifiableList(((aqhl) aihfVar.instance).g);
        listUnmodifiableList.getClass();
        new aikl(listUnmodifiableList);
    }

    public static int aO(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 9;
            case 9:
                return 10;
            case 10:
            case 23:
            default:
                return 0;
            case 11:
                return 12;
            case 12:
                return 13;
            case 13:
                return 14;
            case 14:
                return 15;
            case 15:
                return 16;
            case 16:
                return 17;
            case 17:
                return 18;
            case 18:
                return 19;
            case 19:
                return 20;
            case 20:
                return 21;
            case 21:
                return 22;
            case 22:
                return 23;
            case 24:
                return 25;
            case 25:
                return 26;
            case 26:
                return 27;
            case 27:
                return 28;
            case 28:
                return 29;
            case 29:
                return 30;
            case 30:
                return 31;
            case 31:
                return 32;
            case 32:
                return 33;
            case 33:
                return 34;
            case 34:
                return 35;
            case 35:
                return 36;
            case 36:
                return 37;
            case 37:
                return 38;
            case 38:
                return 39;
            case 39:
                return 40;
            case 40:
                return 41;
            case 41:
                return 42;
            case 42:
                return 43;
            case 43:
                return 44;
            case 44:
                return 45;
            case 45:
                return 46;
            case 46:
                return 47;
            case 47:
                return 48;
            case 48:
                return 49;
        }
    }

    public static /* synthetic */ alba aP(aihh aihhVar) {
        aihn aihnVarBuild = aihhVar.build();
        aihnVarBuild.getClass();
        return (alba) aihnVarBuild;
    }

    public static void aQ(String str, aihh aihhVar) {
        str.getClass();
        aihhVar.copyOnWrite();
        alba albaVar = (alba) aihhVar.instance;
        alba albaVar2 = alba.a;
        albaVar.b |= 1;
        albaVar.c = str;
    }

    public static /* synthetic */ String aR(int i) {
        switch (i) {
            case 1:
                return "STOPPAGE_REASON_UNKNOWN";
            case 2:
                return "STOPPAGE_REASON_USER_INTENT";
            case 3:
                return "STOPPAGE_REASON_DETACH_FROM_ACTIVITY";
            case 4:
                return "STOPPAGE_REASON_AUDIO_FOCUS";
            case 5:
                return "STOPPAGE_DIRECTOR_RESET_INTERNALLY";
            case 6:
                return "STOPPAGE_INTERSTITIAL_ENDED";
            case 7:
                return "STOPPAGE_HEARTBEAT_END";
            case 8:
                return "STOPPAGE_PLAYBACK_INTERRUPTED";
            case 9:
                return "STOPPAGE_AFTER_SEEK_VIDEO_END";
            case 10:
                return "STOPPAGE_SEEK_PREVENT_AUTO_PLAY_NEW_PLAYER";
            case 11:
            default:
                return "null";
            case 12:
                return "STOPPAGE_SEQUENCELESS_RESET_PLAYBACK";
            case 13:
                return "STOPPAGE_SEQUENCEFUL_RESET_PLAYBACK";
            case 14:
                return "STOPPAGE_RELEASE_VIDEO";
            case 15:
                return "STOPPAGE_PICTURE_IN_PICTURE_CHANGE";
            case 16:
                return "STOPPAGE_BACKGROUND_PLAYABILITY";
            case 17:
                return "STOPPAGE_PLAYBACK_SUSPENDED";
            case 18:
                return "STOPPAGE_SCREEN_OFF_WHILE_PAUSED";
            case 19:
                return "STOPPAGE_GENERIC_PAUSE";
            case 20:
                return "STOPPAGE_PLAYER_SWITCH";
            case 21:
                return "STOPPAGE_INLINE_TO_WATCH";
            case 22:
                return "STOPPAGE_MOBILE_AUDIO_TIER_APP_RESET";
            case 23:
                return "STOPPAGE_HANDLE_SIGN_IN";
            case 24:
                return "STOPPAGE_WATCH_DUE_TO_REELS_PLAYBACK";
            case 25:
                return "STOPPAGE_PIP_NOT_SUPPORTED";
            case 26:
                return "STOPPAGE_MEDIA_SESSION_STOP";
            case 27:
                return "STOPPAGE_AUDIO_PLAYBACK_CONTROLLER";
            case 28:
                return "STOPPAGE_PLAYBACK_SHORTS_CONTROLLER";
            case 29:
                return "STOPPAGE_INLINE_PLAYER_CONTROLS";
            case 30:
                return "STOPPAGE_DEVICE_NOT_COMPLIANT";
            case 31:
                return "STOPPAGE_MUSIC_PLAYLIST_DELETION_WHILE_PLAYING";
            case 32:
                return "STOPPAGE_PAUSE_MUSIC_IN_WEAR";
            case 33:
                return "STOPPAGE_STOP_MUSIC_MEDIA_SESSION";
            case 34:
                return "STOPPAGE_MUSIC_OFFLINE_PLAYBACK_STOP";
            case 35:
                return "STOPPAGE_METERED_NETWORK_RESTRICTED";
            case 36:
                return "STOPPAGE_UNPLAYABLE_APP_POLICY_WIFI_CONTROLLER";
            case 37:
                return "STOPPAGE_INITIALIZE_NEW_FRAG_TUNEDER";
            case 38:
                return "STOPPAGE_VR_ACTIVITY_STOP_NO_BACKGROUND_PLAY";
            case 39:
                return "STOPPAGE_FALLBACK_TRANSITION";
            case 40:
                return "STOPPAGE_FATAL_TRANSITION_ERROR";
            case 41:
                return "STOPPAGE_ON_MEDIA_ERROR";
            case 42:
                return "STOPPAGE_RETRY_PLAYBACK";
            case 43:
                return "STOPPAGE_YOUTHERE_PROMPT_NO_USER_RESPONSE";
            case 44:
                return "STOPPAGE_SLEEP_TIMER_END";
            case 45:
                return "STOPPAGE_EMBARGOED";
        }
    }

    public static /* synthetic */ apxs aS(aihf aihfVar) {
        aihn aihnVarBuild = aihfVar.build();
        aihnVarBuild.getClass();
        return (apxs) aihnVarBuild;
    }

    public static void aT(akud akudVar, aihf aihfVar) {
        aihfVar.copyOnWrite();
        apxs apxsVar = (apxs) aihfVar.instance;
        apxs apxsVar2 = apxs.a;
        apxsVar.e = akudVar;
        apxsVar.d = 10;
    }

    public static int aU(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
            default:
                return 0;
            case 9:
                return 10;
            case 10:
                return 11;
            case 11:
                return 12;
            case 12:
                return 13;
            case 13:
                return 14;
            case 14:
                return 15;
            case 15:
                return 16;
            case 16:
                return 17;
            case 17:
                return 18;
        }
    }

    public static int aV(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 9;
            case 9:
                return 10;
            case 10:
                return 11;
            case 11:
                return 12;
            case 12:
                return 13;
            case 13:
                return 14;
            case 14:
                return 15;
            case 15:
                return 16;
            case 16:
                return 17;
            case 17:
                return 18;
            case 18:
                return 19;
            case 19:
                return 20;
            case 20:
                return 21;
            case 21:
                return 22;
            case 22:
                return 23;
            case 23:
                return 24;
            case 24:
                return 25;
            case 25:
                return 26;
            case 26:
                return 27;
            case 27:
                return 28;
            case 28:
                return 29;
            case 29:
                return 30;
            case 30:
                return 31;
            case 31:
                return 32;
            case 32:
                return 33;
            case 33:
                return 34;
            case 34:
                return 35;
            case 35:
                return 36;
            case 36:
                return 37;
            case 37:
                return 38;
            case 38:
                return 39;
            case 39:
                return 40;
            case 40:
                return 41;
            case 41:
                return 42;
            case 42:
                return 43;
            case 43:
                return 44;
            case 44:
                return 45;
            case 45:
                return 46;
            case 46:
                return 47;
            case 47:
                return 48;
            case 48:
                return 49;
            case 49:
                return 50;
            case 50:
                return 51;
            case 51:
                return 52;
            case 52:
                return 53;
            case 53:
                return 54;
            case 54:
                return 55;
            case 55:
                return 56;
            case 56:
                return 57;
            case 57:
                return 58;
            case 58:
                return 59;
            case 59:
                return 60;
            case 60:
                return 61;
            case 61:
                return 62;
            case 62:
                return 63;
            case 63:
                return 64;
            case 64:
                return 65;
            case 65:
                return 66;
            case 66:
                return 67;
            default:
                return 0;
        }
    }

    public static int aW(int i) {
        if (i == 0) {
            return 1;
        }
        switch (i) {
            case 20000:
                return 20001;
            case 20001:
                return 20002;
            case 20002:
                return 20003;
            case 20003:
                return 20004;
            case 20004:
                return 20005;
            case 20005:
                return 20006;
            case 20006:
                return 20007;
            case 20007:
                return 20008;
            case 20008:
                return 20009;
            case 20009:
                return 20010;
            case 20010:
                return 20011;
            case 20011:
                return 20012;
            case 20012:
                return 20013;
            case 20013:
                return 20014;
            case 20014:
                return 20015;
            case 20015:
                return 20016;
            case 20016:
                return 20017;
            case 20017:
                return 20018;
            case 20018:
                return 20019;
            case 20019:
                return 20020;
            default:
                switch (i) {
                    case 20024:
                        return 20025;
                    case 20025:
                        return 20026;
                    case 20026:
                        return 20027;
                    case 20027:
                        return 20028;
                    case 20028:
                        return 20029;
                    case 20029:
                        return 20030;
                    case 20030:
                        return 20031;
                    default:
                        switch (i) {
                            case 20034:
                                return 20035;
                            case 20035:
                                return 20036;
                            case 20036:
                                return 20037;
                            case 20037:
                                return 20038;
                            case 20038:
                                return 20039;
                            case 20039:
                                return 20040;
                            case 20040:
                                return 20041;
                            case 20041:
                                return 20042;
                            case 20042:
                                return 20043;
                            case 20043:
                                return 20044;
                            case 20044:
                                return 20045;
                            case 20045:
                                return 20046;
                            case 20046:
                                return 20047;
                            case 20047:
                                return 20048;
                            case 20048:
                                return 20049;
                            case 20049:
                                return 20050;
                            case 20050:
                                return 20051;
                            case 20051:
                                return 20052;
                            case 20052:
                                return 20053;
                            case 20053:
                                return 20054;
                            default:
                                return 0;
                        }
                }
        }
    }

    public static int aX(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 9;
            case 9:
                return 10;
            case 10:
                return 11;
            case 11:
                return 12;
            case 12:
                return 13;
            case 13:
                return 14;
            case 14:
                return 15;
            case 15:
                return 16;
            case 16:
                return 17;
            case 17:
                return 18;
            case 18:
                return 19;
            case 19:
                return 20;
            case 20:
                return 21;
            case 21:
                return 22;
            case 22:
                return 23;
            case 23:
                return 24;
            case 24:
                return 25;
            case 25:
                return 26;
            case 26:
                return 27;
            case 27:
                return 28;
            case 28:
                return 29;
            case 29:
                return 30;
            case 30:
                return 31;
            case 31:
                return 32;
            case 32:
            case 108:
            case 158:
            default:
                return 0;
            case 33:
                return 34;
            case 34:
                return 35;
            case 35:
                return 36;
            case 36:
                return 37;
            case 37:
                return 38;
            case 38:
                return 39;
            case 39:
                return 40;
            case 40:
                return 41;
            case 41:
                return 42;
            case 42:
                return 43;
            case 43:
                return 44;
            case 44:
                return 45;
            case 45:
                return 46;
            case 46:
                return 47;
            case 47:
                return 48;
            case 48:
                return 49;
            case 49:
                return 50;
            case 50:
                return 51;
            case 51:
                return 52;
            case 52:
                return 53;
            case 53:
                return 54;
            case 54:
                return 55;
            case 55:
                return 56;
            case 56:
                return 57;
            case 57:
                return 58;
            case 58:
                return 59;
            case 59:
                return 60;
            case 60:
                return 61;
            case 61:
                return 62;
            case 62:
                return 63;
            case 63:
                return 64;
            case 64:
                return 65;
            case 65:
                return 66;
            case 66:
                return 67;
            case 67:
                return 68;
            case 68:
                return 69;
            case 69:
                return 70;
            case 70:
                return 71;
            case 71:
                return 72;
            case 72:
                return 73;
            case 73:
                return 74;
            case 74:
                return 75;
            case 75:
                return 76;
            case 76:
                return 77;
            case 77:
                return 78;
            case 78:
                return 79;
            case 79:
                return 80;
            case 80:
                return 81;
            case 81:
                return 82;
            case 82:
                return 83;
            case 83:
                return 84;
            case 84:
                return 85;
            case 85:
                return 86;
            case 86:
                return 87;
            case 87:
                return 88;
            case 88:
                return 89;
            case 89:
                return 90;
            case 90:
                return 91;
            case 91:
                return 92;
            case 92:
                return 93;
            case 93:
                return 94;
            case 94:
                return 95;
            case 95:
                return 96;
            case 96:
                return 97;
            case 97:
                return 98;
            case 98:
                return 99;
            case 99:
                return 100;
            case 100:
                return 101;
            case 101:
                return 102;
            case 102:
                return 103;
            case 103:
                return 104;
            case 104:
                return 105;
            case 105:
                return 106;
            case 106:
                return 107;
            case 107:
                return 108;
            case 109:
                return 110;
            case 110:
                return 111;
            case 111:
                return 112;
            case 112:
                return 113;
            case 113:
                return 114;
            case 114:
                return 115;
            case 115:
                return 116;
            case 116:
                return 117;
            case 117:
                return 118;
            case 118:
                return 119;
            case 119:
                return 120;
            case 120:
                return 121;
            case 121:
                return 122;
            case 122:
                return 123;
            case 123:
                return com.google.cardboard.sdk.R.styleable.AppCompatTheme_windowMinWidthMajor;
            case com.google.cardboard.sdk.R.styleable.AppCompatTheme_windowMinWidthMajor /* 124 */:
                return com.google.cardboard.sdk.R.styleable.AppCompatTheme_windowMinWidthMinor;
            case com.google.cardboard.sdk.R.styleable.AppCompatTheme_windowMinWidthMinor /* 125 */:
                return com.google.cardboard.sdk.R.styleable.AppCompatTheme_windowNoTitle;
            case com.google.cardboard.sdk.R.styleable.AppCompatTheme_windowNoTitle /* 126 */:
                return 127;
            case 127:
                return SemanticState.Focused;
            case SemanticState.Focused /* 128 */:
                return 129;
            case 129:
                return 130;
            case 130:
                return 131;
            case 131:
                return 132;
            case 132:
                return 133;
            case 133:
                return 134;
            case 134:
                return 135;
            case 135:
                return 136;
            case 136:
                return 137;
            case 137:
                return 138;
            case 138:
                return 139;
            case 139:
                return 140;
            case 140:
                return 141;
            case 141:
                return 142;
            case 142:
                return 143;
            case 143:
                return 144;
            case 144:
                return 145;
            case 145:
                return 146;
            case 146:
                return 147;
            case 147:
                return 148;
            case 148:
                return 149;
            case 149:
                return 150;
            case 150:
                return 151;
            case 151:
                return 152;
            case 152:
                return 153;
            case 153:
                return 154;
            case 154:
                return 155;
            case 155:
                return 156;
            case 156:
                return 157;
            case 157:
                return 158;
            case 159:
                return 160;
            case 160:
                return 161;
            case 161:
                return 162;
            case 162:
                return 163;
            case 163:
                return 164;
            case 164:
                return 165;
            case 165:
                return 166;
            case 166:
                return 167;
            case 167:
                return 168;
            case 168:
                return 169;
            case 169:
                return 170;
            case 170:
                return 171;
            case 171:
                return 172;
            case 172:
                return 173;
            case 173:
                return 174;
            case 174:
                return 175;
            case 175:
                return 176;
            case 176:
                return 177;
            case 177:
                return 178;
            case 178:
                return 179;
            case 179:
                return 180;
            case 180:
                return 181;
            case 181:
                return 182;
            case 182:
                return 183;
            case 183:
                return 184;
            case 184:
                return 185;
            case 185:
                return 186;
            case 186:
                return 187;
            case 187:
                return 188;
            case 188:
                return 189;
            case 189:
                return 190;
            case 190:
                return 191;
            case 191:
                return 192;
            case 192:
                return 193;
            case 193:
                return 194;
            case 194:
                return 195;
            case 195:
                return 196;
            case 196:
                return 197;
            case 197:
                return 198;
            case 198:
                return 199;
            case 199:
                return 200;
            case 200:
                return 201;
            case 201:
                return 202;
            case 202:
                return 203;
            case 203:
                return 204;
            case 204:
                return 205;
            case 205:
                return 206;
            case 206:
                return 207;
            case 207:
                return 208;
            case 208:
                return 209;
            case 209:
                return 210;
            case 210:
                return 211;
            case 211:
                return 212;
            case 212:
                return 213;
            case 213:
                return 214;
            case 214:
                return 215;
            case 215:
                return ModuleDescriptor.MODULE_VERSION;
            case ModuleDescriptor.MODULE_VERSION /* 216 */:
                return 217;
            case 217:
                return 218;
            case 218:
                return 219;
            case 219:
                return 220;
            case 220:
                return 221;
            case 221:
                return 222;
            case 222:
                return 223;
            case 223:
                return 224;
            case 224:
                return 225;
            case 225:
                return 226;
            case 226:
                return 227;
            case 227:
                return 228;
        }
    }

    public static /* synthetic */ appb aY(aihf aihfVar) {
        aihn aihnVarBuild = aihfVar.build();
        aihnVarBuild.getClass();
        return (appb) aihnVarBuild;
    }

    public static void aZ(akdx akdxVar, aihf aihfVar) {
        aihfVar.copyOnWrite();
        appb appbVar = (appb) aihfVar.instance;
        appb appbVar2 = appb.a;
        appbVar.f = akdxVar;
        appbVar.b |= 16;
    }

    public static adqr aa(adqs adqsVar, awwd awwdVar) {
        return new adqr(adqsVar.b(), awwdVar);
    }

    public static awwd ab(adqs adqsVar) {
        return adqsVar.b().c;
    }

    public static /* synthetic */ int ac(Object obj) {
        Objects.checkIndex(0, 6);
        if (obj == null) {
            return -1;
        }
        if (obj instanceof adqn) {
            return 0;
        }
        if (obj instanceof adqp) {
            return 1;
        }
        if (obj instanceof adqo) {
            return 2;
        }
        if (obj instanceof adqq) {
            return 3;
        }
        return obj instanceof adqr ? 4 : -2;
    }

    public static void ad(Map map, adqh adqhVar, adps adpsVar, adpi adpiVar) {
        adpi adpiVar2;
        adox adouVar;
        adox adovVar;
        map.getClass();
        adqhVar.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            Objects.checkIndex(0, 7);
            if (value == null) {
                adpiVar2 = adpiVar;
            } else if (value instanceof adpv) {
                if (adpsVar != null) {
                    adpv adpvVar = (adpv) value;
                    str.getClass();
                    adpsVar.c.put(str, adpvVar);
                    RiveFile riveFile = adpsVar.g;
                    if (riveFile != null) {
                        adpsVar.e(riveFile, str, adpvVar);
                    }
                }
            } else if (!(value instanceof adpl)) {
                adpiVar2 = adpiVar;
                if (value instanceof adpy) {
                    adpy adpyVar = (adpy) value;
                    adqhVar.j(adpyVar.a, adpyVar.b);
                } else if (value instanceof adpx) {
                    adpx adpxVar = (adpx) value;
                    adqhVar.i(adpxVar.a, adpxVar.b, adpxVar.c, adpxVar.d);
                } else if (value instanceof adpw) {
                    if (adpsVar != null) {
                        adpw adpwVar = (adpw) value;
                        String str2 = adpwVar.a;
                        int i = adpwVar.b;
                        String str3 = adpwVar.c;
                        adpv adpvVar2 = adpwVar.d;
                        adpsVar.d.put(new adpn(str2, i, str3), adpvVar2);
                        RiveFile riveFile2 = adpsVar.g;
                        if (riveFile2 != null) {
                            adpsVar.f(riveFile2, str2, i, str3, adpvVar2);
                        }
                    }
                } else if (value instanceof adox) {
                    linkedHashMap.put(str, value);
                }
                adpiVar = adpiVar2;
            } else if (adpiVar != null) {
                adpl adplVar = (adpl) value;
                str.getClass();
                adpiVar.c.put(str, adplVar);
                RiveFile riveFile3 = adpiVar.f;
                if (riveFile3 != null) {
                    adpiVar.f(riveFile3, str, adplVar, adpiVar.g.get());
                }
            }
            value.getClass();
            Objects.checkIndex(0, 6);
            if (value instanceof adox) {
                adovVar = (adox) value;
            } else if (value instanceof Boolean) {
                adovVar = new ados(((Boolean) value).booleanValue());
            } else if (value instanceof Number) {
                adovVar = new adov(((Number) value).floatValue());
            } else {
                if (value instanceof String) {
                    adouVar = new adow((String) value);
                } else {
                    if (!(value instanceof ImageAsset)) {
                        Class<?> cls = value.getClass();
                        java.util.Objects.toString(cls);
                        throw new IllegalArgumentException("Unsupported property type: ".concat(String.valueOf(cls)));
                    }
                    adouVar = new adou((ImageAsset) value);
                }
                adovVar = adouVar;
            }
            linkedHashMap.put(str, adovVar);
            adpiVar = adpiVar2;
        }
        adqhVar.g(linkedHashMap);
    }

    public static /* synthetic */ int ae(Object obj) {
        Objects.checkIndex(0, 6);
        if (obj instanceof ados) {
            return 0;
        }
        if (obj instanceof adov) {
            return 1;
        }
        if (obj instanceof adow) {
            return 2;
        }
        if (obj instanceof adou) {
            return 3;
        }
        return obj instanceof adot ? 4 : -2;
    }

    public static void af(AutoCloseable autoCloseable) {
        if (autoCloseable != null) {
            try {
                autoCloseable.close();
            } catch (Exception unused) {
            }
        }
    }

    public static void ai(FontAsset fontAsset, String str) {
        fontAsset.getClass();
        str.getClass();
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet();
        if (str.length() > 0) {
            linkedHashSet.add(str);
            if (awrc.y(str, '.')) {
                int iA = awrc.A(str, '.', 0, 6);
                if (iA != -1) {
                    str = str.substring(0, iA);
                    str.getClass();
                }
                linkedHashSet.add(str);
            }
        }
        for (String str2 : linkedHashSet) {
            try {
                fontAsset.register(str2);
            } catch (Exception e) {
                ((agrc) ((agrc) adpi.a.c()).j(e).k("com/google/android/libraries/youtube/rendering/rive/RiveFontAssetLoader$Companion", "registerFontKeys", 361, "RiveFontAssetLoader.kt")).w("Failed to register FontAsset under key: %s", str2);
            }
        }
    }

    public static boolean aj(anfv anfvVar) {
        ajwo ajwoVarDT = yno.dT(anfvVar);
        if (ajwoVarDT != null) {
            aihl aihlVarCheckIsLite = aihn.checkIsLite(aofx.b);
            ajwoVarDT.c(aihlVarCheckIsLite);
            if (ajwoVarDT.j.n(aihlVarCheckIsLite.d)) {
                return true;
            }
        }
        return false;
    }

    public static boolean ak(anfv anfvVar) {
        ajwo ajwoVarDT = yno.dT(anfvVar);
        if (ajwoVarDT == null) {
            return false;
        }
        aihl aihlVarCheckIsLite = aihn.checkIsLite(arow.b);
        ajwoVarDT.c(aihlVarCheckIsLite);
        return ajwoVarDT.j.n(aihlVarCheckIsLite.d);
    }

    public static boolean al(anfv anfvVar) {
        ajwo ajwoVarDT = yno.dT(anfvVar);
        if (ajwoVarDT != null) {
            aihl aihlVarCheckIsLite = aihn.checkIsLite(aohd.b);
            ajwoVarDT.c(aihlVarCheckIsLite);
            if (ajwoVarDT.j.n(aihlVarCheckIsLite.d)) {
                return true;
            }
        }
        return false;
    }

    public static tpq am(Context context, abxu abxuVar, String str, rrq rrqVar) {
        ahex ahexVarS = abxuVar.s();
        Pattern pattern = qpr.a;
        qpq qpqVar = new qpq(context);
        qpqVar.c("rendering");
        qpqVar.d("rendering_settings.pb");
        Uri uriA = qpqVar.a();
        qrl qrlVarA = qrm.a();
        ainr ainrVar = ainr.a;
        qrlVarA.e(ainrVar);
        qrlVarA.f(uriA);
        qrn qrnVarD = qrp.d(context, ahexVarS);
        qrnVarD.c = str;
        qrnVarD.b();
        qrnVarD.d("permissions_requested");
        qrnVarD.e(new vlf(6));
        qrlVarA.b(qrnVarD.a());
        return new tpn(omj.U(rrqVar.c(qrlVarA.a())), ainrVar);
    }

    public static void an(axlj axljVar, aqhl aqhlVar, adrs adrsVar, boolean z) {
        String str;
        axljVar.getClass();
        aqhlVar.getClass();
        int i = aqhlVar.b;
        if ((i & 8) != 0) {
            str = aqhlVar.h;
        } else if ((i & 1) == 0) {
            return;
        } else {
            str = aqhlVar.e;
        }
        str.getClass();
        if (axljVar.w(str) != null) {
            if (z) {
                return;
            }
            axljVar.y(str);
            return;
        }
        apji apjiVarR = R(aqhlVar);
        if (apjiVarR != null) {
            axljVar.C(str, "suspense_content_data_key", adrsVar.a(apjiVarR), z);
        }
        apji apjiVarT = T(aqhlVar);
        if (apjiVarT != null) {
            axljVar.C(str, "suspense_placeholder_data_key", adrsVar.a(apjiVarT), z);
        }
        apji apjiVarS = S(aqhlVar);
        if (apjiVarS != null) {
            axljVar.C(str, "suspense_error_data_key", adrsVar.a(apjiVarS), z);
        }
        if (R(aqhlVar) != null) {
            axljVar.z(str, "suspense_content_data_key", z);
        } else if (T(aqhlVar) != null) {
            axljVar.z(str, "suspense_placeholder_data_key", z);
        } else if (S(aqhlVar) != null) {
            axljVar.z(str, "suspense_error_data_key", z);
        }
        aiie aiieVar = aqhlVar.g;
        aiieVar.getClass();
        if (aiieVar.isEmpty()) {
            return;
        }
        aiie aiieVar2 = aqhlVar.g;
        aiieVar2.getClass();
        axljVar.B(str, aguu.T(aiieVar2));
    }

    public static void ao(axlj axljVar, aqhl aqhlVar, String str, aijp aijpVar) {
        Object next;
        axljVar.getClass();
        str.getClass();
        if (aqhlVar != null) {
            aiie aiieVar = aqhlVar.g;
            aiieVar.getClass();
            Iterator<E> it = aiieVar.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                aqhs aqhsVar = (aqhs) next;
                int i = aqhsVar.c;
                if (i == 2) {
                    if (awrc.c((i == 2 ? (aqhp) aqhsVar.d : aqhp.a).c, str)) {
                        break;
                    }
                }
            }
            aqhs aqhsVar2 = (aqhs) next;
            if (aqhsVar2 != null) {
                if (aijpVar != null) {
                    aijp aijpVar2 = (aqhsVar2.c == 2 ? (aqhp) aqhsVar2.d : aqhp.a).d;
                    if (aijpVar2 == null) {
                        aijpVar2 = aijp.a;
                    }
                    aijp aijpVar3 = aikz.a;
                    if (aiky.a(aijpVar, aijpVar2) <= 0) {
                        return;
                    }
                }
                aq(axljVar, aqhlVar, aqhsVar2);
            }
        }
    }

    public static void ap(axlj axljVar, String str) {
        axljVar.getClass();
        str.getClass();
        axljVar.z(str, "suspense_error_data_key", false);
    }

    public static void aq(axlj axljVar, aqhl aqhlVar, aqhs aqhsVar) {
        String str = (aqhlVar.b & 8) != 0 ? aqhlVar.h : aqhlVar.e;
        str.getClass();
        int i = 1;
        if ((aqhsVar.b & 1) != 0) {
            int iAS = a.aS(aqhsVar.e);
            if (iAS != 0) {
                i = iAS;
            }
        } else {
            i = 2;
        }
        if (ar(i, axljVar, str)) {
            axljVar.z(str, "suspense_placeholder_data_key", false);
        }
    }

    public static boolean ar(int i, axlj axljVar, String str) {
        axljVar.getClass();
        str.getClass();
        if (axljVar.u(str, "suspense_placeholder_data_key") != null) {
            return i + (-1) == 2 || axljVar.u(str, "suspense_content_data_key") == null;
        }
        return false;
    }

    public static aqhl as(String str, assm assmVar, adel adelVar, axlj axljVar, boolean z, boolean z2) {
        Object next;
        str.getClass();
        assmVar.getClass();
        axljVar.getClass();
        agkj agkjVarAt = at(assmVar, adelVar, axljVar, z2);
        Collection collectionValues = agkjVarAt.values();
        collectionValues.getClass();
        Iterator it = collectionValues.iterator();
        loop0: while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            aiie aiieVar = ((aqhl) next).g;
            aiieVar.getClass();
            if (!aiieVar.isEmpty()) {
                Iterator<E> it2 = aiieVar.iterator();
                while (it2.hasNext()) {
                    if (((aqhs) it2.next()).c == 1) {
                        break loop0;
                    }
                }
            }
        }
        aqhl aqhlVar = (aqhl) next;
        String strV = (!z || axljVar.v(str) == null) ? (adelVar == null || (adelVar.c & 8) == 0) ? null : adelVar.h : axljVar.v(str);
        if (aqhlVar != null) {
            if (strV != null || !U(aqhlVar)) {
                aiie<aqhs> aiieVar2 = aqhlVar.g;
                aiieVar2.getClass();
                if (!aiieVar2.isEmpty()) {
                    for (aqhs aqhsVar : aiieVar2) {
                        int i = aqhsVar.c;
                        if (i == 1) {
                            if (((i == 1 ? (aoij) aqhsVar.d : aoij.a).b & 1) == 0) {
                                continue;
                            } else {
                                int iAS = a.aS((aqhsVar.c == 1 ? (aoij) aqhsVar.d : aoij.a).c);
                                if (iAS == 0 || iAS != 3) {
                                }
                            }
                        }
                    }
                }
            }
            return aqhlVar;
        }
        if (strV != null) {
            return (aqhl) agkjVarAt.get(strV);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Object, java.util.Map] */
    public static agkj at(assm assmVar, adel adelVar, axlj axljVar, boolean z) {
        int i;
        agke agkeVarT;
        apji apjiVarBx;
        apji apjiVarBx2;
        apji apjiVarBx3;
        assmVar.getClass();
        axljVar.getClass();
        aiie aiieVar = assmVar.d;
        aiieVar.getClass();
        agke agkeVarT2 = aguu.T(aiieVar);
        if (adelVar != null) {
            aiie<adei> aiieVar2 = adelVar.i;
            aiieVar2.getClass();
            ArrayList arrayList = new ArrayList(atqq.N(aiieVar2, 10));
            for (adei adeiVar : aiieVar2) {
                adeiVar.getClass();
                aihf aihfVarCreateBuilder = aqhl.a.createBuilder();
                aihfVarCreateBuilder.getClass();
                String str = adeiVar.c;
                str.getClass();
                aK(str, aihfVarCreateBuilder);
                aqhm aqhmVar = aqhm.a;
                aihf aihfVarCreateBuilder2 = aqhmVar.createBuilder();
                aihfVarCreateBuilder2.getClass();
                for (adek adekVar : adeiVar.f) {
                    int i2 = adekVar.b;
                    if ((i2 & 1) != 0 && (i2 & 2) != 0) {
                        aigj aigjVar = adekVar.d;
                        aigjVar.getClass();
                        apji apjiVarBx4 = bx(aigjVar);
                        if (apjiVarBx4 != null) {
                            String str2 = adekVar.c;
                            int iHashCode = str2.hashCode();
                            if (iHashCode != -2064014842) {
                                if (iHashCode != -1809995403) {
                                    if (iHashCode == 2124035899 && str2.equals("suspense_placeholder_data_key")) {
                                        aI(apjiVarBx4, aihfVarCreateBuilder2);
                                    }
                                } else if (str2.equals("suspense_content_data_key")) {
                                    aG(apjiVarBx4, aihfVarCreateBuilder2);
                                }
                            } else if (str2.equals("suspense_error_data_key")) {
                                aH(apjiVarBx4, aihfVarCreateBuilder2);
                            }
                        }
                    }
                }
                aqhm aqhmVarAF = aF(aihfVarCreateBuilder2);
                if (!awrc.c(aqhmVarAF, aqhmVar)) {
                    aL(aqhmVarAF, aihfVarCreateBuilder);
                }
                if ((adeiVar.b & 4) != 0) {
                    aqhn aqhnVar = adeiVar.d;
                    if (aqhnVar == null) {
                        aqhnVar = aqhn.a;
                    }
                    aqhnVar.getClass();
                    aM(aqhnVar, aihfVarCreateBuilder);
                }
                aiie aiieVar3 = adeiVar.e;
                aiieVar3.getClass();
                if (!aiieVar3.isEmpty()) {
                    aN(aihfVarCreateBuilder);
                    aiie aiieVar4 = adeiVar.e;
                    aiieVar4.getClass();
                    aihfVarCreateBuilder.cs(aiieVar4);
                }
                arrayList.add(aJ(aihfVarCreateBuilder));
            }
            i = 4;
            agkeVarT = aguu.T(arrayList);
        } else {
            i = 4;
            agkeVarT = agpi.a;
            agkeVarT.getClass();
        }
        List<aqhl> listAj = atqq.aj(agkeVarT2, agkeVarT);
        ArrayList arrayList2 = new ArrayList(atqq.N(listAj, 10));
        Iterator it = listAj.iterator();
        while (it.hasNext()) {
            arrayList2.add(((aqhl) it.next()).e);
        }
        agke agkeVarT3 = aguu.T(arrayList2);
        agke agkeVarN = agke.n(axljVar.b.keySet());
        agkeVarN.getClass();
        ArrayList<String> arrayList3 = new ArrayList();
        for (Object obj : agkeVarN) {
            if (agkeVarT3.contains((String) obj)) {
                arrayList3.add(obj);
            }
        }
        ArrayList arrayList4 = new ArrayList(atqq.N(arrayList3, 10));
        for (String str3 : arrayList3) {
            str3.getClass();
            aihf aihfVarCreateBuilder3 = aqhl.a.createBuilder();
            aihfVarCreateBuilder3.getClass();
            aK(str3, aihfVarCreateBuilder3);
            aqhm aqhmVar2 = aqhm.a;
            aihf aihfVarCreateBuilder4 = aqhmVar2.createBuilder();
            aihfVarCreateBuilder4.getClass();
            aigj aigjVar2 = (aigj) axljVar.u(str3, "suspense_content_data_key");
            if (aigjVar2 != null && (apjiVarBx3 = bx(aigjVar2)) != null) {
                aG(apjiVarBx3, aihfVarCreateBuilder4);
            }
            aigj aigjVar3 = (aigj) axljVar.u(str3, "suspense_placeholder_data_key");
            if (aigjVar3 != null && (apjiVarBx2 = bx(aigjVar3)) != null) {
                aI(apjiVarBx2, aihfVarCreateBuilder4);
            }
            aigj aigjVar4 = (aigj) axljVar.u(str3, "suspense_error_data_key");
            if (aigjVar4 != null && (apjiVarBx = bx(aigjVar4)) != null) {
                aH(apjiVarBx, aihfVarCreateBuilder4);
            }
            aqhm aqhmVarAF2 = aF(aihfVarCreateBuilder4);
            if (!awrc.c(aqhmVarAF2, aqhmVar2)) {
                aL(aqhmVarAF2, aihfVarCreateBuilder3);
            }
            aqhn aqhnVarT = axljVar.t(str3);
            if (aqhnVarT != null) {
                aM(aqhnVarT, aihfVarCreateBuilder3);
            }
            agke agkeVarS = axljVar.s(str3);
            if (agkeVarS != null) {
                aN(aihfVarCreateBuilder3);
                aihfVarCreateBuilder3.cs(agkeVarS);
            }
            arrayList4.add(aJ(aihfVarCreateBuilder3));
        }
        agke agkeVarT4 = aguu.T(arrayList4);
        if (z) {
            agjz agjzVar = new agjz(i);
            agjzVar.j(agkeVarT2);
            agjzVar.j(agkeVarT);
            agjzVar.j(agkeVarT4);
            agke agkeVarG = agjzVar.g();
            agkeVarG.getClass();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            agqs agqsVarListIterator = agkeVarG.listIterator(0);
            while (agqsVarListIterator.hasNext()) {
                E next = agqsVarListIterator.next();
                String str4 = ((aqhl) next).e;
                Object arrayList5 = linkedHashMap.get(str4);
                if (arrayList5 == null) {
                    arrayList5 = new ArrayList();
                    linkedHashMap.put(str4, arrayList5);
                }
                ((List) arrayList5).add(next);
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(atqq.u(linkedHashMap.size()));
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                Object key = entry.getKey();
                Iterator it2 = ((List) entry.getValue()).iterator();
                if (!it2.hasNext()) {
                    throw new UnsupportedOperationException("Empty collection can't be reduced.");
                }
                Object next2 = it2.next();
                while (it2.hasNext()) {
                    aqhl aqhlVar = (aqhl) it2.next();
                    aihf builder = ((aqhl) next2).toBuilder();
                    builder.mergeFrom((aihn) aqhlVar);
                    builder.getClass();
                    List listUnmodifiableList = DesugarCollections.unmodifiableList(((aqhl) builder.instance).g);
                    listUnmodifiableList.getClass();
                    List listAh = atqq.ah(listUnmodifiableList);
                    builder.copyOnWrite();
                    ((aqhl) builder.instance).g = aqhl.emptyProtobufList();
                    builder.cs(listAh);
                    next2 = (aqhl) builder.build();
                }
                linkedHashMap2.put(key, (aqhl) next2);
            }
            return aguu.U(linkedHashMap2);
        }
        ArrayList arrayList6 = new ArrayList(atqq.N(listAj, 10));
        for (aqhl aqhlVar2 : listAj) {
            arrayList6.add(new awml(aqhlVar2.e, aqhlVar2));
        }
        Map mapC = atqq.C(arrayList6);
        ArrayList arrayList7 = new ArrayList();
        for (Object obj2 : agkeVarT4) {
            aqhl aqhlVar3 = (aqhl) obj2;
            aqhl aqhlVar4 = (aqhl) mapC.get(aqhlVar3.e);
            if (aqhlVar4 != null) {
                aqhlVar3.getClass();
                aiie aiieVar5 = aqhlVar4.g;
                aiieVar5.getClass();
                if (aiieVar5.isEmpty() || !aqhlVar3.g.isEmpty()) {
                    if (aqhlVar4.c != 5 || aqhlVar3.c == 5) {
                        int i3 = aqhlVar4.b & 2;
                        if (i3 != 0 && i3 != 0) {
                            if ((aqhlVar3.b & 2) != 0) {
                                aqhm aqhmVar3 = aqhlVar4.f;
                                if (aqhmVar3 == null) {
                                    aqhmVar3 = aqhm.a;
                                }
                                aqhmVar3.getClass();
                                aqhm aqhmVar4 = aqhlVar3.f;
                                if (aqhmVar4 == null) {
                                    aqhmVar4 = aqhm.a;
                                }
                                aqhmVar4.getClass();
                                int i4 = aqhmVar3.b;
                                if ((i4 & 1) == 0 || (aqhmVar4.b & 1) != 0) {
                                    if ((i4 & 2) == 0 || (aqhmVar4.b & 2) != 0) {
                                        if ((i4 & 4) == 0 || (aqhmVar4.b & 4) != 0) {
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            arrayList7.add(obj2);
        }
        List<aqhl> listAj2 = atqq.aj(listAj, arrayList7);
        ArrayList arrayList8 = new ArrayList(atqq.N(listAj2, 10));
        for (aqhl aqhlVar5 : listAj2) {
            arrayList8.add(new awml(aqhlVar5.e, aqhlVar5));
        }
        return aguu.U(atqq.C(arrayList8));
    }

    public static int au(int i) {
        if (i == 112) {
            return 113;
        }
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 9;
            case 9:
                return 10;
            case 10:
                return 11;
            case 11:
                return 12;
            case 12:
                return 13;
            case 13:
                return 14;
            case 14:
                return 15;
            case 15:
                return 16;
            case 16:
                return 17;
            case 17:
                return 18;
            case 18:
                return 19;
            case 19:
                return 20;
            case 20:
                return 21;
            case 21:
                return 22;
            case 22:
                return 23;
            case 23:
                return 24;
            case 24:
                return 25;
            case 25:
                return 26;
            case 26:
                return 27;
            case 27:
                return 28;
            case 28:
                return 29;
            case 29:
                return 30;
            case 30:
                return 31;
            case 31:
                return 32;
            case 32:
                return 33;
            case 33:
                return 34;
            case 34:
                return 35;
            case 35:
                return 36;
            case 36:
                return 37;
            case 37:
                return 38;
            case 38:
                return 39;
            case 39:
                return 40;
            case 40:
                return 41;
            case 41:
                return 42;
            case 42:
                return 43;
            case 43:
                return 44;
            case 44:
                return 45;
            case 45:
                return 46;
            case 46:
                return 47;
            case 47:
                return 48;
            case 48:
                return 49;
            case 49:
                return 50;
            case 50:
                return 51;
            case 51:
                return 52;
            case 52:
                return 53;
            case 53:
                return 54;
            case 54:
                return 55;
            case 55:
                return 56;
            case 56:
                return 57;
            case 57:
                return 58;
            case 58:
                return 59;
            case 59:
                return 60;
            case 60:
                return 61;
            case 61:
                return 62;
            case 62:
                return 63;
            case 63:
                return 64;
            case 64:
                return 65;
            case 65:
                return 66;
            case 66:
                return 67;
            case 67:
                return 68;
            case 68:
                return 69;
            case 69:
                return 70;
            case 70:
                return 71;
            case 71:
                return 72;
            case 72:
                return 73;
            case 73:
                return 74;
            case 74:
                return 75;
            case 75:
                return 76;
            case 76:
                return 77;
            case 77:
                return 78;
            case 78:
                return 79;
            case 79:
                return 80;
            case 80:
                return 81;
            case 81:
                return 82;
            case 82:
                return 83;
            case 83:
                return 84;
            case 84:
                return 85;
            case 85:
                return 86;
            case 86:
                return 87;
            case 87:
                return 88;
            case 88:
                return 89;
            case 89:
                return 90;
            case 90:
                return 91;
            case 91:
                return 92;
            case 92:
                return 93;
            case 93:
                return 94;
            case 94:
                return 95;
            case 95:
                return 96;
            case 96:
                return 97;
            case 97:
                return 98;
            case 98:
                return 99;
            case 99:
                return 100;
            case 100:
                return 101;
            case 101:
                return 102;
            case 102:
                return 103;
            case 103:
                return 104;
            case 104:
                return 105;
            case 105:
                return 106;
            case 106:
                return 107;
            case 107:
                return 108;
            default:
                switch (i) {
                    case 117:
                        return 118;
                    case 118:
                        return 119;
                    case 119:
                        return 120;
                    case 120:
                        return 121;
                    case 121:
                        return 122;
                    case 122:
                        return 123;
                    case 123:
                        return com.google.cardboard.sdk.R.styleable.AppCompatTheme_windowMinWidthMajor;
                    case com.google.cardboard.sdk.R.styleable.AppCompatTheme_windowMinWidthMajor /* 124 */:
                        return com.google.cardboard.sdk.R.styleable.AppCompatTheme_windowMinWidthMinor;
                    case com.google.cardboard.sdk.R.styleable.AppCompatTheme_windowMinWidthMinor /* 125 */:
                        return com.google.cardboard.sdk.R.styleable.AppCompatTheme_windowNoTitle;
                    case com.google.cardboard.sdk.R.styleable.AppCompatTheme_windowNoTitle /* 126 */:
                        return 127;
                    case 127:
                        return SemanticState.Focused;
                    case SemanticState.Focused /* 128 */:
                        return 129;
                    case 129:
                        return 130;
                    case 130:
                        return 131;
                    case 131:
                        return 132;
                    case 132:
                        return 133;
                    case 133:
                        return 134;
                    case 134:
                        return 135;
                    case 135:
                        return 136;
                    case 136:
                        return 137;
                    case 137:
                        return 138;
                    case 138:
                        return 139;
                    case 139:
                        return 140;
                    case 140:
                        return 141;
                    case 141:
                        return 142;
                    case 142:
                        return 143;
                    case 143:
                        return 144;
                    case 144:
                        return 145;
                    case 145:
                        return 146;
                    case 146:
                        return 147;
                    case 147:
                        return 148;
                    case 148:
                        return 149;
                    case 149:
                        return 150;
                    case 150:
                        return 151;
                    case 151:
                        return 152;
                    case 152:
                        return 153;
                    case 153:
                        return 154;
                    case 154:
                        return 155;
                    case 155:
                        return 156;
                    case 156:
                        return 157;
                    case 157:
                        return 158;
                    case 158:
                        return 159;
                    case 159:
                        return 160;
                    case 160:
                        return 161;
                    case 161:
                        return 162;
                    case 162:
                        return 163;
                    case 163:
                        return 164;
                    case 164:
                        return 165;
                    case 165:
                        return 166;
                    case 166:
                        return 167;
                    default:
                        switch (i) {
                            case 168:
                                return 169;
                            case 169:
                                return 170;
                            case 170:
                                return 171;
                            case 171:
                                return 172;
                            case 172:
                                return 173;
                            case 173:
                                return 174;
                            case 174:
                                return 175;
                            case 175:
                                return 176;
                            case 176:
                                return 177;
                            case 177:
                                return 178;
                            case 178:
                                return 179;
                            case 179:
                                return 180;
                            case 180:
                                return 181;
                            case 181:
                                return 182;
                            case 182:
                                return 183;
                            case 183:
                                return 184;
                            case 184:
                                return 185;
                            case 185:
                                return 186;
                            case 186:
                                return 187;
                            case 187:
                                return 188;
                            case 188:
                                return 189;
                            case 189:
                                return 190;
                            case 190:
                                return 191;
                            case 191:
                                return 192;
                            case 192:
                                return 193;
                            case 193:
                                return 194;
                            case 194:
                                return 195;
                            case 195:
                                return 196;
                            case 196:
                                return 197;
                            case 197:
                                return 198;
                            case 198:
                                return 199;
                            case 199:
                                return 200;
                            case 200:
                                return 201;
                            case 201:
                                return 202;
                            default:
                                return 0;
                        }
                }
        }
    }

    public static int av(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 9;
            case 9:
                return 10;
            case 10:
                return 11;
            case 11:
                return 12;
            case 12:
                return 13;
            case 13:
                return 14;
            case 14:
                return 15;
            case 15:
                return 16;
            case 16:
                return 17;
            case 17:
                return 18;
            case 18:
                return 19;
            case 19:
                return 20;
            case 20:
                return 21;
            case 21:
                return 22;
            case 22:
                return 23;
            case 23:
                return 24;
            case 24:
                return 25;
            case 25:
                return 26;
            case 26:
                return 27;
            case 27:
                return 28;
            case 28:
                return 29;
            case 29:
                return 30;
            case 30:
                return 31;
            case 31:
                return 32;
            case 32:
                return 33;
            case 33:
                return 34;
            case 34:
                return 35;
            case 35:
                return 36;
            case 36:
                return 37;
            case 37:
                return 38;
            case 38:
                return 39;
            case 39:
                return 40;
            case 40:
                return 41;
            case 41:
                return 42;
            case 42:
                return 43;
            case 43:
                return 44;
            case 44:
                return 45;
            case 45:
                return 46;
            case 46:
                return 47;
            case 47:
                return 48;
            case 48:
                return 49;
            case 49:
                return 50;
            default:
                return 0;
        }
    }

    public static int aw(int i) {
        return i == 1 ? aiif.a() : i - 2;
    }

    public static int ax(int i) {
        if (i == 0) {
            return 2;
        }
        if (i == 34) {
            return 36;
        }
        if (i == 42) {
            return 44;
        }
        if (i == 48) {
            return 50;
        }
        if (i == 95) {
            return 97;
        }
        if (i == 104) {
            return 106;
        }
        if (i != 36) {
            return i != 37 ? 0 : 39;
        }
        return 38;
    }

    public static /* synthetic */ arby ay(aihf aihfVar) {
        aihn aihnVarBuild = aihfVar.build();
        aihnVarBuild.getClass();
        return (arby) aihnVarBuild;
    }

    public static void az(double d, aihf aihfVar) {
        aihfVar.copyOnWrite();
        arby arbyVar = (arby) aihfVar.instance;
        arby arbyVar2 = arby.a;
        arbyVar.b |= 1;
        arbyVar.c = d;
    }

    public static float b(wiu wiuVar, abnc abncVar, abxi abxiVar) {
        if (abzc.y(wiuVar, abncVar)) {
            return 0.0f;
        }
        return abncVar.a();
    }

    public static /* synthetic */ apox ba(aihf aihfVar) {
        aihn aihnVarBuild = aihfVar.build();
        aihnVarBuild.getClass();
        return (apox) aihnVarBuild;
    }

    public static /* synthetic */ apoq bb(aihf aihfVar) {
        aihn aihnVarBuild = aihfVar.build();
        aihnVarBuild.getClass();
        return (apoq) aihnVarBuild;
    }

    public static void bc(apok apokVar, aihf aihfVar) {
        aihfVar.copyOnWrite();
        apoq apoqVar = (apoq) aihfVar.instance;
        apoq apoqVar2 = apoq.a;
        apoqVar.u = apokVar;
        apoqVar.c |= 268435456;
    }

    public static /* synthetic */ apok bd(aihf aihfVar) {
        aihn aihnVarBuild = aihfVar.build();
        aihnVarBuild.getClass();
        return (apok) aihnVarBuild;
    }

    public static /* synthetic */ void be(aihf aihfVar) {
        List listUnmodifiableList = DesugarCollections.unmodifiableList(((apok) aihfVar.instance).c);
        listUnmodifiableList.getClass();
        new aikl(listUnmodifiableList);
    }

    public static int bf(int i) {
        switch (i) {
            case 0:
                return 8;
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 3;
            case 7:
                return 7;
            default:
                return 0;
        }
    }

    public static /* synthetic */ apoj bg(aihf aihfVar) {
        aihn aihnVarBuild = aihfVar.build();
        aihnVarBuild.getClass();
        return (apoj) aihnVarBuild;
    }

    public static void bh(ambj ambjVar, aihf aihfVar) {
        aihfVar.copyOnWrite();
        apoj apojVar = (apoj) aihfVar.instance;
        apoj apojVar2 = apoj.a;
        apojVar.c = ambjVar;
        apojVar.b = 6;
    }

    public static int bi(int i) {
        if (i == 0) {
            return 3;
        }
        if (i != 1) {
            return i != 3 ? 0 : 2;
        }
        return 1;
    }

    public static /* synthetic */ alwt bj(aihf aihfVar) {
        aihn aihnVarBuild = aihfVar.build();
        aihnVarBuild.getClass();
        return (alwt) aihnVarBuild;
    }

    public static void bk(aklk aklkVar, aihf aihfVar) {
        aihfVar.copyOnWrite();
        alwt alwtVar = (alwt) aihfVar.instance;
        alwt alwtVar2 = alwt.a;
        alwtVar.e = aklkVar;
        alwtVar.b |= 16;
    }

    public static /* synthetic */ apiu bl(aihf aihfVar) {
        aihn aihnVarBuild = aihfVar.build();
        aihnVarBuild.getClass();
        return (apiu) aihnVarBuild;
    }

    public static /* synthetic */ apic bm(aihf aihfVar) {
        aihn aihnVarBuild = aihfVar.build();
        aihnVarBuild.getClass();
        return (apic) aihnVarBuild;
    }

    public static /* synthetic */ apfo bn(aihf aihfVar) {
        aihn aihnVarBuild = aihfVar.build();
        aihnVarBuild.getClass();
        return (apfo) aihnVarBuild;
    }

    public static void bo(String str, aihf aihfVar) {
        str.getClass();
        aihfVar.copyOnWrite();
        apfo apfoVar = (apfo) aihfVar.instance;
        apfo apfoVar2 = apfo.a;
        apfoVar.b |= 1;
        apfoVar.c = str;
    }

    public static int bp(int i) {
        switch (i) {
            case 0:
                return 15;
            case 1001:
                return 6;
            case 1182:
                return 7;
            case 1333:
                return 9;
            case 1916:
                return 10;
            case 2070:
                return 11;
            case 2402:
                return 12;
            case 2597:
                return 13;
            case 36890:
                return 8;
            case 37249:
                return 14;
            case 139970731:
                return 1;
            case 423410527:
                return 2;
            case 481628963:
                return 5;
            case 502632665:
                return 4;
            case 520708025:
                return 3;
            default:
                return 0;
        }
    }

    public static int bq(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 4) {
            return 5;
        }
        if (i != 8) {
            return i != 11 ? 0 : 12;
        }
        return 9;
    }

    public static /* synthetic */ aosi br(aihf aihfVar) {
        aihn aihnVarBuild = aihfVar.build();
        aihnVarBuild.getClass();
        return (aosi) aihnVarBuild;
    }

    public static void bs(String str, aihf aihfVar) {
        aihfVar.copyOnWrite();
        aosi aosiVar = (aosi) aihfVar.instance;
        aosi aosiVar2 = aosi.a;
        aosiVar.b |= 2;
        aosiVar.d = str;
    }

    public static void bt(int i, aihf aihfVar) {
        aihfVar.copyOnWrite();
        aosi aosiVar = (aosi) aihfVar.instance;
        aosi aosiVar2 = aosi.a;
        aosiVar.c = bu(i);
        aosiVar.b |= 1;
    }

    public static int bu(int i) {
        return i == 1 ? aiif.a() : i - 2;
    }

    public static int bv(int i) {
        if (i == 0) {
            return 2;
        }
        switch (i) {
            case 100:
                return 102;
            case 101:
                return 103;
            case 102:
                return 104;
            case 103:
                return 105;
            case 104:
                return 106;
            case 105:
                return 107;
            case 106:
                return 108;
            case 107:
                return 109;
            case 108:
                return 110;
            case 109:
                return 111;
            default:
                switch (i) {
                    case 200:
                        return 202;
                    case 201:
                        return 203;
                    case 202:
                        return 204;
                    case 203:
                        return 205;
                    default:
                        switch (i) {
                            case 300:
                                return 302;
                            case 301:
                                return 303;
                            case 302:
                                return 304;
                            default:
                                return 0;
                        }
                }
        }
    }

    public static int bw(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 2) {
            return 3;
        }
        if (i != 4) {
            return i != 5 ? 0 : 6;
        }
        return 5;
    }

    private static apji bx(aigj aigjVar) {
        try {
            return (apji) aihn.parseFrom(apji.a, aigjVar.h(), ExtensionRegistryLite.getGeneratedRegistry());
        } catch (aiik unused) {
            return null;
        }
    }

    public static abnv c(abob abobVar) {
        switch (abobVar.ordinal()) {
            case 0:
            case 4:
            case 5:
                return null;
            case 1:
                return abnv.a;
            case 2:
                return abnv.b;
            case 3:
                return abnv.c;
            case 6:
                return abnv.d;
            case 7:
                return abnv.e;
            case 8:
                return abnv.f;
            case 9:
                return abnv.h;
            default:
                throw new RuntimeException(null, null);
        }
    }

    public static acip d(acip acipVar) {
        while (acipVar instanceof acjl) {
            acipVar = ((acjl) acipVar).bs();
        }
        return acipVar;
    }

    public static tyy e(aciq aciqVar) {
        aciqVar.getClass();
        return new yyq(aciqVar, 4);
    }

    public static tyy f(abyv abyvVar) {
        abyvVar.getClass();
        return new yyq(abyvVar, 6);
    }

    public static tyy g(abyv abyvVar) {
        abyvVar.getClass();
        return new yyq(abyvVar, 5);
    }

    public static CuePointDataProviderWrapper.Holder h(ExecutorImpl executorImpl, String str, awku awkuVar) {
        return new CuePointDataProviderWrapper.Holder(executorImpl, new aalb(awkuVar, str, 2, null));
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0087  */
    /* JADX WARN: Code duplicated, block: B:31:0x008e  */
    /* JADX WARN: Code duplicated, block: B:33:0x0092  */
    /* JADX WARN: Code duplicated, block: B:34:0x0095  */
    /* JADX WARN: Code duplicated, block: B:37:0x0099 A[EDGE_INSN: B:37:0x0099->B:38:0x009a BREAK  A[LOOP:0: B:7:0x001d->B:50:?]] */
    /* JADX WARN: Code duplicated, block: B:48:0x0096 A[SYNTHETIC] */
    public static arif i(aciq aciqVar, abmt abmtVar, Set set) {
        arig arigVar;
        if (!abmtVar.q.l(271, 45813622L, false)) {
            arigVar = null;
            break;
        }
        abnl abnlVar = aciqVar.b;
        abnp abnpVar = aciqVar.c;
        if (abnlVar == null) {
            arigVar = null;
            break;
        }
        ajwo ajwoVar = abnlVar.b;
        agqr it = ((agqj) set).iterator();
        do {
            if (!it.hasNext()) {
                arigVar = null;
                break;
            }
            adif adifVar = (adif) it.next();
            if (ajwoVar != null) {
                aihl aihlVarCheckIsLite = aihn.checkIsLite(apfp.b);
                ajwoVar.c(aihlVarCheckIsLite);
                if (ajwoVar.j.n(aihlVarCheckIsLite.d)) {
                    aihl aihlVarCheckIsLite2 = aihn.checkIsLite(apfp.b);
                    ajwoVar.c(aihlVarCheckIsLite2);
                    Object objK = ajwoVar.j.k(aihlVarCheckIsLite2.d);
                    Object objC = objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK);
                    objC.getClass();
                    apfp apfpVar = (apfp) objC;
                    if (abnpVar != null && abnpVar.m) {
                        if ((apfpVar.c & 1073741824) == 0) {
                            ((acts) adifVar.a).e(ajtv.ERROR_LEVEL_ERROR, null, 198, 34, "ReelsWatchEndpointLoggingContextResolver: isAutoplaying is true but reelWatchEndpoint does not have autoAdvanceLoggingContext.");
                        }
                        if ((apfpVar.c & 1073741824) != 0) {
                            arigVar = apfpVar.J;
                            if (arigVar == null) {
                                arigVar = arig.a;
                            }
                        } else if ((apfpVar.c & 536870912) != 0) {
                            arigVar = apfpVar.I;
                            if (arigVar == null) {
                                arigVar = arig.a;
                            }
                        } else {
                            arigVar = null;
                        }
                    } else if ((apfpVar.c & 536870912) != 0) {
                        arigVar = apfpVar.I;
                        if (arigVar == null) {
                            arigVar = arig.a;
                        }
                    } else {
                        arigVar = null;
                    }
                } else {
                    arigVar = null;
                }
            } else {
                arigVar = null;
            }
        } while (arigVar == null);
        if (arigVar == null) {
            return null;
        }
        arif arifVar = arigVar.b;
        return arifVar == null ? arif.a : arifVar;
    }

    public static long j(acip acipVar) {
        abnl abnlVarN = acipVar.n();
        if (abnlVarN == null || !abnlVarN.E() || abnlVarN.b() > acipVar.w().i) {
            return -1L;
        }
        return abnlVarN.b();
    }

    public static long k(acip acipVar) {
        abnl abnlVarN = acipVar.n();
        if (abnlVarN == null || !abnlVarN.G()) {
            return -1L;
        }
        return abnlVarN.d();
    }

    public static wjf l(acip acipVar) {
        return acipVar.w().d;
    }

    public static yvx m(acip acipVar) {
        Optional optional;
        ablr ablrVarM = acipVar.m();
        String str = ablrVarM.i;
        if (str != null && (optional = (Optional) ablrVarM.h.b(str)) != null) {
            String str2 = ablrVarM.i;
            wjf wjfVar = (wjf) optional.orElse(null);
            if (str2 != null || wjfVar != null) {
                return new yvx(str2, wjfVar);
            }
        }
        return yvx.a;
    }

    public static abnl n(acip acipVar) {
        return acipVar.w().b;
    }

    public static abnp o(acip acipVar) {
        return acipVar.w().c;
    }

    public static Optional p(acip acipVar, wiu wiuVar) {
        ablr ablrVarM = acipVar.m();
        if (ablrVarM.e.a().isAfter(ablrVarM.d) || !wiuVar.aj() || ablrVarM.b.isEmpty()) {
            return Optional.empty();
        }
        return Optional.of(Float.valueOf(Math.max(((Float) ablrVarM.b.get()).floatValue(), ((Float) wiuVar.N().orElse(Float.valueOf((float) ablrVarM.g.g.b(2, 45726784L)))).floatValue())));
    }

    public static void q(acip acipVar) {
        acan acanVar = acipVar.br().c;
        if (acanVar != null) {
            acanVar.a();
        }
    }

    public static void r(acip acipVar, Duration duration) {
        acan acanVar = acipVar.br().c;
        if (acanVar != null) {
            acanVar.c.q(acbl.class, new acge(Long.MIN_VALUE, duration.toMillis(), 0, null));
        }
    }

    public static void s(acip acipVar, Duration duration) {
        acan acanVar = acipVar.br().c;
        if (acanVar != null) {
            acanVar.c.q(acbl.class, new acge(duration.toMillis(), Long.MAX_VALUE, 0, null));
        }
    }

    public static void t(acip acipVar, boolean z) {
        acipVar.br().b.kk(Boolean.valueOf(z));
    }

    public static void u(acip acipVar, boolean z) {
        acipVar.i().bo(z);
    }

    public static void v(acip acipVar, wiu wiuVar, float f) {
        ablr ablrVarM = acipVar.m();
        aoqd aoqdVar = wiuVar.d;
        ajhg ajhgVar = aoqdVar.g;
        if (ajhgVar == null) {
            ajhgVar = ajhg.a;
        }
        amuq amuqVar = ajhgVar.m;
        if (amuqVar == null) {
            amuqVar = amuq.a;
        }
        if (amuqVar.d) {
            ajhg ajhgVar2 = aoqdVar.g;
            if (ajhgVar2 == null) {
                ajhgVar2 = ajhg.a;
            }
            amuq amuqVar2 = ajhgVar2.m;
            if (amuqVar2 == null) {
                amuqVar2 = amuq.a;
            }
            ablrVarM.c = Optional.of(Integer.valueOf(amuqVar2.e));
            ablrVarM.b = Optional.of(Float.valueOf(f));
        }
    }

    public static acca w(acip acipVar) {
        return acipVar.br().d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.lang.Object, java.util.List] */
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
    public static void x(acip acipVar, bwb bwbVar, Duration duration, int i) throws yxm {
        acan acanVar = acipVar.br().c;
        if (acanVar == null) {
            throw new yxm(5, null);
        }
        acad acadVar = (acad) acanVar.a;
        acadVar.a.g(acadVar.b, false);
        acga acgaVar = acanVar.c;
        if (bwbVar != null) {
            acbg acbgVar = new acbg();
            acanVar.b.a(acbgVar, bwbVar, duration.toMillis(), i);
            try {
                acgaVar.h(new aeqc(acbgVar).d);
            } catch (bsz e) {
                throw new yxm(4, e);
            }
        }
    }

    public static void y(int i, int i2, alvl alvlVar, xeu xeuVar) {
        aihf aihfVarCreateBuilder = alhc.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        alhc alhcVar = (alhc) aihfVarCreateBuilder.instance;
        alhcVar.c = i - 1;
        alhcVar.b |= 1;
        aihfVarCreateBuilder.copyOnWrite();
        alhc alhcVar2 = (alhc) aihfVarCreateBuilder.instance;
        alhcVar2.d = i2 - 1;
        alhcVar2.b |= 2;
        if (alvlVar != null) {
            aigj aigjVar = alvlVar.t;
            aihfVarCreateBuilder.copyOnWrite();
            alhc alhcVar3 = (alhc) aihfVarCreateBuilder.instance;
            aigjVar.getClass();
            alhcVar3.b |= 4;
            alhcVar3.e = aigjVar;
        }
        if (xeuVar.b) {
            xff xffVarA = xeuVar.a(aihfVarCreateBuilder, alot.HEARTBEAT_ACTION_PLAYER_TRANSITIONED);
            ztf ztfVar = xffVarA.k.e;
            xffVarA.l = ztfVar.a();
            ztfVar.k(xffVarA);
            return;
        }
        alos alosVar = (alos) alou.a.createBuilder();
        alosVar.copyOnWrite();
        alou alouVar = (alou) alosVar.instance;
        alhc alhcVar4 = (alhc) aihfVarCreateBuilder.build();
        alhcVar4.getClass();
        alouVar.d = alhcVar4;
        alouVar.c = 330;
        xeuVar.b((alou) alosVar.build());
    }

    public static void z(acwf acwfVar, String str) {
        acwfVar.b = ackj.c(str);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v7 */
    public final Object ag(byte[] bArr, Context context, CommandQueue commandQueue, List list, awoq awoqVar) throws Throwable {
        adpz adpzVar;
        CommandQueue commandQueue2;
        Object obj;
        ?? r0;
        if (awoqVar instanceof adpz) {
            adpzVar = (adpz) awoqVar;
            int i = adpzVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                adpzVar.d = i - Integer.MIN_VALUE;
            } else {
                adpzVar = new adpz(this, awoqVar);
            }
        } else {
            adpzVar = new adpz(this, awoqVar);
        }
        Object objLoad = adpzVar.c;
        awox awoxVar = awox.a;
        int i2 = adpzVar.d;
        int i3 = 1;
        Alignment alignment = null;
        boolean z = false;
        try {
            if (i2 == 0) {
                atqp.j(objLoad);
                RiveFile.Companion companion = RiveFile.Companion;
                RiveFileSource.Bytes.m291constructorimpl(bArr);
                RiveFileSource.Bytes bytesM290boximpl = RiveFileSource.Bytes.m290boximpl(bArr);
                adpzVar.a = context;
                adpzVar.e = commandQueue;
                adpzVar.b = list;
                adpzVar.d = 1;
                objLoad = companion.load(bytesM290boximpl, commandQueue, adpzVar);
                if (objLoad == awoxVar) {
                    return awoxVar;
                }
                commandQueue2 = commandQueue;
                obj = context;
                r0 = list;
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Object obj2 = adpzVar.b;
                CommandQueue commandQueue3 = adpzVar.e;
                obj = adpzVar.a;
                atqp.j(objLoad);
                commandQueue2 = commandQueue3;
                r0 = obj2;
            }
            RiveFile riveFile = (RiveFile) objLoad;
            r0.add(riveFile);
            Artboard artboardFromFile$default = Artboard.Companion.fromFile$default(Artboard.Companion, riveFile, null, 2, null);
            r0.add(artboardFromFile$default);
            StateMachine stateMachineFromArtboard$default = StateMachine.Companion.fromArtboard$default(StateMachine.Companion, artboardFromFile$default, null, 2, null);
            r0.add(stateMachineFromArtboard$default);
            ViewModelSource.DefaultForArtboard.m357constructorimpl(artboardFromFile$default);
            ViewModelInstance viewModelInstanceFromFile = ViewModelInstance.Companion.fromFile(riveFile, ViewModelSource.DefaultForArtboard.m356boximpl(artboardFromFile$default).defaultInstance());
            r0.add(viewModelInstanceFromFile);
            RiveCanvasSession riveCanvasSession = new RiveCanvasSession((Context) obj, commandQueue2, artboardFromFile$default, stateMachineFromArtboard$default, viewModelInstanceFromFile, new Fit.Cover(alignment, i3, z ? 1 : 0), 0, (RiveSemanticsMode) null, 192, (awqx) null);
            r0.add(riveCanvasSession);
            return new ahgb(riveFile, artboardFromFile$default, stateMachineFromArtboard$default, viewModelInstanceFromFile, riveCanvasSession);
        } catch (CancellationException e) {
            throw e;
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x02a4 A[LOOP:3: B:100:0x029e->B:102:0x02a4, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:125:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:126:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:127:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:128:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:130:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:131:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:45:0x011c  */
    /* JADX WARN: Code duplicated, block: B:48:0x0124  */
    /* JADX WARN: Code duplicated, block: B:51:0x0135 A[LOOP:1: B:49:0x012f->B:51:0x0135, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:56:0x015b A[Catch: all -> 0x0219, RiveInitializationException -> 0x021b, TRY_ENTER, TRY_LEAVE, TryCatch #9 {RiveInitializationException -> 0x021b, all -> 0x0219, blocks: (B:21:0x008a, B:46:0x0120, B:56:0x015b), top: B:117:0x008a }] */
    /* JADX WARN: Code duplicated, block: B:62:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:66:0x01c4 A[Catch: RiveInitializationException -> 0x020e, all -> 0x0291, LOOP:0: B:64:0x01be->B:66:0x01c4, LOOP_END, TryCatch #3 {all -> 0x0291, blocks: (B:17:0x006a, B:63:0x01ad, B:64:0x01be, B:66:0x01c4, B:67:0x01d6, B:90:0x0236, B:60:0x018a), top: B:109:0x0030 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x001f  */
    /* JADX WARN: Code duplicated, block: B:94:0x0265 A[LOOP:2: B:92:0x025f->B:94:0x0265, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:97:0x028f A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [app.rive.core.CommandQueue, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v20, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r1v28 */
    /* JADX WARN: Type inference failed for: r1v29 */
    /* JADX WARN: Type inference failed for: r1v30 */
    /* JADX WARN: Type inference failed for: r1v31, types: [app.rive.core.CommandQueue] */
    /* JADX WARN: Type inference failed for: r1v36, types: [app.rive.core.CommandQueue] */
    /* JADX WARN: Type inference failed for: r1v42 */
    /* JADX WARN: Type inference failed for: r1v43 */
    /* JADX WARN: Type inference failed for: r20v1, types: [acfz] */
    /* JADX WARN: Type inference failed for: r23v1, types: [app.rive.core.CommandQueue] */
    /* JADX WARN: Type inference failed for: r24v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r25v2, types: [app.rive.core.CommandQueue] */
    /* JADX WARN: Type inference failed for: r2v0, types: [awqk] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v20, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v24, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v28 */
    /* JADX WARN: Type inference failed for: r2v29 */
    /* JADX WARN: Type inference failed for: r2v30 */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14, types: [awrm, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v16, types: [awrm] */
    /* JADX WARN: Type inference failed for: r6v17, types: [awrm] */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v22 */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Type inference failed for: r6v24 */
    /* JADX WARN: Type inference failed for: r6v25 */
    /* JADX WARN: Type inference failed for: r6v26 */
    /* JADX WARN: Type inference failed for: r6v3, types: [awrm] */
    /* JADX WARN: Type inference failed for: r6v4, types: [awrm] */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r8v0, types: [int] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v14, types: [app.rive.core.CommandQueue] */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v2, types: [app.rive.core.CommandQueue] */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v21, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v24, types: [app.rive.core.CommandQueue] */
    /* JADX WARN: Type inference failed for: r8v28 */
    /* JADX WARN: Type inference failed for: r8v29 */
    /* JADX WARN: Type inference failed for: r8v3, types: [app.rive.core.CommandQueue] */
    /* JADX WARN: Type inference failed for: r8v30 */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.lang.Object, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9, types: [java.lang.Object] */
    public final Object ah(byte[] bArr, Context context, awut awutVar, CommandQueue commandQueue, awqk awqkVar, awoq awoqVar) throws Throwable {
        adqa adqaVar;
        ?? r6;
        awnu awnuVar;
        awwq awwqVar;
        adpb adpbVar;
        awnu awnuVar2;
        awwq awwqVar2;
        adpb adpbVar2;
        awrm awrmVar;
        ?? arrayList;
        Context context2;
        awut awutVar2;
        Function0 function0;
        ?? r23;
        adqa adqaVar2;
        ?? r24;
        Object objAg;
        Function0 function1;
        ahgb ahgbVar;
        adqc adqcVar;
        ?? r25;
        ?? r8;
        Object objA;
        adqc adqcVar2;
        ahgb ahgbVar2;
        awnu awnuVar3;
        awwq awwqVar3;
        adpb adpbVar3;
        ArrayList arrayList2;
        Iterator it;
        byte[] bArr2 = bArr;
        ?? r1 = commandQueue;
        ?? r2 = awqkVar;
        if (awoqVar instanceof adqa) {
            adqaVar = (adqa) awoqVar;
            int i = adqaVar.i;
            if ((i & Integer.MIN_VALUE) != 0) {
                adqaVar.i = i - Integer.MIN_VALUE;
                r6 = this;
            } else {
                acfz acfzVar = this;
                adqaVar = new adqa(acfzVar, awoqVar);
                r6 = acfzVar;
            }
        } else {
            acfz acfzVar2 = this;
            adqaVar = new adqa(acfzVar2, awoqVar);
            r6 = acfzVar2;
        }
        Object obj = adqaVar.h;
        awox awoxVar = awox.a;
        ?? r9 = adqaVar.i;
        try {
            try {
                switch (r9) {
                    case 0:
                        atqp.j(obj);
                        if (bArr2.length == 0) {
                            throw new IllegalArgumentException("Failed requirement.");
                        }
                        awrmVar = new awrm();
                        arrayList = new ArrayList();
                        try {
                            r1.acquire("RiveNativeSession");
                            if (r2 != 0) {
                                adqaVar.a = bArr2;
                                context2 = context;
                                adqaVar.b = context2;
                                awutVar2 = awutVar;
                                adqaVar.c = awutVar2;
                                adqaVar.d = r1;
                                adqaVar.e = null;
                                adqaVar.f = awrmVar;
                                adqaVar.g = arrayList;
                                adqaVar.i = 1;
                                if (r2.invoke(r1, adqaVar) == awoxVar) {
                                    return awoxVar;
                                }
                            } else {
                                context2 = context;
                                awutVar2 = awutVar;
                            }
                            function0 = null;
                            r1 = r1;
                            arrayList = arrayList;
                            adqaVar.a = awutVar2;
                            adqaVar.b = r1;
                            adqaVar.c = function0;
                            adqaVar.d = awrmVar;
                            adqaVar.e = arrayList;
                            adqaVar.f = null;
                            adqaVar.g = null;
                            adqaVar.i = 2;
                            r23 = r1;
                            adqaVar2 = adqaVar;
                            r24 = arrayList;
                            try {
                                objAg = r6.ag(bArr2, context2, r23, r24, adqaVar2);
                                r1 = r23;
                                adqaVar = adqaVar2;
                                if (objAg != awoxVar) {
                                    return awoxVar;
                                }
                                r6 = awrmVar;
                                obj = objAg;
                                function1 = function0;
                                r2 = r24;
                                ahgbVar = (ahgb) obj;
                                if (ahgbVar == null) {
                                    awnuVar3 = new awnu((awnv) atqq.T(r2), 0);
                                    while (awnuVar3.hasNext()) {
                                        af((AutoCloseable) awnuVar3.next());
                                    }
                                    awwqVar3 = awwq.a;
                                    adpbVar3 = new adpb((awrm) r6, (CommandQueue) r1, (awoq) null, 2);
                                    adqaVar.a = null;
                                    adqaVar.b = null;
                                    adqaVar.c = null;
                                    adqaVar.d = null;
                                    adqaVar.e = null;
                                    adqaVar.i = 3;
                                    if (awro.p(awwqVar3, adpbVar3, adqaVar) == awoxVar) {
                                        return awoxVar;
                                    }
                                    return null;
                                }
                                Object obj2 = ahgbVar.d;
                                Object obj3 = ahgbVar.e;
                                Object obj4 = ahgbVar.a;
                                Object obj5 = ahgbVar.b;
                                r25 = r1;
                                try {
                                    adqcVar = new adqc((RiveFile) obj2, (Artboard) obj3, (StateMachine) obj4, (ViewModelInstance) obj5, (RiveCanvasSession) ahgbVar.c, r25);
                                    r8 = r25;
                                    adqcVar.g = function1;
                                    adoq adoqVar = adoq.a;
                                    adqaVar.a = awutVar2;
                                    adqaVar.b = r8;
                                    adqaVar.c = r6;
                                    adqaVar.d = r2;
                                    adqaVar.e = ahgbVar;
                                    adqaVar.f = adqcVar;
                                    adqaVar.i = 4;
                                    objA = adoqVar.a((RiveFile) obj2, (ViewModelInstance) obj5, adqaVar);
                                    if (objA == awoxVar) {
                                        return awoxVar;
                                    }
                                    obj = objA;
                                    adqcVar2 = adqcVar;
                                    ahgbVar2 = ahgbVar;
                                    r2 = r2;
                                    r6 = r6;
                                    r9 = r8;
                                    List list = (List) obj;
                                    arrayList2 = new ArrayList(atqq.N(list, 10));
                                    it = list.iterator();
                                    while (it.hasNext()) {
                                        arrayList2.add(((ViewModelInstance) ahgbVar2.b).getBooleanFlow((String) it.next()));
                                    }
                                    adqc adqcVar3 = adqcVar2;
                                    r6.a = awro.t(awutVar2, null, 0, new gme(new ikx(new awzl(r9.getSettledFlow(), ahgbVar2, 1), 5), arrayList2, adqcVar3, (awoq) null, 17), 3);
                                    adqcVar3.e = (awwd) r6.a;
                                    return adqcVar3;
                                } catch (RiveInitializationException e) {
                                    e = e;
                                    r9 = r25;
                                    ((agrc) ((agrc) adqc.a.c()).j(e).k("com/google/android/libraries/youtube/rendering/rive/RiveNativeSession$Companion", "create", 250, "RiveNativeSession.kt")).t("Failed to initialize Rive CommandQueue");
                                    awnuVar2 = new awnu((awnv) atqq.T(r2), 0);
                                    while (awnuVar2.hasNext()) {
                                        af((AutoCloseable) awnuVar2.next());
                                    }
                                    awwqVar2 = awwq.a;
                                    adpbVar2 = new adpb((awrm) r6, (CommandQueue) r9, (awoq) null, 2);
                                    adqaVar.a = null;
                                    adqaVar.b = null;
                                    adqaVar.c = null;
                                    adqaVar.d = null;
                                    adqaVar.e = null;
                                    adqaVar.f = null;
                                    adqaVar.g = null;
                                    adqaVar.i = 6;
                                    if (awro.p(awwqVar2, adpbVar2, adqaVar) != awoxVar) {
                                        return null;
                                    }
                                    return awoxVar;
                                } catch (Throwable th) {
                                    th = th;
                                    r9 = r25;
                                    awnuVar = new awnu((awnv) atqq.T(r2), 0);
                                    while (awnuVar.hasNext()) {
                                        af((AutoCloseable) awnuVar.next());
                                    }
                                    awwqVar = awwq.a;
                                    adpbVar = new adpb((awrm) r6, (CommandQueue) r9, (awoq) null, 2);
                                    adqaVar.a = th;
                                    adqaVar.b = null;
                                    adqaVar.c = null;
                                    adqaVar.d = null;
                                    adqaVar.e = null;
                                    adqaVar.f = null;
                                    adqaVar.g = null;
                                    adqaVar.i = 7;
                                    if (awro.p(awwqVar, adpbVar, adqaVar) == awoxVar) {
                                        return awoxVar;
                                    }
                                    throw th;
                                }
                            } catch (RiveInitializationException e2) {
                                e = e2;
                                r1 = r23;
                                arrayList = r24;
                                adqaVar = adqaVar2;
                                r6 = awrmVar;
                                r2 = arrayList;
                                r9 = r1;
                                ((agrc) ((agrc) adqc.a.c()).j(e).k("com/google/android/libraries/youtube/rendering/rive/RiveNativeSession$Companion", "create", 250, "RiveNativeSession.kt")).t("Failed to initialize Rive CommandQueue");
                                awnuVar2 = new awnu((awnv) atqq.T(r2), 0);
                                while (awnuVar2.hasNext()) {
                                    af((AutoCloseable) awnuVar2.next());
                                }
                                awwqVar2 = awwq.a;
                                adpbVar2 = new adpb((awrm) r6, (CommandQueue) r9, (awoq) null, 2);
                                adqaVar.a = null;
                                adqaVar.b = null;
                                adqaVar.c = null;
                                adqaVar.d = null;
                                adqaVar.e = null;
                                adqaVar.f = null;
                                adqaVar.g = null;
                                adqaVar.i = 6;
                                if (awro.p(awwqVar2, adpbVar2, adqaVar) != awoxVar) {
                                    return null;
                                }
                                return awoxVar;
                            } catch (Throwable th2) {
                                th = th2;
                                r1 = r23;
                                arrayList = r24;
                                adqaVar = adqaVar2;
                                r6 = awrmVar;
                                r2 = arrayList;
                                r9 = r1;
                                awnuVar = new awnu((awnv) atqq.T(r2), 0);
                                while (awnuVar.hasNext()) {
                                    af((AutoCloseable) awnuVar.next());
                                }
                                awwqVar = awwq.a;
                                adpbVar = new adpb((awrm) r6, (CommandQueue) r9, (awoq) null, 2);
                                adqaVar.a = th;
                                adqaVar.b = null;
                                adqaVar.c = null;
                                adqaVar.d = null;
                                adqaVar.e = null;
                                adqaVar.f = null;
                                adqaVar.g = null;
                                adqaVar.i = 7;
                                if (awro.p(awwqVar, adpbVar, adqaVar) == awoxVar) {
                                    return awoxVar;
                                }
                                throw th;
                            }
                        } catch (RiveInitializationException e3) {
                            e = e3;
                            r6 = awrmVar;
                            r2 = arrayList;
                            r9 = r1;
                            ((agrc) ((agrc) adqc.a.c()).j(e).k("com/google/android/libraries/youtube/rendering/rive/RiveNativeSession$Companion", "create", 250, "RiveNativeSession.kt")).t("Failed to initialize Rive CommandQueue");
                            awnuVar2 = new awnu((awnv) atqq.T(r2), 0);
                            while (awnuVar2.hasNext()) {
                                af((AutoCloseable) awnuVar2.next());
                            }
                            awwqVar2 = awwq.a;
                            adpbVar2 = new adpb((awrm) r6, (CommandQueue) r9, (awoq) null, 2);
                            adqaVar.a = null;
                            adqaVar.b = null;
                            adqaVar.c = null;
                            adqaVar.d = null;
                            adqaVar.e = null;
                            adqaVar.f = null;
                            adqaVar.g = null;
                            adqaVar.i = 6;
                            if (awro.p(awwqVar2, adpbVar2, adqaVar) != awoxVar) {
                                return null;
                            }
                            return awoxVar;
                        } catch (Throwable th3) {
                            th = th3;
                            r6 = awrmVar;
                            r2 = arrayList;
                            r9 = r1;
                            awnuVar = new awnu((awnv) atqq.T(r2), 0);
                            while (awnuVar.hasNext()) {
                                af((AutoCloseable) awnuVar.next());
                            }
                            awwqVar = awwq.a;
                            adpbVar = new adpb((awrm) r6, (CommandQueue) r9, (awoq) null, 2);
                            adqaVar.a = th;
                            adqaVar.b = null;
                            adqaVar.c = null;
                            adqaVar.d = null;
                            adqaVar.e = null;
                            adqaVar.f = null;
                            adqaVar.g = null;
                            adqaVar.i = 7;
                            if (awro.p(awwqVar, adpbVar, adqaVar) == awoxVar) {
                                return awoxVar;
                            }
                            throw th;
                        }
                    case 1:
                        r2 = adqaVar.g;
                        awrm awrmVar2 = (awrm) adqaVar.f;
                        Function0 function2 = (Function0) adqaVar.e;
                        r9 = (CommandQueue) adqaVar.d;
                        awutVar2 = (awut) adqaVar.c;
                        Context context3 = (Context) adqaVar.b;
                        byte[] bArr3 = (byte[]) adqaVar.a;
                        try {
                            atqp.j(obj);
                            awrmVar = awrmVar2;
                            r1 = r9;
                            arrayList = r2;
                            function0 = function2;
                            bArr2 = bArr3;
                            context2 = context3;
                            adqaVar.a = awutVar2;
                            adqaVar.b = r1;
                            adqaVar.c = function0;
                            adqaVar.d = awrmVar;
                            adqaVar.e = arrayList;
                            adqaVar.f = null;
                            adqaVar.g = null;
                            adqaVar.i = 2;
                            r23 = r1;
                            adqaVar2 = adqaVar;
                            r24 = arrayList;
                            objAg = r6.ag(bArr2, context2, r23, r24, adqaVar2);
                            r1 = r23;
                            adqaVar = adqaVar2;
                            if (objAg != awoxVar) {
                                return awoxVar;
                            }
                            r6 = awrmVar;
                            obj = objAg;
                            function1 = function0;
                            r2 = r24;
                            ahgbVar = (ahgb) obj;
                            if (ahgbVar == null) {
                                awnuVar3 = new awnu((awnv) atqq.T(r2), 0);
                                while (awnuVar3.hasNext()) {
                                    af((AutoCloseable) awnuVar3.next());
                                }
                                awwqVar3 = awwq.a;
                                adpbVar3 = new adpb((awrm) r6, (CommandQueue) r1, (awoq) null, 2);
                                adqaVar.a = null;
                                adqaVar.b = null;
                                adqaVar.c = null;
                                adqaVar.d = null;
                                adqaVar.e = null;
                                adqaVar.i = 3;
                                if (awro.p(awwqVar3, adpbVar3, adqaVar) == awoxVar) {
                                    return awoxVar;
                                }
                                return null;
                            }
                            Object obj6 = ahgbVar.d;
                            Object obj7 = ahgbVar.e;
                            Object obj8 = ahgbVar.a;
                            Object obj9 = ahgbVar.b;
                            r25 = r1;
                            adqcVar = new adqc((RiveFile) obj6, (Artboard) obj7, (StateMachine) obj8, (ViewModelInstance) obj9, (RiveCanvasSession) ahgbVar.c, r25);
                            r8 = r25;
                            adqcVar.g = function1;
                            adoq adoqVar2 = adoq.a;
                            adqaVar.a = awutVar2;
                            adqaVar.b = r8;
                            adqaVar.c = r6;
                            adqaVar.d = r2;
                            adqaVar.e = ahgbVar;
                            adqaVar.f = adqcVar;
                            adqaVar.i = 4;
                            objA = adoqVar2.a((RiveFile) obj6, (ViewModelInstance) obj9, adqaVar);
                            if (objA == awoxVar) {
                                return awoxVar;
                            }
                            obj = objA;
                            adqcVar2 = adqcVar;
                            ahgbVar2 = ahgbVar;
                            r2 = r2;
                            r6 = r6;
                            r9 = r8;
                            List list2 = (List) obj;
                            arrayList2 = new ArrayList(atqq.N(list2, 10));
                            it = list2.iterator();
                            while (it.hasNext()) {
                                arrayList2.add(((ViewModelInstance) ahgbVar2.b).getBooleanFlow((String) it.next()));
                            }
                            adqc adqcVar4 = adqcVar2;
                            r6.a = awro.t(awutVar2, null, 0, new gme(new ikx(new awzl(r9.getSettledFlow(), ahgbVar2, 1), 5), arrayList2, adqcVar4, (awoq) null, 17), 3);
                            adqcVar4.e = (awwd) r6.a;
                            return adqcVar4;
                        } catch (RiveInitializationException e4) {
                            e = e4;
                            r6 = awrmVar2;
                            ((agrc) ((agrc) adqc.a.c()).j(e).k("com/google/android/libraries/youtube/rendering/rive/RiveNativeSession$Companion", "create", 250, "RiveNativeSession.kt")).t("Failed to initialize Rive CommandQueue");
                            awnuVar2 = new awnu((awnv) atqq.T(r2), 0);
                            while (awnuVar2.hasNext()) {
                                af((AutoCloseable) awnuVar2.next());
                            }
                            awwqVar2 = awwq.a;
                            adpbVar2 = new adpb((awrm) r6, (CommandQueue) r9, (awoq) null, 2);
                            adqaVar.a = null;
                            adqaVar.b = null;
                            adqaVar.c = null;
                            adqaVar.d = null;
                            adqaVar.e = null;
                            adqaVar.f = null;
                            adqaVar.g = null;
                            adqaVar.i = 6;
                            if (awro.p(awwqVar2, adpbVar2, adqaVar) != awoxVar) {
                                return null;
                            }
                            return awoxVar;
                        } catch (Throwable th4) {
                            th = th4;
                            r6 = awrmVar2;
                            awnuVar = new awnu((awnv) atqq.T(r2), 0);
                            while (awnuVar.hasNext()) {
                                af((AutoCloseable) awnuVar.next());
                            }
                            awwqVar = awwq.a;
                            adpbVar = new adpb((awrm) r6, (CommandQueue) r9, (awoq) null, 2);
                            adqaVar.a = th;
                            adqaVar.b = null;
                            adqaVar.c = null;
                            adqaVar.d = null;
                            adqaVar.e = null;
                            adqaVar.f = null;
                            adqaVar.g = null;
                            adqaVar.i = 7;
                            if (awro.p(awwqVar, adpbVar, adqaVar) == awoxVar) {
                                return awoxVar;
                            }
                            throw th;
                        }
                    case 2:
                        r2 = (List) adqaVar.e;
                        r6 = (awrm) adqaVar.d;
                        function1 = (Function0) adqaVar.c;
                        r1 = (CommandQueue) adqaVar.b;
                        awut awutVar3 = (awut) adqaVar.a;
                        try {
                            atqp.j(obj);
                            awutVar2 = awutVar3;
                            r1 = r1;
                            r2 = r2;
                            r6 = r6;
                            ahgbVar = (ahgb) obj;
                            if (ahgbVar == null) {
                                awnuVar3 = new awnu((awnv) atqq.T(r2), 0);
                                while (awnuVar3.hasNext()) {
                                    af((AutoCloseable) awnuVar3.next());
                                }
                                awwqVar3 = awwq.a;
                                adpbVar3 = new adpb((awrm) r6, (CommandQueue) r1, (awoq) null, 2);
                                adqaVar.a = null;
                                adqaVar.b = null;
                                adqaVar.c = null;
                                adqaVar.d = null;
                                adqaVar.e = null;
                                adqaVar.i = 3;
                                if (awro.p(awwqVar3, adpbVar3, adqaVar) == awoxVar) {
                                    return awoxVar;
                                }
                                return null;
                            }
                            Object obj10 = ahgbVar.d;
                            Object obj11 = ahgbVar.e;
                            Object obj12 = ahgbVar.a;
                            Object obj13 = ahgbVar.b;
                            r25 = r1;
                            adqcVar = new adqc((RiveFile) obj10, (Artboard) obj11, (StateMachine) obj12, (ViewModelInstance) obj13, (RiveCanvasSession) ahgbVar.c, r25);
                            r8 = r25;
                            adqcVar.g = function1;
                            adoq adoqVar3 = adoq.a;
                            adqaVar.a = awutVar2;
                            adqaVar.b = r8;
                            adqaVar.c = r6;
                            adqaVar.d = r2;
                            adqaVar.e = ahgbVar;
                            adqaVar.f = adqcVar;
                            adqaVar.i = 4;
                            objA = adoqVar3.a((RiveFile) obj10, (ViewModelInstance) obj13, adqaVar);
                            if (objA == awoxVar) {
                                return awoxVar;
                            }
                            obj = objA;
                            adqcVar2 = adqcVar;
                            ahgbVar2 = ahgbVar;
                            r2 = r2;
                            r6 = r6;
                            r9 = r8;
                            List list3 = (List) obj;
                            arrayList2 = new ArrayList(atqq.N(list3, 10));
                            it = list3.iterator();
                            while (it.hasNext()) {
                                arrayList2.add(((ViewModelInstance) ahgbVar2.b).getBooleanFlow((String) it.next()));
                            }
                            adqc adqcVar5 = adqcVar2;
                            r6.a = awro.t(awutVar2, null, 0, new gme(new ikx(new awzl(r9.getSettledFlow(), ahgbVar2, 1), 5), arrayList2, adqcVar5, (awoq) null, 17), 3);
                            adqcVar5.e = (awwd) r6.a;
                            return adqcVar5;
                        } catch (RiveInitializationException e5) {
                            e = e5;
                            r9 = r1;
                            ((agrc) ((agrc) adqc.a.c()).j(e).k("com/google/android/libraries/youtube/rendering/rive/RiveNativeSession$Companion", "create", 250, "RiveNativeSession.kt")).t("Failed to initialize Rive CommandQueue");
                            awnuVar2 = new awnu((awnv) atqq.T(r2), 0);
                            while (awnuVar2.hasNext()) {
                                af((AutoCloseable) awnuVar2.next());
                            }
                            awwqVar2 = awwq.a;
                            adpbVar2 = new adpb((awrm) r6, (CommandQueue) r9, (awoq) null, 2);
                            adqaVar.a = null;
                            adqaVar.b = null;
                            adqaVar.c = null;
                            adqaVar.d = null;
                            adqaVar.e = null;
                            adqaVar.f = null;
                            adqaVar.g = null;
                            adqaVar.i = 6;
                            if (awro.p(awwqVar2, adpbVar2, adqaVar) != awoxVar) {
                                return null;
                            }
                            return awoxVar;
                        } catch (Throwable th5) {
                            th = th5;
                            r9 = r1;
                            awnuVar = new awnu((awnv) atqq.T(r2), 0);
                            while (awnuVar.hasNext()) {
                                af((AutoCloseable) awnuVar.next());
                            }
                            awwqVar = awwq.a;
                            adpbVar = new adpb((awrm) r6, (CommandQueue) r9, (awoq) null, 2);
                            adqaVar.a = th;
                            adqaVar.b = null;
                            adqaVar.c = null;
                            adqaVar.d = null;
                            adqaVar.e = null;
                            adqaVar.f = null;
                            adqaVar.g = null;
                            adqaVar.i = 7;
                            if (awro.p(awwqVar, adpbVar, adqaVar) == awoxVar) {
                                return awoxVar;
                            }
                            throw th;
                        }
                    case 3:
                        atqp.j(obj);
                        return null;
                    case 4:
                        adqcVar2 = (adqc) adqaVar.f;
                        ahgbVar2 = (ahgb) adqaVar.e;
                        List list4 = (List) adqaVar.d;
                        awrm awrmVar3 = (awrm) adqaVar.c;
                        CommandQueue commandQueue2 = (CommandQueue) adqaVar.b;
                        awutVar2 = (awut) adqaVar.a;
                        atqp.j(obj);
                        r2 = list4;
                        r6 = awrmVar3;
                        r9 = commandQueue2;
                        List list5 = (List) obj;
                        arrayList2 = new ArrayList(atqq.N(list5, 10));
                        it = list5.iterator();
                        while (it.hasNext()) {
                            arrayList2.add(((ViewModelInstance) ahgbVar2.b).getBooleanFlow((String) it.next()));
                        }
                        adqc adqcVar6 = adqcVar2;
                        r6.a = awro.t(awutVar2, null, 0, new gme(new ikx(new awzl(r9.getSettledFlow(), ahgbVar2, 1), 5), arrayList2, adqcVar6, (awoq) null, 17), 3);
                        adqcVar6.e = (awwd) r6.a;
                        return adqcVar6;
                    case 5:
                        adqc adqcVar7 = (adqc) adqaVar.a;
                        atqp.j(obj);
                        return adqcVar7;
                    case 6:
                        atqp.j(obj);
                        return null;
                    case 7:
                        Throwable th6 = (Throwable) adqaVar.a;
                        atqp.j(obj);
                        throw th6;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } catch (Throwable th7) {
                th = th7;
            }
        } catch (RiveInitializationException e6) {
            e = e6;
        }
    }

    public acfz(byte[] bArr) {
    }

    public acfz() {
    }

    public acfz(awmd awmdVar, awmd awmdVar2, awmd awmdVar3, awmd awmdVar4) {
        awmdVar.getClass();
        awmdVar2.getClass();
        awmdVar3.getClass();
        awmdVar4.getClass();
    }
}
