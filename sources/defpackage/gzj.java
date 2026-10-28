package defpackage;

import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PathEffect;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Trace;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.ContextThemeWrapper;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.TextView;
import androidx.car.app.model.Alert;
import app.rive.semantics.SemanticState;
import com.facebook.litho.ComponentTree;
import com.facebook.litho.TextContent;
import com.facebook.yoga.YogaNative;
import com.facebook.yoga.YogaNodeJNIBase;
import com.google.android.apps.youtube.music.R;
import com.google.android.apps.youtube.music.activities.MusicActivity;
import com.google.android.apps.youtube.music.watch.WatchFragment;
import com.google.android.apps.youtube.music.watchpage.ui.WatchWhileLayout;
import com.google.android.libraries.backup.Backup;
import com.google.android.libraries.youtube.notification.NotificationInteractionBroadcastReceiver;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import j$.util.DesugarCollections;
import j$.util.Objects;
import j$.util.Optional;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.function.Function;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class gzj {

    @Backup
    public static final String AUDIO_VIDEO_SWITCHER_DONT_PLAY_VIDEO_SETTING_USER_EDU_COUNT = "pref_key_audio_video_switcher_dont_play_video_setting_shown_count";

    @sxr
    public static final String AUTOPLAY_ENABLED = "autoplay_enabled";

    @sxr
    public static final String AUTO_OFFLINE_ENABLED = "enable_auto_offline";

    @sxr
    public static final String AUTO_OFFLINE_MAX_NUM_SONGS = "auto_offline_max_num_songs";

    @Backup
    public static final String BITRATE_AUDIO_MOBILE = "BitrateAudioMobile";

    @Backup
    public static final String BITRATE_AUDIO_WIFI = "BitrateAudioWiFi";

    @Backup
    public static final String DOGFOOD_WARNING_SHOWN_VERSION = "dogfood_warning_shown_version";

    @sxr
    public static final String DONT_PLAY_VIDEO_SETTING = "pref_key_dont_play_video";

    @sxr
    public static final String HAS_USER_CHANGED_DEFAULT_AUTOPLAY_MODE = "has_user_changed_default_autoplay_mode";

    @sxr
    public static final String LOOP_MODE = "pref_key_loop_mode";

    @Backup
    public static final String OFFLINE_AUDIO_QUALITY = "offline_audio_quality";

    @Backup
    public static final String OFFLINE_QUALITY = "offline_quality";

    @Backup
    public static final String PAUSE_SEARCH_HISTORY = "pause_search_history";

    @Backup
    public static final String PAUSE_WATCH_HISTORY = "pause_watch_history";

    @Backup
    public static final String SHAKE_TO_SEND_FEEDBACK = "pref_key_shake_to_send_feedback";

    @Backup
    public static final String STREAM_OVER_WIFI_ONLY = "stream_over_wifi_only";
    public static volatile fvz c;
    public static volatile fvy d;
    public static volatile fio e;
    public static Paint f;
    public static Paint g;
    public static Rect h;
    public static Paint i;
    public static Paint j;

    public gzj(List list) {
        DesugarCollections.unmodifiableList(list);
    }

    public static Optional A(dd ddVar) {
        return Optional.ofNullable((WatchFragment) ddVar.f(R.id.watch_fragment));
    }

    public static WatchWhileLayout B(MusicActivity musicActivity) {
        return (WatchWhileLayout) musicActivity.findViewById(R.id.watch_while_layout);
    }

    public static tth C(Activity activity) {
        return new ttr(activity.getWindow(), activity.findViewById(R.id.watch_while_layout));
    }

    public static hwn D(Context context, acdf acdfVar, abgm abgmVar) {
        hwn hwnVar = new hwn(context);
        if (acdfVar instanceof acdf) {
            hwnVar.c(acdfVar);
        }
        if (abgmVar instanceof abgr) {
            hwnVar.c((abgr) abgmVar);
        }
        return hwnVar;
    }

    public static abkk E(xgn xgnVar, abkq abkqVar, Handler handler, acdo acdoVar, abvn abvnVar) {
        glj gljVar = new glj(xgnVar, 1);
        abvnVar.o();
        return new abkk(gljVar, abkqVar, handler, acdoVar);
    }

    public static Context F(afip afipVar) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper((Context) afipVar.b, ((tza) afipVar.c).a);
        afipVar.c(contextThemeWrapper, ajet.USER_INTERFACE_THEME_DARK);
        contextThemeWrapper.getTheme().applyStyle(R.style.LiveChatDarkThemeUpdates, true);
        return contextThemeWrapper;
    }

    public static spa G(tfq tfqVar) {
        return new spa(!tfqVar.i());
    }

    public static abwk H(abfx abfxVar, xgn xgnVar, hwc hwcVar, vxe vxeVar) {
        abhv abhvVar = new abhv((TextView) hwcVar.findViewById(R.id.player_learn_more_button));
        spi spiVar = abfxVar.a;
        if (spiVar.g != null) {
            throw new IllegalStateException();
        }
        spiVar.g = abhvVar;
        abhv abhvVar2 = spiVar.g;
        abhvVar2.a.setOnClickListener(new hxg(spiVar, 12));
        spiVar.g.a(8);
        return new abwk(abfxVar, xgnVar, vxeVar, new sod[0]);
    }

    public static boolean I(ajsy ajsyVar) {
        ajsyVar.getClass();
        ajsz ajszVar = ajsyVar.e;
        if (ajszVar == null) {
            ajszVar = ajsz.a;
        }
        int iR = aext.r(ajszVar.c);
        if (iR == 0) {
            iR = 1;
        }
        return iR == 4 || iR == 17;
    }

    public static void J(AppBarLayout appBarLayout) {
        StateListAnimator stateListAnimator = new StateListAnimator();
        stateListAnimator.addState(new int[0], ObjectAnimator.ofFloat(appBarLayout, "elevation", appBarLayout.getResources().getDimensionPixelSize(R.dimen.design_appbar_elevation)));
        appBarLayout.setStateListAnimator(stateListAnimator);
    }

    public static void K(CollapsingToolbarLayout collapsingToolbarLayout) {
        int i2 = bac.a;
        int i3 = collapsingToolbarLayout.getLayoutDirection() == 1 ? 5 : 3;
        aeyb aeybVar = collapsingToolbarLayout.a;
        int i4 = i3 | 80;
        aeybVar.x(i4);
        aeyb aeybVar2 = collapsingToolbarLayout.b;
        aeybVar2.x(i4);
        int i5 = i3 | 16;
        aeybVar.s(i5);
        aeybVar2.s(i5);
    }

    public static void L(Toolbar toolbar, int i2) {
        toolbar.q(i2);
        Drawable drawableE = toolbar.e();
        if (drawableE != null) {
            drawableE.setAutoMirrored(true);
        }
    }

    public static void M(AppBarLayout appBarLayout, iwe iweVar, float f2) {
        int i2 = ((int) (f2 * 255.0f)) << 24;
        iweVar.a(i2);
        appBarLayout.setBackgroundColor(i2);
    }

    public static void N(Toolbar toolbar) {
        Object objA;
        if (toolbar == null || toolbar.f() == null) {
            return;
        }
        for (int i2 = 0; i2 < toolbar.f().size(); i2++) {
            MenuItem item = toolbar.f().getItem(i2);
            if (item instanceof awj) {
                objA = ((awj) item).a();
            } else {
                Log.w("MenuItemCompat", "getActionProvider: item does not implement SupportMenuItem; returning null");
                objA = null;
            }
            if (objA instanceof twn) {
                ((twn) objA).i();
            }
        }
    }

    public static ajwo O(ajwo ajwoVar, xzc xzcVar) {
        if (xzcVar == null || xzcVar.b() == 2) {
            return ajwoVar;
        }
        aihl aihlVarCheckIsLite = aihn.checkIsLite(aohu.a);
        ajwoVar.c(aihlVarCheckIsLite);
        if (!ajwoVar.j.n(aihlVarCheckIsLite.d)) {
            return ajwoVar;
        }
        aihl aihlVarCheckIsLite2 = aihn.checkIsLite(aohu.a);
        ajwoVar.c(aihlVarCheckIsLite2);
        Object objK = ajwoVar.j.k(aihlVarCheckIsLite2.d);
        if (!((aoht) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK))).d.equals("PPSV")) {
            aihl aihlVarCheckIsLite3 = aihn.checkIsLite(aohu.a);
            ajwoVar.c(aihlVarCheckIsLite3);
            Object objK2 = ajwoVar.j.k(aihlVarCheckIsLite3.d);
            if (!((aoht) (objK2 == null ? aihlVarCheckIsLite3.b : aihlVarCheckIsLite3.c(objK2))).d.equals("PPSE")) {
                return ajwoVar;
            }
        }
        aihh aihhVar = (aihh) ajwoVar.toBuilder();
        aihf builder = ((aoht) aihhVar.b(aohu.a)).toBuilder();
        builder.copyOnWrite();
        aoht aohtVar = (aoht) builder.instance;
        aohtVar.b |= 2;
        aohtVar.d = "";
        aihhVar.e(aohu.a, (aoht) builder.build());
        return (ajwo) aihhVar.build();
    }

    public static anzw P(ajwo ajwoVar) {
        if (ajwoVar != null) {
            aihl aihlVarCheckIsLite = aihn.checkIsLite(arik.a);
            ajwoVar.c(aihlVarCheckIsLite);
            if (ajwoVar.j.n(aihlVarCheckIsLite.d)) {
                aihl aihlVarCheckIsLite2 = aihn.checkIsLite(arik.a);
                ajwoVar.c(aihlVarCheckIsLite2);
                Object objK = ajwoVar.j.k(aihlVarCheckIsLite2.d);
                arij arijVar = (arij) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK));
                arii ariiVar = arijVar.s;
                if (ariiVar == null) {
                    ariiVar = arii.a;
                }
                if ((ariiVar.b & 1) != 0) {
                    arii ariiVar2 = arijVar.s;
                    if (ariiVar2 == null) {
                        ariiVar2 = arii.a;
                    }
                    arih arihVar = ariiVar2.c;
                    if (arihVar == null) {
                        arihVar = arih.a;
                    }
                    anzw anzwVarA = anzw.a(arihVar.d);
                    if (anzwVarA != null) {
                        return anzwVarA;
                    }
                }
                return anzw.MUSIC_VIDEO_TYPE_UNKNOWN;
            }
            aihl aihlVarCheckIsLite3 = aihn.checkIsLite(aohu.a);
            ajwoVar.c(aihlVarCheckIsLite3);
            if (ajwoVar.j.n(aihlVarCheckIsLite3.d)) {
                aihl aihlVarCheckIsLite4 = aihn.checkIsLite(aohu.a);
                ajwoVar.c(aihlVarCheckIsLite4);
                Object objK2 = ajwoVar.j.k(aihlVarCheckIsLite4.d);
                aohs aohsVar = ((aoht) (objK2 == null ? aihlVarCheckIsLite4.b : aihlVarCheckIsLite4.c(objK2))).h;
                if (aohsVar == null) {
                    aohsVar = aohs.a;
                }
                anzw anzwVarA2 = anzw.a(aohsVar.f);
                return anzwVarA2 == null ? anzw.MUSIC_VIDEO_TYPE_UNKNOWN : anzwVarA2;
            }
            aihl aihlVarCheckIsLite5 = aihn.checkIsLite(ish.a);
            ajwoVar.c(aihlVarCheckIsLite5);
            if (ajwoVar.j.n(aihlVarCheckIsLite5.d)) {
                return anzw.MUSIC_VIDEO_TYPE_ATV;
            }
        }
        return anzw.MUSIC_VIDEO_TYPE_UNKNOWN;
    }

    public static apzf Q(abnl abnlVar) {
        if (abnlVar == null || !X(abnlVar)) {
            return null;
        }
        ajwo ajwoVar = abnlVar.b;
        ajwoVar.getClass();
        aihl aihlVarCheckIsLite = aihn.checkIsLite(ish.a);
        ajwoVar.c(aihlVarCheckIsLite);
        Object objK = ajwoVar.j.k(aihlVarCheckIsLite.d);
        return (apzf) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK));
    }

    public static String R(ajwo ajwoVar) {
        if (ajwoVar != null) {
            aihl aihlVarCheckIsLite = aihn.checkIsLite(arik.a);
            ajwoVar.c(aihlVarCheckIsLite);
            if (ajwoVar.j.n(aihlVarCheckIsLite.d)) {
                aihl aihlVarCheckIsLite2 = aihn.checkIsLite(arik.a);
                ajwoVar.c(aihlVarCheckIsLite2);
                Object objK = ajwoVar.j.k(aihlVarCheckIsLite2.d);
                if ((((arij) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK))).b & 2) != 0) {
                    aihl aihlVarCheckIsLite3 = aihn.checkIsLite(arik.a);
                    ajwoVar.c(aihlVarCheckIsLite3);
                    Object objK2 = ajwoVar.j.k(aihlVarCheckIsLite3.d);
                    return ((arij) (objK2 == null ? aihlVarCheckIsLite3.b : aihlVarCheckIsLite3.c(objK2))).e;
                }
            }
        }
        if (ajwoVar != null) {
            aihl aihlVarCheckIsLite4 = aihn.checkIsLite(arix.a);
            ajwoVar.c(aihlVarCheckIsLite4);
            if (ajwoVar.j.n(aihlVarCheckIsLite4.d)) {
                aihl aihlVarCheckIsLite5 = aihn.checkIsLite(arix.a);
                ajwoVar.c(aihlVarCheckIsLite5);
                Object objK3 = ajwoVar.j.k(aihlVarCheckIsLite5.d);
                if ((((ariw) (objK3 == null ? aihlVarCheckIsLite5.b : aihlVarCheckIsLite5.c(objK3))).b & 1) != 0) {
                    aihl aihlVarCheckIsLite6 = aihn.checkIsLite(arix.a);
                    ajwoVar.c(aihlVarCheckIsLite6);
                    Object objK4 = ajwoVar.j.k(aihlVarCheckIsLite6.d);
                    return ((ariw) (objK4 == null ? aihlVarCheckIsLite6.b : aihlVarCheckIsLite6.c(objK4))).c;
                }
            }
        }
        return "";
    }

    public static String S(ajwo ajwoVar) {
        if (ajwoVar != null) {
            aihl aihlVarCheckIsLite = aihn.checkIsLite(arik.a);
            ajwoVar.c(aihlVarCheckIsLite);
            if (ajwoVar.j.n(aihlVarCheckIsLite.d)) {
                aihl aihlVarCheckIsLite2 = aihn.checkIsLite(arik.a);
                ajwoVar.c(aihlVarCheckIsLite2);
                Object objK = ajwoVar.j.k(aihlVarCheckIsLite2.d);
                return ((arij) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK))).g;
            }
        }
        return "";
    }

    public static boolean T(ajwo ajwoVar) {
        return igs.a(P(ajwoVar));
    }

    public static boolean U(ajwo ajwoVar) {
        return igs.c(P(ajwoVar));
    }

    public static boolean V(String str, String str2) {
        if (str == null || !str.startsWith("RQ")) {
            return str2 != null && str2.startsWith("RQ");
        }
        return true;
    }

    public static boolean W(ajwo ajwoVar) {
        if (ajwoVar == null) {
            return false;
        }
        aihl aihlVarCheckIsLite = aihn.checkIsLite(arik.a);
        ajwoVar.c(aihlVarCheckIsLite);
        if (!ajwoVar.j.n(aihlVarCheckIsLite.d)) {
            aihl aihlVarCheckIsLite2 = aihn.checkIsLite(arix.a);
            ajwoVar.c(aihlVarCheckIsLite2);
            if (!ajwoVar.j.n(aihlVarCheckIsLite2.d)) {
                aihl aihlVarCheckIsLite3 = aihn.checkIsLite(aohu.a);
                ajwoVar.c(aihlVarCheckIsLite3);
                if (!ajwoVar.j.n(aihlVarCheckIsLite3.d)) {
                    aihl aihlVarCheckIsLite4 = aihn.checkIsLite(ish.a);
                    ajwoVar.c(aihlVarCheckIsLite4);
                    if (!ajwoVar.j.n(aihlVarCheckIsLite4.d)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public static boolean X(abnl abnlVar) {
        ajwo ajwoVar;
        if (abnlVar == null || (ajwoVar = abnlVar.b) == null) {
            return false;
        }
        aihl aihlVarCheckIsLite = aihn.checkIsLite(ish.a);
        ajwoVar.c(aihlVarCheckIsLite);
        return ajwoVar.j.n(aihlVarCheckIsLite.d);
    }

    public static boolean Y(ajwo ajwoVar) {
        return !ab(ajwoVar);
    }

    public static boolean Z(ajwo ajwoVar) {
        if (ajwoVar == null) {
            return false;
        }
        aihl aihlVarCheckIsLite = aihn.checkIsLite(arik.a);
        ajwoVar.c(aihlVarCheckIsLite);
        if (!ajwoVar.j.n(aihlVarCheckIsLite.d)) {
            aihl aihlVarCheckIsLite2 = aihn.checkIsLite(aohu.a);
            ajwoVar.c(aihlVarCheckIsLite2);
            if (!ajwoVar.j.n(aihlVarCheckIsLite2.d)) {
                return false;
            }
        }
        return true;
    }

    public static String a(woo wooVar) {
        anqm anqmVarA;
        dov dovVar = new dov((int[]) null);
        dovVar.F("browseId", wooVar.a);
        dovVar.F("params", wooVar.b);
        dovVar.F("continuation", wooVar.i);
        dovVar.F("language", wooVar.F);
        if (hdu.h.contains(wooVar.a)) {
            almc almcVar = wooVar.E;
            if (almcVar == null || (almcVar.b & 64) == 0) {
                anqmVarA = anqm.MUSIC_LIBRARY_ITEM_VIEW_MODE_UNSPECIFIED;
            } else {
                anqd anqdVar = almcVar.d;
                if (anqdVar == null) {
                    anqdVar = anqd.a;
                }
                anqmVarA = anqm.a(anqdVar.c);
                if (anqmVarA == null) {
                    anqmVarA = anqm.MUSIC_LIBRARY_ITEM_VIEW_MODE_UNSPECIFIED;
                }
            }
            if (anqmVarA != anqm.MUSIC_LIBRARY_ITEM_VIEW_MODE_UNSPECIFIED) {
                dovVar.E("libraryItemViewMode", anqmVarA.d);
            }
        }
        return dovVar.D();
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [awmd, java.lang.Object] */
    public static hwz aA(Context context, rrq rrqVar, awmd awmdVar) {
        hfn hfnVar = (hfn) awmdVar.io();
        Pattern pattern = qpr.a;
        qpq qpqVar = new qpq(context);
        qpqVar.c("queuemodule");
        qpqVar.d("queue_eml_responses.pb");
        Uri uriA = qpqVar.a();
        qrl qrlVarA = qrm.a();
        qrlVarA.f(uriA);
        qrlVarA.e(aimf.a);
        qrx qrxVarC = rrqVar.c(qrlVarA.a());
        qrxVarC.getClass();
        kjc kjcVar = (kjc) hfnVar.a.io();
        kjcVar.getClass();
        return new hwz(qrxVarC, kjcVar);
    }

    public static abjp aB(awmd awmdVar, awmd awmdVar2, hfn hfnVar, iby ibyVar, awku awkuVar, abmt abmtVar) {
        abjp abjpVar = new abjp(new abjv(awmdVar, awmdVar2), hfnVar, abmtVar);
        abjpVar.C(ibyVar);
        abjpVar.p(new ibi(awkuVar, 2));
        return abjpVar;
    }

    public static vqt aC(final hfn hfnVar, final vxz vxzVar, vxz vxzVar2) {
        return !vxzVar2.l(240, 45794845L, false) ? new vqt() { // from class: gee
            @Override // defpackage.vqt
            public final void a(View view) {
                vxz vxzVar3 = vxzVar;
                hfn hfnVar2 = hfnVar;
                view.setPadding(view.getPaddingStart(), vxzVar3.l(130, 45835942L, false) ? 0 : hfnVar2.K(), view.getPaddingEnd(), hfnVar2.J());
            }
        } : new gef(hfnVar, vxzVar);
    }

    public static isi aD() {
        zrz zrzVar = new zrz();
        zrzVar.c = gzp.a;
        zrzVar.a = zrv.ANDROID_MUSIC;
        return new isi(zrzVar);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0036 A[Catch: all -> 0x006e, TryCatch #0 {all -> 0x006e, blocks: (B:5:0x000f, B:7:0x0013, B:9:0x001b, B:11:0x0021, B:15:0x0036, B:17:0x003c, B:19:0x0042, B:21:0x0048, B:23:0x004e, B:13:0x0027, B:24:0x0052, B:26:0x0056, B:30:0x0062, B:31:0x006d), top: B:36:0x000f }] */
    /* JADX WARN: Code duplicated, block: B:23:0x004e A[Catch: all -> 0x006e, TryCatch #0 {all -> 0x006e, blocks: (B:5:0x000f, B:7:0x0013, B:9:0x001b, B:11:0x0021, B:15:0x0036, B:17:0x003c, B:19:0x0042, B:21:0x0048, B:23:0x004e, B:13:0x0027, B:24:0x0052, B:26:0x0056, B:30:0x0062, B:31:0x006d), top: B:36:0x000f }] */
    public static void aE(int i2, int i3, int i4, int i5, Object obj, boolean z) {
        gzj gzjVar = fvp.b;
        boolean zAJ = aJ();
        if (zAJ) {
            fvp.a = true;
            gzj gzjVar2 = fvp.b;
            boolean z2 = fvn.a;
        }
        try {
            if (obj instanceof View) {
                View view = (View) obj;
                int i6 = i4 - i2;
                int i7 = i5 - i3;
                if (z || view.getMeasuredHeight() != i7 || view.getMeasuredWidth() != i6) {
                    view.measure(View.MeasureSpec.makeMeasureSpec(i6, 1073741824), View.MeasureSpec.makeMeasureSpec(i7, 1073741824));
                    if (z) {
                        view.layout(i2, i3, i4, i5);
                    } else if (view.getLeft() == i2 || view.getTop() != i3 || view.getRight() != i4 || view.getBottom() != i5) {
                        view.layout(i2, i3, i4, i5);
                    }
                } else if (view.getLeft() == i2) {
                    view.layout(i2, i3, i4, i5);
                } else {
                    view.layout(i2, i3, i4, i5);
                }
            } else {
                if (!(obj instanceof Drawable)) {
                    throw new IllegalStateException(a.cp(obj, "Unsupported mounted content "));
                }
                ((Drawable) obj).setBounds(i2, i3, i4, i5);
            }
            if (zAJ) {
                gzj gzjVar3 = fvp.b;
                boolean z3 = fvn.a;
            }
        } catch (Throwable th) {
            if (zAJ) {
                gzj gzjVar4 = fvp.b;
                boolean z4 = fvn.a;
            }
            throw th;
        }
    }

    public static void aF(flp flpVar, List list, String str) {
        if (flpVar instanceof flj) {
            list.addAll(((flj) flpVar).a());
        } else {
            if (flpVar != null) {
                list.add(flpVar);
                return;
            }
            throw new IllegalStateException("[" + str + "] Adding null to transition list is not allowed.");
        }
    }

    public static void aG(Drawable drawable, int i2, int i3) {
        Rect bounds = drawable.getBounds();
        drawable.setBounds(bounds.left, bounds.top, bounds.left + i2, bounds.top + i3);
        if (drawable instanceof fjx) {
            ((fjx) drawable).a(i2, i3);
        }
    }

    public static void aH(Drawable drawable, int i2, int i3) {
        Rect bounds = drawable.getBounds();
        drawable.setBounds(i2, i3, bounds.width() + i2, bounds.height() + i3);
        if (drawable instanceof fjx) {
        }
    }

    public static void aI(flq flqVar, flp flpVar, fmh fmhVar, inn innVar) {
        int i2 = 0;
        if (flpVar instanceof flv) {
            ArrayList arrayList = ((flv) flpVar).a;
            int size = arrayList.size();
            while (i2 < size) {
                aI(flqVar, (flp) arrayList.get(i2), fmhVar, innVar);
                i2++;
            }
            return;
        }
        if (!(flpVar instanceof flo)) {
            if (!(flpVar instanceof flj)) {
                throw new RuntimeException("Unhandled transition type: ".concat(String.valueOf(String.valueOf(flpVar))));
            }
            ArrayList arrayListA = ((flj) flpVar).a();
            int size2 = arrayListA.size();
            while (i2 < size2) {
                aI(flqVar, (flp) arrayListA.get(i2), fmhVar, innVar);
                i2++;
            }
            return;
        }
        flo floVar = (flo) flpVar;
        gev gevVar = floVar.e;
        aero aeroVar = (aero) gevVar.b;
        int i3 = aeroVar.a;
        if (flqVar.b.equals(aeroVar.b)) {
            aero aeroVar2 = (aero) gevVar.a;
            int i4 = aeroVar2.a;
            if (fmhVar.equals(aeroVar2.b)) {
                innVar.a = true;
                if (floVar.a()) {
                    innVar.b = floVar;
                }
            }
        }
    }

    public static boolean aJ() {
        return fvn.b && Build.VERSION.SDK_INT >= 29 && Trace.isEnabled();
    }

    public static oq aK(int i2, int i3, int i4) {
        if (i2 == -1) {
            return new ftp(i4);
        }
        switch (i2) {
            case 2147483643:
                return new frt(i3);
            case 2147483644:
                return new ftq(i3);
            case 2147483645:
                return new fqk(i3);
            case 2147483646:
                return new fqi();
            case Alert.DURATION_SHOW_INDEFINITELY /* 2147483647 */:
                return new fqj();
            default:
                return null;
        }
    }

    public static od aL(Context context, int i2) {
        if (i2 == 7 || i2 == 6 || i2 == 8) {
            return new fqn(context, i2 - 7);
        }
        return i2 == 1 ? new fqb(context) : new od(context);
    }

    public static int aM(int i2, float f2, boolean z) {
        if (f2 <= 0.0f || f2 > 1.0f) {
            return i2;
        }
        int i3 = (int) (i2 * f2);
        return z ? i2 + i3 : i2 - i3;
    }

    public static int aN(int i2, float f2, boolean z) {
        if (f2 <= 0.0f || f2 > 1.0f) {
            return i2;
        }
        int i3 = (int) (i2 * f2);
        return z ? i2 - i3 : i2 + i3;
    }

    public static void aO(boolean z, int i2, int i3, int i4, Set set) {
        int i5 = 0;
        if (z) {
            while (i5 < i4) {
                set.add(Integer.valueOf(i3 - i5));
                i5++;
            }
        } else {
            while (i5 < i4) {
                set.add(Integer.valueOf(i2 + i5));
                i5++;
            }
        }
    }

    public static void aP(fqc fqcVar, Map map, fif fifVar) {
        boolean z = fna.a;
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                fqcVar.a((String) entry.getKey(), entry.getValue());
            }
        }
        fqcVar.d = (omj) fifVar.b;
    }

    public static fkn aQ(fhd fhdVar, int i2, foe foeVar, foe foeVar2) {
        omj omjVarW = fhdVar.w();
        if (omjVarW == null) {
            return null;
        }
        fkn fknVarBN = bN(omjVarW, fhdVar.n(), omjVarW.p(fhdVar, i2), fhdVar.e);
        if (fknVarBN == null) {
            return fknVarBN;
        }
        fknVarBN.b("section_current", foeVar == null ? "null" : foeVar.f);
        fknVarBN.b("section_next", foeVar2 != null ? foeVar2.f : "null");
        return fknVarBN;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean aR(Drawable drawable, Drawable drawable2) {
        if (drawable == 0) {
            return drawable2 == 0;
        }
        if (drawable2 != 0) {
            return ((drawable instanceof fnx) && (drawable2 instanceof fnx)) ? ((fnx) drawable).b((fnx) drawable2) : drawable.equals(drawable2);
        }
        return false;
    }

    public static void aS() {
        if (!fna.d && !aT()) {
            throw new IllegalStateException("This must run on the main thread; but is running on ".concat(String.valueOf(Thread.currentThread().getName())));
        }
    }

    public static boolean aT() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    public static int aU(int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i2);
        if (mode == Integer.MIN_VALUE) {
            return Math.min(View.MeasureSpec.getSize(i2), i3);
        }
        if (mode == 0) {
            return i3;
        }
        if (mode == 1073741824) {
            return View.MeasureSpec.getSize(i2);
        }
        throw new IllegalStateException("Unexpected size mode: " + View.MeasureSpec.getMode(i2));
    }

    public static int aV(float f2, int i2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return 0;
        }
        int iP = rpi.p(f2);
        return i3 != 1 ? View.MeasureSpec.makeMeasureSpec(iP, Integer.MIN_VALUE) : View.MeasureSpec.makeMeasureSpec(iP, 1073741824);
    }

    public static fvq aW(fjr fjrVar, Rect rect, qx qxVar, fvq fvqVar) {
        return new fvq(fvqVar, fjrVar, qxVar, rect, fvqVar != null ? fvqVar.a() : 0);
    }

    public static boolean aX(fkl fklVar, fkl fklVar2) {
        if (fklVar == fklVar2) {
            return true;
        }
        if (fklVar2 != null && fklVar.J == fklVar2.J && bH(fklVar.A, fklVar2.A) && fklVar.n == fklVar2.n && bI(fklVar.r, fklVar2.r) && fklVar.i == fklVar2.i && fklVar.j == fklVar2.j && fklVar.k == fklVar2.k && bH(fklVar.a, fklVar2.a) && fklVar.G == fklVar2.G && bI(fklVar.s, fklVar2.s) && fklVar.D == fklVar2.D && bI(fklVar.z, fklVar2.z) && bI(fklVar.t, fklVar2.t) && bI(fklVar.B, fklVar2.B) && bH(fklVar.h, fklVar2.h) && bI(fklVar.C, fklVar2.C) && fklVar.o == fklVar2.o && fklVar.b() == fklVar2.b() && fklVar.l == fklVar2.l && fklVar.m == fklVar2.m && fklVar.p == fklVar2.p && fklVar.q == fklVar2.q && fklVar.H == fklVar2.H && fklVar.f == fklVar2.f && fklVar.g == fklVar2.g && bI(fklVar.x, fklVar2.x) && bH(fklVar.c, fklVar2.c)) {
            SparseArray sparseArray = fklVar.e;
            SparseArray sparseArray2 = fklVar2.e;
            if (sparseArray == sparseArray2) {
                return true;
            }
            if (sparseArray != null && sparseArray2 != null && sparseArray.size() == sparseArray2.size()) {
                int size = sparseArray.size();
                for (int i2 = 0; i2 < size; i2++) {
                    if (sparseArray.keyAt(i2) == sparseArray2.keyAt(i2) && bH(sparseArray.valueAt(i2), sparseArray2.valueAt(i2))) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001e  */
    /* JADX WARN: Code duplicated, block: B:13:0x0022 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:16:0x0027 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x0029 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:23:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    public static boolean aY(int i2, int i3, int i4) {
        int mode = View.MeasureSpec.getMode(i3);
        int size = View.MeasureSpec.getSize(i3);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (i2 != i3) {
            if (mode2 != 0) {
                if (mode == 1073741824 || size != i4) {
                    if (mode == Integer.MIN_VALUE || mode2 != 0) {
                        if (mode2 == Integer.MIN_VALUE || mode != Integer.MIN_VALUE || size2 <= size || i4 > size) {
                            return false;
                        }
                    } else if (size < i4) {
                        return false;
                    }
                }
            } else if (mode != 0) {
                mode2 = 0;
                if (mode == 1073741824) {
                    if (mode == Integer.MIN_VALUE) {
                        if (mode2 == Integer.MIN_VALUE) {
                            return false;
                        }
                        return false;
                    }
                    if (mode2 == Integer.MIN_VALUE) {
                        return false;
                    }
                    return false;
                }
                if (mode == Integer.MIN_VALUE) {
                    if (mode2 == Integer.MIN_VALUE) {
                        return false;
                    }
                    return false;
                }
                if (mode2 == Integer.MIN_VALUE) {
                    return false;
                }
                return false;
            }
        }
        return true;
    }

    public static boolean aZ(fjq fjqVar) {
        return fjqVar != null;
    }

    public static boolean aa(abnl abnlVar) {
        ajwo ajwoVar;
        if (abnlVar == null || (ajwoVar = abnlVar.b) == null) {
            return false;
        }
        aihl aihlVarCheckIsLite = aihn.checkIsLite(arik.a);
        ajwoVar.c(aihlVarCheckIsLite);
        if (!ajwoVar.j.n(aihlVarCheckIsLite.d)) {
            return false;
        }
        aihl aihlVarCheckIsLite2 = aihn.checkIsLite(arik.a);
        ajwoVar.c(aihlVarCheckIsLite2);
        Object objK = ajwoVar.j.k(aihlVarCheckIsLite2.d);
        if ((((arij) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK))).b & 2097152) == 0) {
            return false;
        }
        aihl aihlVarCheckIsLite3 = aihn.checkIsLite(arik.a);
        ajwoVar.c(aihlVarCheckIsLite3);
        Object objK2 = ajwoVar.j.k(aihlVarCheckIsLite3.d);
        arid aridVar = ((arij) (objK2 == null ? aihlVarCheckIsLite3.b : aihlVarCheckIsLite3.c(objK2))).r;
        if (aridVar == null) {
            aridVar = arid.a;
        }
        aria ariaVar = aridVar.b;
        if (ariaVar == null) {
            ariaVar = aria.a;
        }
        arib aribVar = ariaVar.c;
        if (aribVar == null) {
            aribVar = arib.a;
        }
        int iAS = a.aS(aribVar.b);
        return iAS != 0 && iAS == 3;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0052  */
    public static boolean ab(ajwo ajwoVar) {
        boolean z;
        if (ajwoVar == null) {
            return false;
        }
        aihl aihlVarCheckIsLite = aihn.checkIsLite(arix.a);
        ajwoVar.c(aihlVarCheckIsLite);
        if (ajwoVar.j.n(aihlVarCheckIsLite.d)) {
            z = true;
        } else {
            aihl aihlVarCheckIsLite2 = aihn.checkIsLite(arik.a);
            ajwoVar.c(aihlVarCheckIsLite2);
            if (ajwoVar.j.n(aihlVarCheckIsLite2.d)) {
                z = true;
            } else {
                aihl aihlVarCheckIsLite3 = aihn.checkIsLite(aohu.a);
                ajwoVar.c(aihlVarCheckIsLite3);
                if (ajwoVar.j.n(aihlVarCheckIsLite3.d)) {
                    z = true;
                } else {
                    aihl aihlVarCheckIsLite4 = aihn.checkIsLite(ish.a);
                    ajwoVar.c(aihlVarCheckIsLite4);
                    if (ajwoVar.j.n(aihlVarCheckIsLite4.d)) {
                        z = true;
                    } else {
                        z = false;
                    }
                }
            }
        }
        ahno.F(z);
        aihl aihlVarCheckIsLite5 = aihn.checkIsLite(arix.a);
        ajwoVar.c(aihlVarCheckIsLite5);
        if (ajwoVar.j.n(aihlVarCheckIsLite5.d)) {
            return true;
        }
        aihl aihlVarCheckIsLite6 = aihn.checkIsLite(arik.a);
        ajwoVar.c(aihlVarCheckIsLite6);
        if (ajwoVar.j.n(aihlVarCheckIsLite6.d)) {
            aihl aihlVarCheckIsLite7 = aihn.checkIsLite(arik.a);
            ajwoVar.c(aihlVarCheckIsLite7);
            Object objK = ajwoVar.j.k(aihlVarCheckIsLite7.d);
            return ((arij) (objK == null ? aihlVarCheckIsLite7.b : aihlVarCheckIsLite7.c(objK))).d.isEmpty();
        }
        aihl aihlVarCheckIsLite8 = aihn.checkIsLite(aohu.a);
        ajwoVar.c(aihlVarCheckIsLite8);
        if (ajwoVar.j.n(aihlVarCheckIsLite8.d)) {
            aihl aihlVarCheckIsLite9 = aihn.checkIsLite(aohu.a);
            ajwoVar.c(aihlVarCheckIsLite9);
            Object objK2 = ajwoVar.j.k(aihlVarCheckIsLite9.d);
            return ((aoht) (objK2 == null ? aihlVarCheckIsLite9.b : aihlVarCheckIsLite9.c(objK2))).c.isEmpty();
        }
        aigw aigwVar = ish.a;
        aihl aihlVarCheckIsLite10 = aihn.checkIsLite(aigwVar);
        ajwoVar.c(aihlVarCheckIsLite10);
        if (!ajwoVar.j.n(aihlVarCheckIsLite10.d)) {
            return false;
        }
        aihl aihlVarCheckIsLite11 = aihn.checkIsLite(aigwVar);
        ajwoVar.c(aihlVarCheckIsLite11);
        Object objK3 = ajwoVar.j.k(aihlVarCheckIsLite11.d);
        return ((apzf) (objK3 == null ? aihlVarCheckIsLite11.b : aihlVarCheckIsLite11.c(objK3))).d.isEmpty();
    }

    public static boolean ac(aoun aounVar) {
        if (aounVar == null || (aounVar.b & SemanticState.Modal) != 0) {
            return false;
        }
        ajwo ajwoVar = aounVar.l;
        if (ajwoVar == null) {
            ajwoVar = ajwo.a;
        }
        return Y(ajwoVar);
    }

    public static boolean ad(abnl abnlVar, abnl abnlVar2) {
        if (abnlVar == null) {
            if (abnlVar2 == null) {
                return true;
            }
        } else if (abnlVar2 != null && Objects.equals(abnlVar.w(), abnlVar2.w()) && Objects.equals(abnlVar.u(), abnlVar2.u())) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00d5, code lost:
    
        if (r6.d == r7.d) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00d8, code lost:
    
        if (r7 == null) goto L52;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean ae(defpackage.abnl r6, defpackage.abnl r7) {
        /*
            Method dump skipped, instruction units count: 235
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gzj.ae(abnl, abnl):boolean");
    }

    public static int af(ajwo ajwoVar) {
        if (ajwoVar != null) {
            aihl aihlVarCheckIsLite = aihn.checkIsLite(arik.a);
            ajwoVar.c(aihlVarCheckIsLite);
            if (ajwoVar.j.n(aihlVarCheckIsLite.d)) {
                aihl aihlVarCheckIsLite2 = aihn.checkIsLite(arik.a);
                ajwoVar.c(aihlVarCheckIsLite2);
                Object objK = ajwoVar.j.k(aihlVarCheckIsLite2.d);
                if ((((arij) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK))).b & 2097152) != 0) {
                    aihl aihlVarCheckIsLite3 = aihn.checkIsLite(arik.a);
                    ajwoVar.c(aihlVarCheckIsLite3);
                    Object objK2 = ajwoVar.j.k(aihlVarCheckIsLite3.d);
                    arid aridVar = ((arij) (objK2 == null ? aihlVarCheckIsLite3.b : aihlVarCheckIsLite3.c(objK2))).r;
                    if (aridVar == null) {
                        aridVar = arid.a;
                    }
                    aria ariaVar = aridVar.b;
                    if (ariaVar == null) {
                        ariaVar = aria.a;
                    }
                    arhz arhzVar = ariaVar.b;
                    if (arhzVar == null) {
                        arhzVar = arhz.a;
                    }
                    int iAS = a.aS(arhzVar.b);
                    if (iAS != 0) {
                        return iAS;
                    }
                }
            }
        }
        return 1;
    }

    public static int ag(abnl abnlVar) {
        ajwo ajwoVar = abnlVar.b;
        if (ajwoVar != null) {
            aigw aigwVar = heb.a;
            if (fhz.M(ajwoVar, aigwVar)) {
                arii ariiVar = ((arij) fhz.L(ajwoVar, aigwVar)).s;
                if (ariiVar == null) {
                    ariiVar = arii.a;
                }
                arih arihVar = ariiVar.c;
                if (arihVar == null) {
                    arihVar = arih.a;
                }
                int iBc = a.bc(arihVar.f);
                if (iBc != 0) {
                    return iBc;
                }
            } else {
                aigw aigwVar2 = hec.a;
                if (fhz.M(ajwoVar, aigwVar2)) {
                    ariv arivVar = ((ariw) fhz.L(ajwoVar, aigwVar2)).h;
                    if (arivVar == null) {
                        arivVar = ariv.a;
                    }
                    int iBc2 = a.bc(arivVar.c);
                    if (iBc2 != 0) {
                        return iBc2;
                    }
                }
            }
        }
        return 1;
    }

    public static boolean ah(abvk abvkVar) {
        wjf wjfVarC;
        if (abvkVar == null) {
            return false;
        }
        acfw acfwVarH = abvkVar.h();
        int iAe = (acfwVarH == null || (wjfVarC = acfwVarH.c()) == null) ? 0 : wjfVarC.ae();
        return iAe == 2 || iAe == 3;
    }

    public static aihf ai(String str, String str2, Map map) {
        String strSubstring = str.substring(0, (str.length() - str2.length()) - 1);
        if (true == TextUtils.isEmpty(strSubstring)) {
            strSubstring = "signedout";
        }
        return (aihf) j$.util.Map.EL.computeIfAbsent(map, strSubstring, new iaa(14));
    }

    public static awku aj() {
        return new awku(Boolean.FALSE);
    }

    public static Boolean ak(ico icoVar) {
        return Boolean.valueOf(icoVar.i());
    }

    public static Boolean al(ycp ycpVar) {
        yco ycoVar = ycpVar.e;
        boolean z = false;
        if (ycoVar != null && ycoVar.am()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    /* JADX WARN: Type inference failed for: r11v11, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v13, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v5, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v7, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v9, types: [awmd, java.lang.Object] */
    public static ids am(Context context, rrq rrqVar, awmd awmdVar, ahex ahexVar, vxz vxzVar) {
        axfd axfdVar = (axfd) awmdVar.io();
        Pattern pattern = qpr.a;
        qpq qpqVar = new qpq(context);
        qpqVar.c("queuemodule");
        qpqVar.d("queue.pb");
        Uri uriA = qpqVar.a();
        int i2 = 4;
        tpr tprVar = new tpr(new glj(context, i2), new idn(2), new hys(i2), new yns(1), new ier(), ahexVar);
        qrl qrlVarA = qrm.a();
        qrlVarA.f(uriA);
        qrlVarA.e(aimg.a);
        qrlVarA.b(tprVar);
        qrx qrxVarC = rrqVar.c(qrlVarA.a());
        qpq qpqVar2 = new qpq(context);
        qpqVar2.c("queuemodule");
        qpqVar2.d("videolists.pb");
        Uri uriA2 = qpqVar2.a();
        qrl qrlVarA2 = qrm.a();
        qrlVarA2.f(uriA2);
        qrlVarA2.e(aimj.a);
        qrx qrxVarC2 = rrqVar.c(qrlVarA2.a());
        qpq qpqVar3 = new qpq(context);
        qpqVar3.c("queuemodule");
        qpqVar3.d("continuations.pb");
        Uri uriA3 = qpqVar3.a();
        qrl qrlVarA3 = qrm.a();
        qrlVarA3.f(uriA3);
        qrlVarA3.e(aime.a);
        qrx qrxVarC3 = rrqVar.c(qrlVarA3.a());
        mbc mbcVar = (mbc) axfdVar.a.io();
        mbcVar.getClass();
        Executor executor = (Executor) axfdVar.c.io();
        executor.getClass();
        hwz hwzVar = (hwz) axfdVar.d.io();
        hwzVar.getClass();
        hfn hfnVar = (hfn) axfdVar.e.io();
        hfnVar.getClass();
        kjc kjcVar = (kjc) axfdVar.b.io();
        kjcVar.getClass();
        qrxVarC.getClass();
        qrxVarC2.getClass();
        qrxVarC3.getClass();
        vxzVar.getClass();
        return new idx(mbcVar, executor, hwzVar, hfnVar, kjcVar, qrxVarC, qrxVarC2, qrxVarC3);
    }

    public static agkz an(weh wehVar) {
        if (wehVar == null) {
            return agpr.a;
        }
        if (wehVar instanceof anjx) {
            return agkz.n(((anjx) wehVar).e());
        }
        if (wehVar instanceof anuk) {
            return agkz.n(((anuk) wehVar).j());
        }
        throw new IllegalArgumentException(String.format("List Entity key is not associated with a %s or %s", anjx.class.getSimpleName(), anuk.class.getSimpleName()));
    }

    public static avlr ao(hpy hpyVar, String str) {
        return avlr.i(agke.r(hpyVar.e(kro.an(str)), hpyVar.e(kro.az(str))), new hpr(1));
    }

    public static avlr ap(hpy hpyVar, String str, avmb avmbVar) {
        aauk aaukVar;
        return avlr.i(agke.r(hpyVar.e(kro.am(str)), hpyVar.e(kro.ay(str))), new hpr(0)).O(avmbVar).X(new abpz((hpyVar instanceof hps) && (aaukVar = ((hps) hpyVar).b) != null && aaukVar.b.l(53, 45397796L, false), hpyVar, 1)).r();
    }

    public static avlr aq(hpy hpyVar, Optional optional) {
        return hpyVar.e(kro.aq()).B(new gkq(18)).K(new gnw(17)).K(new hbn(optional, 16)).s(new hpl());
    }

    public static avlr ar(hpy hpyVar, Class cls) {
        boolean z = true;
        if (cls != anuc.class && cls != anjq.class) {
            z = false;
        }
        ahno.F(z);
        int i2 = 20;
        return hpyVar.f(cls).B(new gkq(i2)).K(new gnw(i2));
    }

    public static avlr as(hpy hpyVar, hpu hpuVar) {
        return hpyVar.e(kro.aq()).B(new gkq(18)).K(new gnw(17)).K(new hbn(hpuVar, 15)).s(new hpl());
    }

    public static avlr at(final Function function, final avlr avlrVar, final hpy hpyVar) {
        return avlr.q(new Callable() { // from class: hpo
            @Override // java.util.concurrent.Callable
            public final Object call() {
                awly awlyVarAz = hpyVar.h() ? awlu.ay().az() : awlu.ay();
                final Function function2 = function;
                int i2 = 19;
                return awlyVarAz.X(new avnn() { // from class: hpq
                    @Override // defpackage.avnn
                    public final Object a(Object obj) {
                        return ((avmc) function2.apply(null)).k();
                    }
                }).U(((avmc) function2.apply(null)).k()).v(new hoi(avlrVar.B(new gkq(i2)).h(Object.class).af(new hib(awlyVarAz, i2)), 2));
            }
        });
    }

    public static avlr au(hpy hpyVar) {
        hpt hptVarA = hpu.a();
        hptVarA.b(true);
        return as(hpyVar, hptVarA.a());
    }

    public static avlr av(hpy hpyVar) {
        hpt hptVarA = hpu.a();
        hptVarA.c(true);
        return as(hpyVar, hptVarA.a());
    }

    public static avlr aw(hpy hpyVar) {
        return hpyVar.f(anyo.class).B(new hgu(7)).K(new hbz(4));
    }

    public static avmc ax(hpy hpyVar, weh wehVar, List list) {
        return (hpb.s(wehVar) || ((wehVar instanceof anuk) && ((anuk) wehVar).getPlaylistId().equals("SE"))) ? tzk.c(hpyVar.b(list)).u(new gnw(16)) : tzk.c(hpyVar.b(list)).u(new gnw(18));
    }

    public static pls ay() {
        String str;
        String str2;
        agkj agkjVar;
        plq plqVar;
        plr plrVar = new plr();
        plrVar.d = Build.MANUFACTURER + ' ' + Build.MODEL;
        plrVar.e = 86400000L;
        plrVar.r = (short) (plrVar.r | 1);
        plrVar.f = "com.google.android.libraries.notifications.entrypoints.scheduled.ScheduledTaskService";
        plrVar.s = 1;
        plrVar.a(false);
        plrVar.c(false);
        short s = plrVar.r;
        plrVar.l = 7;
        plrVar.m = true;
        plrVar.n = true;
        plrVar.r = (short) (s | 504);
        plrVar.b(false);
        plrVar.p = agpn.b;
        short s2 = plrVar.r;
        plrVar.t = 1;
        plrVar.r = (short) (s2 | 3072);
        plrVar.q = new plq(null);
        plrVar.r = (short) (s2 | 31744);
        plrVar.a = "youtube_notifications";
        plrVar.b = "551011954849";
        plrVar.g = "AIzaSyAOghZGza2MQSZkY_zfZ370N-PUdXEo8AI";
        plrVar.s = 1;
        plrVar.h = 999000000;
        plp plpVar = new plp();
        plpVar.d = true;
        short s3 = plpVar.m;
        plpVar.e = true;
        plpVar.f = true;
        plpVar.m = (short) (s3 | 28);
        plpVar.a(true);
        plpVar.h = "com.google.android.libraries.notifications.entrypoints.systemtray.SystemTrayActivity";
        plpVar.i = "com.google.android.libraries.notifications.entrypoints.systemtray.SystemTrayBroadcastReceiver";
        plpVar.k = 1;
        plpVar.m = (short) (plpVar.m | 64);
        plpVar.b(1);
        short s4 = plpVar.m;
        plpVar.a = R.drawable.music_push_notification_white;
        plpVar.b = R.string.app_name;
        plpVar.m = (short) (s4 | 771);
        plpVar.c = Integer.valueOf(R.color.yt_youtube_red_cairo);
        plpVar.a(false);
        plpVar.b(2);
        plpVar.j = "generic_notifications";
        if (plpVar.m != 1023) {
            StringBuilder sb = new StringBuilder();
            if ((plpVar.m & 1) == 0) {
                sb.append(" iconResourceId");
            }
            if ((plpVar.m & 2) == 0) {
                sb.append(" appNameResourceId");
            }
            if ((plpVar.m & 4) == 0) {
                sb.append(" soundEnabled");
            }
            if ((plpVar.m & 8) == 0) {
                sb.append(" vibrationEnabled");
            }
            if ((plpVar.m & 16) == 0) {
                sb.append(" lightsEnabled");
            }
            if ((plpVar.m & 32) == 0) {
                sb.append(" displayRecipientAccountName");
            }
            if ((plpVar.m & 64) == 0) {
                sb.append(" defaultGroupThreshold");
            }
            if ((plpVar.m & 128) == 0) {
                sb.append(" summaryNotificationThreshold");
            }
            if ((plpVar.m & 256) == 0) {
                sb.append(" shouldFilterOldThreads");
            }
            if ((plpVar.m & 512) == 0) {
                sb.append(" drawCircularAvatarSeparators");
            }
            throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
        }
        plrVar.c = new plt(plpVar.a, plpVar.b, plpVar.c, plpVar.d, plpVar.e, plpVar.f, plpVar.g, plpVar.h, plpVar.i, plpVar.j, plpVar.k, plpVar.l);
        plrVar.a(true);
        plrVar.b(true);
        plrVar.c(true);
        plrVar.k = 90;
        if (plrVar.r == Short.MAX_VALUE && (str = plrVar.a) != null && plrVar.s != 0 && (str2 = plrVar.d) != null && (agkjVar = plrVar.p) != null && plrVar.t != 0 && (plqVar = plrVar.q) != null) {
            return new pls(str, plrVar.b, plrVar.c, str2, plrVar.e, plrVar.f, plrVar.g, plrVar.h, plrVar.i, plrVar.j, plrVar.k, plrVar.l, plrVar.m, plrVar.n, plrVar.o, agkjVar, plqVar);
        }
        StringBuilder sb2 = new StringBuilder();
        if (plrVar.a == null) {
            sb2.append(" clientId");
        }
        if (plrVar.s == 0) {
            sb2.append(" defaultEnvironment");
        }
        if (plrVar.d == null) {
            sb2.append(" deviceName");
        }
        if ((plrVar.r & 1) == 0) {
            sb2.append(" registrationStalenessTimeMs");
        }
        if ((plrVar.r & 2) == 0) {
            sb2.append(" disableEntrypoints");
        }
        if ((plrVar.r & 4) == 0) {
            sb2.append(" useDefaultFirebaseApp");
        }
        if ((plrVar.r & 8) == 0) {
            sb2.append(" useFirebaseReceiver");
        }
        if ((plrVar.r & 16) == 0) {
            sb2.append(" enableEndToEndEncryption");
        }
        if ((plrVar.r & 32) == 0) {
            sb2.append(" periodRegistrationIntervalDays");
        }
        if ((plrVar.r & 64) == 0) {
            sb2.append(" enableGrowthKitIfExists");
        }
        if ((plrVar.r & 128) == 0) {
            sb2.append(" enableInAppPushFlow");
        }
        if ((plrVar.r & 256) == 0) {
            sb2.append(" allowedFromEmbargoedCountries");
        }
        if ((plrVar.r & 512) == 0) {
            sb2.append(" disableRestartReceiverManager");
        }
        if (plrVar.p == null) {
            sb2.append(" additionalRestartReceivers");
        }
        if ((plrVar.r & 1024) == 0) {
            sb2.append(" firebaseInitializedByApp");
        }
        if (plrVar.t == 0) {
            sb2.append(" registrationApi");
        }
        if ((plrVar.r & 2048) == 0) {
            sb2.append(" removeNotVcnManagedCapability");
        }
        if (plrVar.q == null) {
            sb2.append(" expeditedJobs");
        }
        if ((plrVar.r & 4096) == 0) {
            sb2.append(" dropNonMatchingClientIds");
        }
        if ((plrVar.r & 8192) == 0) {
            sb2.append(" logNonMatchingClientIds");
        }
        if ((plrVar.r & 16384) == 0) {
            sb2.append(" additionalIsolatedInstance");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
    }

    public static qrx az(Context context, rrq rrqVar) {
        Pattern pattern = qpr.a;
        qpq qpqVar = new qpq(context);
        qpqVar.c("onboardingmodule");
        qpqVar.d("onboardingmodule.pb");
        Uri uriA = qpqVar.a();
        qrl qrlVarA = qrm.a();
        qrlVarA.f(uriA);
        qrlVarA.e(ailg.a);
        return rrqVar.c(qrlVarA.a());
    }

    public static hxs b(Activity activity) {
        if (!(activity instanceof cf)) {
            return new hxs();
        }
        cc ccVarG = ((cf) activity).getSupportFragmentManager().g("AUDIO_TRACKS_MENU_BOTTOM_SHEET_FRAGMENT");
        return ccVarG != null ? (hxs) ccVarG : new hxs();
    }

    public static boolean bA(fgy fgyVar, fgy fgyVar2) {
        if (fgyVar == fgyVar2) {
            return true;
        }
        if (fgyVar == null || fgyVar2 == null) {
            return false;
        }
        return fgyVar.getClass().equals(fgyVar2.getClass());
    }

    public static TextContent bB(List list) {
        int size = list.size();
        if (size == 1) {
            Object obj = list.get(0);
            if (obj instanceof TextView) {
                return new fhh(obj, 1);
            }
            return obj instanceof TextContent ? (TextContent) obj : TextContent.b;
        }
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < size; i2++) {
            Object obj2 = list.get(i2);
            if (obj2 instanceof TextView) {
                arrayList.add(((TextView) obj2).getText());
            }
            if (obj2 instanceof TextContent) {
                arrayList.addAll(((TextContent) obj2).getTextItems());
            }
        }
        return new fhh(arrayList, 0);
    }

    public static void bC(View view, Drawable drawable, int i2, fkl fklVar) {
        if (((fklVar == null || !fklVar.H()) && (i2 & 1) != 1) || !drawable.isStateful()) {
            return;
        }
        drawable.setState(view.getDrawableState());
    }

    public static void bD(int i2, int i3, ahb ahbVar, ahb ahbVar2) {
        Object objA;
        if (bG(i2, ahbVar2)) {
            objA = ahc.a(ahbVar2, i2);
            ahc.b(ahbVar2, i2);
        } else {
            objA = ahc.a(ahbVar, i2);
            ahc.b(ahbVar, i2);
        }
        ahbVar.f(i3, objA);
    }

    public static void bE(int i2, ahb ahbVar, ahb ahbVar2) {
        if (bG(i2, ahbVar2)) {
            ahc.b(ahbVar2, i2);
        } else {
            ahc.b(ahbVar, i2);
        }
    }

    public static void bF(int i2, ahb ahbVar, ahb ahbVar2) {
        Object objA;
        if (ahbVar == null || ahbVar2 == null || (objA = ahc.a(ahbVar, i2)) == null) {
            return;
        }
        ahbVar2.f(i2, objA);
    }

    static boolean bG(int i2, ahb ahbVar) {
        return (ahbVar == null || ahc.a(ahbVar, i2) == null) ? false : true;
    }

    public static boolean bH(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj == null || obj2 == null) {
            return false;
        }
        return obj.equals(obj2);
    }

    public static boolean bI(fil filVar, fil filVar2) {
        if (filVar == filVar2) {
            return true;
        }
        if (filVar == null || filVar2 == null) {
            return false;
        }
        return filVar.a(filVar2);
    }

    public static void bJ(boolean z, String str) {
        if (!z) {
            throw new IllegalArgumentException(str);
        }
    }

    public static void bK(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Must not be null or empty");
        }
    }

    public static void bL(Collection collection) {
        if (collection.isEmpty()) {
            throw new IllegalArgumentException("Must not be empty.");
        }
    }

    public static void bM(Object obj) {
        if (obj == null) {
            throw new NullPointerException("Argument must not be null");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static fkn bN(omj omjVar, String str, fkn fknVar, fly flyVar) {
        Map mapQ;
        if (str == null) {
            fknVar.d();
            return null;
        }
        fknVar.b("log_tag", str);
        if (flyVar == null || (mapQ = omjVar.q(flyVar)) == null) {
            return fknVar;
        }
        for (Map.Entry entry : mapQ.entrySet()) {
            fknVar.b((String) entry.getKey(), (String) entry.getValue());
        }
        return fknVar;
    }

    public static void bO(fhd fhdVar, isw iswVar) {
        fip fipVarF = fhdVar.f();
        if (fipVarF != null) {
            fipVarF.gK(iswVar);
        }
    }

    public static abgo bP(hhb hhbVar, abvn abvnVar, xgn xgnVar) {
        return new abgo(new ahsm(abvnVar, (vxz) ((ghi) hhbVar.a).a.cQ.io()), xgnVar);
    }

    public static Boolean bQ(axfd axfdVar) {
        return Boolean.valueOf(axfdVar.as());
    }

    public static Boolean bR(awmd awmdVar, axfd axfdVar) {
        boolean z = false;
        if (!axfdVar.as() && ((Boolean) awmdVar.io()).booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x002a  */
    /* JADX WARN: Code duplicated, block: B:21:0x0030  */
    public static Boolean bS(vxu vxuVar, axfd axfdVar) {
        ajvu ajvuVarC = vxuVar.c();
        boolean z = true;
        if (ajvuVarC != null && (ajvuVarC.b & SemanticState.ReadOnly) != 0) {
            anhb anhbVar = ajvuVarC.j;
            if (anhbVar == null) {
                anhbVar = anhb.a;
            }
            if ((anhbVar.b & 268435456) != 0) {
                anhb anhbVar2 = ajvuVarC.j;
                if (anhbVar2 == null) {
                    anhbVar2 = anhb.a;
                }
                ajhe ajheVar = anhbVar2.m;
                if (ajheVar == null) {
                    ajheVar = ajhe.a;
                }
                if (!ajheVar.b) {
                    if (!axfdVar.as()) {
                        z = false;
                    }
                }
            } else if (!axfdVar.as()) {
                z = false;
            }
        } else if (!axfdVar.as()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    private static List bT(ajwo ajwoVar) {
        if (ajwoVar == null) {
            return agpi.a;
        }
        aihl aihlVarCheckIsLite = aihn.checkIsLite(aohu.a);
        ajwoVar.c(aihlVarCheckIsLite);
        if (!ajwoVar.j.n(aihlVarCheckIsLite.d)) {
            return agpi.a;
        }
        aihl aihlVarCheckIsLite2 = aihn.checkIsLite(aohu.a);
        ajwoVar.c(aihlVarCheckIsLite2);
        Object objK = ajwoVar.j.k(aihlVarCheckIsLite2.d);
        aohs aohsVar = ((aoht) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK))).h;
        if (aohsVar == null) {
            aohsVar = aohs.a;
        }
        return aohsVar.d;
    }

    private static int bU(float f2) {
        return f2 >= 0.0f ? 1 : -1;
    }

    private static void bV(Canvas canvas, Paint paint, int i2, int i3, int i4, int i5) {
        int i6 = i2 > i4 ? i4 : i2;
        int i7 = i3 > i5 ? i5 : i3;
        if (i2 <= i4) {
            i2 = i4;
        }
        if (i3 <= i5) {
            i3 = i5;
        }
        canvas.drawRect(i6, i7, i2, i3, paint);
    }

    private static boolean bW(int i2, Collection collection, Collection collection2) {
        if (i2 <= 0) {
            throw new IllegalArgumentException("Level cannot be < 1");
        }
        if (collection == null) {
            if (collection2 == null) {
                return true;
            }
        } else if (collection2 != null && collection.size() == collection2.size()) {
            Iterator it = collection.iterator();
            Iterator it2 = collection2.iterator();
            while (it.hasNext() && it2.hasNext()) {
                if (i2 == 1) {
                    fgy fgyVar = (fgy) it.next();
                    fgy fgyVar2 = (fgy) it2.next();
                    boolean z = fna.a;
                    if (!fgyVar.g(fgyVar2)) {
                    }
                } else if (!bW(i2 - 1, (Collection) it.next(), (Collection) it2.next())) {
                }
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:94:0x014a A[ORIG_RETURN, RETURN] */
    private static boolean bX(Field field, Class cls, Object obj, Object obj2) {
        try {
            int iA = ((fmt) field.getAnnotation(fmt.class)).a();
            switch (iA) {
                case 0:
                    if (Float.compare(((Float) obj).floatValue(), ((Float) obj2).floatValue()) == 0) {
                        return true;
                    }
                    return false;
                case 1:
                    if (Double.compare(((Double) obj).doubleValue(), ((Double) obj2).doubleValue()) != 0) {
                        return false;
                    }
                    return true;
                case 2:
                    Class<?> componentType = cls.getComponentType();
                    if (Byte.TYPE.isAssignableFrom(componentType)) {
                        if (!Arrays.equals((byte[]) obj, (byte[]) obj2)) {
                            return false;
                        }
                    } else if (Short.TYPE.isAssignableFrom(componentType)) {
                        if (!Arrays.equals((short[]) obj, (short[]) obj2)) {
                            return false;
                        }
                    } else if (Character.TYPE.isAssignableFrom(componentType)) {
                        if (!Arrays.equals((char[]) obj, (char[]) obj2)) {
                            return false;
                        }
                    } else if (Integer.TYPE.isAssignableFrom(componentType)) {
                        if (!Arrays.equals((int[]) obj, (int[]) obj2)) {
                            return false;
                        }
                    } else if (Long.TYPE.isAssignableFrom(componentType)) {
                        if (!Arrays.equals((long[]) obj, (long[]) obj2)) {
                            return false;
                        }
                    } else if (Float.TYPE.isAssignableFrom(componentType)) {
                        if (!Arrays.equals((float[]) obj, (float[]) obj2)) {
                            return false;
                        }
                    } else if (Double.TYPE.isAssignableFrom(componentType)) {
                        if (!Arrays.equals((double[]) obj, (double[]) obj2)) {
                            return false;
                        }
                    } else if (Boolean.TYPE.isAssignableFrom(componentType)) {
                        if (!Arrays.equals((boolean[]) obj, (boolean[]) obj2)) {
                            return false;
                        }
                    } else if (!Arrays.equals((Object[]) obj, (Object[]) obj2)) {
                        return false;
                    }
                    return true;
                case 3:
                    if (obj.equals(obj2)) {
                        return true;
                    }
                    return false;
                case 4:
                    if (((fnx) obj).b((fnx) obj2)) {
                        return true;
                    }
                    return false;
                case 5:
                    Collection collection = (Collection) obj;
                    Collection collection2 = (Collection) obj2;
                    if (collection != null) {
                        if (!collection.equals(collection2)) {
                            return false;
                        }
                    } else if (collection2 != null) {
                        return false;
                    }
                    return true;
                case 6:
                case 7:
                case 8:
                case 9:
                    if (bW(iA - 5, (Collection) obj, (Collection) obj2)) {
                        return true;
                    }
                    return false;
                case 10:
                    if (obj != null) {
                        boolean z = fna.a;
                        if (!((fgy) obj).g((fgy) obj2)) {
                            return false;
                        }
                    } else if (obj2 != null) {
                        return false;
                    }
                    return true;
                case 11:
                case 12:
                    if (obj != null) {
                        if (!((fip) obj).a((fip) obj2)) {
                            return false;
                        }
                    } else if (obj2 != null) {
                        return false;
                    }
                    return true;
                case 13:
                    if (obj != null) {
                        if (!obj.equals(obj2)) {
                            return false;
                        }
                    } else if (obj2 != null) {
                        return false;
                    }
                    return true;
                case 14:
                default:
                    return true;
                case 15:
                    if (obj != null) {
                        if (!((fil) obj).a(obj2)) {
                            return false;
                        }
                    } else if (obj2 != null) {
                        return false;
                    }
                    return true;
            }
        } catch (IncompatibleClassChangeError | NullPointerException unused) {
            return false;
        }
    }

    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.Map] */
    public static fhd ba(fjd fjdVar, fhd fhdVar, fgy fgyVar, boolean z, String str) {
        fky fkyVar;
        Object obj;
        fky fkyVar2;
        List list;
        int iIntValue;
        if (z && str == null) {
            throw new IllegalStateException("Cannot reuse a null global key");
        }
        fly flyVar = fhdVar.e;
        if (str == null) {
            fgy fgyVar2 = fhdVar.c;
            Pattern pattern = fhj.a;
            boolean z2 = fgyVar.m;
            String strD = fgyVar.D();
            if (z2) {
                strD = "$".concat(String.valueOf(strD));
            }
            if (fgyVar2 == null) {
                str = strD;
            } else {
                String strM = fhdVar.m();
                if (strM == null) {
                    br(2, "Trying to generate parent-based key for component " + fgyVar.c() + " , but parent " + fgyVar2.c() + " has a null global key \".");
                    str = "null".concat(String.valueOf(strD));
                } else {
                    StringBuilder sb = new StringBuilder(strM.length() + strD.length() + 1);
                    sb.append(strM);
                    sb.append(',');
                    sb.append(strD);
                    str = sb.toString();
                    if (z2) {
                        fkt fktVarI = fhdVar.i();
                        if (fktVarI.mManualKeysCounter == null) {
                            fktVarI.mManualKeysCounter = new HashMap(1);
                        }
                        Integer num = (Integer) fktVarI.mManualKeysCounter.get(strD);
                        if (num == null) {
                            num = 0;
                        }
                        fktVarI.mManualKeysCounter.put(strD, Integer.valueOf(num.intValue() + 1));
                        iIntValue = num.intValue();
                        if (iIntValue != 0) {
                            br(1, "The manual key " + strD.substring(1) + " you are setting on this " + fgyVar.c() + " is a duplicate and will be changed into a unique one. This will result in unexpected behavior if you don't change it.");
                        }
                    } else {
                        fkt fktVarI2 = fhdVar.i();
                        if (fktVarI2.e == null) {
                            fktVarI2.e = new SparseIntArray(1);
                        }
                        SparseIntArray sparseIntArray = fktVarI2.e;
                        int i2 = fgyVar.i;
                        int i3 = sparseIntArray.get(i2, 0);
                        fktVarI2.e.put(i2, i3 + 1);
                        iIntValue = i3;
                    }
                    if (iIntValue != 0) {
                        StringBuilder sb2 = new StringBuilder(str.length() + 4);
                        sb2.append(str);
                        sb2.append('!');
                        sb2.append(iIntValue);
                        str = sb2.toString();
                    }
                }
            }
        }
        fhd fhdVar2 = new fhd(fhdVar, fhdVar.e, fhdVar.h());
        fhdVar2.c = fgyVar;
        fhdVar2.g = fhdVar.g;
        fhdVar2.d = str;
        fhdVar2.h = new WeakReference(fjdVar);
        fhdVar2.f = fhdVar.e;
        fhdVar2.i = new fkt(fgyVar, fhdVar2, fhdVar.f());
        fkt fktVarI3 = fhdVar2.i();
        fkz fkzVarA = fjdVar.a();
        fgy fgyVar3 = fktVarI3.a;
        if (!fgyVar3.e()) {
            fkzVarA.n(fktVarI3.b.m());
        } else if (fgyVar3.S()) {
            fhd fhdVar3 = fktVarI3.b;
            String strM2 = fhdVar3.m();
            if (fgyVar3.S()) {
                fkzVarA.l();
                fkzVarA.j();
                synchronized (fkzVarA) {
                    fkyVar = (fky) fkzVarA.e.get(strM2);
                }
                if (fkyVar != null) {
                    fkyVar2 = fhdVar3.i().c;
                    fgyVar3.N(fkyVar, fkyVar2);
                } else {
                    ayq ayqVar = fkzVarA.g;
                    synchronized (ayqVar) {
                        ?? r3 = ayqVar.b;
                        obj = r3.get(strM2);
                        if (obj == null) {
                            obj = new Object();
                            r3.put(strM2, obj);
                        }
                    }
                    synchronized (obj) {
                        ?? r2 = ayqVar.a;
                        fky fkyVar3 = (fky) r2.get(strM2);
                        if (fkyVar3 == null) {
                            fgyVar3.G(fhdVar3);
                            r2.put(strM2, fhdVar3.i().c);
                        } else {
                            fgyVar3.N(fkyVar3, fhdVar3.i().c);
                        }
                    }
                    fkyVar2 = fhdVar3.i().c;
                }
                boolean z3 = fna.a;
                fkzVarA.g(strM2, fkyVar2);
                synchronized (fkzVarA) {
                    Map map = fkzVarA.a;
                    list = map == null ? null : (List) map.get(strM2);
                }
                if (list != null) {
                    Iterator it = list.iterator();
                    ArrayList arrayList = null;
                    while (it.hasNext()) {
                        fkyVar2.b((aero) it.next());
                        flp flpVarA = fkyVar2 instanceof fgx ? ((fgx) fkyVar2).a() : null;
                        if (flpVarA != null) {
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            arrayList.add(flpVarA);
                        }
                    }
                    fpq.a.addAndGet(list.size());
                    synchronized (fkzVarA) {
                        fkzVarA.a.remove(strM2);
                        Map map2 = fkzVarA.b;
                        if (map2 != null) {
                            map2.remove(strM2);
                        }
                        fkzVarA.d.put(strM2, list);
                        if (arrayList != null && !arrayList.isEmpty()) {
                            fkzVarA.k();
                            fkzVarA.c.put(strM2, arrayList);
                        }
                    }
                }
            }
        }
        fly flyVarV = fgyVar.v(fhdVar2, flyVar);
        fhdVar2.f = flyVar;
        fhdVar2.e = flyVarV;
        if (fna.a) {
            fht fhtVar = (fht) fhu.a.get(fhu.k(fhdVar2, fhdVar2.m()));
            if (fhtVar != null) {
                fhtVar.a();
                fhdVar2.i();
                fhtVar.c();
            }
        }
        return fhdVar2;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x007a  */
    /* JADX WARN: Code duplicated, block: B:38:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:41:0x00c6  */
    public static fji bb(fjd fjdVar, fhd fhdVar, fkd fkdVar, int i2, int i3) {
        int i4;
        int i5;
        fji fjiVarBi;
        fkc fkcVarT = fkdVar.l();
        fgy fgyVarE = fkcVarT.e();
        String strS = fkcVarT.s();
        fji fjiVarE = fkdVar.n;
        if (fjiVarE != null) {
            i4 = i2;
            i5 = i3;
            if (!bh(fjiVarE.h, fjiVarE.i, i4, i5, fjiVarE.j, fjiVarE.k)) {
                if (!fgy.Y(fgyVarE)) {
                    fjiVarBi = bc(fjdVar, fjiVarE, i4, i5);
                }
                fjiVarE = fjiVarBi;
                if (fjiVarE != null) {
                    fjiVarE.h = i4;
                    fjiVarE.i = i5;
                    fjiVarE.k = fjiVarE.b();
                    fjiVarE.j = fjiVarE.g();
                }
                fkdVar.n = fjiVarE;
                if (fjiVarE != null) {
                    fjiVarE.f = fkdVar;
                }
            }
            return fjiVarE;
        }
        i4 = i2;
        i5 = i3;
        fjc fjcVar = fjdVar.b;
        if (fjcVar == null) {
            throw new IllegalStateException(fgyVarE.c().concat(": Trying to access the cached InternalNode for a component outside of a LayoutState calculation. If that is what you must do, see Component#measureMightNotCacheInternalNode."));
        }
        fjiVarE = fjcVar.e(fgyVarE);
        if (fjiVarE != null) {
            fjcVar.j(fgyVarE);
            boolean z = fjiVarE.l().M() || fjiVarE.m() == fkdVar.m();
            fjd fjdVar2 = fjiVarE.a;
            boolean zBh = bh(fjiVarE.h, fjiVarE.i, i4, i5, fjiVarE.j, fjiVarE.k);
            if (fjdVar2 != fjdVar || !z) {
                fjiVarE = null;
            } else if (!zBh) {
                if (fgy.Y(fgyVarE)) {
                    fjiVarE = null;
                } else {
                    fjiVarE = bc(fjdVar, fjiVarE, i4, i5);
                }
            }
        } else {
            fjiVarE = null;
        }
        if (fjiVarE == null) {
            fjq fjqVarBe = be(fjdVar, fhdVar, i4, i5, fgyVarE, true, true, strS);
            if (fjqVarBe != null) {
                fjqVarBe.F = fkdVar.l();
                if (fjqVarBe.M()) {
                    fwl fwlVarM = fkdVar.m();
                    fjqVarBe.G |= 1;
                    fjqVarBe.E = fwlVarM;
                }
                fib fibVar = fkdVar.m;
                fjdVar.c = true;
                fjdVar.i = fibVar;
                fjiVarBi = bi(fjdVar, fjqVarBe, i4, i5);
                fjiVarE = fjiVarBi;
            } else {
                fjiVarE = null;
            }
        }
        if (fjiVarE != null) {
            fjiVarE.h = i4;
            fjiVarE.i = i5;
            fjiVarE.k = fjiVarE.b();
            fjiVarE.j = fjiVarE.g();
        }
        fkdVar.n = fjiVarE;
        if (fjiVarE != null) {
            fjiVarE.f = fkdVar;
        }
        return fjiVarE;
    }

    static fji bc(fjd fjdVar, fji fjiVar, int i2, int i3) {
        return bi(fjdVar, fjiVar.l(), i2, i3);
    }

    public static fjq bd(fjd fjdVar, fhd fhdVar, fgy fgyVar, boolean z, String str) {
        return be(fjdVar, fhdVar, 0, 0, fgyVar, false, z, str);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0196  */
    /* JADX WARN: Code duplicated, block: B:103:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:106:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:108:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:112:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:115:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:117:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:119:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:124:0x020d  */
    /* JADX WARN: Code duplicated, block: B:127:0x0223  */
    /* JADX WARN: Code duplicated, block: B:130:0x0231  */
    /* JADX WARN: Code duplicated, block: B:134:0x0246  */
    /* JADX WARN: Code duplicated, block: B:136:0x024f  */
    /* JADX WARN: Code duplicated, block: B:144:0x026b  */
    /* JADX WARN: Code duplicated, block: B:147:0x027d  */
    /* JADX WARN: Code duplicated, block: B:164:0x0201 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:165:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:32:0x009d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:33:0x009f  */
    /* JADX WARN: Code duplicated, block: B:51:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:54:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:57:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:65:0x0106  */
    /* JADX WARN: Code duplicated, block: B:67:0x010e  */
    /* JADX WARN: Code duplicated, block: B:70:0x011c  */
    /* JADX WARN: Code duplicated, block: B:73:0x0129  */
    /* JADX WARN: Code duplicated, block: B:76:0x0134  */
    /* JADX WARN: Code duplicated, block: B:79:0x0140  */
    /* JADX WARN: Code duplicated, block: B:82:0x014c  */
    /* JADX WARN: Code duplicated, block: B:85:0x015a  */
    /* JADX WARN: Code duplicated, block: B:88:0x0166  */
    /* JADX WARN: Code duplicated, block: B:91:0x0172  */
    /* JADX WARN: Code duplicated, block: B:94:0x0180  */
    /* JADX WARN: Code duplicated, block: B:97:0x018a  */
    public static fjq be(fjd fjdVar, fhd fhdVar, int i2, int i3, fgy fgyVar, boolean z, boolean z2, String str) {
        fgy fgyVar2;
        fjq fkcVar;
        fhd fhdVar2;
        fgu fguVar;
        List list;
        List list2;
        fkl fklVar;
        byte b;
        fgt fgtVar;
        int i4;
        float fC;
        boolean zBm = bm();
        Map map = fgy.h;
        fjc fjcVar = fjdVar.b;
        boolean zContainsKey = fjcVar != null ? fjcVar.l.containsKey(Integer.valueOf(fgyVar.j)) : false;
        try {
            fhd fhdVarBa = ba(fjdVar, fhdVar, fgyVar, z2, str);
            String strM = fhdVarBa.m();
            fgyVar2 = fhdVarBa.c;
            try {
                fkt fktVarI = fhdVarBa.i();
                boolean zY = fgy.Y(fgyVar);
                byte b2 = 1;
                if ((zY || zContainsKey) && !z) {
                    fkcVar = new fkc(fhdVarBa, fhdVarBa.e);
                } else {
                    if (!fgyVar2.d()) {
                        if (fgy.aa(fgyVar2)) {
                            fkcVar = new fjq(fhdVarBa);
                            fkcVar.L = 1;
                            fgyVar2.M(fktVarI.b);
                        } else {
                            if (!fgy.X(fgyVar2)) {
                                throw new IllegalArgumentException("component:" + fgyVar2.c());
                            }
                            Object obj = fgyVar2.aB(fhdVarBa, i2, i3).a;
                            if (obj == null) {
                                b2 = 1;
                                fhdVar2 = fhdVarBa;
                                fkcVar = null;
                            } else if (obj == fgyVar2) {
                                fkcVar = ((fgy) obj).b(fjdVar, fhdVarBa);
                                fhdVar2 = fhdVarBa;
                            } else {
                                fhdVar2 = fhdVarBa;
                                b2 = 1;
                                fkcVar = be(fjdVar, fhdVar2, 0, 0, (fgy) obj, false, false, null);
                            }
                        }
                        if (fkcVar != null) {
                            return null;
                        }
                        if (zBm) {
                            fgyVar2.c();
                            int i5 = fjdVar.b.x;
                            boolean z3 = fna.a;
                        }
                        if (fkcVar.b() == 0 && ((fgyVar2.O() && fgy.aa(fgyVar2)) || ((zY || zContainsKey) && !z))) {
                            fkcVar.M = fgy.p;
                        }
                        fguVar = fgyVar2.n;
                        if (fguVar != null && (!fgy.Y(fgyVar2) || !z)) {
                            fklVar = fguVar.c;
                            if (fklVar != null) {
                                fkcVar.u(fklVar);
                            }
                            if ((fguVar.a & b2) != 0) {
                                fkcVar.w(fguVar.e);
                            }
                            b = fguVar.a;
                            if ((b & 2) != 0) {
                                fkcVar.w = fguVar.f;
                            }
                            if (fguVar.h || (b & 28) != 0) {
                                fkcVar.K();
                            }
                            fgtVar = fguVar.b;
                            if (fgtVar != null) {
                                if ((fgtVar.a & b2) != 0) {
                                    fkcVar.O(fgtVar.d);
                                }
                                if ((fgtVar.a & 2) != 0) {
                                    fkcVar.U();
                                }
                                if ((fgtVar.a & 262144) != 0) {
                                    fkcVar.N();
                                }
                                if ((fgtVar.a & 4) != 0) {
                                    fkcVar.V();
                                }
                                if ((fgtVar.a & SemanticState.ReadOnly) != 0) {
                                    fkcVar.K();
                                }
                                if ((fgtVar.a & 8) != 0) {
                                    fkcVar.J(fgtVar.b);
                                }
                                if ((fgtVar.a & 16) != 0) {
                                    fkcVar.B(null);
                                }
                                if ((fgtVar.a & 32) != 0) {
                                    fkcVar.D(null);
                                }
                                if ((fgtVar.a & 64) != 0) {
                                    fkcVar.P(fgtVar.c);
                                }
                                if ((fgtVar.a & SemanticState.Focused) != 0) {
                                    fkcVar.H(null);
                                }
                                if ((fgtVar.a & 65536) != 0) {
                                    fkcVar.I(null);
                                }
                                if ((fgtVar.a & SemanticState.LiveRegion) != 0) {
                                    fkcVar.F(fgtVar.g, fgtVar.f);
                                }
                                if ((fgtVar.a & 131072) != 0) {
                                    fkcVar.G(fgtVar.h);
                                }
                                if ((fgtVar.a & Integer.MIN_VALUE) != 0) {
                                    flp flpVar = fgtVar.i;
                                    if (fkcVar.t == null) {
                                        fkcVar.t = new ArrayList(b2);
                                    }
                                    fkcVar.t.add(flpVar);
                                }
                                if ((fgtVar.a & SemanticState.Hidden) != 0) {
                                    for (i4 = 0; i4 < 9; i4++) {
                                        fC = fgtVar.e.c(i4);
                                        if (!kro.bg(fC)) {
                                            int iBf = kro.bf(i4);
                                            int i6 = (int) fC;
                                            if (fkcVar.p == null) {
                                                fkcVar.p = new fik();
                                            }
                                            fkcVar.G |= 33554432;
                                            fkcVar.p.e(iBf, i6);
                                        }
                                    }
                                }
                                if ((fgtVar.a & SemanticState.Multiline) != 0) {
                                    fgp fgpVar = fgtVar.j;
                                    int[] iArr = fgpVar.b;
                                    int[] iArr2 = fgpVar.c;
                                    float[] fArr = fgpVar.a;
                                    PathEffect pathEffect = fgpVar.d;
                                    fkcVar.T(iArr, iArr2, fArr);
                                }
                                if ((fgtVar.a & 16384) != 0) {
                                    fkcVar.R();
                                }
                                if ((fgtVar.a & 32768) != 0) {
                                    fkcVar.S();
                                }
                                fkcVar.Q(-1);
                            }
                        }
                        fkcVar.b.add(fktVarI);
                        bg(fhdVar2);
                        if (fgyVar2.P()) {
                            jij jijVar = new jij(strM, fgyVar2, fktVarI);
                            if (fkcVar.v == null) {
                                fkcVar.v = new ArrayList(4);
                            }
                            fkcVar.v.add(jijVar);
                        }
                        list = fktVarI.g;
                        if (list != null && !list.isEmpty()) {
                            list2 = fktVarI.g;
                            if (fkcVar.u == null) {
                                fkcVar.u = new ArrayList(list2.size());
                            }
                            fkcVar.u.addAll(list2);
                        }
                        if (zBm) {
                            boolean z4 = fna.a;
                        }
                        return fkcVar;
                    }
                    fkcVar = fgyVar2.b(fjdVar, fhdVarBa);
                }
                fhdVar2 = fhdVarBa;
                if (fkcVar != null) {
                    return null;
                }
                if (zBm) {
                    fgyVar2.c();
                    int i7 = fjdVar.b.x;
                    boolean z5 = fna.a;
                }
                if (fkcVar.b() == 0) {
                    fkcVar.M = fgy.p;
                }
                fguVar = fgyVar2.n;
                if (fguVar != null) {
                    fklVar = fguVar.c;
                    if (fklVar != null) {
                        fkcVar.u(fklVar);
                    }
                    if ((fguVar.a & b2) != 0) {
                        fkcVar.w(fguVar.e);
                    }
                    b = fguVar.a;
                    if ((b & 2) != 0) {
                        fkcVar.w = fguVar.f;
                    }
                    if (fguVar.h) {
                        fkcVar.K();
                    } else {
                        fkcVar.K();
                    }
                    fgtVar = fguVar.b;
                    if (fgtVar != null) {
                        if ((fgtVar.a & b2) != 0) {
                            fkcVar.O(fgtVar.d);
                        }
                        if ((fgtVar.a & 2) != 0) {
                            fkcVar.U();
                        }
                        if ((fgtVar.a & 262144) != 0) {
                            fkcVar.N();
                        }
                        if ((fgtVar.a & 4) != 0) {
                            fkcVar.V();
                        }
                        if ((fgtVar.a & SemanticState.ReadOnly) != 0) {
                            fkcVar.K();
                        }
                        if ((fgtVar.a & 8) != 0) {
                            fkcVar.J(fgtVar.b);
                        }
                        if ((fgtVar.a & 16) != 0) {
                            fkcVar.B(null);
                        }
                        if ((fgtVar.a & 32) != 0) {
                            fkcVar.D(null);
                        }
                        if ((fgtVar.a & 64) != 0) {
                            fkcVar.P(fgtVar.c);
                        }
                        if ((fgtVar.a & SemanticState.Focused) != 0) {
                            fkcVar.H(null);
                        }
                        if ((fgtVar.a & 65536) != 0) {
                            fkcVar.I(null);
                        }
                        if ((fgtVar.a & SemanticState.LiveRegion) != 0) {
                            fkcVar.F(fgtVar.g, fgtVar.f);
                        }
                        if ((fgtVar.a & 131072) != 0) {
                            fkcVar.G(fgtVar.h);
                        }
                        if ((fgtVar.a & Integer.MIN_VALUE) != 0) {
                            flp flpVar2 = fgtVar.i;
                            if (fkcVar.t == null) {
                                fkcVar.t = new ArrayList(b2);
                            }
                            fkcVar.t.add(flpVar2);
                        }
                        if ((fgtVar.a & SemanticState.Hidden) != 0) {
                            while (i4 < 9) {
                                fC = fgtVar.e.c(i4);
                                if (!kro.bg(fC)) {
                                    int iBf2 = kro.bf(i4);
                                    int i8 = (int) fC;
                                    if (fkcVar.p == null) {
                                        fkcVar.p = new fik();
                                    }
                                    fkcVar.G |= 33554432;
                                    fkcVar.p.e(iBf2, i8);
                                }
                            }
                        }
                        if ((fgtVar.a & SemanticState.Multiline) != 0) {
                            fgp fgpVar2 = fgtVar.j;
                            int[] iArr3 = fgpVar2.b;
                            int[] iArr4 = fgpVar2.c;
                            float[] fArr2 = fgpVar2.a;
                            PathEffect pathEffect2 = fgpVar2.d;
                            fkcVar.T(iArr3, iArr4, fArr2);
                        }
                        if ((fgtVar.a & 16384) != 0) {
                            fkcVar.R();
                        }
                        if ((fgtVar.a & 32768) != 0) {
                            fkcVar.S();
                        }
                        fkcVar.Q(-1);
                    }
                }
                fkcVar.b.add(fktVarI);
                bg(fhdVar2);
                if (fgyVar2.P()) {
                    jij jijVar2 = new jij(strM, fgyVar2, fktVarI);
                    if (fkcVar.v == null) {
                        fkcVar.v = new ArrayList(4);
                    }
                    fkcVar.v.add(jijVar2);
                }
                list = fktVarI.g;
                if (list != null) {
                    list2 = fktVarI.g;
                    if (fkcVar.u == null) {
                        fkcVar.u = new ArrayList(list2.size());
                    }
                    fkcVar.u.addAll(list2);
                }
                if (zBm) {
                    boolean z6 = fna.a;
                }
                return fkcVar;
            } catch (Exception e2) {
                e = e2;
                bw(fhdVar, fgyVar2, e);
                return null;
            }
        } catch (Exception e3) {
            e = e3;
            fgyVar2 = fgyVar;
        }
    }

    public static void bf(fjd fjdVar, fjq fjqVar) {
        List list = fjqVar.y;
        if (list != null) {
            fhd fhdVarG = fjqVar.g();
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                fjqVar.y(fjdVar, fhdVarG, (fgy) list.get(i2));
            }
            list.clear();
        }
        int iA = fjqVar.a();
        for (int i3 = 0; i3 < iA; i3++) {
            bf(fjdVar, fjqVar.j(i3));
        }
    }

    public static boolean bg(fhd fhdVar) {
        ComponentTree componentTree = fhdVar.g;
        return componentTree == null ? fgo.a(null) : componentTree.d;
    }

    public static boolean bh(int i2, int i3, int i4, int i5, float f2, float f3) {
        return aY(i2, i4, (int) f2) && aY(i3, i5, (int) f3);
    }

    public static fji bi(fjd fjdVar, fjq fjqVar, int i2, int i3) {
        if (fna.w) {
            fjqVar.d().c();
        }
        ci ciVar = new ci(fjdVar, (char[]) null);
        fjd fjdVar2 = (fjd) ciVar.a;
        if (fjdVar2.b == null) {
            throw new IllegalStateException("Cannot calculate a layout without a layout state.");
        }
        boolean z = fna.w;
        fjq.v(fjdVar2, fjqVar);
        if (z) {
            fjqVar.d().c();
        }
        fjq.C(fjqVar, null);
        if (z) {
            fjqVar.d().c();
        }
        fwo fwoVarW = fjq.W(ciVar, fjqVar, null);
        if (fjqVar.M()) {
            Context context = fjqVar.a;
            if ((context.getApplicationInfo().flags & 4194304) != 0 && context.getResources().getConfiguration().getLayoutDirection() == 1) {
                fwoVarW.e(fwl.RTL);
            }
        }
        YogaNodeJNIBase yogaNodeJNIBase = (YogaNodeJNIBase) fwoVarW;
        long jJni_YGNodeStyleGetWidthJNI = YogaNative.jni_YGNodeStyleGetWidthJNI(yogaNodeJNIBase.c);
        if (kro.bg(new fwq(Float.intBitsToFloat((int) jJni_YGNodeStyleGetWidthJNI), (int) (jJni_YGNodeStyleGetWidthJNI >> 32)).a)) {
            int mode = View.MeasureSpec.getMode(i2);
            if (mode == Integer.MIN_VALUE) {
                fwoVarW.h(View.MeasureSpec.getSize(i2));
            } else if (mode == 0) {
                fwoVarW.i(Float.NaN);
            } else if (mode == 1073741824) {
                fwoVarW.i(View.MeasureSpec.getSize(i2));
            }
        }
        long jJni_YGNodeStyleGetHeightJNI = YogaNative.jni_YGNodeStyleGetHeightJNI(yogaNodeJNIBase.c);
        if (kro.bg(new fwq(Float.intBitsToFloat((int) jJni_YGNodeStyleGetHeightJNI), (int) (jJni_YGNodeStyleGetHeightJNI >> 32)).a)) {
            int mode2 = View.MeasureSpec.getMode(i3);
            if (mode2 == Integer.MIN_VALUE) {
                fwoVarW.g(View.MeasureSpec.getSize(i3));
            } else if (mode2 == 0) {
                fwoVarW.f(Float.NaN);
            } else if (mode2 == 1073741824) {
                fwoVarW.f(View.MeasureSpec.getSize(i3));
            }
        }
        float size = View.MeasureSpec.getMode(i2) == 0 ? Float.NaN : View.MeasureSpec.getSize(i2);
        float size2 = View.MeasureSpec.getMode(i3) != 0 ? View.MeasureSpec.getSize(i3) : Float.NaN;
        if (z) {
            fjqVar.d().c();
        }
        yogaNodeJNIBase.m();
        ArrayList arrayList = new ArrayList();
        arrayList.add(fwoVarW);
        for (int i4 = 0; i4 < arrayList.size(); i4++) {
            List<YogaNodeJNIBase> list = ((YogaNodeJNIBase) arrayList.get(i4)).b;
            if (list != null) {
                for (YogaNodeJNIBase yogaNodeJNIBase2 : list) {
                    yogaNodeJNIBase2.m();
                    arrayList.add(yogaNodeJNIBase2);
                }
            }
        }
        YogaNodeJNIBase[] yogaNodeJNIBaseArr = (YogaNodeJNIBase[]) arrayList.toArray(new YogaNodeJNIBase[arrayList.size()]);
        long[] jArr = new long[yogaNodeJNIBaseArr.length];
        for (int i5 = 0; i5 < yogaNodeJNIBaseArr.length; i5++) {
            jArr[i5] = yogaNodeJNIBaseArr[i5].c;
        }
        YogaNative.jni_YGNodeCalculateLayoutJNI(yogaNodeJNIBase.c, size, size2, jArr, yogaNodeJNIBaseArr);
        for (int i6 = 0; i6 < fjqVar.b(); i6++) {
            fgy fgyVarC = fjqVar.c(i6);
            fjqVar.f(i6);
            fgyVarC.an();
        }
        return (fji) yogaNodeJNIBase.d;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x003d  */
    public static fjr bj(fji fjiVar, Drawable drawable, int i2) {
        fjr fjrVar;
        boolean z;
        int i3;
        fjr fjrVar2;
        fgy fihVar = new fih(drawable);
        fjc fjcVar = fjiVar.a.b;
        fjcVar.getClass();
        fjq fjqVarL = fjiVar.l();
        String strS = fjqVarL.s();
        fib fibVar = fjiVar.m;
        if (fibVar == null) {
            fjrVar = null;
        } else {
            if (i2 == 1) {
                fjrVar2 = fibVar.b;
            } else if (i2 == 2) {
                fjrVar = null;
            } else {
                if (i2 != 4) {
                    throw new IllegalArgumentException(a.bP(i2, "OutputUnitType ", " not supported"));
                }
                fjrVar2 = fibVar.c;
            }
            fjrVar = fjrVar2;
        }
        if (fjrVar != null) {
            try {
                z = !fihVar.ad(null, fjrVar.b.c, null, fihVar);
            } catch (Exception e2) {
                bw(fjiVar.b, fihVar, e2);
                z = false;
            }
        } else {
            z = false;
        }
        long j2 = fjrVar != null ? fjrVar.a : -1L;
        long jC = fjcVar.c(fihVar, strS, fjcVar.u, i2, j2);
        boolean z2 = fna.a;
        try {
            fihVar.ag(fjiVar.b, fjiVar, null);
        } catch (Exception e3) {
            bw(fjiVar.b, fihVar, e3);
        }
        if (j2 != jC) {
            i3 = 0;
        } else {
            i3 = z ? 1 : 2;
        }
        return bl(jC, fihVar, null, fjiVar, fjqVarL, 2, i3, fjcVar.v, bk(fjiVar, fjcVar), false);
    }

    /* JADX WARN: Code duplicated, block: B:43:0x007f  */
    /* JADX WARN: Code duplicated, block: B:45:0x0084  */
    /* JADX WARN: Code duplicated, block: B:48:0x0090  */
    public static boolean bk(fji fjiVar, fjc fjcVar) {
        fjq fjqVarL = fjiVar.l();
        if (fji.q(fjiVar)) {
            return false;
        }
        if (!fjqVarL.B) {
            fgy fgyVarE = fjqVarL.e();
            fkl fklVar = fjqVarL.f;
            boolean z = (fklVar != null && fklVar.R()) || fgyVarE.T();
            int i2 = fjqVarL.D;
            if (!fjcVar.C || i2 == 2 || (!z && ((fklVar == null || TextUtils.isEmpty(fklVar.a)) && i2 == 0))) {
                if (fklVar != null) {
                    fip fipVar = fklVar.s;
                    boolean z2 = fklVar.H() && fklVar.G != 2;
                    Object obj = fklVar.c;
                    SparseArray sparseArray = fklVar.e;
                    int i3 = fklVar.f;
                    int i4 = fklVar.g;
                    ViewOutlineProvider viewOutlineProvider = fklVar.h;
                    boolean z3 = fklVar.i;
                    int i5 = fklVar.D;
                    int i6 = fklVar.E;
                    boolean zJ = fklVar.J();
                    String str = fklVar.d;
                    if (fipVar == null && !z2 && obj == null && sparseArray == null && i3 == -16777216 && i4 == -16777216 && viewOutlineProvider == null && !z3 && !zJ && i5 != 1 && i6 != 1 && str == null) {
                        if (fjqVarL.C == -1) {
                            for (fkt fktVar : fjqVarL.b) {
                                if (fktVar != null || !fktVar.a.R()) {
                                }
                            }
                            if (!TextUtils.isEmpty(fjiVar.l().q) || fji.q(fjiVar)) {
                                fjiVar.l();
                                return false;
                            }
                        }
                    }
                } else if (fjqVarL.C == -1) {
                    while (r15.hasNext()) {
                        if (fktVar != null) {
                        }
                    }
                    if (!TextUtils.isEmpty(fjiVar.l().q)) {
                    }
                    fjiVar.l();
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:42:0x00c3  */
    public static fjr bl(long j2, fgy fgyVar, fhd fhdVar, fji fjiVar, fjq fjqVar, int i2, int i3, boolean z, boolean z2, boolean z3) {
        flz flzVar;
        fkl fklVar = fjqVar.f;
        int i4 = 0;
        if (z3) {
            flz flzVar2 = new flz();
            Map map = fgy.h;
            if (!(fgyVar instanceof fiw)) {
                flzVar2.a = fjiVar.j();
            }
            fjq fjqVar2 = fjiVar.c;
            if (fjqVar2.z) {
                int iD = fjiVar.d();
                int iF = fjiVar.f();
                int iE = fjiVar.e();
                int iC = fjiVar.c();
                if (flzVar2.b != null) {
                    throw new IllegalStateException("Padding already initialized for this ViewNodeInfo.");
                }
                flzVar2.b = new Rect();
                flzVar2.b.set(iD, iF, iE, iC);
            }
            flzVar2.d = fjiVar.m();
            if ((fjqVar.G & 33554432) != 0) {
                int iP = !fjiVar.o() ? 0 : rpi.p(fjiVar.r(fjqVar2.p, 1));
                int iP2 = !fjiVar.o() ? 0 : rpi.p(fjqVar2.p.d(2));
                int iP3 = !fjiVar.o() ? 0 : rpi.p(fjiVar.r(fjqVar2.p, 3));
                int iP4 = !fjiVar.o() ? 0 : rpi.p(fjqVar2.p.d(4));
                if (iP == 0) {
                    if (iP2 != 0) {
                        iP = 0;
                    } else if (iP3 != 0) {
                        iP2 = 0;
                        iP = 0;
                    } else if (iP4 != 0) {
                        iP2 = 0;
                        iP = 0;
                        iP3 = 0;
                    }
                    if (flzVar2.c == null) {
                        throw new IllegalStateException("ExpandedTouchBounds already initialized for this ViewNodeInfo.");
                    }
                    flzVar2.c = new Rect(iP, iP2, iP3, iP4);
                } else {
                    if (flzVar2.c == null) {
                        throw new IllegalStateException("ExpandedTouchBounds already initialized for this ViewNodeInfo.");
                    }
                    flzVar2.c = new Rect(iP, iP2, iP3, iP4);
                }
            }
            flzVar2.e = fjqVar.C;
            flzVar = flzVar2;
        } else {
            int i5 = (fklVar == null || fklVar.G != 2) ? 0 : 2;
            fklVar = null;
            i4 = i5;
            flzVar = null;
        }
        if (z) {
            i4 |= 1;
        }
        if (z2) {
            i4 |= 4;
        }
        return new fjr(j2, new fja(fgyVar, fklVar, flzVar, i4, i2, i3), fhdVar);
    }

    public static boolean bm() {
        return fna.w;
    }

    public static int bn(Resources resources, int i2) {
        return (int) ((i2 * resources.getDisplayMetrics().density) + 0.5f);
    }

    public static void bo(Canvas canvas, Paint paint, int i2, int i3, int i4, int i5, int i6) {
        bV(canvas, paint, i2, i3, i2 + i4, i3 + (bU(i5) * i6));
        bV(canvas, paint, i2, i3, i2 + (i6 * bU(i4)), i5 + i3);
    }

    public static boolean bp(View view) {
        return (fkb.g(view) == null && fkb.h(view) == null) ? false : true;
    }

    public static int bq(int i2) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            return i3 != 1 ? 3 : 2;
        }
        return 1;
    }

    public static void br(int i2, String str) {
        fvc.a().a(bq(i2), str, null, null);
    }

    public static void bs(int i2, String str, Map map) {
        fvc.a().a(bq(i2), str, null, map);
    }

    public static fjn bt(fhd fhdVar, Exception exc) {
        return exc instanceof fjn ? (fjn) exc : new fjn(fhdVar, null, exc);
    }

    static void bu(fhd fhdVar, Exception exc) {
        isw iswVar = new isw();
        iswVar.b = exc;
        iswVar.a = fhdVar != null ? fhdVar.g : null;
        bO(fhdVar, iswVar);
    }

    public static void bv(fhd fhdVar, Exception exc) {
        String strGroup;
        boolean zBm = bm();
        try {
            if (zBm) {
                try {
                    boolean z = fna.a;
                } catch (fkp unused) {
                    throw bt(fhdVar, exc);
                } catch (Exception e2) {
                    throw bt(fhdVar, e2);
                }
            }
            if (fhdVar.c != null) {
                fjn fjnVarBt = bt(fhdVar, exc);
                String strM = fhdVar.m();
                Map map = fgy.h;
                LinkedList linkedList = new LinkedList();
                String[] strArrSplit = strM.split(",");
                Map map2 = fgy.h;
                synchronized (map2) {
                    try {
                        for (String string : strArrSplit) {
                            Pattern pattern = fhj.a;
                            if (!string.startsWith("$")) {
                                String str = "id(" + string + ')';
                                Matcher matcher = fhj.a.matcher(string);
                                if (!matcher.find() || (strGroup = matcher.group(0)) == null) {
                                    string = str;
                                    break;
                                }
                                try {
                                    int i2 = Integer.parseInt(strGroup);
                                    Iterator it = map2.entrySet().iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            string = str;
                                            break;
                                            break;
                                        }
                                        Map.Entry entry = (Map.Entry) it.next();
                                        if (((Integer) entry.getValue()).equals(Integer.valueOf(i2))) {
                                            Object key = entry.getKey();
                                            if (!(key instanceof Class)) {
                                                string = key.toString();
                                                break;
                                            }
                                            string = "<cls>" + ((Class) key).getName() + "</cls>";
                                            break;
                                        }
                                    }
                                } catch (NumberFormatException unused2) {
                                }
                            }
                            linkedList.add(string);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                Iterator it2 = linkedList.iterator();
                while (it2.hasNext()) {
                    fjnVarBt.a((String) it2.next());
                }
                bu(fhdVar, fjnVarBt);
            } else {
                bu(fhdVar, exc);
            }
            if (zBm) {
                boolean z2 = fna.a;
            }
        } catch (Throwable th2) {
            if (zBm) {
                boolean z3 = fna.a;
            }
            throw th2;
        }
    }

    public static void bw(fhd fhdVar, fgy fgyVar, Exception exc) {
        boolean z = exc instanceof fkp;
        fip fipVarF = fhdVar.f();
        fip fipVar = null;
        if (z) {
            exc = null;
        } else if (exc instanceof fjn) {
            fipVar = ((fjn) exc).a;
        }
        fjn fjnVarBt = bt(fhdVar, exc);
        fjnVarBt.a(fgyVar.c());
        if (fipVar == fipVarF) {
            fjnVarBt.a = fipVar;
            throw fjnVarBt;
        }
        if (fipVarF instanceof fim) {
            ((fim) fipVarF).b(fhdVar.g, fjnVarBt);
        } else {
            try {
                bu(fhdVar, exc);
            } catch (fkp unused) {
                fjnVarBt.a = fipVarF;
                throw fjnVarBt;
            }
        }
    }

    public static void bx(Exception exc) {
        if (exc instanceof fkp) {
            Exception exc2 = ((fkp) exc).a;
            bx(null);
        } else {
            if (!(exc instanceof RuntimeException)) {
                throw new RuntimeException(exc);
            }
            throw ((RuntimeException) exc);
        }
    }

    public static boolean by(Object obj, Object obj2) {
        if (obj.getClass() != obj2.getClass()) {
            throw new IllegalArgumentException("The input is invalid.");
        }
        for (Field field : obj.getClass().getDeclaredFields()) {
            if (field.isAnnotationPresent(fmt.class)) {
                Class<?> type = field.getType();
                try {
                    field.setAccessible(true);
                    Object obj3 = field.get(obj);
                    Object obj4 = field.get(obj2);
                    field.setAccessible(false);
                    boolean z = fna.a;
                    if (!bX(field, type, obj3, obj4)) {
                        return false;
                    }
                } catch (IllegalAccessException e2) {
                    throw new IllegalStateException("Unable to get fields by reflection.", e2);
                }
            }
        }
        return true;
    }

    public static boolean bz(fky fkyVar, fky fkyVar2) {
        if (fkyVar == null) {
            return fkyVar2 == null;
        }
        if (fkyVar2 != null) {
            return by(fkyVar, fkyVar2);
        }
        return false;
    }

    public static hyc c(Activity activity) {
        if (!(activity instanceof cf)) {
            return new hyc();
        }
        cc ccVarG = ((cf) activity).getSupportFragmentManager().g("PLAYBACK_RATE_MENU_BOTTOM_SHEET_FRAGMENT");
        return ccVarG != null ? (hyc) ccVarG : new hyc();
    }

    public static hyf d(Activity activity) {
        if (!(activity instanceof cf)) {
            return new hyf();
        }
        cc ccVarG = ((cf) activity).getSupportFragmentManager().g("SUBTITLE_MENU_BOTTOM_SHEET_FRAGMENT");
        return ccVarG != null ? (hyf) ccVarG : new hyf();
    }

    public static aazw e() {
        return aazw.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static View f(Activity activity) {
        if (activity instanceof gfs) {
            return ((gfs) activity).d();
        }
        return null;
    }

    public static xgv g(xgg xggVar) {
        return xggVar.a(xgu.e);
    }

    public static xmr h() {
        int i2 = xmr.m;
        return new xmr(Build.VERSION.SDK_INT >= 33 ? R.drawable.yt_fill_youtube_music_white_24 : R.drawable.yt_fill_chromecast_white_24);
    }

    public static aaae i(Context context) {
        aaad aaadVar = new aaad();
        aaadVar.c(0);
        aaadVar.b(0);
        aaadVar.a(0);
        aaadVar.b = new Intent().setClassName(context, "com.google.android.apps.youtube.music.activities.InternalMusicActivity").setFlags(335544320).setAction("android.intent.action.MAIN").addCategory("android.intent.category.LAUNCHER");
        aaadVar.a = new Intent(context, (Class<?>) NotificationInteractionBroadcastReceiver.class);
        aaadVar.c(R.drawable.music_push_notification_white);
        aaadVar.b(R.mipmap.ic_launcher_release);
        aaadVar.a(R.string.app_name);
        aaadVar.f = "551011954849";
        if (aaadVar.g == 7) {
            return new aaae(aaadVar.a, aaadVar.b, aaadVar.c, aaadVar.d, aaadVar.e, aaadVar.f);
        }
        StringBuilder sb = new StringBuilder();
        if ((aaadVar.g & 1) == 0) {
            sb.append(" smallIcon");
        }
        if ((aaadVar.g & 2) == 0) {
            sb.append(" largeIcon");
        }
        if ((aaadVar.g & 4) == 0) {
            sb.append(" appLabel");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public static aawa j() {
        tyy tyyVar;
        aavz aavzVar = new aavz();
        aavzVar.a(R.drawable.quantum_ic_video_youtube_white_24);
        byte b = aavzVar.h;
        aavzVar.c = true;
        aavzVar.b = true;
        aavzVar.h = (byte) (b | 14);
        aavzVar.b(false);
        aavzVar.e = new aavp(2);
        aavzVar.f = 10;
        byte b2 = aavzVar.h;
        aavzVar.g = true;
        aavzVar.h = (byte) (b2 | 96);
        aavzVar.a(R.drawable.yt_fill_youtube_music_white_24);
        aavzVar.b(true);
        if (aavzVar.h == 127 && (tyyVar = aavzVar.e) != null) {
            return new aawa(aavzVar.a, aavzVar.b, aavzVar.c, aavzVar.d, tyyVar, aavzVar.f, aavzVar.g);
        }
        StringBuilder sb = new StringBuilder();
        if ((aavzVar.h & 1) == 0) {
            sb.append(" onesieEnabled");
        }
        if ((aavzVar.h & 2) == 0) {
            sb.append(" enableVss2StatsTracking");
        }
        if ((aavzVar.h & 4) == 0) {
            sb.append(" enableRawCcSupport");
        }
        if ((aavzVar.h & 8) == 0) {
            sb.append(" enableLegacyHeartbeatFlow");
        }
        if ((aavzVar.h & 16) == 0) {
            sb.append(" backgroundNotificationIconResourceId");
        }
        if (aavzVar.e == null) {
            sb.append(" referringAppProvider");
        }
        if ((aavzVar.h & 32) == 0) {
            sb.append(" maximumConsecutiveSkippedUnplayableVideos");
        }
        if ((aavzVar.h & 64) == 0) {
            sb.append(" enableVss2UserPresenceTracking");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public static rsi k(Context context) {
        String str;
        String strB = txz.b(context);
        long j2 = rsi.a;
        rsh rshVar = new rsh();
        if (strB == null) {
            throw new NullPointerException("Null getAppVersionForAds");
        }
        rshVar.a = strB;
        rshVar.b = rsi.a;
        int i2 = rshVar.k | 1;
        rshVar.c = rsi.b;
        rshVar.d = rsi.c;
        rshVar.e = rsi.d;
        rshVar.k = (short) (((short) (((short) (((short) (((short) i2) | 2)) | 4)) | 8)) | 16);
        rshVar.c(false);
        rshVar.a(false);
        rshVar.k = (short) (((short) (((short) (((short) (rshVar.k | 128)) | 256)) | 512)) | 1024);
        rshVar.b(false);
        int i3 = rshVar.k | 4096;
        rshVar.i = true;
        rshVar.j = 1000;
        rshVar.k = (short) (((short) (((short) (((short) i3) | 8192)) | 16384)) | Short.MIN_VALUE);
        rshVar.c(true);
        rshVar.b(true);
        rshVar.a(true);
        if (rshVar.k == -1 && (str = rshVar.a) != null) {
            return new rsi(str, rshVar.b, rshVar.c, rshVar.d, rshVar.e, rshVar.f, rshVar.g, rshVar.h, rshVar.i, rshVar.j);
        }
        StringBuilder sb = new StringBuilder();
        if (rshVar.a == null) {
            sb.append(" getAppVersionForAds");
        }
        if ((rshVar.k & 1) == 0) {
            sb.append(" getMidrollAdsFreqCapMillis");
        }
        if ((rshVar.k & 2) == 0) {
            sb.append(" getImmediateAdExpireTimeMillis");
        }
        if ((rshVar.k & 4) == 0) {
            sb.append(" getAdsTimeoutMillis");
        }
        if ((rshVar.k & 8) == 0) {
            sb.append(" getAdWarningMillis");
        }
        if ((rshVar.k & 16) == 0) {
            sb.append(" getMidrollPrefetchMillis");
        }
        if ((rshVar.k & 32) == 0) {
            sb.append(" trackUserPresence");
        }
        if ((rshVar.k & 64) == 0) {
            sb.append(" shouldAllowInnertubeCaching");
        }
        if ((rshVar.k & 128) == 0) {
            sb.append(" shouldEmitAdClickthroughReportedEvent");
        }
        if ((rshVar.k & 256) == 0) {
            sb.append(" shouldPreventYoutubeHeaders");
        }
        if ((rshVar.k & 512) == 0) {
            sb.append(" shouldPreventAdsHeaders");
        }
        if ((rshVar.k & 1024) == 0) {
            sb.append(" shouldBlockAds");
        }
        if ((rshVar.k & 2048) == 0) {
            sb.append(" shouldBlockOfflineAds");
        }
        if ((rshVar.k & 4096) == 0) {
            sb.append(" shouldGenerateDebugSlotIds");
        }
        if ((rshVar.k & 8192) == 0) {
            sb.append(" shouldGenerateDebugLayoutIds");
        }
        if ((rshVar.k & 16384) == 0) {
            sb.append(" shouldSendAdsClientMonitoringLogsAsync");
        }
        if ((rshVar.k & Short.MIN_VALUE) == 0) {
            sb.append(" getAdsClientMonitoringDelayLogMs");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public static aaeg l() {
        aaef aaefVar = new aaef();
        aaefVar.b = (byte) (aaefVar.b | 1);
        aaefVar.a(false);
        aaefVar.b = (byte) (aaefVar.b | 12);
        aaefVar.a(true);
        if (aaefVar.b == 15) {
            return new aaeg(aaefVar.a);
        }
        StringBuilder sb = new StringBuilder();
        if ((aaefVar.b & 1) == 0) {
            sb.append(" channelAutoOfflineEnabled");
        }
        if ((aaefVar.b & 2) == 0) {
            sb.append(" videoListAutoOfflineEnabled");
        }
        if ((aaefVar.b & 4) == 0) {
            sb.append(" offlineCandidatesEnabled");
        }
        if ((aaefVar.b & 8) == 0) {
            sb.append(" offlineSubscriptionsSyncEnabled");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public static aaek m() {
        aaej aaejVar = new aaej();
        aaejVar.b(false);
        short s = aaejVar.g;
        aaejVar.b = 1;
        aaejVar.c = 35;
        aaejVar.d = 2000L;
        aaejVar.g = (short) (s | 30);
        aaejVar.e = aarq.a;
        aaejVar.g = (short) (aaejVar.g | 32);
        aaejVar.a(false);
        aaejVar.g = (short) (aaejVar.g | 192);
        aaejVar.b(true);
        aaejVar.a(true);
        if (aaejVar.g == 511) {
            return new aaek(aaejVar.a, aaejVar.b, aaejVar.c, aaejVar.d, aaejVar.e, aaejVar.f);
        }
        StringBuilder sb = new StringBuilder();
        if ((aaejVar.g & 1) == 0) {
            sb.append(" enablePlaylistAutoSync");
        }
        if ((aaejVar.g & 2) == 0) {
            sb.append(" enableYouTubeBundles");
        }
        if ((aaejVar.g & 4) == 0) {
            sb.append(" transferRetryStrategy");
        }
        if ((aaejVar.g & 8) == 0) {
            sb.append(" transferMaxRetries");
        }
        if ((aaejVar.g & 16) == 0) {
            sb.append(" transferBaseRetryMilliSecs");
        }
        if ((aaejVar.g & 32) == 0) {
            sb.append(" transferMaxRetryMilliSecs");
        }
        if ((aaejVar.g & 64) == 0) {
            sb.append(" disableOfflineWhenDatabaseOpenException");
        }
        if ((aaejVar.g & 128) == 0) {
            sb.append(" databaseOpenRetries");
        }
        if ((aaejVar.g & 256) == 0) {
            sb.append(" enableFallbackToAudioOnlyDownload");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public static vvn n(Context context, hdw hdwVar, tqj tqjVar) {
        ActivityManager activityManager;
        int i2 = tqr.a;
        int iA = tqjVar.a(1073938800);
        int iMin = iA > 0 ? (int) Math.min(iA * 5242880, tym.E() * 0.1d) : 5242880;
        int iEd = 262144;
        if (tqjVar.k(1073815392)) {
            float fA = tqjVar.a(1074863979);
            iEd = tqjVar.a(1074405217) > 0 ? yno.ed(tqjVar.a(1074405217)) : 262144;
            float f2 = fA / 100000.0f;
            if (f2 > 0.0f && (activityManager = (ActivityManager) context.getSystemService("activity")) != null) {
                iEd = Math.max(yno.ed((int) (activityManager.getMemoryClass() * f2)), iEd);
            }
        }
        return new vvn(iEd, iMin, alol.ANDROID_MUSIC, hdwVar);
    }

    public static wbh o(wbd wbdVar, aijp aijpVar) {
        return new wbh(new vwt((byte[]) null, (byte[]) null), wbdVar, aijpVar);
    }

    public static agkj q(awmd awmdVar, awmd awmdVar2, awmd awmdVar3, awmd awmdVar4, awmd awmdVar5, awmd awmdVar6, awmd awmdVar7) {
        agkh agkhVar = new agkh(4);
        agkhVar.e(aixo.SLOT_TYPE_BELOW_PLAYER, awmdVar);
        agkhVar.e(aixo.SLOT_TYPE_BELOW_PLAYER_IMMERSIVE, awmdVar2);
        agkhVar.e(aixo.SLOT_TYPE_IN_PLAYER, awmdVar4);
        agkhVar.e(aixo.SLOT_TYPE_LOCKSCREEN, awmdVar5);
        agkhVar.e(aixo.SLOT_TYPE_FIXED_FOOTER, awmdVar4);
        agkhVar.e(aixo.SLOT_TYPE_FORECASTING, awmdVar3);
        agkhVar.e(aixo.SLOT_TYPE_PLAYER_BYTES, awmdVar6);
        agkhVar.e(aixo.SLOT_TYPE_AD_BREAK_REQUEST, awmdVar7);
        return agkhVar.d(true);
    }

    public static agkj r(awmd awmdVar, awmd awmdVar2, awmd awmdVar3, awmd awmdVar4, awmd awmdVar5, awmd awmdVar6, awmd awmdVar7) {
        agkh agkhVar = new agkh(4);
        agkhVar.e(aixo.SLOT_TYPE_BELOW_PLAYER, awmdVar);
        agkhVar.e(aixo.SLOT_TYPE_BELOW_PLAYER_IMMERSIVE, awmdVar2);
        agkhVar.e(aixo.SLOT_TYPE_IN_PLAYER, awmdVar3);
        agkhVar.e(aixo.SLOT_TYPE_LOCKSCREEN, awmdVar4);
        agkhVar.e(aixo.SLOT_TYPE_FORECASTING, awmdVar5);
        agkhVar.e(aixo.SLOT_TYPE_PLAYER_BYTES, awmdVar6);
        agkhVar.e(aixo.SLOT_TYPE_AD_BREAK_REQUEST, awmdVar7);
        return agkhVar.d(true);
    }

    public static agkj s(awmd awmdVar, awmd awmdVar2) {
        agkh agkhVar = new agkh(4);
        agkhVar.e(aixo.SLOT_TYPE_BELOW_PLAYER, awmdVar2);
        agkhVar.e(aixo.SLOT_TYPE_BELOW_PLAYER_IMMERSIVE, new gfy(1));
        agkhVar.e(aixo.SLOT_TYPE_IN_PLAYER, new gfy(0));
        agkhVar.e(aixo.SLOT_TYPE_LOCKSCREEN, new gfy(2));
        agkhVar.e(aixo.SLOT_TYPE_FIXED_FOOTER, new gfy(3));
        agkhVar.e(aixo.SLOT_TYPE_FORECASTING, new gfy(4));
        agkhVar.e(aixo.SLOT_TYPE_PLAYER_BYTES, awmdVar);
        agkhVar.e(aixo.SLOT_TYPE_AD_BREAK_REQUEST, new gfy(5));
        return agkhVar.d(true);
    }

    public static Map t(awmd awmdVar, awmd awmdVar2, awmd awmdVar3, awmd awmdVar4, awmd awmdVar5, awmd awmdVar6, awmd awmdVar7, awmd awmdVar8, awmd awmdVar9, awmd awmdVar10, awmd awmdVar11, awmd awmdVar12, awmd awmdVar13, awmd awmdVar14, awmd awmdVar15, awmd awmdVar16, awmd awmdVar17, awmd awmdVar18, awmd awmdVar19, awmd awmdVar20, awmd awmdVar21, awmd awmdVar22) {
        HashMap map = new HashMap();
        map.put(aixr.TRIGGER_TYPE_ACTIVE_VIEW_VIEWABLE_CRITERIA_SATISFIED, awmdVar2);
        map.put(aixr.TRIGGER_TYPE_ACTIVE_VIEW_MEASURABLE_CRITERIA_SATISFIED, awmdVar2);
        map.put(aixr.TRIGGER_TYPE_ACTIVE_VIEW_GROUPM_VIEWABLE_CRITERIA_SATISFIED, awmdVar2);
        map.put(aixr.TRIGGER_TYPE_ACTIVE_VIEW_AUDIO_AUDIBLE_CRITERIA_SATISFIED, awmdVar2);
        map.put(aixr.TRIGGER_TYPE_ACTIVE_VIEW_AUDIO_MEASURABLE_CRITERIA_SATISFIED, awmdVar2);
        map.put(aixr.TRIGGER_TYPE_SLOT_ID_ENTER_REQUESTED, awmdVar);
        map.put(aixr.TRIGGER_TYPE_SLOT_ID_ENTERED, awmdVar);
        map.put(aixr.TRIGGER_TYPE_SLOT_ID_SCHEDULED, awmdVar);
        map.put(aixr.TRIGGER_TYPE_SLOT_ID_UNSCHEDULED, awmdVar);
        map.put(aixr.TRIGGER_TYPE_LAYOUT_ID_ENTERED, awmdVar);
        map.put(aixr.TRIGGER_TYPE_LAYOUT_ID_ENTERED_AND_SLOT_FULFILLED, awmdVar);
        map.put(aixr.TRIGGER_TYPE_ON_DIFFERENT_LAYOUT_ID_ENTERED, awmdVar);
        map.put(aixr.TRIGGER_TYPE_LAYOUT_ID_EXITED, awmdVar);
        map.put(aixr.TRIGGER_TYPE_SLOT_ID_EXITED, awmdVar);
        map.put(aixr.TRIGGER_TYPE_MEDIA_TIME_RANGE, awmdVar3);
        map.put(aixr.TRIGGER_TYPE_MEDIA_TIME_RANGE_PING, awmdVar3);
        map.put(aixr.TRIGGER_TYPE_ON_PLAYBACK_DESTROYED, awmdVar6);
        map.put(aixr.TRIGGER_TYPE_CONTENT_VIDEO_ID_ENDED, awmdVar3);
        map.put(aixr.TRIGGER_TYPE_ENGAGEMENT_PANEL_CLOSE_REQUESTED, awmdVar5);
        map.put(aixr.TRIGGER_TYPE_ENGAGEMENT_PANEL_AUTO_CLOSE, awmdVar5);
        map.put(aixr.TRIGGER_TYPE_ON_NEXT_SLOT_ENTER_REQUESTED, awmdVar);
        map.put(aixr.TRIGGER_TYPE_ON_NEW_PLAYBACK_AFTER_CONTENT_VIDEO_ID, awmdVar12);
        map.put(aixr.TRIGGER_TYPE_ON_SLOT_CANCELLATION_REQUESTED, awmdVar13);
        map.put(aixr.TRIGGER_TYPE_LIVE_STREAM_BREAK_STARTED, awmdVar14);
        map.put(aixr.TRIGGER_TYPE_LIVE_STREAM_BREAK_ENDED, awmdVar14);
        map.put(aixr.TRIGGER_TYPE_MEDIA_NON_TERMINAL_ABANDONED, awmdVar15);
        map.put(aixr.TRIGGER_TYPE_ON_LAYOUT_SELF_EXIT_REQUESTED, awmdVar16);
        map.put(aixr.TRIGGER_TYPE_SKIP_REQUESTED, awmdVar17);
        map.put(aixr.TRIGGER_TYPE_SKIP_REQUESTED_PING, awmdVar17);
        map.put(aixr.TRIGGER_TYPE_LAYOUT_EXITED_FOR_REASON, awmdVar);
        map.put(aixr.TRIGGER_TYPE_LAYOUT_EXITED_FOR_REASON_PING, awmdVar);
        map.put(aixr.TRIGGER_TYPE_SURVEY_DISMISSED, awmdVar18);
        map.put(aixr.TRIGGER_TYPE_SURVEY_SUBMITTED, awmdVar18);
        map.put(aixr.TRIGGER_TYPE_BEFORE_CONTENT_VIDEO_ID_STARTED, awmdVar12);
        map.put(aixr.TRIGGER_TYPE_LAYOUT_EXITED_FOR_OTHER_REASON, awmdVar);
        map.put(aixr.TRIGGER_TYPE_ON_MEDIA_PLAYBACK_ERROR, awmdVar7);
        map.put(aixr.TRIGGER_TYPE_MEDIA_FULLSCREEN_ENTERED, awmdVar8);
        map.put(aixr.TRIGGER_TYPE_MEDIA_FULLSCREEN_EXITED, awmdVar8);
        map.put(aixr.TRIGGER_TYPE_MEDIA_PAUSED, awmdVar10);
        map.put(aixr.TRIGGER_TYPE_DURATION_AFTER_MEDIA_PAUSED, awmdVar10);
        map.put(aixr.TRIGGER_TYPE_MEDIA_RESUMED, awmdVar10);
        map.put(aixr.TRIGGER_TYPE_MEDIA_PLAYBACK_STARTED, awmdVar10);
        map.put(aixr.TRIGGER_TYPE_CLOSE_REQUESTED, awmdVar11);
        map.put(aixr.TRIGGER_TYPE_DURATION_AFTER_MEDIA_PAUSED_AND_STANDARD_PLAYER, awmdVar9);
        map.put(aixr.TRIGGER_TYPE_DURATION_AFTER_MEDIA_PAUSED_AND_FULLSCREEN_PLAYER, awmdVar9);
        map.put(aixr.TRIGGER_TYPE_VISIT_ADVERTISER_LINK_CLICKED, awmdVar19);
        map.put(aixr.TRIGGER_TYPE_SLOT_ID_FULFILLED_NON_EMPTY, awmdVar);
        map.put(aixr.TRIGGER_TYPE_SLOT_ID_FULFILLED_EMPTY, awmdVar);
        map.put(aixr.TRIGGER_TYPE_ON_OPPORTUNITY_TYPE_RECEIVED, awmdVar);
        map.put(aixr.TRIGGER_TYPE_LAYOUT_EXITED_AFTER_TIMEOUT, awmdVar20);
        map.put(aixr.TRIGGER_TYPE_ON_PLAYBACK_WITH_CONTENT_VIDEO_ID, awmdVar12);
        map.put(aixr.TRIGGER_TYPE_ON_INTERSTITIAL_PLAYING_DURING_CONTENT_VIDEO_ID, awmdVar12);
        map.put(aixr.TRIGGER_TYPE_DURATION_AFTER_LAYOUT_EXITED, awmdVar4);
        map.put(aixr.TRIGGER_TYPE_DYNAMIC_DURATION_AFTER_CACHE_MISS, awmdVar21);
        map.put(aixr.TRIGGER_TYPE_BELOW_PLAYER_SPACE_TAKEN, awmdVar22);
        map.put(aixr.TRIGGER_TYPE_IN_PLAYER_SPACE_TAKEN, awmdVar22);
        return map;
    }

    public static MusicActivity u(Activity activity) {
        if (activity instanceof MusicActivity) {
            return (MusicActivity) activity;
        }
        throw new IllegalStateException(enb.d(activity, get.class, "Attempt to inject a Activity wrapper of type "));
    }

    public static jba v(Map map, Map map2) {
        return new jba(new admq(map, map2, new tgr((byte[]) null)));
    }

    public static stp w() {
        return stp.a;
    }

    public static wza x() {
        return wza.a;
    }

    public static awku y() {
        return new awku(Float.valueOf(1.0f));
    }

    public static awku z() {
        return new awku(Boolean.FALSE);
    }

    private gzj() {
    }
}
