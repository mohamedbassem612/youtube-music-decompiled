package defpackage;

import android.R;
import android.app.Dialog;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Editable;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import android.view.ViewParent;
import app.rive.semantics.SemanticState;
import com.google.protos.youtube.api.innertube.CompositionProto$Composition;
import com.google.protos.youtube.elements.CommandOuterClass$Command;
import j$.net.URLDecoder;
import j$.util.DesugarCollections;
import j$.util.Optional;
import java.io.Closeable;
import java.io.IOException;
import java.math.RoundingMode;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class afxw {
    public static volatile avbh a;

    public afxw(awmd awmdVar, awmd awmdVar2, awmd awmdVar3, awmd awmdVar4, awmd awmdVar5, awmd awmdVar6) {
        awmdVar.getClass();
        awmdVar2.getClass();
        awmdVar3.getClass();
        awmdVar4.getClass();
        awmdVar5.getClass();
        awmdVar6.getClass();
    }

    public static afxk A(cc ccVar) {
        return ((afxi) atqp.a(ccVar, afxi.class)).C();
    }

    public static View B(bp bpVar) {
        if (bpVar.getView() != null) {
            return bpVar.getView();
        }
        Dialog dialog = bpVar.f;
        if (dialog != null) {
            return dialog.findViewById(R.id.content);
        }
        return null;
    }

    public static void C(bp bpVar) {
        View viewB;
        D(bpVar);
        View viewB2 = B(bpVar);
        cc parentFragment = bpVar.getParentFragment();
        if (parentFragment == null) {
            viewB = bpVar.getActivity().findViewById(R.id.content);
        } else {
            viewB = parentFragment instanceof bp ? B((bp) parentFragment) : parentFragment.getView();
        }
        viewB2.getClass();
        viewB2.setTag(com.google.android.apps.youtube.music.R.id.tiktok_event_parent, viewB);
    }

    public static void D(bp bpVar) {
        if (bpVar.d && B(bpVar) == null) {
            throw new IllegalStateException("DialogFragment is being used as a dialog. Must return a valid view in onCreateView() or a valid Dialog in onCreateDialog().");
        }
        if (!bpVar.d && bpVar.getView() == null) {
            throw new IllegalStateException("DialogFragment not being used as a dialog. Must return a valid view in onCreateView() -- onCreateDialog() is not called.");
        }
    }

    public static boolean E(Context context) {
        if (context == null) {
            return true;
        }
        if (context instanceof cf) {
            return !((cf) context).getSupportFragmentManager().ad();
        }
        if (context instanceof ContextWrapper) {
            return E(((ContextWrapper) context).getBaseContext());
        }
        return true;
    }

    public static /* synthetic */ long F(long j) {
        int iNumberOfLeadingZeros = Long.numberOfLeadingZeros(j) + Long.numberOfLeadingZeros(~j) + 44;
        if (iNumberOfLeadingZeros > 65) {
            return j * 1000000;
        }
        if (iNumberOfLeadingZeros >= 64) {
            long j2 = j * 1000000;
            if (j == 0 || j2 / j == 1000000) {
                return j2;
            }
        }
        throw new ArithmeticException();
    }

    public static byte G(long j) {
        ahno.J((j >> 8) == 0, "out of range: %s", j);
        return (byte) j;
    }

    public static float H(float f, float f2, float f3) {
        if (f2 <= f3) {
            return Math.min(Math.max(f, f2), f3);
        }
        throw new IllegalArgumentException(ahno.E("min (%s) must be less than or equal to max (%s)", Float.valueOf(f2), Float.valueOf(f3)));
    }

    public static float I(float... fArr) {
        float fMin = fArr[0];
        for (int i = 1; i < 3; i++) {
            fMin = Math.min(fMin, fArr[i]);
        }
        return fMin;
    }

    public static int J(float[] fArr, float f, int i, int i2) {
        while (i < i2) {
            if (fArr[i] == f) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static float[] K(Collection collection) {
        if (collection instanceof ahbm) {
            ahbm ahbmVar = (ahbm) collection;
            return Arrays.copyOfRange(ahbmVar.a, ahbmVar.b, ahbmVar.c);
        }
        Object[] array = collection.toArray();
        int length = array.length;
        float[] fArr = new float[length];
        for (int i = 0; i < length; i++) {
            Object obj = array[i];
            obj.getClass();
            fArr[i] = ((Number) obj).floatValue();
        }
        return fArr;
    }

    public static byte[] L(byte[]... bArr) {
        long length = 0;
        for (int i = 0; i < 3; i++) {
            length += (long) bArr[i].length;
        }
        byte[] bArr2 = new byte[N(length)];
        int i2 = 0;
        for (int i3 = 0; i3 < 3; i3++) {
            byte[] bArr3 = bArr[i3];
            int length2 = bArr3.length;
            System.arraycopy(bArr3, 0, bArr2, i2, length2);
            i2 += length2;
        }
        return bArr2;
    }

    public static int M(boolean... zArr) {
        int i = 0;
        for (boolean z : zArr) {
            if (z) {
                i++;
            }
        }
        return i;
    }

    public static /* synthetic */ int N(long j) {
        int i = (int) j;
        ahno.J(j == ((long) i), "the total number of elements (%s) in the arrays must fit in an int", j);
        return i;
    }

    public static double O(double d, double d2, double d3, double d4) {
        if (d == Double.NEGATIVE_INFINITY) {
            return d2 == Double.POSITIVE_INFINITY ? Double.NaN : Double.NEGATIVE_INFINITY;
        }
        if (d2 == Double.POSITIVE_INFINITY) {
            return Double.POSITIVE_INFINITY;
        }
        return d + (((d2 - d) * d3) / d4);
    }

    public static void P(int i, int i2) {
        boolean z = false;
        if (i >= 0 && i <= i2) {
            z = true;
        }
        ahno.I(z, "Quantile indexes must be between 0 and the scale, which is %s", i2);
    }

    public static void Q(int[] iArr, int i, int i2, double[] dArr, int i3, int i4) {
        int i5;
        if (i != i2) {
            int i6 = i3 + i4;
            int i7 = i6 >>> 1;
            int i8 = i;
            i5 = i2;
            while (true) {
                if (i5 <= i8 + 1) {
                    if ((i6 - iArr[i8]) - iArr[i5] > 0) {
                        break;
                    }
                    i5 = i8;
                    break;
                }
                int i9 = (i8 + i5) >>> 1;
                int i10 = iArr[i9];
                if (i10 <= i7) {
                    if (i10 >= i7) {
                        i5 = i9;
                        break;
                    }
                    i8 = i9;
                } else {
                    i5 = i9;
                }
            }
        } else {
            i5 = i;
        }
        int i11 = iArr[i5];
        R(i11, dArr, i3, i4);
        for (int i12 = i5 - 1; i12 >= i; i12--) {
            if (iArr[i12] != i11) {
                Q(iArr, i, i12, dArr, i3, i11 - 1);
                break;
            }
        }
        for (int i13 = i5 + 1; i13 <= i2; i13++) {
            if (iArr[i13] != i11) {
                Q(iArr, i13, i2, dArr, i11 + 1, i4);
                return;
            }
        }
    }

    public static void R(int i, double[] dArr, int i2, int i3) {
        if (i == i2) {
            int i4 = i2;
            for (int i5 = i2 + 1; i5 <= i3; i5++) {
                if (dArr[i4] > dArr[i5]) {
                    i4 = i5;
                }
            }
            if (i4 != i2) {
                aH(dArr, i4, i2);
                return;
            }
            return;
        }
        while (i3 > i2) {
            double d = dArr[i3];
            int i6 = (i2 + i3) >>> 1;
            double d2 = dArr[i6];
            int i7 = (d > d2 ? 1 : (d == d2 ? 0 : -1)) >>> 31;
            double d3 = dArr[i2];
            int i8 = (d > d3 ? 1 : (d == d3 ? 0 : -1)) >>> 31;
            if (i7 == ((d2 > d3 ? 1 : (d2 == d3 ? 0 : -1)) >>> 31)) {
                aH(dArr, i6, i2);
            } else if (i7 != i8) {
                aH(dArr, i2, i3);
            }
            double d4 = dArr[i2];
            int i9 = i3;
            int i10 = i9;
            while (i9 > i2) {
                if (dArr[i9] > d4) {
                    aH(dArr, i10, i9);
                    i10--;
                }
                i9--;
            }
            aH(dArr, i2, i10);
            if (i10 >= i) {
                i3 = i10 - 1;
            }
            if (i10 <= i) {
                i2 = i10 + 1;
            }
        }
    }

    public static boolean S(double... dArr) {
        for (double d : dArr) {
            if (Double.isNaN(d)) {
                return true;
            }
        }
        return false;
    }

    public static int T(long j, int i) {
        long j2 = i;
        long j3 = j % j2;
        if (j3 == 0) {
            j3 = 0;
        } else if ((((j ^ j2) >> 63) | 1) <= 0) {
            j3 += j2;
        }
        return (int) j3;
    }

    public static long U(long j, long j2, RoundingMode roundingMode) {
        roundingMode.getClass();
        long j3 = j / j2;
        long j4 = j - (j2 * j3);
        if (j4 == 0) {
            return j3;
        }
        int i = ((int) ((j ^ j2) >> 63)) | 1;
        switch (ahbf.a[roundingMode.ordinal()]) {
            case 1:
                ahng.U(false);
                return j3;
            case 2:
                return j3;
            case 3:
                if (i >= 0) {
                    return j3;
                }
                break;
            case 4:
                break;
            case 5:
                if (i <= 0) {
                    return j3;
                }
                break;
            case 6:
            case 7:
            case 8:
                long jAbs = Math.abs(j4);
                long jAbs2 = jAbs - (Math.abs(j2) - jAbs);
                if (jAbs2 == 0) {
                    if (roundingMode != RoundingMode.HALF_UP && (roundingMode != RoundingMode.HALF_EVEN || (1 & j3) == 0)) {
                        return j3;
                    }
                } else if (jAbs2 <= 0) {
                    return j3;
                }
            default:
                throw new AssertionError();
        }
        return j3 + ((long) i);
    }

    public static long V(long j, long j2) {
        ahng.W("a", j);
        ahng.W("b", j2);
        if (j == 0) {
            return j2;
        }
        if (j2 == 0) {
            return j;
        }
        int iNumberOfTrailingZeros = Long.numberOfTrailingZeros(j);
        long jNumberOfTrailingZeros = j >> iNumberOfTrailingZeros;
        int iNumberOfTrailingZeros2 = Long.numberOfTrailingZeros(j2);
        long j3 = j2 >> iNumberOfTrailingZeros2;
        while (jNumberOfTrailingZeros != j3) {
            long j4 = jNumberOfTrailingZeros - j3;
            long j5 = (j4 >> 63) & j4;
            long j6 = (j4 - j5) - j5;
            jNumberOfTrailingZeros = j6 >> Long.numberOfTrailingZeros(j6);
            j3 += j5;
        }
        return jNumberOfTrailingZeros << Math.min(iNumberOfTrailingZeros, iNumberOfTrailingZeros2);
    }

    public static long W(long j, long j2) {
        int i = ((j ^ j2) > 0L ? 1 : ((j ^ j2) == 0L ? 0 : -1));
        long j3 = j2 + j;
        return (i | (((j ^ j3) > 0L ? 1 : ((j ^ j3) == 0L ? 0 : -1)) ^ (-1))) >= 0 ? ((j3 >>> 63) ^ 1) + Long.MAX_VALUE : j3;
    }

    public static long X(long j, long j2) {
        int iNumberOfLeadingZeros = Long.numberOfLeadingZeros(j) + Long.numberOfLeadingZeros(~j) + Long.numberOfLeadingZeros(j2) + Long.numberOfLeadingZeros(~j2);
        if (iNumberOfLeadingZeros > 65) {
            return j * j2;
        }
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        long j3 = ((j ^ j2) >>> 63) + Long.MAX_VALUE;
        if (((iNumberOfLeadingZeros < 64 ? 1 : 0) | ((i >>> 31) & (j2 != Long.MIN_VALUE ? 0 : 1))) == 0) {
            long j4 = j * j2;
            if (i == 0 || j4 / j == j2) {
                return j4;
            }
        }
        return j3;
    }

    public static long Y(double d) {
        ahno.G(Z(d), "not a normal value");
        int exponent = Math.getExponent(d);
        long jDoubleToRawLongBits = Double.doubleToRawLongBits(d) & 4503599627370495L;
        return exponent == -1023 ? jDoubleToRawLongBits << 1 : jDoubleToRawLongBits | 4503599627370496L;
    }

    public static boolean Z(double d) {
        return Math.getExponent(d) <= 1023;
    }

    public static int aA(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 5) {
            return 6;
        }
        if (i == 10) {
            return 11;
        }
        if (i != 20) {
            return i != 30 ? 0 : 31;
        }
        return 21;
    }

    public static int aB(int i) {
        switch (i) {
            case 0:
                return 53;
            case 1:
            case 2:
            case 51:
            default:
                return 0;
            case 3:
                return 26;
            case 4:
                return 1;
            case 5:
                return 13;
            case 6:
                return 14;
            case 7:
                return 24;
            case 8:
                return 25;
            case 9:
                return 29;
            case 10:
                return 18;
            case 11:
                return 19;
            case 12:
                return 27;
            case 13:
                return 28;
            case 14:
                return 4;
            case 15:
                return 7;
            case 16:
                return 2;
            case 17:
                return 8;
            case 18:
                return 5;
            case 19:
                return 21;
            case 20:
                return 23;
            case 21:
                return 16;
            case 22:
                return 17;
            case 23:
                return 20;
            case 24:
                return 3;
            case 25:
                return 10;
            case 26:
                return 11;
            case 27:
                return 9;
            case 28:
                return 6;
            case 29:
                return 15;
            case 30:
                return 12;
            case 31:
                return 30;
            case 32:
                return 31;
            case 33:
                return 32;
            case 34:
                return 37;
            case 35:
                return 33;
            case 36:
                return 34;
            case 37:
                return 35;
            case 38:
                return 38;
            case 39:
                return 39;
            case 40:
                return 40;
            case 41:
                return 41;
            case 42:
                return 36;
            case 43:
                return 42;
            case 44:
                return 22;
            case 45:
                return 43;
            case 46:
                return 45;
            case 47:
                return 46;
            case 48:
                return 47;
            case 49:
                return 48;
            case 50:
                return 49;
            case 52:
                return 50;
            case 53:
                return 51;
            case 54:
                return 44;
            case 55:
                return 52;
        }
    }

    public static /* synthetic */ String aC(int i) {
        switch (i) {
            case 1:
                return "ADS_CLIENT_ERROR_MESSAGE_UNSPECIFIED";
            case 2:
                return "ADS_CLIENT_ERROR_MESSAGE_INVALID_SLOT";
            case 3:
                return "ADS_CLIENT_ERROR_MESSAGE_INVALID_LAYOUT";
            case 4:
                return "ADS_CLIENT_ERROR_MESSAGE_INVALID_TRIGGER";
            case 5:
                return "ADS_CLIENT_ERROR_MESSAGE_SLOT_IS_NULL";
            case 6:
                return "ADS_CLIENT_ERROR_MESSAGE_FULFILLMENT_ADAPTER_IS_NULL";
            case 7:
                return "ADS_CLIENT_ERROR_MESSAGE_DUPLICATE_SLOT";
            case 8:
                return "ADS_CLIENT_ERROR_MESSAGE_EMPTY_SLOT_ENTRY_TRIGGER";
            case 9:
                return "ADS_CLIENT_ERROR_MESSAGE_EMPTY_SLOT_FULFILLMENT_TRIGGER";
            case 10:
                return "ADS_CLIENT_ERROR_MESSAGE_EMPTY_SLOT_EXPIRATION_TRIGGER";
            case 11:
                return "ADS_CLIENT_ERROR_MESSAGE_NO_TRIGGER_ADAPTER_REGISTERED_FOR_TYPE";
            case 12:
                return "ADS_CLIENT_ERROR_MESSAGE_REGISTER_DUPLICATE_TRIGGER";
            case 13:
                return "ADS_CLIENT_ERROR_MESSAGE_BUILD_FULFILLMENT_ADAPTER_FAILED";
            case 14:
                return "ADS_CLIENT_ERROR_MESSAGE_BUILD_SLOT_ADAPTER_FAILED";
            case 15:
                return "ADS_CLIENT_ERROR_MESSAGE_SLOT_STATE_IS_NULL";
            case 16:
                return "ADS_CLIENT_ERROR_MESSAGE_ILLEGAL_SLOT_STATE";
            case 17:
                return "ADS_CLIENT_ERROR_MESSAGE_NO_SLOT_ADAPTER_REGISTERED";
            case 18:
                return "ADS_CLIENT_ERROR_MESSAGE_SLOT_WAS_UNREGISTERED";
            case 19:
                return "ADS_CLIENT_ERROR_MESSAGE_CUE_RANGE_REGISTRATION_API_ERROR";
            case 20:
                return "ADS_CLIENT_ERROR_MESSAGE_LAYOUT_WAS_UNREGISTERED";
            case 21:
                return "ADS_CLIENT_ERROR_MESSAGE_SLOT_HAS_NO_VIDEO_PLAYBACK";
            case 22:
                return "ADS_CLIENT_ERROR_MESSAGE_NO_BELOW_PLAYER_SPACE_ACQUIRER_API_AVAILABLE";
            case 23:
                return "ADS_CLIENT_ERROR_MESSAGE_EXTERNAL_API_ERROR";
            case 24:
                return "ADS_CLIENT_ERROR_MESSAGE_AUTO_GEN_ERROR";
            case 25:
                return "ADS_CLIENT_ERROR_MESSAGE_RUNTIME_ERROR";
            case 26:
                return "ADS_CLIENT_ERROR_MESSAGE_CONFLICT_LAYOUT";
            case 27:
                return "ADS_CLIENT_ERROR_MESSAGE_SLOT_HAS_MULTIPLE_LAYOUT";
            case 28:
                return "ADS_CLIENT_ERROR_MESSAGE_UNSUPPORTED_TRIGGER";
            case 29:
                return "ADS_CLIENT_ERROR_MESSAGE_REDUNDANT_FULFILLMENT_REQUEST";
            case 30:
                return "ADS_CLIENT_ERROR_MESSAGE_EMPTY_LAYOUT_EXIT_TRIGGER";
            case 31:
                return "ADS_CLIENT_ERROR_MESSAGE_UNRECOGNIZED_PING_TRACKER_REQUIREMENTS";
            case 32:
                return "ADS_CLIENT_ERROR_MESSAGE_NO_LAYOUT_TRACKING_MAP_AVAILABLE";
            case 33:
                return "ADS_CLIENT_ERROR_MESSAGE_ADS_ENGAGEMENT_PANEL_API_ERROR";
            case 34:
                return "ADS_CLIENT_ERROR_MESSAGE_NO_ADS_ENGAGEMENT_PANEL_API_AVAILABLE";
            case 35:
                return "ADS_CLIENT_ERROR_MESSAGE_AD_OVERLAY_API_ERROR";
            case 36:
                return "ADS_CLIENT_ERROR_MESSAGE_WATCHNEXT_RESPONSE_IS_NULL";
            case 37:
                return "ADS_CLIENT_ERROR_MESSAGE_CTA_RENDERER_IS_NULL";
            case 38:
                return "ADS_CLIENT_ERROR_MESSAGE_PLAYBACK_TIMELINE_API_ERROR";
            case 39:
                return "ADS_CLIENT_ERROR_MESSAGE_INVALID_CURR_INDEX";
            case 40:
                return "ADS_CLIENT_ERROR_MESSAGE_UNEXPECTED_LAYOUT_EXIT_REASON";
            case 41:
                return "ADS_CLIENT_ERROR_MESSAGE_SUBLAYOUT_HAS_NO_VALID_PLAYERAD";
            case 42:
                return "ADS_CLIENT_ERROR_MESSAGE_TARGET_INDEX_NOT_FOUND";
            case 43:
                return "ADS_CLIENT_ERROR_MESSAGE_VIDEO_INTERRUPT_API_ERROR";
            case 44:
                return "ADS_CLIENT_ERROR_MESSAGE_CUSTOM_DISPLAY_ERROR";
            case 45:
                return "ADS_CLIENT_ERROR_MESSAGE_UNRECOGNIZED_SCENARIO_FOR_CUSTOM_DISPLAY";
            case 46:
                return "ADS_CLIENT_ERROR_MESSAGE_INTERNAL_MEDIA_ERROR";
            case 47:
                return "ADS_CLIENT_ERROR_MESSAGE_EXIT_WRONG_SUBLAYOUT";
            case 48:
                return "ADS_CLIENT_ERROR_MESSAGE_NO_VIEW_AVAILABLE";
            case 49:
                return "ADS_CLIENT_ERROR_MESSAGE_NO_PRESENT_CONTEXT_AVAILABLE";
            case 50:
                return "ADS_CLIENT_ERROR_MESSAGE_BUILD_LAYOUT_RENDERING_ADAPTER_FAILED";
            case 51:
                return "ADS_CLIENT_ERROR_MESSAGE_UNSUPPORTED_SLOT";
            case 52:
                return "ADS_CLIENT_ERROR_MESSAGE_INVALID_METADATA";
            case 53:
                return "ADS_CLIENT_ERROR_MESSAGE_FULLSCREEN_ENGAGEMENT_LAYOUT_EVENT_LISTENER_IS_NULL";
            case 54:
                return "ADS_CLIENT_ERROR_MESSAGE_ELEMENTS_RENDERING_API_FACTORY_IS_NULL";
            case 55:
                return "ADS_CLIENT_ERROR_MESSAGE_REEL_EXTERNAL_API_IS_NULL";
            case 56:
                return "ADS_CLIENT_ERROR_MESSAGE_INVALID_ELEMENTS_RENDERING_API";
            case 57:
                return "ADS_CLIENT_ERROR_MESSAGE_COMPANION_API_IS_NULL";
            case 58:
                return "ADS_CLIENT_ERROR_MESSAGE_CTA_OVERLAY_API_IS_NO_OP";
            case 59:
                return "ADS_CLIENT_ERROR_MESSAGE_CANNOT_FIND_MATCHING_LAYOUT_RENDERING_ADAPTER_FACTORY";
            case 60:
                return "ADS_CLIENT_ERROR_MESSAGE_PAGE_ENTRY_STATE_UPDATE_NOT_SUPPORTED";
            case 61:
                return "ADS_CLIENT_ERROR_MESSAGE_FORCED_FAILURE";
            case 62:
                return "ADS_CLIENT_ERROR_MESSAGE_PARALLEL_FULFILLMENT_REQUESTED";
            case 63:
                return "ADS_CLIENT_ERROR_MESSAGE_ONGOING_FULFILLMENT_TASK_EXIST";
            case 64:
                return "ADS_CLIENT_ERROR_MESSAGE_MACRO_VALUE_IS_NULL";
            case 65:
                return "ADS_CLIENT_ERROR_MESSAGE_VIDEO_PLAYBACK_IS_NULL";
            case 66:
                return "ADS_CLIENT_ERROR_MESSAGE_VIDEO_INTERRUPT_CONTROLLER_IS_NULL";
            case 67:
                return "ADS_CLIENT_ERROR_MESSAGE_VIDEO_INTERRUPT_ALREADY_ACQUIRED";
            case 68:
                return "ADS_CLIENT_ERROR_MESSAGE_VIDEO_INTERRUPT_IS_NULL_WHEN_STOP_INTERSTITIAL_VIDEO";
            case 69:
                return "ADS_CLIENT_ERROR_MESSAGE_VIDEO_INTERRUPT_IS_NULL_WHEN_START_INTERSTITIAL_VIDEO";
            case 70:
                return "ADS_CLIENT_ERROR_MESSAGE_ACTIVE_PANEL_IS_NULL";
            case 71:
                return "ADS_CLIENT_ERROR_MESSAGE_OVERRIDE_LISTENER";
            case 72:
                return "ADS_CLIENT_ERROR_MESSAGE_PLAYBACK_TIMELINE_IS_NULL_FOR_AD_QUEUE";
            case 73:
                return "ADS_CLIENT_ERROR_MESSAGE_PLAYBACK_TIMELINE_IS_NULL_FOR_AD_QUEUE_VIA_INTERRUPT";
            case 74:
                return "ADS_CLIENT_ERROR_MESSAGE_PLAYBACK_TIMELINE_IS_NULL_IN_AD_QUEUE_CHECK";
            case 75:
                return "ADS_CLIENT_ERROR_MESSAGE_PLAYBACK_TIMELINE_IS_NULL_IN_CONTENT_SEGEMENT_CREATION";
            case 76:
                return "ADS_CLIENT_ERROR_MESSAGE_PLAYBACK_TIMELINE_IS_NULL_FOR_AD_SKIP";
            case 77:
                return "ADS_CLIENT_ERROR_MESSAGE_CONTENT_SEGMENT_IS_NULL";
            case 78:
                return "ADS_CLIENT_ERROR_MESSAGE_CONVERTER_EXCEPTION_IN_APPLY_MACROS";
            case 79:
                return "ADS_CLIENT_ERROR_MESSAGE_AD_STATS_MACROS_CONVERTER_IS_NULL";
            case 80:
                return "ADS_CLIENT_ERROR_MESSAGE_CUE_RANGE_REGISTER_IS_NULL";
            case 81:
                return "ADS_CLIENT_ERROR_MESSAGE_INVALID_URI";
            case 82:
                return "ADS_CLIENT_ERROR_MESSAGE_FULFILLED_PING_IS_NULL";
            case 83:
                return "ADS_CLIENT_ERROR_MESSAGE_INVALID_LAYOUT_ID_EXITED_TRIGGER";
            case 84:
                return "ADS_CLIENT_ERROR_MESSAGE_INVALID_LAYOUT_EXITED_FOR_REASON_TRIGGER";
            case 85:
                return "ADS_CLIENT_ERROR_MESSAGE_INVALID_LAYOUT_EXITED_FOR_OTHER_REASON_TRIGGER";
            case 86:
                return "ADS_CLIENT_ERROR_MESSAGE_INVALID_SLOT_ID_EXITED_TRIGGER";
            case 87:
                return "ADS_CLIENT_ERROR_MESSAGE_CONTENT_PLAYBACK_INFO_IS_NOT_AVAILABLE";
            case 88:
                return "ADS_CLIENT_ERROR_MESSAGE_AD_WATCH_NEXT_REQUEST_ERROR";
            case 89:
                return "ADS_CLIENT_ERROR_MESSAGE_SLOT_COLLISION";
            case 90:
                return "ADS_CLIENT_ERROR_MESSAGE_REGISTER_SLOT_ENTRY_TRIGGER_FAILED";
            case 91:
                return "ADS_CLIENT_ERROR_MESSAGE_REGISTER_SLOT_FULFILLMENT_TRIGGER_FAILED";
            case 92:
                return "ADS_CLIENT_ERROR_MESSAGE_REGISTER_SLOT_EXPIRATION_TRIGGER_FAILED";
            case 93:
                return "ADS_CLIENT_ERROR_MESSAGE_LAYOUT_IS_NULL";
            case 94:
                return "ADS_CLIENT_ERROR_MESSAGE_INVALID_LAYOUT_EXIT_NORMAL_TRIGGER";
            case 95:
                return "ADS_CLIENT_ERROR_MESSAGE_INVALID_LAYOUT_EXIT_USER_SKIPPED_TRIGGER";
            case 96:
                return "ADS_CLIENT_ERROR_MESSAGE_INVALID_LAYOUT_EXIT_USER_MUTED_TRIGGER";
            case 97:
            default:
                return "null";
            case 98:
                return "ADS_CLIENT_ERROR_MESSAGE_AD_BREAK_RESPONSE_IS_NULL";
            case 99:
                return "ADS_CLIENT_ERROR_MESSAGE_LOAD_COMPANION_AD_SECTION_CONTROLLER_FAILED";
            case 100:
                return "ADS_CLIENT_ERROR_MESSAGE_CTA_VIEW_CONTROLLER_OR_PARENT_RESPONDER_IS_NULL";
            case 101:
                return "ADS_CLIENT_ERROR_MESSAGE_PLAYBACK_LOCKSCREEN_CONTROLLER_AND_PLAYING_INFO_CENTER_OBSERVER_ARE_NULL";
            case 102:
                return "ADS_CLIENT_ERROR_MESSAGE_NO_FULFILLMENT_ADAPTER_REGISTERED";
            case 103:
                return "ADS_CLIENT_ERROR_MESSAGE_AD_PLACEMENT_END_SHOULD_GREATER_THAN_START";
            case 104:
                return "ADS_CLIENT_ERROR_MESSAGE_AD_BREAK_REQUEST_ERROR";
            case 105:
                return "ADS_CLIENT_ERROR_MESSAGE_INVALID_FULFILLMENT_CANCELLATION_REQUEST";
            case 106:
                return "ADS_CLIENT_ERROR_MESSAGE_CANCEL_SLOT_FULFILLMENT_FAILURE";
            case 107:
                return "ADS_CLIENT_ERROR_MESSAGE_BUILD_DUPLICATE_LAYOUT_RENDERING_ADAPTER";
            case 108:
                return "ADS_CLIENT_ERROR_MESSAGE_UNKNOWN_LAYOUT";
            case 109:
                return "ADS_CLIENT_ERROR_MESSAGE_PLAYER_STUCK_DURING_ADNOTIFY";
            case 110:
                return "ADS_CLIENT_ERROR_MESSAGE_PLAYER_ERROR_DURING_ADNOTIFY";
            case 111:
                return "ADS_CLIENT_ERROR_MESSAGE_AD_INFO_NOT_READY";
            case 112:
                return "ADS_CLIENT_ERROR_MESSAGE_AD_UI_UNSTABLE";
            case 113:
                return "ADS_CLIENT_ERROR_MESSAGE_MEDIA_LAYOUT_LOAD_TIMEOUT";
            case 114:
                return "ADS_CLIENT_ERROR_MESSAGE_PLAYER_ERROR";
            case 115:
                return "ADS_CLIENT_ERROR_MESSAGE_UNEXPECTED_ERROR";
            case 116:
                return "ADS_CLIENT_ERROR_MESSAGE_TRIGGER_CONSTRUCTION_ERROR";
            case 117:
                return "ADS_CLIENT_ERROR_MESSAGE_LAYOUT_CONSTRUCTION_ERROR";
            case 118:
                return "ADS_CLIENT_ERROR_MESSAGE_PLAYBACK_TIMELINE_IS_NULL_FOR_PLAY_NEXT_IN_QUEUE";
        }
    }

    public static /* synthetic */ String aD(int i) {
        switch (i) {
            case 1:
                return "BREAK_UNKNOWN";
            case 2:
                return "BREAK_PREROLL";
            case 3:
                return "BREAK_MIDROLL";
            case 4:
                return "BREAK_POSTROLL";
            case 5:
                return "DEPRECATED_BREAK_INFEED_POSTROLL";
            case 6:
                return "BREAK_INDEPENDENT";
            case 7:
                return "BREAK_CUE_POINT";
            case 8:
                return "BREAK_PAUSE";
            case 9:
                return "BREAK_POSTLOOP";
            default:
                return "BREAK_INLINE_MUTED_PLAYBACK";
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static View aE(ViewParent viewParent) {
        if (viewParent instanceof View) {
            return (View) viewParent;
        }
        if (viewParent != 0) {
            return aE(viewParent.getParent());
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [afxh, java.lang.Object] */
    private static agev aF(int i, View view, agev agevVar) {
        afxj afxjVarGG;
        if (!agevVar.g()) {
            return agevVar;
        }
        ?? C = agevVar.c();
        aha ahaVarX = x(i, view);
        if (ahaVarX != null && !ahaVarX.isEmpty()) {
            Class<?> cls = C.getClass();
            int i2 = 0;
            while (true) {
                if (i2 >= ahaVarX.d) {
                    afxjVarGG = afxj.b;
                    break;
                }
                Class cls2 = (Class) ahaVarX.d(i2);
                if (cls2.isAssignableFrom(cls)) {
                    afxjVarGG = yno.gG(C);
                    break;
                }
                i2++;
            }
        } else {
            afxjVarGG = afxj.b;
        }
        if (afxjVarGG == afxj.a) {
            return agdf.a;
        }
        return afxjVarGG != afxj.b ? agev.i(null) : agevVar;
    }

    private static void aG(int i, afxh afxhVar, View view) {
        qpj.c();
        agev agevVarI = agev.i(afxhVar);
        View viewAE = view;
        while (viewAE != null) {
            if (viewAE != view || i == com.google.android.apps.youtube.music.R.id.tiktok_event_view_listeners) {
                agevVarI = aF(com.google.android.apps.youtube.music.R.id.tiktok_event_view_listeners, viewAE, agevVarI);
            }
            if (viewAE != view || i != com.google.android.apps.youtube.music.R.id.tiktok_event_activity_listeners) {
                agevVarI = aF(com.google.android.apps.youtube.music.R.id.tiktok_event_fragment_listeners, viewAE, agevVarI);
            }
            agevVarI = aF(com.google.android.apps.youtube.music.R.id.tiktok_event_activity_listeners, viewAE, agevVarI);
            if (!agevVarI.g()) {
                return;
            }
            Object tag = viewAE.getTag(com.google.android.apps.youtube.music.R.id.tiktok_event_parent);
            if (tag != null && !(tag instanceof View)) {
                throw new IllegalStateException("Invalid tag returned: " + String.valueOf(tag.getClass()) + tag.toString() + " for view " + viewAE.toString());
            }
            View view2 = (View) tag;
            viewAE = view2 != null ? view2 : aE(viewAE.getParent());
        }
    }

    private static void aH(double[] dArr, int i, int i2) {
        double d = dArr[i];
        dArr[i] = dArr[i2];
        dArr[i2] = d;
    }

    public static final /* synthetic */ akll aa(aihf aihfVar) {
        aihn aihnVarBuild = aihfVar.build();
        aihnVarBuild.getClass();
        return (akll) aihnVarBuild;
    }

    public static final void ab(int i, aihf aihfVar) {
        if (i == 0) {
            throw null;
        }
        aihfVar.copyOnWrite();
        akll akllVar = (akll) aihfVar.instance;
        akll akllVar2 = akll.a;
        akllVar.c = i - 1;
        akllVar.b |= 2;
    }

    public static final /* synthetic */ aklk ac(aihf aihfVar) {
        aihn aihnVarBuild = aihfVar.build();
        aihnVarBuild.getClass();
        return (aklk) aihnVarBuild;
    }

    public static final apiu ad(aihf aihfVar) {
        apiu apiuVar = ((aklk) aihfVar.instance).e;
        if (apiuVar == null) {
            apiuVar = apiu.a;
        }
        apiuVar.getClass();
        return apiuVar;
    }

    public static final void ae(apiu apiuVar, aihf aihfVar) {
        aihfVar.copyOnWrite();
        aklk aklkVar = (aklk) aihfVar.instance;
        aklk aklkVar2 = aklk.a;
        aklkVar.e = apiuVar;
        aklkVar.b |= 4;
    }

    public static /* synthetic */ String af(int i) {
        switch (i) {
            case 1:
                return "CREATION_EDITOR_POSITIONAL_GUIDELINE_SNAP_DIRECTION_UNSPECIFIED";
            case 2:
                return "CREATION_EDITOR_POSITIONAL_GUIDELINE_SNAP_DIRECTION_CENTER_HORIZONTAL";
            case 3:
                return "CREATION_EDITOR_POSITIONAL_GUIDELINE_SNAP_DIRECTION_CENTER_VERTICAL";
            case 4:
                return "CREATION_EDITOR_POSITIONAL_GUIDELINE_SNAP_DIRECTION_TOP";
            case 5:
                return "CREATION_EDITOR_POSITIONAL_GUIDELINE_SNAP_DIRECTION_BOTTOM";
            case 6:
                return "CREATION_EDITOR_POSITIONAL_GUIDELINE_SNAP_DIRECTION_TRAILING";
            default:
                return "CREATION_EDITOR_POSITIONAL_GUIDELINE_SNAP_DIRECTION_LEADING";
        }
    }

    public static final /* synthetic */ akec ag(aihh aihhVar) {
        aihn aihnVarBuild = aihhVar.build();
        aihnVarBuild.getClass();
        return (akec) aihnVarBuild;
    }

    public static final void ah(String str, aihh aihhVar) {
        aihhVar.copyOnWrite();
        akec akecVar = (akec) aihhVar.instance;
        akec akecVar2 = akec.a;
        akecVar.b |= 2;
        akecVar.c = str;
    }

    public static final /* synthetic */ akdx ai(aihf aihfVar) {
        aihn aihnVarBuild = aihfVar.build();
        aihnVarBuild.getClass();
        return (akdx) aihnVarBuild;
    }

    public static final void aj(akec akecVar, aihf aihfVar) {
        aihfVar.copyOnWrite();
        akdx akdxVar = (akdx) aihfVar.instance;
        akdx akdxVar2 = akdx.a;
        akdxVar.e = akecVar;
        akdxVar.b |= 4;
    }

    public static final /* synthetic */ CompositionProto$Composition ak(aihf aihfVar) {
        aihn aihnVarBuild = aihfVar.build();
        aihnVarBuild.getClass();
        return (CompositionProto$Composition) aihnVarBuild;
    }

    public static final /* synthetic */ void al(aqot aqotVar, aihf aihfVar) {
        aihfVar.copyOnWrite();
        CompositionProto$Composition compositionProto$Composition = (CompositionProto$Composition) aihfVar.instance;
        CompositionProto$Composition compositionProto$Composition2 = CompositionProto$Composition.a;
        aiie aiieVar = compositionProto$Composition.b;
        if (!aiieVar.c()) {
            compositionProto$Composition.b = aihn.mutableCopy(aiieVar);
        }
        compositionProto$Composition.b.add(aqotVar);
    }

    public static final /* synthetic */ void am(aihf aihfVar) {
        List listUnmodifiableList = DesugarCollections.unmodifiableList(((CompositionProto$Composition) aihfVar.instance).c);
        listUnmodifiableList.getClass();
        new aikl(listUnmodifiableList);
    }

    public static final /* synthetic */ void an(aihf aihfVar) {
        List listUnmodifiableList = DesugarCollections.unmodifiableList(((CompositionProto$Composition) aihfVar.instance).b);
        listUnmodifiableList.getClass();
        new aikl(listUnmodifiableList);
    }

    public static final /* synthetic */ akcw ao(aihf aihfVar) {
        aihn aihnVarBuild = aihfVar.build();
        aihnVarBuild.getClass();
        return (akcw) aihnVarBuild;
    }

    public static final void ap(String str, aihf aihfVar) {
        aihfVar.copyOnWrite();
        akcw akcwVar = (akcw) aihfVar.instance;
        akcw akcwVar2 = akcw.a;
        akcwVar.b |= 1;
        akcwVar.e = str;
    }

    public static final void aq(amsy amsyVar, aihf aihfVar) {
        aihfVar.copyOnWrite();
        akcw akcwVar = (akcw) aihfVar.instance;
        akcw akcwVar2 = akcw.a;
        akcwVar.d = amsyVar;
        akcwVar.c = 3;
    }

    public static int ar(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 10) {
            return 11;
        }
        if (i == 20) {
            return 21;
        }
        if (i == 30) {
            return 31;
        }
        if (i == 70) {
            return 71;
        }
        if (i == 80) {
            return 81;
        }
        if (i != 90) {
            return i != 100 ? 0 : 101;
        }
        return 91;
    }

    public static int as(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 10) {
            return 11;
        }
        if (i == 20) {
            return 21;
        }
        if (i != 30) {
            return i != 40 ? 0 : 41;
        }
        return 31;
    }

    public static final /* synthetic */ alou at(alos alosVar) {
        aihn aihnVarBuild = alosVar.build();
        aihnVarBuild.getClass();
        return (alou) aihnVarBuild;
    }

    public static int au(int i) {
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
            default:
                return 0;
        }
    }

    public static final /* synthetic */ ajsv av(aihf aihfVar) {
        aihn aihnVarBuild = aihfVar.build();
        aihnVarBuild.getClass();
        return (ajsv) aihnVarBuild;
    }

    public static final void aw(String str, aihf aihfVar) {
        aihfVar.copyOnWrite();
        ajsv ajsvVar = (ajsv) aihfVar.instance;
        ajsv ajsvVar2 = ajsv.a;
        ajsvVar.b |= SemanticState.Focused;
        ajsvVar.g = str;
    }

    public static final void ax(CommandOuterClass$Command commandOuterClass$Command, aihf aihfVar) {
        aihfVar.copyOnWrite();
        ajsv ajsvVar = (ajsv) aihfVar.instance;
        ajsv ajsvVar2 = ajsv.a;
        ajsvVar.d = commandOuterClass$Command;
        ajsvVar.b |= 2;
    }

    public static final void ay(String str, aihf aihfVar) {
        aihfVar.copyOnWrite();
        ajsv ajsvVar = (ajsv) aihfVar.instance;
        ajsv ajsvVar2 = ajsv.a;
        ajsvVar.b |= SemanticState.LiveRegion;
        ajsvVar.h = str;
    }

    public static final void az(String str, aihf aihfVar) {
        aihfVar.copyOnWrite();
        ajsv ajsvVar = (ajsv) aihfVar.instance;
        ajsv ajsvVar2 = ajsv.a;
        ajsvVar.b |= 1;
        ajsvVar.c = str;
    }

    public static /* synthetic */ aivt b(apji apjiVar) {
        aihl aihlVarCheckIsLite = aihn.checkIsLite(aivv.a);
        apjiVar.c(aihlVarCheckIsLite);
        Object objK = apjiVar.j.k(aihlVarCheckIsLite.d);
        return (aivt) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK));
    }

    public static /* synthetic */ boolean c(apji apjiVar) {
        aihl aihlVarCheckIsLite = aihn.checkIsLite(aivv.a);
        apjiVar.c(aihlVarCheckIsLite);
        return apjiVar.j.n(aihlVarCheckIsLite.d);
    }

    public static /* synthetic */ aizx e(vyo vyoVar) {
        if (vyoVar == null || vyoVar.b() == null) {
            return aizx.a;
        }
        aizx aizxVar = vyoVar.b().o;
        return aizxVar == null ? aizx.a : aizxVar;
    }

    public static /* synthetic */ int[] f() {
        return new int[]{1, 2, 3, 4, 5, 6};
    }

    public static /* synthetic */ void g(Editable editable) {
        for (adta adtaVar : (adta[]) editable.getSpans(0, editable.length(), adta.class)) {
            int spanStart = editable.getSpanStart(adtaVar);
            int spanEnd = editable.getSpanEnd(adtaVar);
            if (spanStart != -1 && spanEnd != -1 && spanStart < spanEnd) {
                editable.replace(spanStart, spanEnd, "@".concat(String.valueOf(adtaVar.a)));
            }
        }
        for (Object obj : (adta[]) editable.getSpans(0, editable.length(), adta.class)) {
            editable.removeSpan(obj);
        }
    }

    public static /* synthetic */ void h(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static /* synthetic */ aopn i(apji apjiVar) {
        aihl aihlVarCheckIsLite = aihn.checkIsLite(aopo.a);
        apjiVar.c(aihlVarCheckIsLite);
        Object objK = apjiVar.j.k(aihlVarCheckIsLite.d);
        return (aopn) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK));
    }

    public static /* synthetic */ akve j(String str) {
        int i = wfs.a;
        try {
            return (akve) aihn.parseFrom(akve.a, Base64.decode(URLDecoder.decode(str, StandardCharsets.UTF_8), 8));
        } catch (aiik | IllegalArgumentException unused) {
            return null;
        }
    }

    public static /* synthetic */ Object k(Object obj) {
        audd auddVar = (audd) obj;
        switch (auddVar.ordinal()) {
            case 0:
                return ancg.MEDIA_ENGINE_ERROR_TYPE_UNKNOWN;
            case 1:
                return ancg.MEDIA_ENGINE_ERROR_TYPE_SET_EFFECT_FAILED;
            case 2:
                return ancg.MEDIA_ENGINE_ERROR_TYPE_IO;
            case 3:
                return ancg.MEDIA_ENGINE_ERROR_TYPE_MISSING_INPUT_ARGUMENT;
            case 4:
                return ancg.MEDIA_ENGINE_ERROR_TYPE_INVALID_INPUT_ARGUMENT;
            case 5:
                return ancg.MEDIA_ENGINE_ERROR_TYPE_FAILED_PRECONDITION;
            case 6:
                return ancg.MEDIA_ENGINE_ERROR_TYPE_AUDIO_PLAYBACK_INTERNAL;
            case 7:
                return ancg.MEDIA_ENGINE_ERROR_TYPE_AUDIO_PLAYER_INIT;
            case 8:
                return ancg.MEDIA_ENGINE_ERROR_TYPE_AUDIO_TRACK_INIT;
            case 9:
                return ancg.MEDIA_ENGINE_ERROR_TYPE_AUDIO_TRACK_SEEK;
            case 10:
                return ancg.MEDIA_ENGINE_ERROR_TYPE_AUDIO_TRACK_FLUSH;
            case 11:
                return ancg.MEDIA_ENGINE_ERROR_TYPE_AUDIO_RESAMPLER_INIT;
            case 12:
                return ancg.MEDIA_ENGINE_ERROR_TYPE_AUDIO_DECODER_INIT;
            case 13:
                return ancg.MEDIA_ENGINE_ERROR_TYPE_AUDIO_DECODER_CANCELED;
            case 14:
                return ancg.MEDIA_ENGINE_ERROR_TYPE_AUDIO_DECODER_FAILED;
            case 15:
                return ancg.MEDIA_ENGINE_ERROR_TYPE_AUDIO_MIXING_INVALID_OUTPUT_SIZE;
            case 16:
                return ancg.MEDIA_ENGINE_ERROR_TYPE_AUDIO_MIXING_INPUT_NOT_INITIALIZED;
            case 17:
                return ancg.MEDIA_ENGINE_ERROR_TYPE_AUDIO_MIXING_INVALID_GAIN;
            case 18:
                return ancg.MEDIA_ENGINE_ERROR_TYPE_AUDIO_MIXING_INPUT_MISMATCH;
            case 19:
                return ancg.MEDIA_ENGINE_ERROR_TYPE_AUDIO_STREAM_INIT;
            case 20:
                return ancg.MEDIA_ENGINE_ERROR_TYPE_AUDIO_STREAM_OPEN;
            case 21:
                return ancg.MEDIA_ENGINE_ERROR_TYPE_AUDIO_STREAM_CLOSE;
            case 22:
                return ancg.MEDIA_ENGINE_ERROR_TYPE_AUDIO_STREAM_PLAY;
            case 23:
                return ancg.MEDIA_ENGINE_ERROR_TYPE_AUDIO_STREAM_PAUSE;
            case 24:
                return ancg.MEDIA_ENGINE_ERROR_TYPE_AUDIO_FORMAT_FAILED;
            case 25:
                return ancg.MEDIA_ENGINE_ERROR_TYPE_AUDIO_FORMAT_MIME;
            case 26:
                return ancg.MEDIA_ENGINE_ERROR_TYPE_AUDIO_FORMAT_CHANNEL_COUNT;
            case 27:
                return ancg.MEDIA_ENGINE_ERROR_TYPE_AUDIO_FORMAT_SAMPLE_RATE;
            case 28:
                return ancg.MEDIA_ENGINE_ERROR_TYPE_AUDIO_FORMAT_CHANGED_DURING_PLAYBACK;
            case 29:
                return ancg.MEDIA_ENGINE_ERROR_TYPE_VIDEO_DECODER_INIT;
            case 30:
                return ancg.MEDIA_ENGINE_ERROR_TYPE_VIDEO_DECODER_FAILED;
            case 31:
                return ancg.MEDIA_ENGINE_ERROR_TYPE_VIDEO_PARSING_CONTAINER_MALFORMED;
            case 32:
                return ancg.MEDIA_ENGINE_ERROR_TYPE_VIDEO_PLAYBACK_INTERNAL;
            case 33:
                return ancg.MEDIA_ENGINE_ERROR_TYPE_VIDEO_NULL_PIXEL_BUFFER;
            case 34:
                return ancg.MEDIA_ENGINE_ERROR_TYPE_EXPORTER_FAILURE;
            case 35:
                return ancg.MEDIA_ENGINE_ERROR_TYPE_EXPORTER_INSUFFICIENT_DISK_SPACE;
            case 36:
                return ancg.MEDIA_ENGINE_ERROR_TYPE_EXPORTER_TIMEOUT;
            case 37:
                return ancg.MEDIA_ENGINE_ERROR_TYPE_EXPORTER_ENCODER_INIT;
            case 38:
                return ancg.MEDIA_ENGINE_ERROR_TYPE_EXPORTER_ENCODER_UNSUPPORTED_FORMAT;
            case 39:
                return ancg.MEDIA_ENGINE_ERROR_TYPE_EXPORTER_ENCODER_OPEN_GL;
            case 40:
                return ancg.MEDIA_ENGINE_ERROR_TYPE_EXPORTER_ENCODER_FAILED;
            case 41:
                return ancg.MEDIA_ENGINE_ERROR_TYPE_PREPROCESSOR_FAILURE;
            case 42:
                return ancg.MEDIA_ENGINE_ERROR_TYPE_GENERIC_ERROR;
            case 43:
                return ancg.MEDIA_ENGINE_ERROR_TYPE_GENERIC_INIT;
            case 44:
                return ancg.MEDIA_ENGINE_ERROR_TYPE_GENERIC_SEEK;
            case 45:
                return ancg.MEDIA_ENGINE_ERROR_TYPE_GENERIC_UPDATE;
            case 46:
                return ancg.MEDIA_ENGINE_ERROR_TYPE_GENERIC_OPEN_GL;
            case 47:
                return ancg.MEDIA_ENGINE_ERROR_TYPE_SEGMENT_ERROR;
            case 48:
                return ancg.MEDIA_ENGINE_ERROR_TYPE_SEGMENT_SOURCE;
            case 49:
                return ancg.MEDIA_ENGINE_ERROR_TYPE_SEGMENT_FAILED_TO_UPDATE;
            case 50:
                return ancg.MEDIA_ENGINE_ERROR_TYPE_SEGMENT_FAILED_TO_APPLY_ON_FRAME;
            case 51:
                return ancg.MEDIA_ENGINE_ERROR_TYPE_SEGMENT_OPEN_GL;
            case 52:
                return ancg.MEDIA_ENGINE_ERROR_TYPE_TRANSITION_ERROR;
            case 53:
                return ancg.MEDIA_ENGINE_ERROR_TYPE_TRANSITION_INIT;
            case 54:
                return ancg.MEDIA_ENGINE_ERROR_TYPE_TRANSITION_SOURCE;
            case 55:
                return ancg.MEDIA_ENGINE_ERROR_TYPE_TRANSITION_FAILED_TO_APPLY_ON_FRAME;
            case 56:
                return ancg.MEDIA_ENGINE_ERROR_TYPE_TRANSITION_OPEN_GL;
            case 57:
                return ancg.MEDIA_ENGINE_ERROR_TYPE_EFFECT_ERROR;
            case 58:
                return ancg.MEDIA_ENGINE_ERROR_TYPE_EFFECT_FAILED_TO_LOAD;
            case 59:
                return ancg.MEDIA_ENGINE_ERROR_TYPE_REMOTE_ASSET_CACHE_DOWNLOADER_TIMEOUT;
            case 60:
                return ancg.MEDIA_ENGINE_ERROR_TYPE_REMOTE_ASSET_CACHE_DOWNLOADER_INSUFFICIENT_DISK_SPACE;
            case 61:
                return ancg.MEDIA_ENGINE_ERROR_TYPE_REMOTE_ASSET_CACHE_DOWNLOADER_FAILED;
            case 62:
                return ancg.MEDIA_ENGINE_ERROR_TYPE_COMPOSITION_RUNTIME_EXPORTER_INELIGIBLE_MISSING_COMPOSITION_PROTO;
            case 63:
                return ancg.MEDIA_ENGINE_ERROR_TYPE_COMPOSITION_RUNTIME_EXPORTER_INELIGIBLE_SEMANTIC_EQUIVALENCE_PROTO_CONVERSION_FAILED;
            case 64:
                return ancg.MEDIA_ENGINE_ERROR_TYPE_COMPOSITION_RUNTIME_EXPORTER_INELIGIBLE_SEMANTIC_EQUIVALENCE_COMPARISON_FAILED;
            case 65:
                return ancg.MEDIA_ENGINE_ERROR_TYPE_COMPOSITION_RUNTIME_EXPORTER_INELIGIBLE_UNSUPPORTED_COMPOSITION;
            case 66:
                return ancg.MEDIA_ENGINE_ERROR_TYPE_COMPOSITION_RUNTIME_EXPORTER_INELIGIBLE_BUILDER_FAILED;
            default:
                throw new IllegalArgumentException("unknown enum value: ".concat(auddVar.toString()));
        }
    }

    public static /* synthetic */ boolean l(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    public static /* synthetic */ Object m(Object obj) {
        pwk pwkVar = (pwk) obj;
        switch (pwkVar.ordinal()) {
            case 0:
                return aibn.DEFAULT;
            case 1:
                return aibn.TV;
            case 2:
                return aibn.WEARABLE;
            case 3:
                return aibn.AUTOMOTIVE;
            case 4:
                return aibn.BATTLESTAR;
            case 5:
                return aibn.CHROME_OS;
            case 6:
                return aibn.DESKTOP_ANDROID;
            case 7:
                return aibn.XR;
            case 8:
                return aibn.XR_PERIPHERAL;
            default:
                throw new IllegalArgumentException("unknown enum value: ".concat(pwkVar.toString()));
        }
    }

    public static /* synthetic */ Typeface n(Resources resources, Typeface typeface) {
        if (typeface == null) {
            typeface = Typeface.defaultFromStyle(0);
        }
        if (Build.VERSION.SDK_INT < 31) {
            return typeface;
        }
        int weight = typeface.getWeight();
        if (weight == 0) {
            weight = true != typeface.isBold() ? 400 : 700;
        }
        int iO = rpi.o(resources, weight);
        return iO != weight ? Typeface.create(typeface, iO, typeface.isItalic()) : typeface;
    }

    public static /* synthetic */ int o(int i) {
        switch (i - 1) {
            case 1:
                return 100;
            case 2:
                return 200;
            case 3:
                return 300;
            case 4:
            default:
                return 400;
            case 5:
                return 500;
            case 6:
                return 600;
            case 7:
                return 700;
            case 8:
                return 800;
            case 9:
                return 900;
        }
    }

    public static /* synthetic */ int[] p() {
        return new int[]{1, 2, 3};
    }

    public static /* synthetic */ boolean q(Object obj) {
        return (((jjv) obj).a.b & 1) != 0;
    }

    public static /* synthetic */ anrv r(apji apjiVar) {
        aihl aihlVarCheckIsLite = aihn.checkIsLite(anrx.b);
        apjiVar.c(aihlVarCheckIsLite);
        Object objK = apjiVar.j.k(aihlVarCheckIsLite.d);
        return (anrv) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK));
    }

    public static /* synthetic */ Object s(Object obj) {
        ajtb ajtbVar = (ajtb) obj;
        return ajtbVar.b == 91394224 ? (ajsy) ajtbVar.c : ajsy.a;
    }

    public static /* synthetic */ aofu t(allp allpVar) {
        aofv aofvVar = allpVar.b;
        if (aofvVar == null) {
            aofvVar = aofv.a;
        }
        if ((aofvVar.b & 1) == 0) {
            return null;
        }
        aofv aofvVar2 = allpVar.b;
        if (aofvVar2 == null) {
            aofvVar2 = aofv.a;
        }
        aofu aofuVar = aofvVar2.c;
        return aofuVar == null ? aofu.a : aofuVar;
    }

    public static /* synthetic */ Optional u(allp allpVar) {
        aofv aofvVar = allpVar.b;
        if (aofvVar == null) {
            aofvVar = aofv.a;
        }
        aofu aofuVar = aofvVar.c;
        if (aofuVar == null) {
            aofuVar = aofu.a;
        }
        String str = aofuVar.c;
        return TextUtils.isEmpty(str) ? Optional.empty() : Optional.of(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void v(Object obj) throws Exception {
        if (!(obj instanceof AutoCloseable)) {
            throw new IllegalArgumentException();
        }
        obj.close();
    }

    public static void w(String str) {
        Pattern.compile(str, 1);
    }

    public static aha x(int i, View view) {
        return (aha) view.getTag(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void y(afxh afxhVar, cc ccVar) {
        View view = ccVar.getView();
        if (view != null) {
            aG(com.google.android.apps.youtube.music.R.id.tiktok_event_fragment_listeners, afxhVar, view);
            return;
        }
        qpj.c();
        if (ccVar instanceof afxl) {
            afxj afxjVarC = ((afxl) ccVar).c(afxhVar);
            if (afxjVarC == afxj.a) {
                return;
            }
            if (afxjVarC != afxj.b) {
                afxhVar = null;
            }
        }
        cc parentFragment = ccVar.getParentFragment();
        if (parentFragment != null) {
            y(afxhVar, parentFragment);
            return;
        }
        cf activity = ccVar.getActivity();
        ahno.G(activity != null, "Fragments must be attached to an Activity to receive events!");
        View viewFindViewById = activity.findViewById(R.id.content);
        viewFindViewById.getClass();
        aG(com.google.android.apps.youtube.music.R.id.tiktok_event_activity_listeners, afxhVar, viewFindViewById);
    }

    public static void z(afxh afxhVar, View view) {
        view.getClass();
        aG(com.google.android.apps.youtube.music.R.id.tiktok_event_view_listeners, afxhVar, view);
    }

    private afxw() {
    }
}
