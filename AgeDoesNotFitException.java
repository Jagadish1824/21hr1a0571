import java.util.*;
class AgeDoesNotFitException extends Exception
{
String msg;
AgeDoesNotFitException(String msg)
{
super(msg);
this.msg=msg;
}
@Override
public String toString()
{
return msg;
}
}