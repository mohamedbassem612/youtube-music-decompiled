package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.Spanned;
import android.text.format.DateUtils;
import android.widget.RemoteViews;
import app.rive.semantics.SemanticState;
import com.google.android.apps.youtube.music.R;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aabn implements aabo {
    public final Context c;
    public final int d;
    public final int e;
    public final Intent f;
    public final Intent g;
    public final mbc h;
    public final agev i;
    public final aaap j;
    public final vxz k;
    private final int o;
    private final aaak p;
    private final adhv q;
    private static final agrf l = agrf.h("com/google/android/libraries/youtube/notification/push/util/ImageNotificationDecorator");
    public static final agkj a = agkj.k(aoci.BASIC_THUMBNAIL_LAYOUT_TYPE_LARGE_THUMBNAIL_END, Integer.valueOf(R.layout.custom_notification_large_thumbnail_end), aoci.BASIC_THUMBNAIL_LAYOUT_TYPE_LARGE_THUMBNAIL_START, Integer.valueOf(R.layout.custom_notification_basic_thumbnail_start));
    private static final agkj m = agkj.k(aocl.SHORTS_LAYOUT_TYPE_THUMBNAIL_END, Integer.valueOf(R.layout.shorts_notification_thumbnail_end), aocl.SHORTS_LAYOUT_TYPE_THUMBNAIL_END_NO_HEADER, Integer.valueOf(R.layout.shorts_notification_thumbnail_end_no_header));
    private static final agkj n = agkj.k(aock.SHORTS_EXPANDED_LAYOUT_TYPE_THUMBNAIL_END, Integer.valueOf(R.layout.shorts_notification_thumbnail_end_expanded), aock.SHORTS_EXPANDED_LAYOUT_TYPE_THUMBNAIL_END_TWO_TWO, Integer.valueOf(R.layout.shorts_notification_thumbnail_end_two_two));
    public static final agkj b = agkj.k(aocj.NOTIFICATION_SURVEY_LAYOUT_TYPE_FIVE_SCALE, Integer.valueOf(R.layout.notification_survey_five_options), aocj.NOTIFICATION_SURVEY_LAYOUT_TYPE_FIVE_SCALE_12_PLUS, Integer.valueOf(R.layout.notification_survey_five_options_12_plus));

    public aabn(Context context, int i, int i2, int i3, Intent intent, Intent intent2, mbc mbcVar, aaak aaakVar, adhv adhvVar, agev agevVar, aaap aaapVar, vxz vxzVar) {
        this.c = context;
        this.d = i;
        this.o = i2;
        this.e = i3;
        this.f = intent;
        this.g = intent2;
        this.h = mbcVar;
        this.p = aaakVar;
        this.q = adhvVar;
        this.i = agevVar;
        this.j = aaapVar;
        this.k = vxzVar;
    }

    private static boolean c(ajda ajdaVar) {
        return ((ajdaVar.c == 17 ? (ajcv) ajdaVar.d : ajcv.a).b & 2) == 0 && Build.VERSION.SDK_INT >= 31;
    }

    @Override // defpackage.aabo
    public final void a(final ajda ajdaVar, final xgn xgnVar, final aabr aabrVar, final atr atrVar) {
        twi twiVar = new twi() { // from class: aabg
            @Override // defpackage.twi
            public final void a(Object obj) {
                alay alayVar;
                alay alayVar2;
                Bitmap bitmap = (Bitmap) obj;
                ajda ajdaVar2 = ajdaVar;
                ajdb ajdbVarI = aagu.i(ajdaVar2);
                if (ajdbVarI != null) {
                    aoci aociVarA = aoci.a(ajdbVarI.g);
                    if (aociVarA == null) {
                        aociVarA = aoci.BASIC_THUMBNAIL_LAYOUT_TYPE_UNKNOWN;
                    }
                    agkj agkjVar = aabn.a;
                    if (agkjVar.containsKey(aociVarA)) {
                        ajcu ajcuVar = ajdaVar2.e;
                        if (ajcuVar == null) {
                            ajcuVar = ajcu.a;
                        }
                        aabn aabnVar = this.a;
                        Integer num = (Integer) agkjVar.get(aociVarA);
                        int iIntValue = num.intValue();
                        agrf agrfVar = aabt.a;
                        jnx jnxVar = new jnx(19);
                        int i = aabnVar.e;
                        Context context = aabnVar.c;
                        if (i == 0 || iIntValue == 0) {
                            return;
                        }
                        try {
                            RemoteViews remoteViews = (RemoteViews) jnxVar.a(context.getPackageName(), num);
                            remoteViews.setImageViewBitmap(R.id.custom_notification_thumbnail, bitmap);
                            aabt.b(context, remoteViews);
                            if ((ajcuVar.b & 8) != 0) {
                                alayVar = ajcuVar.f;
                                if (alayVar == null) {
                                    alayVar = alay.a;
                                }
                            } else {
                                alayVar = null;
                            }
                            remoteViews.setTextViewText(R.id.custom_notification_title, ackj.k(null, alayVar, null, false));
                            if ((ajcuVar.b & 16) != 0) {
                                alayVar2 = ajcuVar.g;
                                if (alayVar2 == null) {
                                    alayVar2 = alay.a;
                                }
                            } else {
                                alayVar2 = null;
                            }
                            int i2 = aabnVar.d;
                            remoteViews.setTextViewText(R.id.custom_notification_body, ackj.k(null, alayVar2, null, false));
                            remoteViews.setImageViewResource(R.id.small_icon, i2);
                            aoci aociVarA2 = aoci.a(ajdbVarI.g);
                            if (aociVarA2 == null) {
                                aociVarA2 = aoci.BASIC_THUMBNAIL_LAYOUT_TYPE_UNKNOWN;
                            }
                            if (aociVarA2 != aoci.BASIC_THUMBNAIL_LAYOUT_TYPE_LARGE_THUMBNAIL_START || ajdbVarI.h) {
                                long epochMilli = aabnVar.h.f().toEpochMilli();
                                remoteViews.setTextViewText(R.id.custom_notification_title_timestamp, DateUtils.formatSameDayTime(epochMilli, epochMilli, 3, 3));
                            }
                            Resources resources = context.getResources();
                            if (aociVarA2.ordinal() == 1) {
                                if (aociVarA2.ordinal() == 1) {
                                    remoteViews.setInt(R.id.small_icon, "setColorFilter", resources.getColor(R.color.small_icon_background));
                                }
                                remoteViews.setTextViewText(R.id.custom_notification_title_text, resources.getString(i));
                            }
                            int iAU = a.aU(ajdbVarI.i);
                            if (iAU != 0 && iAU == 2) {
                                remoteViews.setTextColor(R.id.custom_notification_title, resources.getColor(R.color.yt_white1));
                                remoteViews.setTextColor(R.id.custom_notification_title_timestamp, resources.getColor(R.color.white_text_body));
                                remoteViews.setTextColor(R.id.custom_notification_body, resources.getColor(R.color.white_text_body));
                            }
                            int iIntValue2 = ajdbVarI.d == 3 ? ((Integer) ajdbVarI.e).intValue() : 0;
                            if (iIntValue2 != 0) {
                                remoteViews.setViewVisibility(R.id.custom_notification_thumbnail_duration, 0);
                                remoteViews.setTextViewText(R.id.custom_notification_thumbnail_duration, DateUtils.formatElapsedTime(iIntValue2));
                            } else {
                                remoteViews.setViewVisibility(R.id.custom_notification_thumbnail_duration, 8);
                            }
                            boolean zBooleanValue = ajdbVarI.d == 6 ? ((Boolean) ajdbVarI.e).booleanValue() : false;
                            if (zBooleanValue || (ajdbVarI.d == 7 && ((Boolean) ajdbVarI.e).booleanValue())) {
                                remoteViews.setViewVisibility(R.id.custom_notification_thumbnail_red_badge, 0);
                                if (zBooleanValue) {
                                    remoteViews.setTextViewText(R.id.custom_notification_thumbnail_red_badge, resources.getString(R.string.custom_notification_live));
                                } else {
                                    remoteViews.setTextViewText(R.id.custom_notification_thumbnail_red_badge, resources.getString(R.string.custom_notification_premiere));
                                }
                            } else {
                                remoteViews.setViewVisibility(R.id.custom_notification_thumbnail_red_badge, 8);
                            }
                            atrVar.i(remoteViews);
                        } catch (Exception e) {
                            ((agrc) ((agrc) ((agrc) aabt.a.b()).j(e)).k("com/google/android/libraries/youtube/notification/push/util/NotificationProcessingCustomRenderingUtil", "decorateInternal", 132, "NotificationProcessingCustomRenderingUtil.java")).w("Exception while creating RemoteViews: %s", e);
                        }
                    }
                }
            }
        };
        final int i = 1;
        avne avneVar = new avne(this) { // from class: aabh
            public final /* synthetic */ aabn a;

            {
                this.a = this;
            }

            @Override // defpackage.avne
            public final void a(Object obj, Object obj2) {
                alay alayVar;
                alay alayVar2;
                alay alayVar3;
                alay alayVar4;
                int i2 = 18;
                if (i == 0) {
                    Bitmap bitmap = (Bitmap) obj;
                    Integer num = (Integer) obj2;
                    ajcu ajcuVar = ajdaVar.e;
                    if (ajcuVar == null) {
                        ajcuVar = ajcu.a;
                    }
                    aabn aabnVar = this.a;
                    num.intValue();
                    jnx jnxVar = new jnx(i2);
                    agrf agrfVar = aabt.a;
                    Context context = aabnVar.c;
                    if (aabnVar.e != 0) {
                        try {
                            Object objA = jnxVar.a(context.getPackageName(), num);
                            if (ajcuVar == null || (ajcuVar.b & 8) == 0) {
                                alayVar = null;
                            } else {
                                alayVar = ajcuVar.f;
                                if (alayVar == null) {
                                    alayVar = alay.a;
                                }
                            }
                            RemoteViews remoteViews = (RemoteViews) objA;
                            remoteViews.setTextViewText(R.id.custom_notification_title, ackj.k(null, alayVar, null, false));
                            if (ajcuVar == null || (ajcuVar.b & 16) == 0) {
                                alayVar2 = null;
                            } else {
                                alayVar2 = ajcuVar.g;
                                if (alayVar2 == null) {
                                    alayVar2 = alay.a;
                                }
                            }
                            atr atrVar2 = atrVar;
                            remoteViews.setTextViewText(R.id.custom_notification_body, ackj.k(null, alayVar2, null, false));
                            remoteViews.setImageViewBitmap(R.id.custom_notification_thumbnail, bitmap);
                            atrVar2.D = remoteViews;
                            atrVar2.r(new atw());
                            return;
                        } catch (Exception e) {
                            ((agrc) ((agrc) ((agrc) aabt.a.b()).j(e)).k("com/google/android/libraries/youtube/notification/push/util/NotificationProcessingCustomRenderingUtil", "decorateForShortsExpanded", 300, "NotificationProcessingCustomRenderingUtil.java")).w("Exception while creating RemoteViews: %s", e);
                            return;
                        }
                    }
                    return;
                }
                Bitmap bitmap2 = (Bitmap) obj;
                Integer num2 = (Integer) obj2;
                int iIntValue = num2.intValue();
                ajcu ajcuVar2 = ajdaVar.e;
                if (ajcuVar2 == null) {
                    ajcuVar2 = ajcu.a;
                }
                aabn aabnVar2 = this.a;
                jnx jnxVar2 = new jnx(i2);
                agrf agrfVar2 = aabt.a;
                Context context2 = aabnVar2.c;
                int i3 = aabnVar2.e;
                if (i3 != 0) {
                    try {
                        Object objA2 = jnxVar2.a(context2.getPackageName(), num2);
                        Resources resources = context2.getResources();
                        if (iIntValue == R.layout.shorts_notification_thumbnail_end) {
                            int i4 = aabnVar2.d;
                            mbc mbcVar = aabnVar2.h;
                            RemoteViews remoteViews2 = (RemoteViews) objA2;
                            remoteViews2.setImageViewResource(R.id.small_icon, i4);
                            remoteViews2.setInt(R.id.small_icon, "setColorFilter", resources.getColor(R.color.small_icon_background));
                            remoteViews2.setTextViewText(R.id.custom_notification_header_text, resources.getString(i3));
                            long epochMilli = mbcVar.f().toEpochMilli();
                            remoteViews2.setTextViewText(R.id.custom_notification_header_timestamp, DateUtils.formatSameDayTime(epochMilli, epochMilli, 3, 3));
                            aabt.b(context2, remoteViews2);
                        }
                        if ((ajcuVar2.b & 8) != 0) {
                            alayVar3 = ajcuVar2.f;
                            if (alayVar3 == null) {
                                alayVar3 = alay.a;
                            }
                        } else {
                            alayVar3 = null;
                        }
                        RemoteViews remoteViews3 = (RemoteViews) objA2;
                        remoteViews3.setTextViewText(R.id.custom_notification_title, ackj.k(null, alayVar3, null, false));
                        if ((ajcuVar2.b & 16) != 0) {
                            alayVar4 = ajcuVar2.g;
                            if (alayVar4 == null) {
                                alayVar4 = alay.a;
                            }
                        } else {
                            alayVar4 = null;
                        }
                        atr atrVar3 = atrVar;
                        remoteViews3.setTextViewText(R.id.custom_notification_body, ackj.k(null, alayVar4, null, false));
                        remoteViews3.setImageViewBitmap(R.id.custom_notification_thumbnail, bitmap2);
                        atrVar3.C = remoteViews3;
                    } catch (Exception e2) {
                        ((agrc) ((agrc) ((agrc) aabt.a.b()).j(e2)).k("com/google/android/libraries/youtube/notification/push/util/NotificationProcessingCustomRenderingUtil", "decorateForShorts", 242, "NotificationProcessingCustomRenderingUtil.java")).w("Exception while creating RemoteViews: %s", e2);
                    }
                }
            }
        };
        final int i2 = 0;
        b(atrVar, ajdaVar, twiVar, avneVar, new avne(this) { // from class: aabh
            public final /* synthetic */ aabn a;

            {
                this.a = this;
            }

            @Override // defpackage.avne
            public final void a(Object obj, Object obj2) {
                alay alayVar;
                alay alayVar2;
                alay alayVar3;
                alay alayVar4;
                int i3 = 18;
                if (i2 == 0) {
                    Bitmap bitmap = (Bitmap) obj;
                    Integer num = (Integer) obj2;
                    ajcu ajcuVar = ajdaVar.e;
                    if (ajcuVar == null) {
                        ajcuVar = ajcu.a;
                    }
                    aabn aabnVar = this.a;
                    num.intValue();
                    jnx jnxVar = new jnx(i3);
                    agrf agrfVar = aabt.a;
                    Context context = aabnVar.c;
                    if (aabnVar.e != 0) {
                        try {
                            Object objA = jnxVar.a(context.getPackageName(), num);
                            if (ajcuVar == null || (ajcuVar.b & 8) == 0) {
                                alayVar = null;
                            } else {
                                alayVar = ajcuVar.f;
                                if (alayVar == null) {
                                    alayVar = alay.a;
                                }
                            }
                            RemoteViews remoteViews = (RemoteViews) objA;
                            remoteViews.setTextViewText(R.id.custom_notification_title, ackj.k(null, alayVar, null, false));
                            if (ajcuVar == null || (ajcuVar.b & 16) == 0) {
                                alayVar2 = null;
                            } else {
                                alayVar2 = ajcuVar.g;
                                if (alayVar2 == null) {
                                    alayVar2 = alay.a;
                                }
                            }
                            atr atrVar2 = atrVar;
                            remoteViews.setTextViewText(R.id.custom_notification_body, ackj.k(null, alayVar2, null, false));
                            remoteViews.setImageViewBitmap(R.id.custom_notification_thumbnail, bitmap);
                            atrVar2.D = remoteViews;
                            atrVar2.r(new atw());
                            return;
                        } catch (Exception e) {
                            ((agrc) ((agrc) ((agrc) aabt.a.b()).j(e)).k("com/google/android/libraries/youtube/notification/push/util/NotificationProcessingCustomRenderingUtil", "decorateForShortsExpanded", 300, "NotificationProcessingCustomRenderingUtil.java")).w("Exception while creating RemoteViews: %s", e);
                            return;
                        }
                    }
                    return;
                }
                Bitmap bitmap2 = (Bitmap) obj;
                Integer num2 = (Integer) obj2;
                int iIntValue = num2.intValue();
                ajcu ajcuVar2 = ajdaVar.e;
                if (ajcuVar2 == null) {
                    ajcuVar2 = ajcu.a;
                }
                aabn aabnVar2 = this.a;
                jnx jnxVar2 = new jnx(i3);
                agrf agrfVar2 = aabt.a;
                Context context2 = aabnVar2.c;
                int i4 = aabnVar2.e;
                if (i4 != 0) {
                    try {
                        Object objA2 = jnxVar2.a(context2.getPackageName(), num2);
                        Resources resources = context2.getResources();
                        if (iIntValue == R.layout.shorts_notification_thumbnail_end) {
                            int i5 = aabnVar2.d;
                            mbc mbcVar = aabnVar2.h;
                            RemoteViews remoteViews2 = (RemoteViews) objA2;
                            remoteViews2.setImageViewResource(R.id.small_icon, i5);
                            remoteViews2.setInt(R.id.small_icon, "setColorFilter", resources.getColor(R.color.small_icon_background));
                            remoteViews2.setTextViewText(R.id.custom_notification_header_text, resources.getString(i4));
                            long epochMilli = mbcVar.f().toEpochMilli();
                            remoteViews2.setTextViewText(R.id.custom_notification_header_timestamp, DateUtils.formatSameDayTime(epochMilli, epochMilli, 3, 3));
                            aabt.b(context2, remoteViews2);
                        }
                        if ((ajcuVar2.b & 8) != 0) {
                            alayVar3 = ajcuVar2.f;
                            if (alayVar3 == null) {
                                alayVar3 = alay.a;
                            }
                        } else {
                            alayVar3 = null;
                        }
                        RemoteViews remoteViews3 = (RemoteViews) objA2;
                        remoteViews3.setTextViewText(R.id.custom_notification_title, ackj.k(null, alayVar3, null, false));
                        if ((ajcuVar2.b & 16) != 0) {
                            alayVar4 = ajcuVar2.g;
                            if (alayVar4 == null) {
                                alayVar4 = alay.a;
                            }
                        } else {
                            alayVar4 = null;
                        }
                        atr atrVar3 = atrVar;
                        remoteViews3.setTextViewText(R.id.custom_notification_body, ackj.k(null, alayVar4, null, false));
                        remoteViews3.setImageViewBitmap(R.id.custom_notification_thumbnail, bitmap2);
                        atrVar3.C = remoteViews3;
                    } catch (Exception e2) {
                        ((agrc) ((agrc) ((agrc) aabt.a.b()).j(e2)).k("com/google/android/libraries/youtube/notification/push/util/NotificationProcessingCustomRenderingUtil", "decorateForShorts", 242, "NotificationProcessingCustomRenderingUtil.java")).w("Exception while creating RemoteViews: %s", e2);
                    }
                }
            }
        }, new twi() { // from class: aabi
            /* JADX WARN: Type inference failed for: r6v5, types: [aduv, java.lang.Object] */
            @Override // defpackage.twi
            public final void a(Object obj) {
                ajdd ajddVar;
                ajdd ajddVar2 = (ajdd) obj;
                agkj agkjVar = aabn.b;
                aocj aocjVarA = aocj.a(ajddVar2.c);
                if (aocjVarA == null) {
                    aocjVarA = aocj.NOTIFICATION_SURVEY_LAYOUT_TYPE_UNKNOWN;
                }
                int i3 = 0;
                Integer num = (Integer) agkjVar.getOrDefault(aocjVarA, 0);
                int iIntValue = num.intValue();
                if (ajddVar2 == null || iIntValue == 0) {
                    return;
                }
                ajda ajdaVar2 = ajdaVar;
                ajcu ajcuVar = ajdaVar2.e;
                if (ajcuVar == null) {
                    ajcuVar = ajcu.a;
                }
                aisd aisdVar = ajdaVar2.o;
                if (aisdVar == null) {
                    aisdVar = aisd.a;
                }
                aabn aabnVar = this.a;
                jnx jnxVar = new jnx(18);
                Context context = aabnVar.c;
                int i4 = 2;
                vnc vncVar = new vnc(context, i4);
                agrf agrfVar = aabt.a;
                try {
                    Object objA = jnxVar.a(context.getPackageName(), num);
                    alay alayVar = ajcuVar.f;
                    if (alayVar == null) {
                        alayVar = alay.a;
                    }
                    Spanned spannedK = ackj.k(null, alayVar, null, false);
                    RemoteViews remoteViews = (RemoteViews) objA;
                    remoteViews.setTextViewText(R.id.custom_notification_title, spannedK);
                    alay alayVar2 = ajcuVar.g;
                    if (alayVar2 == null) {
                        alayVar2 = alay.a;
                    }
                    Spanned spannedK2 = ackj.k(null, alayVar2, null, false);
                    remoteViews.setTextViewText(R.id.custom_notification_text, spannedK2);
                    int i5 = 0;
                    while (i5 < ajddVar2.d.size()) {
                        apji apjiVar = (apji) ajddVar2.d.get(i5);
                        int i6 = i4;
                        int i7 = aabt.b.get(i5, i3);
                        int i8 = aabt.c.get(i5, i3);
                        if (i7 == 0) {
                            ajddVar = ajddVar2;
                        } else {
                            aihl aihlVarCheckIsLite = aihn.checkIsLite(ajdc.b);
                            apjiVar.c(aihlVarCheckIsLite);
                            ajddVar = ajddVar2;
                            Object objK = apjiVar.j.k(aihlVarCheckIsLite.d);
                            ajdc ajdcVar = (ajdc) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK));
                            alja aljaVar = ajdcVar.d;
                            if (aljaVar == null) {
                                aljaVar = alja.a;
                            }
                            aliz alizVarA = aliz.a(aljaVar.c);
                            if (alizVarA == null) {
                                alizVarA = aliz.UNKNOWN;
                            }
                            remoteViews.setImageViewResource(i7, ((agfa) aabnVar.i).a.a(alizVarA));
                            int i9 = ajdcVar.c;
                            int i10 = i9 & 2;
                            if ((i9 & 4) != 0 || i10 != 0) {
                                Intent intent = aabnVar.f;
                                Intent intent2 = aabnVar.g;
                                aabr aabrVar2 = aabrVar;
                                if (i10 == 0) {
                                    intent2 = intent;
                                }
                                Intent intent3 = new Intent(intent2);
                                aagu.p(intent3, aabrVar2);
                                if ((ajdcVar.c & 2) != 0) {
                                    ajwo ajwoVar = ajdcVar.e;
                                    if (ajwoVar == null) {
                                        ajwoVar = ajwo.a;
                                    }
                                    zik.bd(intent3, ajwoVar, null, false);
                                }
                                if ((ajdcVar.c & 4) != 0) {
                                    ajwo ajwoVar2 = ajdcVar.f;
                                    if (ajwoVar2 == null) {
                                        ajwoVar2 = ajwo.a;
                                    }
                                    aagu.q(intent3, ajwoVar2);
                                }
                                yno.V(intent3, aisdVar);
                                if ((ajdcVar.c & 8) != 0) {
                                    aabp.c(intent3, xgnVar.a());
                                    intent3.putExtra("interaction_type", 1);
                                    amud amudVar = ajdcVar.g;
                                    if (amudVar == null) {
                                        amudVar = amud.b;
                                    }
                                    aabq.e(intent3, amudVar);
                                }
                                try {
                                    remoteViews.setOnClickPendingIntent(i8, (PendingIntent) vncVar.a(Boolean.valueOf((ajdcVar.c & 2) != 0), intent3));
                                    remoteViews.setViewVisibility(i8, 0);
                                } catch (Exception e) {
                                    ((agrc) ((agrc) ((agrc) aabt.a.b()).j(e)).k("com/google/android/libraries/youtube/notification/push/util/NotificationProcessingCustomRenderingUtil", "decorateForSurvey", 377, "NotificationProcessingCustomRenderingUtil.java")).w("Exception while getting PendingIntent for survey option: %s", e);
                                }
                            }
                            i5++;
                            ajddVar2 = ajddVar;
                            i3 = 0;
                            i4 = i6;
                        }
                        i5 = i5;
                        i5++;
                        ajddVar2 = ajddVar;
                        i3 = 0;
                        i4 = i6;
                    }
                    vxz vxzVar = aabnVar.k;
                    atr atrVar2 = atrVar;
                    if (vxzVar.l(17, 45666398L, false)) {
                        atrVar2.l(spannedK);
                        atrVar2.k(spannedK2);
                        atrVar2.m = false;
                    } else {
                        atrVar2.i(remoteViews);
                    }
                    atrVar2.D = remoteViews;
                } catch (Exception e2) {
                    ((agrc) ((agrc) ((agrc) aabt.a.b()).j(e2)).k("com/google/android/libraries/youtube/notification/push/util/NotificationProcessingCustomRenderingUtil", "decorateForSurvey", 339, "NotificationProcessingCustomRenderingUtil.java")).w("Exception while providing RemoveViews: %s", e2);
                }
            }
        }, new avnf() { // from class: aabj
            @Override // defpackage.avnf
            public final Object a(Object obj, Object obj2) {
                Bitmap bitmap = (Bitmap) obj;
                Context context = this.a.c;
                int dimension = (int) context.getResources().getDimension(android.R.dimen.notification_large_icon_width);
                int dimension2 = (int) context.getResources().getDimension(android.R.dimen.notification_large_icon_height);
                ajcx ajcxVarA = ajcx.a(ajdaVar.p);
                if (ajcxVarA == null) {
                    ajcxVarA = ajcx.ICON_IMAGE_STYLE_DEFAULT;
                }
                int iOrdinal = ajcxVarA.ordinal();
                if (iOrdinal != 2) {
                    return iOrdinal != 3 ? Bitmap.createScaledBitmap(bitmap, dimension, dimension2, true) : bitmap;
                }
                if (bitmap.getWidth() >= bitmap.getHeight()) {
                    return Bitmap.createBitmap(bitmap, (bitmap.getWidth() / 2) - (bitmap.getHeight() / 2), 0, bitmap.getHeight(), bitmap.getHeight());
                }
                return Bitmap.createBitmap(bitmap, 0, (bitmap.getHeight() / 2) - (bitmap.getWidth() / 2), bitmap.getWidth(), bitmap.getWidth());
            }
        }, new atp(), new atq());
    }

    /* JADX WARN: Code duplicated, block: B:138:0x0207  */
    /* JADX WARN: Code duplicated, block: B:174:0x0306 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:175:0x0308  */
    /* JADX WARN: Code duplicated, block: B:177:0x0310  */
    /* JADX WARN: Code duplicated, block: B:179:0x031a  */
    /* JADX WARN: Code duplicated, block: B:184:0x0330 A[Catch: Exception -> 0x033e, TryCatch #0 {Exception -> 0x033e, blocks: (B:182:0x0322, B:184:0x0330, B:185:0x0332), top: B:282:0x0322 }] */
    /* JADX WARN: Code duplicated, block: B:189:0x035b  */
    /* JADX WARN: Code duplicated, block: B:191:0x0361  */
    /* JADX WARN: Code duplicated, block: B:282:0x0322 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:45:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:47:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:48:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:51:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:53:0x0109  */
    /* JADX WARN: Code duplicated, block: B:54:0x010c  */
    /* JADX WARN: Code duplicated, block: B:57:0x011a  */
    /* JADX WARN: Code duplicated, block: B:60:0x0122  */
    final void b(atr atrVar, ajda ajdaVar, twi twiVar, avne avneVar, avne avneVar2, twi twiVar2, avnf avnfVar, atp atpVar, atq atqVar) {
        String str;
        String str2;
        agkj agkjVarD;
        ajdd ajddVarJ;
        aabm aabmVar;
        agkj agkjVar;
        aocl aoclVarA;
        aocl aoclVarA2;
        Object objA;
        alay alayVar;
        alay alayVar2;
        alay alayVar3;
        alay alayVar4;
        int i;
        Uri uriH;
        int i2;
        aihl aihlVar;
        aihl aihlVarCheckIsLite;
        aihl aihlVarCheckIsLite2;
        Object objK;
        Object objC;
        agkj agkjVar2;
        aihl aihlVarCheckIsLite3;
        Object objK2;
        Object objC2;
        aocl aoclVarA3;
        if (ajdaVar != null) {
            int i3 = this.e;
            agkh agkhVar = new agkh(4);
            agkx agkxVar = new agkx();
            agkxVar.c(aabm.e);
            if (((ajdaVar.c == 17 ? (ajcv) ajdaVar.d : ajcv.a).b & 1) != 0) {
                agkxVar.c(aabm.a);
            }
            if (((ajdaVar.c == 17 ? (ajcv) ajdaVar.d : ajcv.a).b & 2) != 0) {
                agkxVar.c(aabm.b);
            }
            if (i3 != 0) {
                if ((ajdaVar.b & SemanticState.Modal) != 0) {
                    apji apjiVar = ajdaVar.s;
                    if (apjiVar == null) {
                        apjiVar = apji.a;
                    }
                    aihl aihlVarCheckIsLite4 = aihn.checkIsLite(ajdb.b);
                    apjiVar.c(aihlVarCheckIsLite4);
                    if (apjiVar.j.n(aihlVarCheckIsLite4.d)) {
                        aihl aihlVarCheckIsLite5 = aihn.checkIsLite(ajdb.b);
                        apjiVar.c(aihlVarCheckIsLite5);
                        Object objK3 = apjiVar.j.k(aihlVarCheckIsLite5.d);
                        if ((((ajdb) (objK3 == null ? aihlVarCheckIsLite5.b : aihlVarCheckIsLite5.c(objK3))).c & 2) != 0) {
                            agkj agkjVar3 = a;
                            aihl aihlVarCheckIsLite6 = aihn.checkIsLite(ajdb.b);
                            apjiVar.c(aihlVarCheckIsLite6);
                            Object objK4 = apjiVar.j.k(aihlVarCheckIsLite6.d);
                            aoci aociVarA = aoci.a(((ajdb) (objK4 == null ? aihlVarCheckIsLite6.b : aihlVarCheckIsLite6.c(objK4))).g);
                            if (aociVarA == null) {
                                aociVarA = aoci.BASIC_THUMBNAIL_LAYOUT_TYPE_UNKNOWN;
                            }
                            if (agkjVar3.containsKey(aociVarA)) {
                                agkxVar.c(aabm.c);
                            } else {
                                aihlVar = ajde.b;
                                aihlVarCheckIsLite = aihn.checkIsLite(aihlVar);
                                apjiVar.c(aihlVarCheckIsLite);
                                if (apjiVar.j.n(aihlVarCheckIsLite.d)) {
                                    aihlVarCheckIsLite2 = aihn.checkIsLite(aihlVar);
                                    apjiVar.c(aihlVarCheckIsLite2);
                                    objK = apjiVar.j.k(aihlVarCheckIsLite2.d);
                                    if (objK == null) {
                                        objC = aihlVarCheckIsLite2.b;
                                    } else {
                                        objC = aihlVarCheckIsLite2.c(objK);
                                    }
                                    if ((((ajde) objC).c & 2) != 0) {
                                        agkjVar2 = m;
                                        aihlVarCheckIsLite3 = aihn.checkIsLite(aihlVar);
                                        apjiVar.c(aihlVarCheckIsLite3);
                                        objK2 = apjiVar.j.k(aihlVarCheckIsLite3.d);
                                        if (objK2 == null) {
                                            objC2 = aihlVarCheckIsLite3.b;
                                        } else {
                                            objC2 = aihlVarCheckIsLite3.c(objK2);
                                        }
                                        aoclVarA3 = aocl.a(((ajde) objC2).e);
                                        if (aoclVarA3 == null) {
                                            aoclVarA3 = aocl.SHORTS_LAYOUT_TYPE_UNKNOWN;
                                        }
                                        if (agkjVar2.containsKey(aoclVarA3)) {
                                            agkxVar.c(aabm.d);
                                        }
                                    }
                                }
                            }
                        } else {
                            aihlVar = ajde.b;
                            aihlVarCheckIsLite = aihn.checkIsLite(aihlVar);
                            apjiVar.c(aihlVarCheckIsLite);
                            if (apjiVar.j.n(aihlVarCheckIsLite.d)) {
                                aihlVarCheckIsLite2 = aihn.checkIsLite(aihlVar);
                                apjiVar.c(aihlVarCheckIsLite2);
                                objK = apjiVar.j.k(aihlVarCheckIsLite2.d);
                                if (objK == null) {
                                    objC = aihlVarCheckIsLite2.b;
                                } else {
                                    objC = aihlVarCheckIsLite2.c(objK);
                                }
                                if ((((ajde) objC).c & 2) != 0) {
                                    agkjVar2 = m;
                                    aihlVarCheckIsLite3 = aihn.checkIsLite(aihlVar);
                                    apjiVar.c(aihlVarCheckIsLite3);
                                    objK2 = apjiVar.j.k(aihlVarCheckIsLite3.d);
                                    if (objK2 == null) {
                                        objC2 = aihlVarCheckIsLite3.b;
                                    } else {
                                        objC2 = aihlVarCheckIsLite3.c(objK2);
                                    }
                                    aoclVarA3 = aocl.a(((ajde) objC2).e);
                                    if (aoclVarA3 == null) {
                                        aoclVarA3 = aocl.SHORTS_LAYOUT_TYPE_UNKNOWN;
                                    }
                                    if (agkjVar2.containsKey(aoclVarA3)) {
                                        agkxVar.c(aabm.d);
                                    }
                                }
                            }
                        }
                    } else {
                        aihlVar = ajde.b;
                        aihlVarCheckIsLite = aihn.checkIsLite(aihlVar);
                        apjiVar.c(aihlVarCheckIsLite);
                        if (apjiVar.j.n(aihlVarCheckIsLite.d)) {
                            aihlVarCheckIsLite2 = aihn.checkIsLite(aihlVar);
                            apjiVar.c(aihlVarCheckIsLite2);
                            objK = apjiVar.j.k(aihlVarCheckIsLite2.d);
                            if (objK == null) {
                                objC = aihlVarCheckIsLite2.b;
                            } else {
                                objC = aihlVarCheckIsLite2.c(objK);
                            }
                            if ((((ajde) objC).c & 2) != 0) {
                                agkjVar2 = m;
                                aihlVarCheckIsLite3 = aihn.checkIsLite(aihlVar);
                                apjiVar.c(aihlVarCheckIsLite3);
                                objK2 = apjiVar.j.k(aihlVarCheckIsLite3.d);
                                if (objK2 == null) {
                                    objC2 = aihlVarCheckIsLite3.b;
                                } else {
                                    objC2 = aihlVarCheckIsLite3.c(objK2);
                                }
                                aoclVarA3 = aocl.a(((ajde) objC2).e);
                                if (aoclVarA3 == null) {
                                    aoclVarA3 = aocl.SHORTS_LAYOUT_TYPE_UNKNOWN;
                                }
                                if (agkjVar2.containsKey(aoclVarA3)) {
                                    agkxVar.c(aabm.d);
                                }
                            }
                        }
                    }
                }
                if (i3 != 0) {
                    if (((ajdaVar.c == 34 ? (ajcz) ajdaVar.d : ajcz.a).b & 1) != 0) {
                        agkj agkjVar4 = n;
                        aock aockVarA = aock.a((ajdaVar.c == 34 ? (ajcz) ajdaVar.d : ajcz.a).d);
                        if (aockVarA == null) {
                            aockVarA = aock.SHORTS_EXPANDED_LAYOUT_TYPE_UNKNOWN;
                        }
                        if (agkjVar4.containsKey(aockVarA)) {
                            agkxVar.c(aabm.f);
                        }
                    }
                }
            }
            agqr it = agkxVar.g().iterator();
            while (it.hasNext()) {
                aabm aabmVar2 = (aabm) it.next();
                int iOrdinal = aabmVar2.ordinal();
                if (iOrdinal == 0) {
                    int i4 = ajdaVar.c;
                    if (i4 == 17) {
                        aqmh aqmhVar = (i4 == 17 ? (ajcv) ajdaVar.d : ajcv.a).c;
                        if (aqmhVar == null) {
                            aqmhVar = aqmh.a;
                        }
                        uriH = aawb.H(aqmhVar);
                    } else {
                        uriH = null;
                    }
                } else if (iOrdinal == 1) {
                    int i5 = ajdaVar.c;
                    if (i5 == 17) {
                        aqmh aqmhVar2 = (i5 == 17 ? (ajcv) ajdaVar.d : ajcv.a).d;
                        if (aqmhVar2 == null) {
                            aqmhVar2 = aqmh.a;
                        }
                        uriH = aawb.H(aqmhVar2);
                    } else {
                        uriH = null;
                    }
                } else if (iOrdinal == 2) {
                    ajdb ajdbVarI = aagu.i(ajdaVar);
                    if (ajdbVarI != null) {
                        aqmh aqmhVar3 = ajdbVarI.f;
                        if (aqmhVar3 == null) {
                            aqmhVar3 = aqmh.a;
                        }
                        uriH = aawb.H(aqmhVar3);
                    } else {
                        uriH = null;
                    }
                } else if (iOrdinal == 3) {
                    ajde ajdeVarK = aagu.k(ajdaVar);
                    if (ajdeVarK != null) {
                        aqmh aqmhVar4 = ajdeVarK.d;
                        if (aqmhVar4 == null) {
                            aqmhVar4 = aqmh.a;
                        }
                        uriH = aawb.H(aqmhVar4);
                    } else {
                        uriH = null;
                    }
                } else if (iOrdinal != 4) {
                    if (iOrdinal == 5 && (i2 = ajdaVar.c) == 34) {
                        aqmh aqmhVar5 = (i2 == 34 ? (ajcz) ajdaVar.d : ajcz.a).c;
                        if (aqmhVar5 == null) {
                            aqmhVar5 = aqmh.a;
                        }
                        uriH = aawb.H(aqmhVar5);
                    } else {
                        uriH = null;
                    }
                } else if ((ajdaVar.b & 1) != 0) {
                    ajcu ajcuVar = ajdaVar.e;
                    if (ajcuVar == null) {
                        ajcuVar = ajcu.a;
                    }
                    aqmh aqmhVar6 = ajcuVar.j;
                    if (aqmhVar6 == null) {
                        aqmhVar6 = aqmh.a;
                    }
                    uriH = aawb.H(aqmhVar6);
                } else {
                    uriH = null;
                }
                if (uriH != null) {
                    agkhVar.e(aabmVar2, uriH);
                }
            }
            agkj agkjVarD2 = agkhVar.d(true);
            this.p.a(2, ajdaVar);
            adhv adhvVar = this.q;
            agkh agkhVar2 = new agkh(4);
            String str3 = "ImageNotificationDecorator.java";
            String str4 = "com/google/android/libraries/youtube/notification/push/util/ImageNotificationDecorator";
            if (agkjVarD2.isEmpty()) {
                agkjVarD = agkhVar2.d(true);
                str = "ImageNotificationDecorator.java";
                str2 = "com/google/android/libraries/youtube/notification/push/util/ImageNotificationDecorator";
            } else {
                agkz agkzVarEntrySet = agkjVarD2.entrySet();
                CountDownLatch countDownLatch = new CountDownLatch(((agpk) agkzVarEntrySet).c);
                agqr it2 = agkzVarEntrySet.iterator();
                while (it2.hasNext()) {
                    Map.Entry entry = (Map.Entry) it2.next();
                    aabm aabmVar3 = (aabm) entry.getKey();
                    Uri uri = (Uri) entry.getValue();
                    if (tyu.g(uri)) {
                        String str5 = str4;
                        CountDownLatch countDownLatch2 = countDownLatch;
                        adhvVar.k(uri, new aabl(this, agkhVar2, aabmVar3, countDownLatch2, adhvVar, uri, new aabk(this, agkhVar2, aabmVar3, countDownLatch)));
                        countDownLatch = countDownLatch2;
                        str3 = str3;
                        str4 = str5;
                    } else {
                        ((agrc) ((agrc) l.b()).k(str4, "getNotificationBitmaps", 578, str3)).t("Insecure URL used for notification image, ignoring");
                        countDownLatch.countDown();
                    }
                }
                str = str3;
                str2 = str4;
                try {
                    countDownLatch.await(60L, TimeUnit.SECONDS);
                } catch (InterruptedException e) {
                    this.j.b("Notification image download was interrupted", e);
                }
                agkjVarD = agkhVar2.d(true);
            }
            agkj agkjVar5 = agkjVarD;
            this.p.a(3, ajdaVar);
            if (!agkjVarD2.isEmpty()) {
                boolean z = ((agpn) agkjVar5).d == ((agpn) agkjVarD2).d;
                Bundle bundle = new Bundle(1);
                bundle.putBoolean("EXTRA_ALL_IMAGES_LOADED", z);
                atrVar.h(bundle);
            }
            ajcu ajcuVar2 = ajdaVar.e;
            if (ajcuVar2 == null) {
                ajcuVar2 = ajcu.a;
            }
            ajcu ajcuVar3 = ajcuVar2;
            ajdb ajdbVarI2 = aagu.i(ajdaVar);
            ajde ajdeVarK2 = aagu.k(ajdaVar);
            if (!c(ajdaVar) && ajdbVarI2 != null) {
                aabm aabmVar4 = aabm.c;
                if (agkjVar5.containsKey(aabmVar4)) {
                    twiVar.a((Bitmap) agkjVar5.get(aabmVar4));
                } else if (ajdeVarK2 != null) {
                    aabmVar = aabm.d;
                    if (agkjVar5.containsKey(aabmVar)) {
                        agkjVar = m;
                        aoclVarA = aocl.a(ajdeVarK2.e);
                        if (aoclVarA == null) {
                            aoclVarA = aocl.SHORTS_LAYOUT_TYPE_UNKNOWN;
                        }
                        if (agkjVar.containsKey(aoclVarA)) {
                            Bitmap bitmap = (Bitmap) agkjVar5.get(aabmVar);
                            aoclVarA2 = aocl.a(ajdeVarK2.e);
                            if (aoclVarA2 == null) {
                                aoclVarA2 = aocl.SHORTS_LAYOUT_TYPE_UNKNOWN;
                            }
                            avneVar.a(bitmap, (Integer) agkjVar.get(aoclVarA2));
                        } else {
                            ajddVarJ = aagu.j(ajdaVar);
                            if (ajddVarJ != null) {
                                twiVar2.a(ajddVarJ);
                            }
                        }
                    } else {
                        ajddVarJ = aagu.j(ajdaVar);
                        if (ajddVarJ != null) {
                            twiVar2.a(ajddVarJ);
                        }
                    }
                } else {
                    ajddVarJ = aagu.j(ajdaVar);
                    if (ajddVarJ != null) {
                        twiVar2.a(ajddVarJ);
                    }
                }
            } else if (ajdeVarK2 != null) {
                aabmVar = aabm.d;
                if (agkjVar5.containsKey(aabmVar)) {
                    agkjVar = m;
                    aoclVarA = aocl.a(ajdeVarK2.e);
                    if (aoclVarA == null) {
                        aoclVarA = aocl.SHORTS_LAYOUT_TYPE_UNKNOWN;
                    }
                    if (agkjVar.containsKey(aoclVarA)) {
                        try {
                            Bitmap bitmap2 = (Bitmap) agkjVar5.get(aabmVar);
                            aoclVarA2 = aocl.a(ajdeVarK2.e);
                            if (aoclVarA2 == null) {
                                aoclVarA2 = aocl.SHORTS_LAYOUT_TYPE_UNKNOWN;
                            }
                            avneVar.a(bitmap2, (Integer) agkjVar.get(aoclVarA2));
                        } catch (Exception e2) {
                            ((agrc) ((agrc) ((agrc) l.b()).j(e2)).k(str2, "decorateInternal", 240, str)).w("Exception while applying shorts custom decoration: %s", e2);
                        }
                    } else {
                        ajddVarJ = aagu.j(ajdaVar);
                        if (ajddVarJ != null) {
                            twiVar2.a(ajddVarJ);
                        }
                    }
                } else {
                    ajddVarJ = aagu.j(ajdaVar);
                    if (ajddVarJ != null) {
                        twiVar2.a(ajddVarJ);
                    }
                }
            } else {
                ajddVarJ = aagu.j(ajdaVar);
                if (ajddVarJ != null) {
                    twiVar2.a(ajddVarJ);
                }
            }
            Object objA2 = (Bitmap) agkjVar5.get(aabm.e);
            Resources resources = this.c.getResources();
            if (objA2 != null) {
                try {
                    ajcx ajcxVarA = ajcx.a(ajdaVar.p);
                    if (ajcxVarA == null) {
                        ajcxVarA = ajcx.ICON_IMAGE_STYLE_DEFAULT;
                    }
                    objA2 = avnfVar.a(objA2, ajcxVarA);
                } catch (Exception e3) {
                    ((agrc) ((agrc) ((agrc) l.b()).j(e3)).k(str2, "decorateInternal", 258, str)).w("Exception while scaling large icon Bitmap: %s", e3);
                    objA = null;
                }
            }
            objA = objA2;
            if (objA == null) {
                ajcu ajcuVar4 = ajdaVar.e;
                if (ajcuVar4 == null) {
                    ajcuVar4 = ajcu.a;
                }
                if ((ajcuVar4.b & SemanticState.Focused) != 0 && (i = this.o) != 0) {
                    try {
                        objA = aabt.a(resources.getDrawable(i));
                    } catch (Resources.NotFoundException e4) {
                        ((agrc) ((agrc) ((agrc) l.b()).j(e4)).k(str2, "decorateInternal", 272, str)).y("Could not load default drawable: %s%s", this.o, e4);
                    }
                }
            }
            Bitmap bitmap3 = (Bitmap) agkjVar5.get(aabm.c);
            if (!c(ajdaVar) || bitmap3 == null) {
                atrVar.o((Bitmap) objA);
            } else {
                atrVar.o(bitmap3);
            }
            int i6 = ajdaVar.c;
            if (i6 == 17) {
                Bitmap bitmap4 = (Bitmap) agkjVar5.get(aabm.a);
                if (bitmap4 != null) {
                    Bitmap bitmap5 = (Bitmap) agkjVar5.get(aabm.b);
                    atpVar.d(bitmap4);
                    if (c(ajdaVar)) {
                        atpVar.c((Bitmap) objA);
                    } else if (bitmap5 != null) {
                        atpVar.c(bitmap5);
                    }
                    if ((ajcuVar3.b & 8) != 0) {
                        alayVar3 = ajcuVar3.f;
                        if (alayVar3 == null) {
                            alayVar3 = alay.a;
                        }
                    } else {
                        alayVar3 = null;
                    }
                    atpVar.e(ackj.k(null, alayVar3, null, false));
                    if ((ajcuVar3.b & 16) != 0) {
                        alayVar4 = ajcuVar3.g;
                        if (alayVar4 == null) {
                            alayVar4 = alay.a;
                        }
                    } else {
                        alayVar4 = null;
                    }
                    atpVar.j = atr.c(ackj.k(null, alayVar4, null, false));
                    atpVar.k = true;
                    atrVar.r(atpVar);
                    return;
                }
                return;
            }
            if (i6 != 34) {
                if (i6 == 35) {
                    if ((ajcuVar3.b & 8) != 0) {
                        alayVar = ajcuVar3.f;
                        if (alayVar == null) {
                            alayVar = alay.a;
                        }
                    } else {
                        alayVar = null;
                    }
                    atqVar.d(ackj.k(null, alayVar, null, false));
                    if (((ajdaVar.c == 35 ? (ajcw) ajdaVar.d : ajcw.a).b & 1) != 0) {
                        alayVar2 = (ajdaVar.c == 35 ? (ajcw) ajdaVar.d : ajcw.a).c;
                        if (alayVar2 == null) {
                            alayVar2 = alay.a;
                        }
                    } else {
                        alayVar2 = null;
                    }
                    atqVar.c(ackj.k(null, alayVar2, null, false));
                    atrVar.r(atqVar);
                    return;
                }
                return;
            }
            ajcz ajczVar = (ajcz) ajdaVar.d;
            agkj agkjVar6 = n;
            aock aockVarA2 = aock.a(ajczVar.d);
            if (aockVarA2 == null) {
                aockVarA2 = aock.SHORTS_EXPANDED_LAYOUT_TYPE_UNKNOWN;
            }
            if (agkjVar6.containsKey(aockVarA2)) {
                aabm aabmVar5 = aabm.f;
                if (agkjVar5.containsKey(aabmVar5)) {
                    try {
                        Bitmap bitmap6 = (Bitmap) agkjVar5.get(aabmVar5);
                        aock aockVarA3 = aock.a(ajczVar.d);
                        if (aockVarA3 == null) {
                            aockVarA3 = aock.SHORTS_EXPANDED_LAYOUT_TYPE_UNKNOWN;
                        }
                        avneVar2.a(bitmap6, (Integer) agkjVar6.get(aockVarA3));
                    } catch (Exception e5) {
                        ((agrc) ((agrc) ((agrc) l.b()).j(e5)).k(str2, "decorateInternal", 304, str)).w("Exception while creating ShortsExpandedCustomStyle: %s", e5);
                    }
                }
            }
        }
    }
}
