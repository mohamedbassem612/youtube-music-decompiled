package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
final class ancf implements aiht {
    static final aiht a = new ancf();

    @Override // defpackage.aiht
    public final boolean isInRange(int i) {
        ancg ancgVar;
        switch (i) {
            case 0:
                ancgVar = ancg.MEDIA_ENGINE_ERROR_TYPE_UNKNOWN;
                break;
            case 1:
                ancgVar = ancg.MEDIA_ENGINE_ERROR_TYPE_SET_EFFECT_FAILED;
                break;
            case 2:
                ancgVar = ancg.MEDIA_ENGINE_ERROR_TYPE_IO;
                break;
            case 3:
                ancgVar = ancg.MEDIA_ENGINE_ERROR_TYPE_AUDIO_PLAYBACK_INTERNAL;
                break;
            case 4:
                ancgVar = ancg.MEDIA_ENGINE_ERROR_TYPE_AUDIO_PLAYER_INIT;
                break;
            case 5:
                ancgVar = ancg.MEDIA_ENGINE_ERROR_TYPE_AUDIO_TRACK_INIT;
                break;
            case 6:
                ancgVar = ancg.MEDIA_ENGINE_ERROR_TYPE_AUDIO_DECODER_FAILED;
                break;
            case 7:
                ancgVar = ancg.MEDIA_ENGINE_ERROR_TYPE_MISSING_INPUT_ARGUMENT;
                break;
            case 8:
                ancgVar = ancg.MEDIA_ENGINE_ERROR_TYPE_INVALID_INPUT_ARGUMENT;
                break;
            case 9:
                ancgVar = ancg.MEDIA_ENGINE_ERROR_TYPE_AUDIO_RESAMPLER_INIT;
                break;
            case 10:
                ancgVar = ancg.MEDIA_ENGINE_ERROR_TYPE_AUDIO_DECODER_INIT;
                break;
            case 11:
                ancgVar = ancg.MEDIA_ENGINE_ERROR_TYPE_AUDIO_DECODER_CANCELED;
                break;
            case 12:
                ancgVar = ancg.MEDIA_ENGINE_ERROR_TYPE_AUDIO_MIXING_INVALID_OUTPUT_SIZE;
                break;
            case 13:
                ancgVar = ancg.MEDIA_ENGINE_ERROR_TYPE_AUDIO_MIXING_INPUT_NOT_INITIALIZED;
                break;
            case 14:
                ancgVar = ancg.MEDIA_ENGINE_ERROR_TYPE_AUDIO_MIXING_INVALID_GAIN;
                break;
            case 15:
                ancgVar = ancg.MEDIA_ENGINE_ERROR_TYPE_AUDIO_MIXING_INPUT_MISMATCH;
                break;
            case 16:
                ancgVar = ancg.MEDIA_ENGINE_ERROR_TYPE_AUDIO_STREAM_INIT;
                break;
            case 17:
                ancgVar = ancg.MEDIA_ENGINE_ERROR_TYPE_AUDIO_STREAM_OPEN;
                break;
            case 18:
                ancgVar = ancg.MEDIA_ENGINE_ERROR_TYPE_AUDIO_STREAM_CLOSE;
                break;
            case 19:
                ancgVar = ancg.MEDIA_ENGINE_ERROR_TYPE_AUDIO_STREAM_PLAY;
                break;
            case 20:
                ancgVar = ancg.MEDIA_ENGINE_ERROR_TYPE_AUDIO_STREAM_PAUSE;
                break;
            case 21:
                ancgVar = ancg.MEDIA_ENGINE_ERROR_TYPE_AUDIO_FORMAT_MIME;
                break;
            case 22:
                ancgVar = ancg.MEDIA_ENGINE_ERROR_TYPE_AUDIO_FORMAT_CHANNEL_COUNT;
                break;
            case 23:
                ancgVar = ancg.MEDIA_ENGINE_ERROR_TYPE_AUDIO_FORMAT_SAMPLE_RATE;
                break;
            case 24:
                ancgVar = ancg.MEDIA_ENGINE_ERROR_TYPE_AUDIO_FORMAT_CHANGED_DURING_PLAYBACK;
                break;
            case 25:
                ancgVar = ancg.MEDIA_ENGINE_ERROR_TYPE_FAILED_PRECONDITION;
                break;
            case 26:
                ancgVar = ancg.MEDIA_ENGINE_ERROR_TYPE_AUDIO_FORMAT_FAILED;
                break;
            case 27:
                ancgVar = ancg.MEDIA_ENGINE_ERROR_TYPE_AUDIO_TRACK_SEEK;
                break;
            case 28:
                ancgVar = ancg.MEDIA_ENGINE_ERROR_TYPE_AUDIO_TRACK_FLUSH;
                break;
            case 29:
                ancgVar = ancg.MEDIA_ENGINE_ERROR_TYPE_VIDEO_NULL_PIXEL_BUFFER;
                break;
            case 30:
                ancgVar = ancg.MEDIA_ENGINE_ERROR_TYPE_EXPORTER_FAILURE;
                break;
            case 31:
                ancgVar = ancg.MEDIA_ENGINE_ERROR_TYPE_PREPROCESSOR_FAILURE;
                break;
            case 32:
                ancgVar = ancg.MEDIA_ENGINE_ERROR_TYPE_EXPORTER_INSUFFICIENT_DISK_SPACE;
                break;
            case 33:
                ancgVar = ancg.MEDIA_ENGINE_ERROR_TYPE_EXPORTER_TIMEOUT;
                break;
            case 34:
                ancgVar = ancg.MEDIA_ENGINE_ERROR_TYPE_VIDEO_DECODER_INIT;
                break;
            case 35:
                ancgVar = ancg.MEDIA_ENGINE_ERROR_TYPE_VIDEO_DECODER_FAILED;
                break;
            case 36:
                ancgVar = ancg.MEDIA_ENGINE_ERROR_TYPE_EXPORTER_ENCODER_INIT;
                break;
            case 37:
                ancgVar = ancg.MEDIA_ENGINE_ERROR_TYPE_EXPORTER_ENCODER_FAILED;
                break;
            case 38:
                ancgVar = ancg.MEDIA_ENGINE_ERROR_TYPE_EXPORTER_ENCODER_UNSUPPORTED_FORMAT;
                break;
            case 39:
                ancgVar = ancg.MEDIA_ENGINE_ERROR_TYPE_VIDEO_PARSING_CONTAINER_MALFORMED;
                break;
            case 40:
                ancgVar = ancg.MEDIA_ENGINE_ERROR_TYPE_GENERIC_ERROR;
                break;
            case 41:
                ancgVar = ancg.MEDIA_ENGINE_ERROR_TYPE_GENERIC_INIT;
                break;
            case 42:
                ancgVar = ancg.MEDIA_ENGINE_ERROR_TYPE_GENERIC_SEEK;
                break;
            case 43:
                ancgVar = ancg.MEDIA_ENGINE_ERROR_TYPE_GENERIC_UPDATE;
                break;
            case 44:
                ancgVar = ancg.MEDIA_ENGINE_ERROR_TYPE_SEGMENT_ERROR;
                break;
            case 45:
                ancgVar = ancg.MEDIA_ENGINE_ERROR_TYPE_SEGMENT_SOURCE;
                break;
            case 46:
                ancgVar = ancg.MEDIA_ENGINE_ERROR_TYPE_SEGMENT_FAILED_TO_UPDATE;
                break;
            case 47:
                ancgVar = ancg.MEDIA_ENGINE_ERROR_TYPE_SEGMENT_FAILED_TO_APPLY_ON_FRAME;
                break;
            case 48:
                ancgVar = ancg.MEDIA_ENGINE_ERROR_TYPE_TRANSITION_ERROR;
                break;
            case 49:
                ancgVar = ancg.MEDIA_ENGINE_ERROR_TYPE_TRANSITION_INIT;
                break;
            case 50:
                ancgVar = ancg.MEDIA_ENGINE_ERROR_TYPE_TRANSITION_SOURCE;
                break;
            case 51:
                ancgVar = ancg.MEDIA_ENGINE_ERROR_TYPE_TRANSITION_FAILED_TO_APPLY_ON_FRAME;
                break;
            case 52:
                ancgVar = ancg.MEDIA_ENGINE_ERROR_TYPE_EFFECT_ERROR;
                break;
            case 53:
                ancgVar = ancg.MEDIA_ENGINE_ERROR_TYPE_EFFECT_FAILED_TO_LOAD;
                break;
            case 54:
                ancgVar = ancg.MEDIA_ENGINE_ERROR_TYPE_GENERIC_OPEN_GL;
                break;
            case 55:
                ancgVar = ancg.MEDIA_ENGINE_ERROR_TYPE_SEGMENT_OPEN_GL;
                break;
            case 56:
                ancgVar = ancg.MEDIA_ENGINE_ERROR_TYPE_TRANSITION_OPEN_GL;
                break;
            case 57:
                ancgVar = ancg.MEDIA_ENGINE_ERROR_TYPE_EXPORTER_ENCODER_OPEN_GL;
                break;
            case 58:
                ancgVar = ancg.MEDIA_ENGINE_ERROR_TYPE_VIDEO_PLAYBACK_INTERNAL;
                break;
            case 59:
                ancgVar = ancg.MEDIA_ENGINE_ERROR_TYPE_REMOTE_ASSET_CACHE_DOWNLOADER_TIMEOUT;
                break;
            case 60:
                ancgVar = ancg.MEDIA_ENGINE_ERROR_TYPE_REMOTE_ASSET_CACHE_DOWNLOADER_INSUFFICIENT_DISK_SPACE;
                break;
            case 61:
                ancgVar = ancg.MEDIA_ENGINE_ERROR_TYPE_REMOTE_ASSET_CACHE_DOWNLOADER_FAILED;
                break;
            case 62:
                ancgVar = ancg.MEDIA_ENGINE_ERROR_TYPE_COMPOSITION_RUNTIME_EXPORTER_INELIGIBLE_MISSING_COMPOSITION_PROTO;
                break;
            case 63:
                ancgVar = ancg.MEDIA_ENGINE_ERROR_TYPE_COMPOSITION_RUNTIME_EXPORTER_INELIGIBLE_SEMANTIC_EQUIVALENCE_PROTO_CONVERSION_FAILED;
                break;
            case 64:
                ancgVar = ancg.MEDIA_ENGINE_ERROR_TYPE_COMPOSITION_RUNTIME_EXPORTER_INELIGIBLE_SEMANTIC_EQUIVALENCE_COMPARISON_FAILED;
                break;
            case 65:
                ancgVar = ancg.MEDIA_ENGINE_ERROR_TYPE_COMPOSITION_RUNTIME_EXPORTER_INELIGIBLE_UNSUPPORTED_COMPOSITION;
                break;
            case 66:
                ancgVar = ancg.MEDIA_ENGINE_ERROR_TYPE_COMPOSITION_RUNTIME_EXPORTER_INELIGIBLE_BUILDER_FAILED;
                break;
            default:
                ancgVar = null;
                break;
        }
        return ancgVar != null;
    }
}
