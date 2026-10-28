package com.google.android.libraries.youtube.media.player.exo2.platypus;

import com.google.android.apps.youtube.proto.streaming.SelectableFormatsOuterClass$SelectableFormats;
import com.google.android.libraries.youtube.media.interfaces.OnesieResponseParams;
import com.google.android.libraries.youtube.media.interfaces.PlaybackController;
import com.google.android.libraries.youtube.media.player.exo2.platypus.mediapush.BufferManagerImpl;
import defpackage.agke;
import defpackage.ytw;
import defpackage.zcf;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public interface OnesieMediaFetchIntegration extends ytw {

    /* JADX INFO: renamed from: com.google.android.libraries.youtube.media.player.exo2.platypus.OnesieMediaFetchIntegration$1, reason: invalid class name */
    /* JADX INFO: compiled from: PG */
    /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] a;
        static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[2];
            b = iArr;
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[2];
            a = iArr2;
            try {
                iArr2[0] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[1] = 2;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    SelectableFormatsOuterClass$SelectableFormats a(String str);

    OnesieResponseParams b();

    BufferManagerImpl c();

    void d();

    void e(PlaybackControllerWrapper playbackControllerWrapper, PlaybackController playbackController);

    void f();

    boolean g(String str, long j, agke agkeVar, boolean z, boolean z2, String str2, int i, boolean z3, boolean z4);

    void h();

    void i(zcf zcfVar);
}
