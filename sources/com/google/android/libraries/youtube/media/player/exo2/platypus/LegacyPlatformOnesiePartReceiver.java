package com.google.android.libraries.youtube.media.player.exo2.platypus;

import defpackage.jqx;
import defpackage.jra;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public class LegacyPlatformOnesiePartReceiver {

    /* JADX INFO: renamed from: com.google.android.libraries.youtube.media.player.exo2.platypus.LegacyPlatformOnesiePartReceiver$1, reason: invalid class name */
    /* JADX INFO: compiled from: PG */
    /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] a;
        static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[jqx.values().length];
            b = iArr;
            try {
                iArr[jqx.MEDIA_PROMISE_CANCELLATION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            int[] iArr2 = new int[jra.values().length];
            a = iArr2;
            try {
                iArr2[jra.NEXT_REQUEST_POLICY.ordinal()] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[jra.REQUEST_IDENTIFIER.ordinal()] = 2;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[jra.FORMAT_INITIALIZATION_METADATA.ordinal()] = 3;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[jra.MEDIA_HEADER.ordinal()] = 4;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[jra.ONESIE_HEADER.ordinal()] = 5;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[jra.LIVE_METADATA.ordinal()] = 6;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[jra.SABR_SEEK.ordinal()] = 7;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[jra.PLAYBACK_DEBUG_INFO.ordinal()] = 8;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                a[jra.PLAYBACK_START_POLICY.ordinal()] = 9;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                a[jra.START_BW_SAMPLING_HINT.ordinal()] = 10;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                a[jra.PAUSE_BW_SAMPLING_HINT.ordinal()] = 11;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                a[jra.SELECTABLE_FORMATS.ordinal()] = 12;
            } catch (NoSuchFieldError unused13) {
            }
        }
    }
}
