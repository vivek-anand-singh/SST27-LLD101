public class TextDecoder extends Decoder {
    @Override
    void decode(byte[] fileBytes){
        System.out.println("TextDecoder decoding " + fileBytes.length + " bytes");
    }
}
