package com.google.android.gms.cast.framework.media;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import defpackage.kaw;
import defpackage.kbk;
import defpackage.kbu;
import defpackage.kcq;
import defpackage.kcr;
import defpackage.kfm;
import defpackage.khn;
import defpackage.kro;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public class MediaIntentReceiver extends BroadcastReceiver {
    public static final String ACTION_DISCONNECT = "com.google.android.gms.cast.framework.action.DISCONNECT";
    public static final String ACTION_FORWARD = "com.google.android.gms.cast.framework.action.FORWARD";
    public static final String ACTION_REWIND = "com.google.android.gms.cast.framework.action.REWIND";
    public static final String ACTION_SKIP_NEXT = "com.google.android.gms.cast.framework.action.SKIP_NEXT";
    public static final String ACTION_SKIP_PREV = "com.google.android.gms.cast.framework.action.SKIP_PREV";
    public static final String ACTION_STOP_CASTING = "com.google.android.gms.cast.framework.action.STOP_CASTING";
    public static final String ACTION_TOGGLE_PLAYBACK = "com.google.android.gms.cast.framework.action.TOGGLE_PLAYBACK";
    public static final String EXTRA_SKIP_STEP_MS = "googlecast-extra_skip_step_ms";
    private static final String TAG = "MediaIntentReceiver";
    private static final khn log = new khn(TAG, (String) null);

    private static kfm getRemoteMediaClient(kbu kbuVar) {
        if (kbuVar == null || !kbuVar.q()) {
            return null;
        }
        return kbuVar.c();
    }

    private void seek(kbu kbuVar, long j) {
        kfm remoteMediaClient;
        if (j == 0 || (remoteMediaClient = getRemoteMediaClient(kbuVar)) == null || remoteMediaClient.p() || remoteMediaClient.t()) {
            return;
        }
        remoteMediaClient.A(new kaw(remoteMediaClient.d() + j));
    }

    private void togglePlayback(kbu kbuVar) {
        kfm remoteMediaClient = getRemoteMediaClient(kbuVar);
        if (remoteMediaClient != null) {
            remoteMediaClient.l();
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        kcr kcrVarD;
        kcq kcqVarB;
        String action = intent.getAction();
        khn.e();
        if (action == null || (kcqVarB = (kcrVarD = kbk.g(context).d()).b()) == null) {
            return;
        }
        switch (action.hashCode()) {
            case -1699820260:
                if (action.equals(ACTION_REWIND)) {
                    onReceiveActionRewind(kcqVarB, intent.getLongExtra(EXTRA_SKIP_STEP_MS, 0L));
                    return;
                }
                break;
            case -945151566:
                if (action.equals(ACTION_SKIP_NEXT)) {
                    onReceiveActionSkipNext(kcqVarB);
                    return;
                }
                break;
            case -945080078:
                if (action.equals(ACTION_SKIP_PREV)) {
                    onReceiveActionSkipPrev(kcqVarB);
                    return;
                }
                break;
            case -668151673:
                if (action.equals(ACTION_STOP_CASTING)) {
                    kcrVarD.d(true);
                    return;
                }
                break;
            case -124479363:
                if (action.equals(ACTION_DISCONNECT)) {
                    kcrVarD.d(false);
                    return;
                }
                break;
            case 235550565:
                if (action.equals(ACTION_TOGGLE_PLAYBACK)) {
                    onReceiveActionTogglePlayback(kcqVarB);
                    return;
                }
                break;
            case 1362116196:
                if (action.equals(ACTION_FORWARD)) {
                    onReceiveActionForward(kcqVarB, intent.getLongExtra(EXTRA_SKIP_STEP_MS, 0L));
                    return;
                }
                break;
            case 1997055314:
                if (action.equals("android.intent.action.MEDIA_BUTTON")) {
                    onReceiveActionMediaButton(kcqVarB, intent);
                    return;
                }
                break;
        }
        onReceiveOtherAction(context, action, intent);
    }

    protected void onReceiveActionForward(kcq kcqVar, long j) {
        if (kcqVar instanceof kbu) {
            seek((kbu) kcqVar, j);
        }
    }

    protected void onReceiveActionMediaButton(kcq kcqVar, Intent intent) {
        if ((kcqVar instanceof kbu) && intent.hasExtra("android.intent.extra.KEY_EVENT")) {
            Bundle extras = intent.getExtras();
            kro.l(extras);
            KeyEvent keyEvent = (KeyEvent) extras.get("android.intent.extra.KEY_EVENT");
            if (keyEvent != null && keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 85) {
                togglePlayback((kbu) kcqVar);
            }
        }
    }

    protected void onReceiveActionRewind(kcq kcqVar, long j) {
        if (kcqVar instanceof kbu) {
            seek((kbu) kcqVar, -j);
        }
    }

    protected void onReceiveActionSkipNext(kcq kcqVar) {
        kfm remoteMediaClient;
        if (!(kcqVar instanceof kbu) || (remoteMediaClient = getRemoteMediaClient((kbu) kcqVar)) == null || remoteMediaClient.t()) {
            return;
        }
        remoteMediaClient.y();
    }

    protected void onReceiveActionSkipPrev(kcq kcqVar) {
        kfm remoteMediaClient;
        if (!(kcqVar instanceof kbu) || (remoteMediaClient = getRemoteMediaClient((kbu) kcqVar)) == null || remoteMediaClient.t()) {
            return;
        }
        remoteMediaClient.z();
    }

    protected void onReceiveActionTogglePlayback(kcq kcqVar) {
        if (kcqVar instanceof kbu) {
            togglePlayback((kbu) kcqVar);
        }
    }

    @Deprecated
    protected void onReceiveOtherAction(String str, Intent intent) {
        onReceiveOtherAction(null, str, intent);
    }

    protected void onReceiveOtherAction(Context context, String str, Intent intent) {
    }
}
