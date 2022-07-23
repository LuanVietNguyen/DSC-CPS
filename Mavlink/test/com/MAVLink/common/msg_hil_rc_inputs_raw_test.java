/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * java mavlink generator tool. It should not be modified by hand.
 */
         
// MESSAGE HIL_RC_INPUTS_RAW PACKING
package com.MAVLink.common;
import com.MAVLink.MAVLinkPacket;
import com.MAVLink.Parser;
import com.MAVLink.ardupilotmega.CRC;
import java.nio.ByteBuffer;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
* Sent from simulation to autopilot. The RAW values of the RC channels received. The standard PPM modulation is as follows: 1000 microseconds: 0%, 2000 microseconds: 100%. Individual receivers/transmitters might violate this specification.
*/
public class msg_hil_rc_inputs_raw_test{

public static final int MAVLINK_MSG_ID_HIL_RC_INPUTS_RAW = 92;
public static final int MAVLINK_MSG_LENGTH = 33;
private static final long serialVersionUID = MAVLINK_MSG_ID_HIL_RC_INPUTS_RAW;

private Parser parser = new Parser();

public CRC generateCRC(byte[] packet){
    CRC crc = new CRC();
    for (int i = 1; i < packet.length - 2; i++) {
        crc.update_checksum(packet[i] & 0xFF);
    }
    crc.finish_checksum(MAVLINK_MSG_ID_HIL_RC_INPUTS_RAW);
    return crc;
}

public byte[] generateTestPacket(){
    ByteBuffer payload = ByteBuffer.allocate(6 + MAVLINK_MSG_LENGTH + 2);
    payload.put((byte)MAVLinkPacket.MAVLINK_STX); //stx
    payload.put((byte)MAVLINK_MSG_LENGTH); //len
    payload.put((byte)0); //seq
    payload.put((byte)255); //sysid
    payload.put((byte)190); //comp id
    payload.put((byte)MAVLINK_MSG_ID_HIL_RC_INPUTS_RAW); //msg id
    payload.putLong((long)93372036854775807L); //time_usec
    payload.putShort((short)17651); //chan1_raw
    payload.putShort((short)17755); //chan2_raw
    payload.putShort((short)17859); //chan3_raw
    payload.putShort((short)17963); //chan4_raw
    payload.putShort((short)18067); //chan5_raw
    payload.putShort((short)18171); //chan6_raw
    payload.putShort((short)18275); //chan7_raw
    payload.putShort((short)18379); //chan8_raw
    payload.putShort((short)18483); //chan9_raw
    payload.putShort((short)18587); //chan10_raw
    payload.putShort((short)18691); //chan11_raw
    payload.putShort((short)18795); //chan12_raw
    payload.put((byte)101); //rssi
    
    CRC crc = generateCRC(payload.array());
    payload.put((byte)crc.getLSB());
    payload.put((byte)crc.getMSB());
    return payload.array();
}

@Test
public void test(){
    byte[] packet = generateTestPacket();
    for(int i = 0; i < packet.length - 1; i++){
        parser.mavlink_parse_char(packet[i] & 0xFF);
    }
    MAVLinkPacket m = parser.mavlink_parse_char(packet[packet.length - 1] & 0xFF);
    byte[] processedPacket = m.encodePacket();
    assertArrayEquals("msg_hil_rc_inputs_raw", processedPacket, packet);
}
}
        