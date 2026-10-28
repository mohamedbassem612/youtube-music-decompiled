package defpackage;

import android.content.Intent;
import android.media.Rating;
import android.media.session.MediaSession;
import android.net.Uri;
import android.os.BadParcelableException;
import android.os.Build;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.support.v4.media.RatingCompat;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.text.TextUtils;
import android.util.Log;
import androidx.versionedparcelable.ParcelImpl;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class ey extends MediaSession.Callback {
    final /* synthetic */ ez a;

    public ey(ez ezVar) {
        this.a = ezVar;
    }

    private final fb a() {
        fb fbVar;
        ez ezVar = this.a;
        synchronized (ezVar.a) {
            fbVar = (fb) ezVar.c.get();
        }
        if (fbVar == null || this.a != fbVar.a()) {
            return null;
        }
        return fbVar;
    }

    private static final void b(fb fbVar) {
        if (Build.VERSION.SDK_INT < 28) {
            String strC = fbVar.c();
            if (true == TextUtils.isEmpty(strC)) {
                strC = "android.media.session.MediaController";
            }
            fbVar.e(new brf(strC, -1, -1));
        }
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onCommand(String str, Bundle bundle, ResultReceiver resultReceiver) {
        int i;
        dtr dtrVar;
        fb fbVarA = a();
        if (fbVarA != null) {
            fg.d(bundle);
            b(fbVarA);
            try {
                if (str.equals("android.support.v4.media.session.command.GET_EXTRA_BINDER")) {
                    Bundle bundle2 = new Bundle();
                    MediaSessionCompat$Token mediaSessionCompat$Token = fbVarA.b;
                    eq eqVarA = mediaSessionCompat$Token.a();
                    bundle2.putBinder("android.support.v4.media.session.EXTRA_BINDER", eqVarA == null ? null : eqVarA.asBinder());
                    synchronized (mediaSessionCompat$Token.a) {
                        try {
                            dtrVar = mediaSessionCompat$Token.d;
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    if (dtrVar == null) {
                        bundle2.putParcelable("android.support.v4.media.session.SESSION_TOKEN2", null);
                    } else {
                        Bundle bundle3 = new Bundle();
                        bundle3.putParcelable("a", new ParcelImpl(dtrVar));
                        bundle2.putParcelable("android.support.v4.media.session.SESSION_TOKEN2", bundle3);
                    }
                    resultReceiver.send(0, bundle2);
                } else if (str.equals("android.support.v4.media.session.command.ADD_QUEUE_ITEM")) {
                } else if (str.equals("android.support.v4.media.session.command.ADD_QUEUE_ITEM_AT")) {
                    bundle.getInt("android.support.v4.media.session.command.ARGUMENT_INDEX");
                } else if (str.equals("android.support.v4.media.session.command.REMOVE_QUEUE_ITEM")) {
                } else if (!str.equals("android.support.v4.media.session.command.REMOVE_QUEUE_ITEM_AT")) {
                    this.a.a(str, bundle, resultReceiver);
                } else if (fbVarA.f != null && (i = bundle.getInt("android.support.v4.media.session.command.ARGUMENT_INDEX", -1)) >= 0 && i < fbVarA.f.size()) {
                }
            } catch (BadParcelableException unused) {
                Log.e("MediaSessionCompat", "Could not unparcel the extra data.");
            }
            fbVarA.e(null);
        }
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onCustomAction(String str, Bundle bundle) {
        fb fbVarA = a();
        if (fbVarA != null) {
            fg.d(bundle);
            b(fbVarA);
            try {
                if (str.equals("android.support.v4.media.session.action.PLAY_FROM_URI")) {
                    Uri uri = (Uri) bundle.getParcelable("android.support.v4.media.session.action.ARGUMENT_URI");
                    Bundle bundle2 = bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
                    fg.d(bundle2);
                    this.a.h(uri, bundle2);
                } else if (!str.equals("android.support.v4.media.session.action.PREPARE")) {
                    if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_MEDIA_ID")) {
                        String string = bundle.getString("android.support.v4.media.session.action.ARGUMENT_MEDIA_ID");
                        Bundle bundle3 = bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
                        fg.d(bundle3);
                        this.a.i(string, bundle3);
                    } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_SEARCH")) {
                        String string2 = bundle.getString("android.support.v4.media.session.action.ARGUMENT_QUERY");
                        Bundle bundle4 = bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
                        fg.d(bundle4);
                        this.a.j(string2, bundle4);
                    } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_URI")) {
                        Uri uri2 = (Uri) bundle.getParcelable("android.support.v4.media.session.action.ARGUMENT_URI");
                        Bundle bundle5 = bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
                        fg.d(bundle5);
                        this.a.k(uri2, bundle5);
                    } else if (str.equals("android.support.v4.media.session.action.SET_CAPTIONING_ENABLED")) {
                        bundle.getBoolean("android.support.v4.media.session.action.ARGUMENT_CAPTIONING_ENABLED");
                    } else if (str.equals("android.support.v4.media.session.action.SET_REPEAT_MODE")) {
                        this.a.o(bundle.getInt("android.support.v4.media.session.action.ARGUMENT_REPEAT_MODE"));
                    } else if (str.equals("android.support.v4.media.session.action.SET_SHUFFLE_MODE")) {
                        this.a.p(bundle.getInt("android.support.v4.media.session.action.ARGUMENT_SHUFFLE_MODE"));
                    } else if (str.equals("android.support.v4.media.session.action.SET_RATING")) {
                        fg.d(bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS"));
                    } else if (str.equals("android.support.v4.media.session.action.SET_PLAYBACK_SPEED")) {
                        bundle.getFloat("android.support.v4.media.session.action.ARGUMENT_PLAYBACK_SPEED", 1.0f);
                    } else {
                        this.a.b(str, bundle);
                    }
                }
            } catch (BadParcelableException unused) {
                Log.e("MediaSessionCompat", "Could not unparcel the data.");
            }
            fbVarA.e(null);
        }
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onFastForward() {
        fb fbVarA = a();
        if (fbVarA != null) {
            b(fbVarA);
            this.a.c();
            fbVarA.e(null);
        }
    }

    @Override // android.media.session.MediaSession.Callback
    public final boolean onMediaButtonEvent(Intent intent) {
        fb fbVarA = a();
        if (fbVarA == null) {
            return false;
        }
        b(fbVarA);
        boolean zU = this.a.u(intent);
        fbVarA.e(null);
        return zU || super.onMediaButtonEvent(intent);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPause() {
        fb fbVarA = a();
        if (fbVarA != null) {
            b(fbVarA);
            this.a.d();
            fbVarA.e(null);
        }
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPlay() {
        fb fbVarA = a();
        if (fbVarA != null) {
            b(fbVarA);
            this.a.e();
            fbVarA.e(null);
        }
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPlayFromMediaId(String str, Bundle bundle) {
        fb fbVarA = a();
        if (fbVarA != null) {
            fg.d(bundle);
            b(fbVarA);
            this.a.f(str, bundle);
            fbVarA.e(null);
        }
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPlayFromSearch(String str, Bundle bundle) {
        fb fbVarA = a();
        if (fbVarA != null) {
            fg.d(bundle);
            b(fbVarA);
            this.a.g(str, bundle);
            fbVarA.e(null);
        }
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPlayFromUri(Uri uri, Bundle bundle) {
        fb fbVarA = a();
        if (fbVarA != null) {
            fg.d(bundle);
            b(fbVarA);
            this.a.h(uri, bundle);
            fbVarA.e(null);
        }
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPrepare() {
        fb fbVarA = a();
        if (fbVarA != null) {
            b(fbVarA);
            fbVarA.e(null);
        }
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPrepareFromMediaId(String str, Bundle bundle) {
        fb fbVarA = a();
        if (fbVarA != null) {
            fg.d(bundle);
            b(fbVarA);
            this.a.i(str, bundle);
            fbVarA.e(null);
        }
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPrepareFromSearch(String str, Bundle bundle) {
        fb fbVarA = a();
        if (fbVarA != null) {
            fg.d(bundle);
            b(fbVarA);
            this.a.j(str, bundle);
            fbVarA.e(null);
        }
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPrepareFromUri(Uri uri, Bundle bundle) {
        fb fbVarA = a();
        if (fbVarA != null) {
            fg.d(bundle);
            b(fbVarA);
            this.a.k(uri, bundle);
            fbVarA.e(null);
        }
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onRewind() {
        fb fbVarA = a();
        if (fbVarA != null) {
            b(fbVarA);
            this.a.l();
            fbVarA.e(null);
        }
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onSeekTo(long j) {
        fb fbVarA = a();
        if (fbVarA != null) {
            b(fbVarA);
            this.a.m(j);
            fbVarA.e(null);
        }
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onSetPlaybackSpeed(float f) {
        fb fbVarA = a();
        if (fbVarA != null) {
            b(fbVarA);
            fbVarA.e(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:41:0x0091  */
    @Override // android.media.session.MediaSession.Callback
    public final void onSetRating(Rating rating) {
        RatingCompat ratingCompatB;
        float f;
        fb fbVarA = a();
        if (fbVarA != null) {
            b(fbVarA);
            ez ezVar = this.a;
            if (rating != null) {
                int ratingStyle = rating.getRatingStyle();
                if (rating.isRated()) {
                    switch (ratingStyle) {
                        case 1:
                            ratingCompatB = new RatingCompat(1, true == rating.hasHeart() ? 1.0f : 0.0f);
                            break;
                        case 2:
                            ratingCompatB = RatingCompat.a(rating.isThumbUp());
                            break;
                        case 3:
                        case 4:
                        case 5:
                            float starRating = rating.getStarRating();
                            if (ratingStyle == 3) {
                                f = 3.0f;
                            } else if (ratingStyle != 4) {
                                if (ratingStyle != 5) {
                                    Log.e("Rating", a.bP(ratingStyle, "Invalid rating style (", ") for a star rating"));
                                } else {
                                    f = 5.0f;
                                }
                                ratingCompatB = null;
                            } else {
                                f = 4.0f;
                            }
                            if (starRating >= 0.0f && starRating <= f) {
                                ratingCompatB = new RatingCompat(ratingStyle, starRating);
                            } else {
                                Log.e("Rating", "Trying to set out of range star-based rating");
                                ratingCompatB = null;
                            }
                            break;
                        case 6:
                            float percentRating = rating.getPercentRating();
                            if (percentRating >= 0.0f && percentRating <= 100.0f) {
                                ratingCompatB = new RatingCompat(6, percentRating);
                            } else {
                                Log.e("Rating", "Invalid percentage-based rating value");
                                ratingCompatB = null;
                            }
                            break;
                        default:
                            ratingCompatB = null;
                            break;
                    }
                } else {
                    ratingCompatB = RatingCompat.b(ratingStyle);
                }
                ratingCompatB.c = rating;
            } else {
                ratingCompatB = null;
            }
            ezVar.n(ratingCompatB);
            fbVarA.e(null);
        }
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onSkipToNext() {
        fb fbVarA = a();
        if (fbVarA != null) {
            b(fbVarA);
            this.a.q();
            fbVarA.e(null);
        }
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onSkipToPrevious() {
        fb fbVarA = a();
        if (fbVarA != null) {
            b(fbVarA);
            this.a.r();
            fbVarA.e(null);
        }
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onSkipToQueueItem(long j) {
        fb fbVarA = a();
        if (fbVarA != null) {
            b(fbVarA);
            this.a.s(j);
            fbVarA.e(null);
        }
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onStop() {
        fb fbVarA = a();
        if (fbVarA != null) {
            b(fbVarA);
            this.a.t();
            fbVarA.e(null);
        }
    }
}
